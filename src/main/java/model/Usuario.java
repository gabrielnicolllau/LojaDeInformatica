package model;

/**
 *
 * @author xGabriel Nicolau
 */
public class Usuario {

    private int idUsuario;
    private String nome;
    private String usuario;
    private String senha;
    private String cargo;

    // Construtores
    //Para guardar no banco de dados, nao precisa do id agora
    public Usuario(String nome, String usuario, String senha, String cargo) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.cargo = cargo;
    }

    // Para pegar do banco de dados, puxar o id criado no banco
    public Usuario(int idUsuario, String nome, String usuario, String senha, String cargo) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.cargo = cargo;
    }

    // metodos acessores
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
