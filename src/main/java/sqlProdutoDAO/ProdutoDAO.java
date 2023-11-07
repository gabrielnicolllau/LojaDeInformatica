
package sqlProdutoDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produto;

public class ProdutoDAO {

    //Criando o caminho/conexao com o banco de dados
    static String url = "jdbc:mysql://localhost:3306/lojainformatica";
    static String login = "admin";
    static String senha = "1234";

    // Metodo para salvar no banco de dados
    public static boolean salvar(Produto novoProduto) {

        // Criando conexao
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        boolean retorno = false;

        try {
            //Passo 1: carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2: Abrir a conexao com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3: Preparar os comandos SQL a ser executado
            comandoSQL = conexao.prepareStatement("INSERT INTO produto (Tipo, Preco, Quantidade, Descricao) VALUES(?, ?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);

            //Pegando as informacoes do objeto para mandar para o banco
            comandoSQL.setString(1, novoProduto.getTipoDaPeca());
            comandoSQL.setDouble(2, novoProduto.getPreco());
            comandoSQL.setInt(3, novoProduto.getQuantidade());
            comandoSQL.setString(4, novoProduto.getDescricao());

            // Executar os comandos
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs != null) {
                    while (rs.next()) {
                        int idGerado = rs.getInt(1);
                        novoProduto.setIdProduto(idGerado);
                    }
                }

            }

        } catch (ClassNotFoundException ex) {

            retorno = false;

        } catch (SQLException ex) {

            retorno = false;
        } finally {

            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return retorno;

    }

    // Metodo para listar
    public static ArrayList<Produto> listar() {

        // Criando conexao
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        boolean retorno = false;
        ResultSet rs = null;

        // Guardar o item na lista
        ArrayList<Produto> lista = new ArrayList<>();

        try {
            //Passo 1: carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2: Abrir a conexao com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3: Preparar os comandos SQL a ser executado
            comandoSQL = conexao.prepareStatement("SELECT * FROM Produto");

            // Passo 4: Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {
                //Percorrer as linhas do ResultSet
                while (rs.next()) {

                    Produto item = new Produto();

                    item.setIdProduto(rs.getInt("ID_produto"));
                    item.setTipoDaPeca(rs.getString("Tipo"));
                    item.setPreco(rs.getDouble("Preco"));
                    item.setQuantidade(rs.getInt("Quantidade"));
                    item.setDescricao(rs.getString("Descricao"));

                    lista.add(item);
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return lista;

    }

    // Metodo para buscar algo especifico
    public static ArrayList<Produto> buscarAlgo(String produtoBuscado) {

        // Criando conexao
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        // Guardar o item na lista
        ArrayList<Produto> lista = new ArrayList<>();

        try {
            //Passo 1: carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2: Abrir a conexao com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3: Preparar os comandos SQL a ser executado
            comandoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE ID_produto = ?");
            comandoSQL.setString(1, produtoBuscado);

            // Passo 4: Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {
                //Percorrer as linhas do ResultSet
                while (rs.next()) {

                    Produto item = new Produto();

                    item.setIdProduto(rs.getInt("ID_produto"));
                    item.setTipoDaPeca(rs.getString("Tipo"));
                    item.setPreco(rs.getDouble("Preco"));
                    item.setQuantidade(rs.getInt("Quantidade"));
                    item.setDescricao(rs.getString("Descricao"));

                    lista.add(item);
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return lista;

    }

    // Metodo para excluir
    public static boolean excluir(int idProduto) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {

            //Passo 1: carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2: Abrir a conexao com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            // Passo 3: Preparar os comandos SQL a ser executado
            comandoSQL = conexao.prepareStatement("DELETE FROM produto WHERE ID_produto = ?");

            // Pegando o ID
            comandoSQL.setInt(1, idProduto);

            // Executar os comandos
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        }

        return retorno;

    }

    // Metodo para alterar
    public static boolean alterar(Produto ProdutoAlterar) {

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        boolean retorno = false;

        try {
            //Passo 1: carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2: Abrir a conexao com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3: Preparar os comandos SQL a ser executado
            comandoSQL = conexao.prepareStatement("UPDATE produto SET Tipo = ?, Preco = ?, Quantidade = ?, Descricao = ? WHERE ID_produto = ?");

            //Pegando as informacoes do objeto para mandar para o banco
            comandoSQL.setString(1, ProdutoAlterar.getTipoDaPeca());
            comandoSQL.setDouble(2, ProdutoAlterar.getPreco());
            comandoSQL.setInt(3, ProdutoAlterar.getQuantidade());
            comandoSQL.setString(4, ProdutoAlterar.getDescricao());
            comandoSQL.setInt(5, ProdutoAlterar.getIdProduto());

            // Executar os comandos
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        }

        return retorno;

    }
}
