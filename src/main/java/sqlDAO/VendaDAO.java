package sqlDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;
import model.Produto;
import model.Venda;
import static sqlDAO.VendaDAO.senha;
import static sqlDAO.VendaDAO.url;

/**
 * A classe VendaDAO é responsável por realizar operações relacionadas às vendas
 * no banco de dados, incluindo a inserção de novas vendas, busca de produtos
 * por categoria, busca de nome do cliente por CPF, e decremento da quantidade
 * de estoque após uma venda.
 *
 * @author Gabriel
 * @see model.Venda
 * @see model.Cliente
 * @see model.Produto
 */
public class VendaDAO {

    //Criando o caminho/conexao com o banco de dados
    static String url = "jdbc:mysql://localhost:3306/lojainformatica";
    static String login = "admin";
    static String senha = "1234";

    /**
     * Método para salvar uma nova venda no banco de dados.
     *
     * @param novaVenda Objeto Venda a ser salvo no banco.
     * @return Retorna true se a operação for bem-sucedida, false caso
     * contrário.
     */
    public static boolean salvar(Venda novaVenda) {

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
            comandoSQL = conexao.prepareStatement("INSERT INTO Venda (id_Produto, id_Cliente, dataCompra, quantidadeComprada, total) VALUES (?, ?, ?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);

            //Pegando as informacoes do objeto para mandar para o banco
            comandoSQL.setDouble(1, novaVenda.getIdProduto());
            comandoSQL.setInt(2, novaVenda.getIdCliente());
            comandoSQL.setDate(3, (Date) novaVenda.getDataCompra());
            comandoSQL.setInt(4, novaVenda.getQuantidadeComprada());
            comandoSQL.setDouble(5, novaVenda.getTotal());

            // Executar os comandos
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs != null) {
                    while (rs.next()) {
                        int idGerado = rs.getInt(1);
                        novaVenda.setIdVenda(idGerado);
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
                    Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return retorno;

    }

    /**
     * Método para buscar produtos por categoria no banco de dados.
     *
     * @param categoria Categoria dos produtos a serem buscados.
     * @return Retorna uma lista de objetos Produto que correspondem à
     * categoria.
     */
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

    /**
     * Método para buscar o nome de um cliente por CPF no banco de dados.
     *
     * @param cpf CPF do cliente a ser buscado.
     * @return Retorna um objeto Cliente com o nome correspondente ao CPF.
     */
    public static Cliente buscarNomePorCPF(String cpf) {
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        Cliente novoCliente = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);
            comandoSQL = conexao.prepareStatement("SELECT id_Cliente, cpf, nome FROM Cliente WHERE cpf = ?");
            comandoSQL.setString(1, cpf);
            rs = comandoSQL.executeQuery();

            if (rs.next()) {
                novoCliente = new Cliente();
                novoCliente.setIdCliente(rs.getInt("id_Cliente"));
                novoCliente.setCpf(rs.getString("cpf"));
                novoCliente.setNome(rs.getString("nome"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            // Trate melhor essa exceção na sua aplicação
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    // Trate melhor essa exceção na sua aplicação
                }
            }
        }
        return novoCliente; // Retorna o cliente encontrado ou null se não for encontrado
    }

    /**
     * Método para decrementar a quantidade de estoque de um produto após uma
     * venda.
     *
     * @param idProduto ID do produto a ter a quantidade decrementada.
     * @param quantidadeVendida Quantidade a ser decrementada no estoque.
     * @return Retorna true se a operação for bem-sucedida, false caso
     * contrário.
     */
    public static boolean decrementarQuantidadeEstoque(int idProduto, int quantidadeVendida) {

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
            comandoSQL = conexao.prepareStatement("UPDATE Produto SET quantidade = quantidade - ? WHERE id_Produto = ?");

            //Pegando as informacoes do objeto para mandar para o banco
            comandoSQL.setInt(1, quantidadeVendida);
            comandoSQL.setInt(2, idProduto);

            // Executar os comandos
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {

                retorno = true;
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
                    ex.printStackTrace();
                }
            }

        }

        return retorno;
    }

}

