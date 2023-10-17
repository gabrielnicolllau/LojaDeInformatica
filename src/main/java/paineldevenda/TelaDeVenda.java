package paineldevenda;

import cadastrarproduto.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaDeVenda extends javax.swing.JFrame {

    private int produtoId; // Variável para armazenar o ID do produto

    // Crie listas para armazenar produtos por categoria
    private List<String> processadores = new ArrayList<>();
    private List<String> placasMae = new ArrayList<>();
    private List<String> memoriaRam = new ArrayList<>();
    private List<String> hDD = new ArrayList<>();
    private List<String> fonte = new ArrayList<>();
    private List<String> gabinete = new ArrayList<>();

    private List<VendaItem> vendas = new ArrayList<>(); // Lista de vendas de produtos

    public TelaDeVenda() {
        initComponents();
        setLocationRelativeTo(null);

        // Preencha o cboCategoria com as categorias disponíveis
        cboCategoria.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione uma Categoria...", "Processador", "Placa-Mãe", "Memoria Ram", "HDD", "Fonte", "Gabinete"}));

        // Desative o cboProdutos inicialmente
        cboProdutos.setEnabled(false);

        // Preencha as listas de produtos por categoria
        processadores.add("Intel Core i9-11900K");
        processadores.add("Intel Core i5-11600K");
        processadores.add("AMD Ryzen 9 5900X (AMD): 12 núcleos");
        processadores.add("AMD Ryzen 5 5600X (AMD): 6 núcleos");

        placasMae.add("Placa-mãe Intel Z590");
        placasMae.add("Placa-mãe Intel B560");
        placasMae.add("Placa-mãe AMD X570");
        placasMae.add("Placa-mãe AMD B450");

        memoriaRam.add("Corsair Vengeance LPX DDR4 (1x8)");
        memoriaRam.add("G.Skill Ripjaws V Series DDR4 (1x8)");
        memoriaRam.add("Crucial Ballistix DDR4 (1x8)");
        memoriaRam.add("Kingston HyperX Fury DDR4 (1x8)");

        hDD.add("1 TB HDD");
        hDD.add("256 SSD");
        hDD.add("512 SSD");
        hDD.add("1 TB SSD");
        hDD.add("256 SSD NvMe");

        fonte.add("Corsair RM750x (750W) - Fonte de Alimentação Modular 80 PLUS Gold");
        fonte.add("EVGA SuperNOVA 850 P2 (850W) - Fonte de Alimentação Modular 80 PLUS Platinum");
        fonte.add("Seasonic Focus SGX-650 (650W) - Fonte de Alimentação 80 PLUS Gold SFX-L");

        gabinete.add("NZXT H510 Elite");
        gabinete.add("Corsair iCUE 4000X RGB");
        gabinete.add("Cooler Master MasterCase H500M");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoComputador = new javax.swing.ButtonGroup();
        bgSO = new javax.swing.ButtonGroup();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        btnDetalhes = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cboCategoria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboProdutos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        opcQuantidade = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblcarrinho = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Escolha o Produto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAdicionar.setBackground(new java.awt.Color(253, 253, 253));
        btnAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdicionar.setText("Adicionar no Carrinho");
        btnAdicionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnDetalhes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDetalhes.setText("Detalhes");
        btnDetalhes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
            }
        });

        btnRemover.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(240, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jLabel3.setText("Categoria:");

        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma CATEGORIA...", "Processador", "Placa-Mãe", "Memórias-RAM", "HDD", "Fonte", "Gabinete" }));
        cboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCategoriaActionPerformed(evt);
            }
        });

        jLabel4.setText("Produto:");

        cboProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboProdutos.setEnabled(false);
        cboProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProdutosActionPerformed(evt);
            }
        });

        jLabel5.setText("Quantidade");

        opcQuantidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opcQuantidade)
                                    .addComponent(cboProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboProdutos))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(opcQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tblcarrinho.setBackground(new java.awt.Color(204, 204, 204));
        tblcarrinho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblcarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produto", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblcarrinho);

        jLabel1.setText("Valor Total: ");

        jLabel2.setText("R$ ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

    }//GEN-LAST:event_btnConfirmarActionPerformed

    // Metodo para adicionar no carrinho
    private void adicionarVendaAoCarrinho(Produto produto) {
        DefaultTableModel modelo = (DefaultTableModel) tblcarrinho.getModel();
        modelo.addRow(new Object[]{produto.getId(), produto.getNome(), produto.getQuantidade(), produto.getPreco()});
    }

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        String categoriaSelecionada = cboCategoria.getSelectedItem().toString();

        if (categoriaSelecionada.equals("Selecione uma Categoria...")) {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma categoria antes de adicionar um produto.");
        } else {
            String nomeProdutoSelecionado = cboProdutos.getSelectedItem().toString(); // Obtenha o nome do produto selecionado
            int quantidade = (int) opcQuantidade.getValue(); // Obtenha a quantidade

            // Verifique se a quantidade é maior que zero
            if (quantidade > 0) {
                // Aqui você precisa criar um objeto Produto com base no nome do produto
                Produto produtoSelecionado = new Produto();

                produtoSelecionado.getId();
                produtoSelecionado.setNome(nomeProdutoSelecionado);
                produtoSelecionado.setQuantidade(quantidade);
                System.out.println(produtoSelecionado.getId());

                adicionarVendaAoCarrinho(produtoSelecionado);
                opcQuantidade.setValue(0); // Redefina o JSpinner para 0
            } else {
                JOptionPane.showMessageDialog(rootPane, "A quantidade deve ser maior que zero.");
            }
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int indiceLinha = tblcarrinho.getSelectedRow();

        if (indiceLinha >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tblcarrinho.getModel();
            modelo.removeRow(indiceLinha);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed

        // Exibir os detalhes a partir da ta
        int linhaSelecionada = tblcarrinho.getSelectedRow();
        if (linhaSelecionada >= 0) {

            String exibirId = tblcarrinho.getValueAt(linhaSelecionada, 0).toString();

            String exibirProduto = tblcarrinho.getValueAt(linhaSelecionada, 1).toString();

            String exibirQuantidade = tblcarrinho.getValueAt(linhaSelecionada, 2).toString();

            String exibirPreco = tblcarrinho.getValueAt(linhaSelecionada, 3).toString();

            JOptionPane.showMessageDialog(rootPane, "Id do produto " + exibirId + "\n"
                    + "Produto: " + exibirProduto + "\n"
                    + "Quantidade: " + exibirQuantidade + "\n"
                    + "Preco: " + exibirPreco + "\n");
        }

    }//GEN-LAST:event_btnDetalhesActionPerformed

    private void cboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriaActionPerformed

        String categoriaSelecionada = cboCategoria.getSelectedItem().toString();

        if (!categoriaSelecionada.equals("Selecione uma Categoria...")) {
            cboProdutos.setEnabled(true);
            if (categoriaSelecionada.equals("Processador")) {
                cboProdutos.setModel(new DefaultComboBoxModel<>(processadores.toArray(new String[0])));
            } else if (categoriaSelecionada.equals("Placa-Mãe")) {
                cboProdutos.setModel(new DefaultComboBoxModel<>(placasMae.toArray(new String[0])));
            } else if (categoriaSelecionada.equals("Memoria Ram")) { // Correção no nome da categoria
                cboProdutos.setModel(new DefaultComboBoxModel<>(memoriaRam.toArray(new String[0])));
            } else if (categoriaSelecionada.equals("HDD")) {
                cboProdutos.setModel(new DefaultComboBoxModel<>(hDD.toArray(new String[0])));
            } else if (categoriaSelecionada.equals("Fonte")) {
                cboProdutos.setModel(new DefaultComboBoxModel<>(fonte.toArray(new String[0])));
            } else if (categoriaSelecionada.equals("Gabinete")) {
                cboProdutos.setModel(new DefaultComboBoxModel<>(gabinete.toArray(new String[0])));
            } else {
                cboProdutos.setEnabled(false);
                cboProdutos.setModel(new DefaultComboBoxModel<>());
            }
        }
    }//GEN-LAST:event_cboCategoriaActionPerformed

    private void cboProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboProdutosActionPerformed

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
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JComboBox<String> cboProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner opcQuantidade;
    private javax.swing.JTable tblcarrinho;
    // End of variables declaration//GEN-END:variables
}
