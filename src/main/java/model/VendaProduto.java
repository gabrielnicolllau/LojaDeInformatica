package model;

/**
 * Representa uma venda de produto, incluindo informações como identificação da compra, cliente,
 * produto, CPF, tipo, descrição, preço, quantidade e valor total.
 * @author Luiz Augusto
 */
public class VendaProduto {

    /**
    * private int idCompra; - Identificador único da compra
    * private int idCliente; - Identificador único do cliente associado à venda
    * private int idProduto; - Identificador único do produto vendido
    * private int cpf; - Número de CPF do cliente associado à venda
    * private String tipo; - Tipo do produto vendido
    * private String descricao; - Descrição do produto vendido
    * private double preco; - Preço unitário do produto
    * private int quantidade; - Quantidade de produtos vendidos
    * private double valorTotal = preco * quantidade;Identificador único da compra. - Valor total da venda (calculado como preço * quantidade)
     */
    private int idCompra;
    private int idCliente;
    private int idProduto;
    private int cpf;
    private String tipo;
    private String descricao;
    private double preco;
    private int quantidade;
    private double valorTotal = preco * quantidade;

    /**
     * Construtor vazio para criar uma instância de venda de produto sem parâmetros.
     */
    public VendaProduto() {
        // Vazio
    }

    /**
     * Construtor para criar uma instância de venda de produto com informações básicas.
     *
     * @param tipo       Tipo do produto.
     * @param descricao  Descrição do produto.
     * @param preco      Preço unitário do produto.
     * @param quantidade Quantidade de produtos vendidos.
     */
    public VendaProduto(String tipo, String descricao, double preco, int quantidade) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    
/**
     * Construtor para criar uma instância de venda de produto com informações completas, incluindo IDs.
     *
     * @param idCompra   Identificador único da compra.
     * @param idCliente  Identificador único do cliente associado à venda.
     * @param idProduto  Identificador único do produto vendido.
     * @param cpf        Número de CPF do cliente.
     * @param tipo       Tipo do produto.
     * @param descricao  Descrição do produto.
     * @param preco      Preço unitário do produto.
     * @param quantidade Quantidade de produtos vendidos.
     */
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

    // Métodos acessores
    
/**
     * Obtém o identificador único da compra.
     *
     * @return O identificador único da compra.
     */
    public int getIdCompra() {
        return idCompra;
    }

    /**
     * Define o identificador único da compra.
     *
     * @param idCompra O identificador único da compra a ser definido.
     */
    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    /**
     * Obtém o identificador único do cliente associado à venda.
     *
     * @return O identificador único do cliente associado à venda.
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Define o identificador único do cliente associado à venda.
     *
     * @param idCliente O identificador único do cliente a ser definido.
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

        /**
     * Obtém o identificador único do produto vendido.
     *
     * @return O identificador único do produto vendido.
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * Define o identificador único do produto vendido.
     *
     * @param idProduto O identificador único do produto vendido a ser definido.
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * Obtém o número de CPF do cliente associado à venda.
     *
     * @return O número de CPF do cliente.
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * Define o número de CPF do cliente associado à venda.
     *
     * @param cpf O número de CPF do cliente a ser definido.
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém o tipo do produto vendido.
     *
     * @return O tipo do produto.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o tipo do produto vendido.
     *
     * @param tipo O tipo do produto a ser definido.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtém a descrição do produto vendido.
     *
     * @return A descrição do produto.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do produto vendido.
     *
     * @param descricao A descrição do produto a ser definida.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém o preço unitário do produto.
     *
     * @return O preço unitário do produto.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço unitário do produto.
     *
     * @param preco O preço unitário do produto a ser definido.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Obtém a quantidade de produtos vendidos.
     *
     * @return A quantidade de produtos vendidos.
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Define a quantidade de produtos vendidos.
     *
     * @param quantidade A quantidade de produtos vendidos a ser definida.
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Obtém o valor total da venda (calculado como preço * quantidade).
     *
     * @return O valor total da venda.
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * Define o valor total da venda.
     *
     * @param valorTotal O valor total da venda a ser definido.
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
