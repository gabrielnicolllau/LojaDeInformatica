package model;

/**
 * Representa um produto com informações como ID, tipo da peça, preço, quantidade e descrição.
 * Esta classe pode ser utilizada para armazenar e manipular dados de produtos.
 * 
 * @author Gabriel Nicolau
 */
public class Produto {

    /**
 *  private int idProduto; - Identificador único do produto
    private String tipoDaPeca; - Tipo da peça associada ao produto
    private double preco; - Preço do produto
    private int quantidade; - Quantidade disponível em estoque
    String descricao; - Descrição detalhada do produto
 */
    private int idProduto;
    private String tipoDaPeca;
    private double preco;
    private int quantidade;
    String descricao;

    /**
     * Construtor padrão para um produto vazio.
     */
    public Produto() {
        // Construtor vazio
    }

    /**
     * Construtor para criar um produto com informações básicas.
     *
     * @param tipoDaPeca Tipo da peça associada ao produto.
     * @param preco      Preço do produto.
     * @param quantidade Quantidade disponível do produto.
     * @param descricao  Descrição do produto.
     */
    //Para guardar no banco de dados
    public Produto(String tipoDaPeca, double preco, int quantidade, String descricao) {
        this.tipoDaPeca = tipoDaPeca;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    /**
     * Sobrecarga do construtor para criar um produto com informações completas, incluindo ID.
     *
     * @param idProduto  Identificador único do produto.
     * @param tipoDaPeca Tipo da peça associada ao produto.
     * @param preco      Preço do produto.
     * @param quantidade Quantidade disponível do produto.
     * @param descricao  Descrição do produto.
     */
    //Sobrecarga para alterar posteriomente
    public Produto(int idProduto, String tipoDaPeca, double preco, int quantidade, String descricao) {
        this.idProduto = idProduto;
        this.tipoDaPeca = tipoDaPeca;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    //Metodos acessores
    /**
     * Obtém o ID do produto.
     *
     * @return O ID do produto.
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * Define o ID do produto.
     *
     * @param idProduto O ID a ser definido para o produto.
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * Obtém o tipo da peça associada ao produto.
     *
     * @return O tipo da peça.
     */
    public String getTipoDaPeca() {
        return tipoDaPeca;
    }

    /**
     * Define o tipo da peça associada ao produto.
     *
     * @param tipoDaPeca O tipo da peça a ser definido.
     */
    public void setTipoDaPeca(String tipoDaPeca) {
        this.tipoDaPeca = tipoDaPeca;
    }
   
    /**
     * Obtém o preço do produto.
     *
     * @return O preço do produto.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço do produto.
     *
     * @param preco O preço a ser definido para o produto.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Obtém a quantidade disponível do produto.
     *
     * @return A quantidade disponível do produto.
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Define a quantidade disponível do produto.
     *
     * @param quantidade A quantidade a ser definida para o produto.
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    /**
     * Obtém a descrição do produto.
     *
     * @return A descrição do produto.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do produto.
     *
     * @param descricao A descrição a ser definida para o produto.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
