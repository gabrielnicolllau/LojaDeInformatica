
package model;

import java.util.Date;

/**
 * A classe Venda representa uma transação de venda de um produto para um cliente.
 * @author Gabriel Nicolau
 */

public class Venda {
/**
 * A classe possui informações como o identificador da venda, produto, cliente,
 * data da compra, quantidade comprada e total.
 * Esta classe fornece métodos para acessar e modificar essas informações.
 */
    private int idVenda;
    private int idProduto;
    private int idCliente;
    private Date dataCompra;
    private int quantidadeComprada;
    private double total;

    /**
     * Construtor vazio para a classe Venda.
     */
    // Construtor vazio
    public Venda() {

    }

    /**
     * Construtor para a classe Venda com parâmetros.
     * 
     * @param idProduto           O identificador do produto vendido.
     * @param idCliente           O identificador do cliente que fez a compra.
     * @param dataCompra          A data da compra.
     * @param quantidadeComprada  A quantidade do produto comprada.
     * @param total               O valor total da compra.
     */
    public Venda(int idProduto, int idCliente, Date dataCompra, int quantidadeComprada, double total) {
        this.idProduto = idProduto;
        this.idCliente = idCliente;
        this.dataCompra = dataCompra;
        this.quantidadeComprada = quantidadeComprada;
        this.total = total;
    }
    
    // Construtor com parametros
    /**
     * Construtor para a classe Venda com parâmetros.
     * 
     * @param idVenda             O identificador da venda.
     * @param idProduto           O identificador do produto vendido.
     * @param idCliente           O identificador do cliente que fez a compra.
     * @param quantidadeComprada  A quantidade do produto comprada.
     */
    public Venda(int idVenda, int idProduto, int idCliente, int quantidadeComprada) {
        this.idVenda = idVenda;
        this.idProduto = idProduto;
        this.idCliente = idCliente;
        this.quantidadeComprada = quantidadeComprada;
    }

    // Metodos
    /**
     * Obtém o identificador da venda.
     * 
     * @return O identificador da venda.
     */
    public int getIdVenda() {
        return idVenda;
    }

    /**
     * Define o identificador da venda.
     * 
     * @param idVenda O identificador da venda.
     */
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    /**
     * Obtém o identificador do produto vendido.
     * 
     * @return O identificador do produto vendido.
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * Define o identificador do produto vendido.
     * 
     * @param idProduto O identificador do produto vendido.
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * Obtém o identificador do cliente que fez a compra.
     * 
     * @return O identificador do cliente.
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Define o identificador do cliente que fez a compra.
     * 
     * @param idCliente O identificador do cliente.
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Obtém a data da compra.
     * 
     * @return A data da compra.
     */
    public Date getDataCompra() {
        return dataCompra;
    }

    /**
     * Define a data da compra.
     * 
     * @param dataCompra A data da compra.
     */
    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    /**
     * Obtém a quantidade do produto comprada.
     * 
     * @return A quantidade do produto comprada.
     */
    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    /**
     * Define a quantidade do produto comprada.
     * 
     * @param quantidadeComprada A quantidade do produto comprada.
     */
    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    /**
     * Obtém o valor total da compra.
     * 
     * @return O valor total da compra.
     */
    public double getTotal() {
        return total;
    }

    /**
     * Define o valor total da compra.
     * 
     * @param total O valor total da compra.
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
