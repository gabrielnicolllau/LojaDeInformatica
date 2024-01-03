package model;
/**
 * A classe VendaItem representa um item de venda em um sistema de gerenciamento de vendas.
 */
public class VendaItem {

    private int id;
    private String categoria;
    private String produto;
    private int quantidade;

    /**
     * Construtor da classe VendaItem.
     *
     * @param id          O identificador único do item de venda.
     * @param categoria   A categoria do produto.
     * @param produto     O nome do produto.
     * @param quantidade  A quantidade do produto vendido.
     */
    public VendaItem(int id, String categoria, String produto, int quantidade) {
        this.id = id;
        this.categoria = categoria;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    /**
     * Obtém o identificador único do item de venda.
     *
     * @return O identificador único do item de venda.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtém a categoria do produto.
     *
     * @return A categoria do produto.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Obtém o nome do produto.
     *
     * @return O nome do produto.
     */
    public String getProduto() {
        return produto;
    }

    /**
     * Obtém a quantidade do produto vendido.
     *
     * @return A quantidade do produto vendido.
     */
    public int getQuantidade() {
        return quantidade;
    }
}
