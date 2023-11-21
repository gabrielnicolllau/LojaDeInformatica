
package model;

import java.util.Date;

/**
 *
 * @author Gabriel Nicolau
 */
public class Venda {

    private int idVenda;
    private int idProduto;
    private int idCliente;
    private Date dataCompra;
    private int quantidadeComprada;

    // Construtor vazio
    public Venda() {

    }

    // Construtor com parametros
    public Venda(int idVenda, int idProduto, int idCliente, int quantidadeComprada) {
        this.idVenda = idVenda;
        this.idProduto = idProduto;
        this.idCliente = idCliente;
        this.quantidadeComprada = quantidadeComprada;
    }

    // Metodos
    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

}
