package sqlDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.RelatorioVenda;
import static sqlDAO.RelatorioVendaDAO.login;
import static sqlDAO.RelatorioVendaDAO.senha;
import static sqlDAO.RelatorioVendaDAO.url;

/**
 * A classe RelatorioVendaDAO realiza operações de acesso a dados relacionadas a
 * relatórios de vendas. Permite buscar informações sobre vendas e detalhes de
 * produtos em vendas. Utiliza uma conexão MySQL para interagir com o banco de
 * dados.
 *
 * @author Lucca Leonardo
 */
public class RelatorioVendaDAO {

    static String url = "jdbc:mysql://localhost:3306/lojainformatica";
    static String login = "root";
    static String senha = "1234";

    /**
     * Busca relatórios de vendas com base em parâmetros fornecidos.
     *
     * @param produtoBuscado O produto a ser buscado nas vendas.
     * @param produtoEncontrado O produto encontrado nas vendas.
     * @return Uma lista de objetos RelatorioVenda contendo informações sobre as
     * vendas.
     */
    public static ArrayList<RelatorioVenda> buscarRelatorio(String produtoBuscado, String produtoEncontrado) {

        // Criando conexao
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        // Guardar o item na lista
        ArrayList<RelatorioVenda> lista = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);

            comandoSQL = conexao.prepareStatement("SELECT v.dataCompra, v.total, c.nome, v.id_Cliente FROM venda as v LEFT JOIN cliente as c ON v.id_Cliente = c.id_Cliente");

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                RelatorioVenda item = new RelatorioVenda();

                item.setDataVenda(rs.getDate("dataCompra"));
                item.setIdCliente(rs.getInt("id_Cliente"));
                item.setValorTotal(rs.getDouble("total"));

                lista.add(item);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RelatorioVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (comandoSQL != null) {
                    comandoSQL.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(RelatorioVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    /**
     * Busca detalhes de produtos em vendas com base no identificador do
     * produto.
     *
     * @param produtoEncontrado O identificador do produto a ser buscado nos
     * detalhes de vendas.
     * @return Uma lista de objetos RelatorioVenda contendo detalhes dos
     * produtos em vendas.
     */
    public static ArrayList<RelatorioVenda> buscarDetalhes(int produtoEncontrado) {

        // Criando conexao
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        // Guardar o item na lista
        ArrayList<RelatorioVenda> lista = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);

            comandoSQL = conexao.prepareStatement("SELECT p.descricao, v.quantidadeComprada, p.preco as valorUnitario, v.total FROM produto AS p LEFT JOIN venda AS v ON v.id_Produto = p.id_Produto");

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                RelatorioVenda item = new RelatorioVenda();

                item.setNomeProduto(rs.getString("descricao"));
                item.setQuantidadeComprada(rs.getInt("quantidadeComprada"));
                item.setValorUnitario(rs.getDouble("valorUnitario"));
                item.setValorTotal(rs.getDouble("total"));

                lista.add(item);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RelatorioVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (comandoSQL != null) {
                    comandoSQL.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(RelatorioVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }
}
