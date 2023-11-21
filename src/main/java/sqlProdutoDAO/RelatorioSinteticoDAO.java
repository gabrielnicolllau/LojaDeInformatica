package sqlProdutoDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.RelatorioSintetico;
import static sqlProdutoDAO.RelatorioSinteticoDAO.login;
import static sqlProdutoDAO.RelatorioSinteticoDAO.senha;
import static sqlProdutoDAO.RelatorioSinteticoDAO.url;

/**
 * @author Lucca Leonardo
 */
public class RelatorioSinteticoDAO {
    
    static String url = "jdbc:mysql://localhost:3306/lojainformatica";
    static String login = "admin";
    static String senha = "1234";

    public static ArrayList<RelatorioSintetico> buscarRelatorio(String produtoBuscado) {
        
        // Criando conexao
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        // Guardar o item na lista
        ArrayList<RelatorioSintetico> lista = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);

            comandoSQL = conexao.prepareStatement("SELECT data_venda, cliente, valor_total FROM vendas WHERE data_venda = ?");
            comandoSQL.setString(1, produtoBuscado);

            rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {

                    RelatorioSintetico item = new RelatorioSintetico();

                    item.setDataInicio(rs.getDate("Data Inicio"));
                    item.setDataFim(rs.getDate("Data Final"));
                    item.setDataVenda(rs.getDate("Data de Venda"));
                    item.setIdCliente(rs.getInt("ID_cliente"));
                    item.setValorTotal(rs.getDouble("Valor total"));

                    lista.add(item);
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RelatorioSinteticoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioSinteticoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(RelatorioSinteticoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lista;
    }
}
