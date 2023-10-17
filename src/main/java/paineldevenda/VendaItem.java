package paineldevenda;

public class VendaItem {

    private int id;
    private String categoria;
    private String produto;
    private int quantidade;

    public VendaItem(int id, String categoria, String produto, int quantidade) {
        this.id = id;
        this.categoria = categoria;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
