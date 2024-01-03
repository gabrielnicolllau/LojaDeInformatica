package views;

import java.time.LocalDate;
import java.time.ZoneId;
import model.Produto;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Venda;
import sqlDAO.VendaDAO;

public class TelaDeVenda extends javax.swing.JFrame {

    public TelaDeVenda() {
        initComponents();
        setLocationRelativeTo(null);

        // Preencha o cboCategoria com as categorias disponíveis
        cboCategoria.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione uma Categoria...", "Processador", "Placa-Mãe", "Memoria Ram", "HDD", "Fonte", "Gabinete"}));

        // Desative o cboProdutos inicialmente
        cboProdutos.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoComputador = new javax.swing.ButtonGroup();
        bgSO = new javax.swing.ButtonGroup();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cboCategoria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboProdutos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        opcQuantidade = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        btnAdicionarCarrinho = new javax.swing.JButton();
        btnDetalhes = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblcarrinho = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblValorTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Tipo:");

        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma CATEGORIA...", "Processador", "Placa-Mãe", "Memórias-RAM", "HDD", "Fonte", "Gabinete" }));
        cboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCategoriaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Produto/Descrição:");

        cboProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboProdutos.setEnabled(false);
        cboProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProdutosActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Quantidade");

        opcQuantidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAdicionarCarrinho.setBackground(new java.awt.Color(204, 204, 204));
        btnAdicionarCarrinho.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdicionarCarrinho.setText("Adicionar no Carrinho");
        btnAdicionarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCarrinhoActionPerformed(evt);
            }
        });

        btnDetalhes.setBackground(new java.awt.Color(204, 204, 204));
        btnDetalhes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDetalhes.setText("Detalhes");
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
            }
        });

        btnConfirmar.setBackground(new java.awt.Color(204, 255, 204));
        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnRemover.setBackground(new java.awt.Color(255, 153, 135));
        btnRemover.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdicionarCarrinho)
                .addGap(18, 18, 18)
                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TELA DE VENDAS");
        jLabel6.setToolTipText("");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCPFFocusLost(evt);
            }
        });
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("CPF:");

        lblNome.setText("Nome");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboProdutos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcQuantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(167, 167, 167))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPF)
                    .addComponent(jLabel7))
                .addGap(21, 21, 21)
                .addComponent(lblNome)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(opcQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tblcarrinho.setBackground(new java.awt.Color(204, 204, 204));
        tblcarrinho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblcarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID do produto", "Tipo", "Descrição", "Valor Unitário", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblcarrinho);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Valor Total R$");

        lblValorTotal.setText("Valor Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 471, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // METODOS
    /*
     * Esse metodo vai percorrer a tabela na coluna 4 que é o preço
     * e vai somar seus valores.
     */
    //Jtable é a propriedade da tabela
    /**
     * Calcula o valor total dos itens na tabela.
     *
     * @param tabela a tabela onde os itens estão listados, Jtable é a
     * propriedade da tabela.
     * @return o valor total dos itens na tabela
     */
    private double calcularValorTotal(JTable tabela) {
        double total = 0;
        for (int i = 0; i < tabela.getRowCount(); i++) {
            total += (double) tabela.getValueAt(i, 5);
        }
        return total;
    }

    /**
     * Verifica se o produto já está no carrinho.
     *
     * @author Gabriel Nicolau
     * @param tblCarrinho a tabela onde os produtos estão listados
     * @param idProduto o ID do produto a ser verificado
     * @return true se o produto estiver no carrinho, caso contrário, retorna
     * false
     */
    private boolean produtoJaNoCarrinho(JTable tblCarrinho, int idProduto) {
        int contarLinhas = tblCarrinho.getRowCount();
        boolean produtoJaAdicionado = false;

        for (int i = 0; i < contarLinhas; i++) {
            int id = (int) tblCarrinho.getValueAt(i, 0); // Supondo que o ID do produto esteja na primeira coluna

            if (id == idProduto) {
                produtoJaAdicionado = true;
                break;
            }
        }

        return produtoJaAdicionado;
    }

    /**
     * Confirma a compra dos itens presentes no carrinho quando o botão
     * correspondente é pressionado na interface. Vai ser pego as informações
     * dos devidos campos.
     *
     * @param evt o evento de ação associado ao botão
     * @author Gabriel Nicolau
     */
    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) tblcarrinho.getModel();
        ArrayList<Venda> vendas = new ArrayList<>(); // Criando lista de venda 

        for (int i = 0; i < modelo.getRowCount(); i++) {

            int idProduto = (int) modelo.getValueAt(i, 0); // Obtém o ID do produto da primeira coluna
            String cpf = txtCPF.getText(); // Pegando o CPF da janela
            Cliente cliente = VendaDAO.buscarNomePorCPF(cpf); // Buscar o cpf no banco

            // Se o cliente for vazio
            if (cliente != null) {

                int idCliente = cliente.getIdCliente(); // Pega i id dele
                LocalDate dataAtual = LocalDate.now(); // Data da compra
                Date dataCompraUtil = Date.from(dataAtual.atStartOfDay(ZoneId.systemDefault()).toInstant()); // Converter um LocalDate em um Date
                java.sql.Date dataCompraSQL = new java.sql.Date(dataCompraUtil.getTime()); // Para guardar no banco

                // Pega a quantidade na tabela do Java e o valor
                int quantidade = Integer.parseInt(modelo.getValueAt(i, 4).toString());
                double valorTotal = Double.parseDouble(modelo.getValueAt(i, 5).toString());

                // Guarda as informações na Classe Venda
                Venda novaVenda = new Venda(idProduto, idCliente, dataCompraSQL, quantidade, valorTotal);
                vendas.add(novaVenda); // Adiciona na lista de Venda
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
            }
        }

        // Salvar a lista no de produtos comprados no banco
        for (Venda produtosDaLista : vendas) {
            boolean inserido = VendaDAO.salvar(produtosDaLista);

            if (!inserido) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar a venda no banco de dados.");
            } else {
                boolean atualizacaoEstoque = VendaDAO.decrementarQuantidadeEstoque(produtosDaLista.getIdProduto(), produtosDaLista.getQuantidadeComprada());
                if (!atualizacaoEstoque) {
                    JOptionPane.showMessageDialog(null, "Erro ao atualizar a quantidade do produto.");

                }
            }
        }

        JOptionPane.showMessageDialog(null, "Compra concluída");

        // Reseta a venda
        modelo.setRowCount(0);
        lblValorTotal.setText("R$ 0.00");
        txtCPF.setEditable(true);
        txtCPF.setFocusable(true);

    }//GEN-LAST:event_btnConfirmarActionPerformed

    /**
     * @author Gabriel Nicolau Adiciona um produto selecionado ao carrinho
     * quando o botão for acionado
     * @param evt o evento de ação associado ao botão
     */
    private void btnAdicionarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCarrinhoActionPerformed

        // Pega as primeiras informações da tabela do Java e guarda em variáveis
        String tipoSelecionado = cboCategoria.getSelectedItem().toString();
        String descricaoProduto = cboProdutos.getSelectedItem().toString();
        int quantidade = (int) opcQuantidade.getValue();

        // Esse if verifica se tipo, descrição e quantidade está preechido, se for true executa o if.
        if (tipoSelecionado.equals("Selecione uma Categoria...") || quantidade == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um tipo e uma quantidade válida antes de adicionar o produto.");

            // se for falso, executa esse.
        } else {
            // Vai buscar no banco a lista do produto selecionado
            ArrayList<Produto> produtos = VendaDAO.buscarProdutosPorCategoria(tipoSelecionado);
            Produto produtoSelecionado = null; // Nenhum produto selecionado ainda.

            /*
             * Percorrendo uma lista de produtos (produtos).
             * Verifica se a descrição do produto atual é igual à descrição do produto selecionado (descricaoProduto)
             * que pegamos na variavel anteriormente.
             */
            for (Produto item : produtos) {
                if (item.getDescricao().equals(descricaoProduto)) {
                    produtoSelecionado = item;
                    break;
                }
            }

            // Verica se o produto é vazio.
            if (produtoSelecionado != null) {

                // Verifica se a quantidade selecionada pelo usuário está disponível
                if (quantidade <= produtoSelecionado.getQuantidade()) {

                    double valorUnitario = produtoSelecionado.getPreco(); // Pegando o preço do produto selecionado
                    double valorTotalItem = valorUnitario * quantidade; // Calcula o total com base na quantidade selecionada

                    // Verificar se o produto já carrinho
                    if (produtoJaNoCarrinho(tblcarrinho, produtoSelecionado.getIdProduto())) {
                        JOptionPane.showMessageDialog(rootPane, "Este produto já está no carrinho.");
                    } else {

                        // Passando os produtos para a tabela do Java
                        DefaultTableModel model = (DefaultTableModel) tblcarrinho.getModel();
                        model.addRow(new Object[]{
                            produtoSelecionado.getIdProduto(),
                            produtoSelecionado.getTipoDaPeca(),
                            produtoSelecionado.getDescricao(),
                            produtoSelecionado.getPreco(),
                            quantidade,
                            valorTotalItem

                        });
                    }

                    // Chamadno a funcao para calcular e jogar no label o total da compra
                    double valorTotal = calcularValorTotal(tblcarrinho);
                    lblValorTotal.setText(String.format("R$ %.2f", valorTotal));

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Quantidade indisponível em estoque. Estoque atual: " + produtoSelecionado.getQuantidade());

                }
            }
        }
    }//GEN-LAST:event_btnAdicionarCarrinhoActionPerformed

    /**
     *
     * Remove o item selecionado da tabela ao pressionar o botão "Remover".
     * Verifica se uma linha está selecionada na tabela e remove o item
     * correspondente.
     *
     * @param evt o evento de ação associado ao botão.
     * @author Gabriel Nicolau
     */
    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int indiceLinha = tblcarrinho.getSelectedRow();

        if (indiceLinha >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tblcarrinho.getModel();
            modelo.removeRow(indiceLinha);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    /**
     * Ação realizada ao pressionar o botão "Detalhes". Mostra os detalhes dos
     * itens presentes na tabela. Ele vai percorrer a tabela do java e vai pegar
     * as informações que tiver na tabela e mostrar na tela no final.
     *
     * @param evt evento de clique no botão
     */
    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) tblcarrinho.getModel();

        String detalhes = "Resumo das Peças:\n\n";

        for (int i = 0; i < modelo.getRowCount(); i++) {
            detalhes += "Tipo: " + modelo.getValueAt(i, 1) + "\n";
            detalhes += "Descrição: " + modelo.getValueAt(i, 2) + "\n";
            detalhes += "Quantidade: " + modelo.getValueAt(i, 4) + "\n";
            detalhes += "Valor Unitário: R$ " + modelo.getValueAt(i, 3) + "\n";
            detalhes += "Preço Total: R$ " + modelo.getValueAt(i, 5) + "\n\n";
        }

        JOptionPane.showMessageDialog(null, detalhes, "Detalhes das Peças", JOptionPane.PLAIN_MESSAGE);


    }//GEN-LAST:event_btnDetalhesActionPerformed

    /**
     * Atualiza a lista de produtos disponíveis de acordo com a categoria
     * selecionada. Ao escolher uma categoria no menu suspenso, atualiza o menu
     * suspenso de produtos com base na categoria selecionada.
     *
     * @param evt o evento de ação associado ao menu suspenso de categoria.
     */
    private void cboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriaActionPerformed

        String categoriaSelecionada = cboCategoria.getSelectedItem().toString();

        if (!categoriaSelecionada.equals("Selecione uma CATEGORIA...")) {
            ArrayList<Produto> produtos = VendaDAO.buscarProdutosPorCategoria(categoriaSelecionada);

            String[] nomesProdutos = produtos.stream().map(Produto::getDescricao).toArray(String[]::new);

            cboProdutos.setModel(new DefaultComboBoxModel<>(nomesProdutos));
            cboProdutos.setEnabled(true);
        } else {
            cboProdutos.setEnabled(false);
            cboProdutos.setModel(new DefaultComboBoxModel<>(new String[]{}));
        }
    }//GEN-LAST:event_cboCategoriaActionPerformed

    private void cboProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboProdutosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtCPFActionPerformed

    /**
     * Verifica o CPF digitado após a perda de foco do campo de texto. Se
     * cliente for encotrado ele mostra tela e desativa para preecher outro cpf.
     * Se não encotrar nada ele retorna que o cliente não foi encontrado
     *
     * @param evt o evento de perda de foco associado ao campo de CPF.
     */

    private void txtCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFFocusLost
        String cpf = txtCPF.getText();

        // Verifica se o CPF foi digitado corretamente (com 11 dígitos)
        if (cpf.length() == 14) {
            Cliente cliente = VendaDAO.buscarNomePorCPF(cpf);

            if (cliente != null) {
                lblNome.setText(cliente.getNome());

                // Desativa o campo CPF após encontrar o cliente
                txtCPF.setEditable(false);
                txtCPF.setFocusable(false);
            } else {
                lblNome.setText("Cliente não encontrado");
            }
        } else {
            lblNome.setText("CPF inválido");
        }

    }//GEN-LAST:event_txtCPFFocusLost

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDeVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSO;
    private javax.swing.ButtonGroup bgTipoComputador;
    private javax.swing.JButton btnAdicionarCarrinho;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JComboBox<String> cboProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JSpinner opcQuantidade;
    private javax.swing.JTable tblcarrinho;
    private javax.swing.JFormattedTextField txtCPF;
    // End of variables declaration//GEN-END:variables
}
