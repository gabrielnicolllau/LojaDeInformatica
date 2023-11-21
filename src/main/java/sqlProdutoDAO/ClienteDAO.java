package sqlProdutoDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import model.Cliente;
import model.Compra;

public class ClienteDAO {

//Criando o caminho/conexao com o banco de dados
    static String url = "jdbc:mysql://localhost:3306/lojainformatica";
    static String login = "admin";
    static String senha = "1234";

    // Metodo para salvar no banco de dados
    public static boolean salvar(Cliente novoCliente) {

        // Criando conexao
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        boolean retorno = false;

        try {
            //Passo 1: carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");//driver

            //Passo 2: Abrir a conexao com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3: Preparar os comandos SQL a ser executado
            comandoSQL = conexao.prepareStatement("INSERT INTO Cliente (nome, email, cpf, dataNascimento, sexo, celular, telefone, "
                    + "estadoCivil, cep, endereco, numeroCasa, bairro, cidade, uf) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);

            //Pegando as informacoes do objeto para mandar para o banco
            comandoSQL.setString(1, novoCliente.getNome());
            comandoSQL.setString(2, novoCliente.getEmail());
            comandoSQL.setString(3, novoCliente.getCpf());
            comandoSQL.setDate(4, new java.sql.Date(novoCliente.getDataNasc().getTime()));
            comandoSQL.setString(5, novoCliente.getSexo());
            comandoSQL.setString(6, novoCliente.getCelular());
            comandoSQL.setString(7, novoCliente.getTelefone());
            comandoSQL.setString(8, novoCliente.getEstadoCivil());
            comandoSQL.setString(9, novoCliente.getCep());
            comandoSQL.setString(10, novoCliente.getEndereço());
            comandoSQL.setString(11, novoCliente.getNumero());
            comandoSQL.setString(12, novoCliente.getBairro());
            comandoSQL.setString(13, novoCliente.getCidade());
            comandoSQL.setString(14, novoCliente.getUf());

            // Executar os comandos
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs != null) {
                    while (rs.next()) {
                        int idGerado = rs.getInt(1);
                        novoCliente.setIdCliente(idGerado);
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
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return retorno;

    }

    // Metodo para listar
    public static ArrayList<Cliente> listar() {

        // Criando conexao
        ArrayList<Cliente> lista = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1: carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2: Abrir a conexao com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3: Preparar os comandos SQL a ser executado
            comandoSQL = conexao.prepareStatement("SELECT * FROM Cliente");

            // Passo 4: Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {
                //Percorrer as linhas do ResultSet
                while (rs.next()) {

                    Cliente dados = new Cliente();

                    dados.setIdCliente(rs.getInt("id_Cliente"));
                    dados.setNome(rs.getString("nome"));
                    dados.setEmail(rs.getString("email"));
                    dados.setCpf(rs.getString("cpf"));
                    dados.setDataNasc(rs.getDate("dataNascimento"));
                    dados.setSexo(rs.getString("sexo"));
                    dados.setCelular(rs.getString("celular"));
                    dados.setTelefone(rs.getString("telefone"));
                    dados.setEstadoCivil(rs.getString("estadoCivil"));
                    dados.setCep(rs.getString("cep"));
                    dados.setEndereço(rs.getString("endereco"));
                    dados.setNumero(rs.getString("numeroCasa"));
                    dados.setBairro(rs.getString("bairro"));
                    dados.setCidade(rs.getString("cidade"));
                    dados.setUf(rs.getString("uf"));

                    lista.add(dados);
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return lista;

    }

    // Metodo para buscar algo especifico
    public static ArrayList<Cliente> buscarAlgo(String clienteBuscado) {

        // Criando conexao
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        // Guardar o item na lista
        ArrayList<Cliente> lista = new ArrayList<>();

        try {
            //Passo 1: carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2: Abrir a conexao com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3: Preparar os comandos SQL a ser executado
            comandoSQL = conexao.prepareStatement("SELECT * FROM Cliente WHERE id_Cliente = ?");
            comandoSQL.setString(1, clienteBuscado);

            // Passo 4: Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {
                //Percorrer as linhas do ResultSet
                while (rs.next()) {

                    Cliente dados = new Cliente();

                    dados.setIdCliente(rs.getInt("id_Cliente"));
                    dados.setNome(rs.getString("nome"));
                    dados.setEmail(rs.getString("email"));
                    dados.setCpf(rs.getString("cpf"));
                    dados.setDataNasc(rs.getDate("dataNascimento"));
                    dados.setSexo(rs.getString("sexo"));
                    dados.setCelular(rs.getString("celular"));
                    dados.setTelefone(rs.getString("telefone"));
                    dados.setEstadoCivil(rs.getString("estadoCivil"));
                    dados.setCep(rs.getString("cep"));
                    dados.setEndereço(rs.getString("endereco"));
                    dados.setNumero(rs.getString("numeroCasa"));
                    dados.setBairro(rs.getString("bairro"));
                    dados.setCidade(rs.getString("cidade"));
                    dados.setUf(rs.getString("uf"));

                    lista.add(dados);
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return lista;

    }

    // Metodo para excluir
    public static boolean excluir(int idCliente) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {

            //Passo 1: carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2: Abrir a conexao com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            // Passo 3: Preparar os comandos SQL a ser executado
            comandoSQL = conexao.prepareStatement("DELETE FROM Cliente WHERE id_Cliente = ?");

            // Pegando o cpf
            comandoSQL.setInt(1, idCliente);//verificar com o professor

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
    public static boolean alterar(Cliente clienteAlterar) {

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        boolean retorno = false;

        try {
            //Passo 1: carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2: Abrir a conexao com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3: Preparar os comandos SQL a ser executado
            comandoSQL = conexao.prepareStatement("UPDATE Cliente SET nome = ?, email = ?, cpf = ?, dataNascimento = ?, sexo = ?, celular = ?, telefone = ?, estadoCivil = ?, cep = ?, endereco = ?, numeroCasa = ?, bairro = ?, cidade = ?, uf = ? WHERE id_Cliente = ?");

            //Pegando as informacoes do objeto para mandar para o banco
            comandoSQL.setString(1, clienteAlterar.getNome());
            comandoSQL.setString(2, clienteAlterar.getEmail());
            comandoSQL.setString(3, clienteAlterar.getCpf());
            comandoSQL.setDate(4, new java.sql.Date(clienteAlterar.getDataNasc().getTime()));
            comandoSQL.setString(5, clienteAlterar.getSexo());
            comandoSQL.setString(6, clienteAlterar.getCelular());
            comandoSQL.setString(7, clienteAlterar.getTelefone());
            comandoSQL.setString(8, clienteAlterar.getEstadoCivil());
            comandoSQL.setString(9, clienteAlterar.getCep());
            comandoSQL.setString(10, clienteAlterar.getEndereço());
            comandoSQL.setString(11, clienteAlterar.getNumero());
            comandoSQL.setString(12, clienteAlterar.getBairro());
            comandoSQL.setString(13, clienteAlterar.getCidade());
            comandoSQL.setString(14, clienteAlterar.getUf());
            comandoSQL.setInt(15, clienteAlterar.getIdCliente());

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

    // Buscar o cpf
    public static Compra buscarCPF(String cpfBuscado) {
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        Compra novaCompra = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);

            comandoSQL = conexao.prepareStatement("SELECT cpf, nome FROM cliente WHERE cpf = ?");
            comandoSQL.setString(1, cpfBuscado);

            rs = comandoSQL.executeQuery();

            if (rs.next()) {
                String nome = rs.getString("nome");
                String cpfEncontrado = rs.getString("cpf");

                novaCompra = new Compra(nome, cpfEncontrado);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return novaCompra;
    }
}
