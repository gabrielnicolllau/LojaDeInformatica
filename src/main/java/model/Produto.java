
package model;

public class Produto {

    private int idProduto;
    private String tipoDaPeca;
    private double preco;
    private int quantidade;
    String descricao;

    public Produto() {
        // Construtor vazio
    }

    //Para guardar no banco de dados
    public Produto(String tipoDaPeca, double preco, int quantidade, String descricao) {
        this.tipoDaPeca = tipoDaPeca;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    //Sobrecarga para alterar posteriomente
    public Produto(int idProduto, String tipoDaPeca, double preco, int quantidade, String descricao) {
        this.idProduto = idProduto;
        this.tipoDaPeca = tipoDaPeca;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    //Metodos acessores
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getTipoDaPeca() {
        return tipoDaPeca;
    }

    public void setTipoDaPeca(String tipoDaPeca) {
        this.tipoDaPeca = tipoDaPeca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
