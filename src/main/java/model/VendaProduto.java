package model;

/**
 * @author Luiz Augusto
 */
public class VendaProduto {

    private int idCompra;
    private int idCliente;
    private int idProduto;
    private int cpf;
    private String tipo;
    private String descricao;
    private double preco;
    private int quantidade;
    private double valorTotal = preco * quantidade;

    public VendaProduto() {
        // Vazio
    }

    public VendaProduto(String tipo, String descricao, double preco, int quantidade) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    

    public VendaProduto(int idCompra, int idCliente, int idProduto, int cpf, String tipo, String descricao, double preco, int quantidade) {
        this.idCompra = idCompra;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.cpf = cpf;
        this.tipo = tipo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
