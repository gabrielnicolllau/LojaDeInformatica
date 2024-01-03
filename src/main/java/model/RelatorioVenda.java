package model;

import java.util.Date;

/**
* Representa um relatório de venda, incluindo informações como datas de início e fim do período,
* data da venda, quantidade comprada, nome do produto, valor unitário, identificador do cliente e valor total.
* @author Luiz Augusto
*/

public class RelatorioVenda {

    /**
    * private Date dataInicio; - Data de início do período do relatório.
    * private Date dataFim; - Data de fim do período do relatório.
    * private Date dataVenda; - Data da venda no relatório.
    * private int quantidadeComprada; - Quantidade de produtos comprados na venda.
    * private String nomeProduto; -  Nome do produto vendido.
    * private double valorUnitario; - Valor unitário do produto
    * private int idCliente; - Identificador único do cliente associado à venda no relatório.
    * private double valorTotal; -  Valor total da venda no relatório.
    */
    private Date dataInicio;

    private Date dataFim;

    private Date dataVenda;
    
    private int quantidadeComprada;
    
    private String nomeProduto;
    
    private double valorUnitario;

    private int idCliente;

    private double valorTotal;

    /**
     * Obtém a data de início do período do relatório.
     *
     * @return A data de início do período.
     */
    public Date getDataInicio() {
        return dataInicio;
    }
   
    /**
     * Define a data de início do período do relatório.
     *
     * @param dataInicio A data de início do período a ser definida.
     */
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * Obtém a data de fim do período do relatório.
     *
     * @return A data de fim do período.
     */
    public Date getDataFim() {
        return dataFim;
    }

    /**
     * Define a data de fim do período do relatório.
     *
     * @param dataFim A data de fim do período a ser definida.
     */
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * Obtém a data da venda no relatório.
     *
     * @return A data da venda.
     */
    public Date getDataVenda() {
        return dataVenda;
    }

    /**
     * Define a data da venda no relatório.
     *
     * @param dataVenda A data da venda a ser definida.
     */
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * Obtém o identificador único do cliente associado à venda no relatório.
     *
     * @return O identificador único do cliente.
     */
    public int getIdCliente() {
        return idCliente;
    }

   /**
     * Define o identificador único do cliente associado à venda no relatório.
     *
     * @param idCliente O identificador único do cliente a ser definido.
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Obtém o valor total da venda no relatório.
     *
     * @return O valor total da venda.
     */
    public double getValorTotal() {
        return valorTotal;
    }

        /**
     * Define o valor total da venda no relatório.
     *
     * @param valorTotal O valor total da venda a ser definido.
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

   /**
     * Obtém a quantidade de produtos comprados na venda.
     *
     * @return A quantidade de produtos comprados.
     */
    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

  /**
     * Define a quantidade de produtos comprados na venda.
     *
     * @param quantidadeComprada A quantidade de produtos comprados a ser definida.
     */
    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }
  
    /**
     * Obtém o nome do produto vendido.
     *
     * @return O nome do produto.
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * Define o nome do produto vendido.
     *
     * @param nomeProduto O nome do produto a ser definido.
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

     /**
     * Obtém o valor unitário do produto.
     *
     * @return O valor unitário do produto.
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

     /**
     * Define o valor unitário do produto.
     *
     * @param valorUnitario O valor unitário do produto a ser definido.
     */
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    
}
    
