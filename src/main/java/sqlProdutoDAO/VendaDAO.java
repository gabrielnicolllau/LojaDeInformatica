/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqlProdutoDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author Gabriel
 */
public class VendaDAO {

    //Criando o caminho/conexao com o banco de dados
    static String url = "jdbc:mysql://localhost:3306/lojainformatica";
    static String login = "admin";
    static String senha = "1234";

    // Buscar por categoria
    public static ArrayList<Produto> buscarProdutosPorCategoria(String categoria) {

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        ArrayList<Produto> lista = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);
            comandoSQL = conexao.prepareStatement("SELECT * FROM Produto WHERE tipo = ?");
            comandoSQL.setString(1, categoria);
            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                Produto item = new Produto();
                item.setIdProduto(rs.getInt("id_Produto"));
                item.setTipoDaPeca(rs.getString("tipo"));
                item.setPreco(rs.getDouble("preco"));
                item.setQuantidade(rs.getInt("quantidade"));
                item.setDescricao(rs.getString("descricao"));
                lista.add(item);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(); // Trate melhor essa exceção na sua aplicação
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    ex.printStackTrace(); // Trate melhor essa exceção na sua aplicação
                }
            }
        }

        return lista;
    }
}
