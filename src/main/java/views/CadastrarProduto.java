package views;

import model.Produto;
import javax.swing.JOptionPane;
import sqlDAO.ProdutoDAO;

/**
 * A classe CadastrarProduto representa uma tela de cadastro e alteração de
 * produtos. Permite ao usuário inserir novos produtos ou editar informações de
 * produtos existentes.
 *
 * @author Gabriel
 * @see model.Produto
 * @see sqlDAO.ProdutoDAO
 */
public class CadastrarProduto extends javax.swing.JDialog {

    Produto obj = null;

    /**
     * Construtor padrão da classe.
     *
     * @param parent O componente pai.
     * @param modal Indica se a janela deve ser modal.
     */
    public CadastrarProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * Construtor que recebe um objeto Produto para edição.
     *
     * @param alterarProduto O produto a ser editado.
     */
    public CadastrarProduto(Produto alterarProduto) { // Chamar a tela e passar objeto como parametro para carregar as informacoes dele
        initComponents();

        // Falando que vai ser esse objeto
        this.obj = alterarProduto;

        //Passar valores do objeto para a tela
        lblID.setText(String.valueOf(obj.getIdProduto()));
        cboTipos.setSelectedItem(String.valueOf(obj.getTipoDaPeca()));
        txtPreco.setText(String.valueOf(obj.getPreco()));
        jsQuantidade.setValue(obj.getQuantidade());
        txtDescricao.setText(obj.getDescricao());

        // Define o valor do JComboBox e o torna não editável
        cboTipos.setEnabled(false);
        cboTipos.setFocusable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jsQuantidade = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboTipos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtPreco = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSalvar.setBackground(new java.awt.Color(204, 255, 204));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 153, 153));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tela Cadastro Computador");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Info"));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Descrição:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Quantidade:");

        jsQuantidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Preço:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tipo:");

        cboTipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Tipo...", "Processador", "Placa-Mãe", "Memória RAM", "HDD", "Fonte", "Gabinete" }));
        cboTipos.setMinimumSize(new java.awt.Dimension(163, 22));
        cboTipos.setPreferredSize(new java.awt.Dimension(163, 22));
        cboTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTiposActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("ID:");

        lblID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblID.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblID)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jsQuantidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboTipos, javax.swing.GroupLayout.Alignment.TRAILING, 0, 283, Short.MAX_VALUE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPreco))
                .addGap(104, 104, 104))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jsQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método acionado ao pressionar o botão "Salvar". Realiza a inclusão de um
     * novo produto ou a alteração de um produto existente, dependendo do
     * contexto.
     *
     * @param evt O evento associado ao botão "Salvar".
     */
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // Esse de inclusao, produto ainda nao existe
        if (obj == null) {

            // Resgatar dados da interface e passar para o objeto "novoProduto"
            String tipo = cboTipos.getSelectedItem().toString();
            double preco = 0;
            int quantidade = 0;
            String descricao = txtDescricao.getText();

            try {
                preco = Double.parseDouble(txtPreco.getText());
                quantidade = Integer.parseInt(jsQuantidade.getValue().toString());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Preço e quantidade devem ser números válidos.");
                return;
            }

            if (tipo.equals("Selecione o Tipo...") || preco <= 0 || quantidade <= 0 || descricao.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios.");
            } else {
                // Passando os dados coletados da tela "CadastrarProduto" para o objeto "novoProduto"
                Produto novoProduto = new Produto(tipo, preco, quantidade, descricao);

                // Call your save method here
                if (ProdutoDAO.salvar(novoProduto)) {
                    JOptionPane.showMessageDialog(null, "Salvo!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível salvar!");
                }

                this.dispose();
            }

        } else {
            // Modo de alteração, produto já existe

            // Usando os dados que o usuário alterou na tela para atualizar o objeto
            String tipo = cboTipos.getSelectedItem().toString();
            double preco = 0;
            int quantidade = 0;
            String descricao = txtDescricao.getText();

            try {
                preco = Double.parseDouble(txtPreco.getText());
                quantidade = Integer.parseInt(jsQuantidade.getValue().toString());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Preço e quantidade devem ser números válidos.");
                return;
            }

            if (tipo.equals("Selecione o Tipo...") || preco <= 0 || quantidade <= 0 || descricao.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios.");
            } else {
                obj.setTipoDaPeca(tipo);
                obj.setPreco(preco);
                obj.setQuantidade(quantidade);
                obj.setDescricao(descricao);

                // Call your update method here
                if (ProdutoDAO.alterar(obj)) {
                    JOptionPane.showMessageDialog(null, "Alteração feita!");
                } else {
                    JOptionPane.showMessageDialog(null, "Alteração falhou!");
                }

                this.dispose();
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed
    /**
     * Método acionado ao selecionar um item no JComboBox.
     *
     * @param evt O evento associado ao JComboBox.
     */
    private void cboTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTiposActionPerformed
    /**
     * Método acionado ao pressionar o botão "Cancelar".
     *
     * @param evt O evento associado ao botão "Cancelar".
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastrarProduto dialog = new CadastrarProduto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cboTipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jsQuantidade;
    private javax.swing.JLabel lblID;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JFormattedTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
