package views;

/**
* @author Lucca Leonardo
*/

public class TelaRelatorioAnalitico extends javax.swing.JFrame {

    public TelaRelatorioAnalitico() {
        initComponents();
        initComponents();
        setResizable(false); //Impedir alteração no tamanho da tela       
        setLocationRelativeTo(null); //deixar centralizado na tela do monitor
        this.setTitle("Loja de Informática - Tela de Relatórios Analíticos"); //altera titulo da janela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        pnlRelatorioAnalitico = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuOpcoes = new javax.swing.JMenu();
        opMenuPrincipal = new javax.swing.JMenuItem();
        opCadastroClientes = new javax.swing.JMenuItem();
        opCadastroProdutos = new javax.swing.JMenuItem();
        opTelaVendas = new javax.swing.JMenuItem();
        opRelatorioSintetico = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        opSair = new javax.swing.JMenuItem();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlRelatorioAnalitico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relatórios Analítico de Vendas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quantidade", "Valor Unitário", "Valor Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel2.setText("Nome do Cliente:");

        jLabel3.setText("ID do Cliente:");

        jLabel4.setText("ID Pedido:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(441, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Valor Total:");

        javax.swing.GroupLayout pnlRelatorioAnaliticoLayout = new javax.swing.GroupLayout(pnlRelatorioAnalitico);
        pnlRelatorioAnalitico.setLayout(pnlRelatorioAnaliticoLayout);
        pnlRelatorioAnaliticoLayout.setHorizontalGroup(
            pnlRelatorioAnaliticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatorioAnaliticoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRelatorioAnaliticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                    .addGroup(pnlRelatorioAnaliticoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlRelatorioAnaliticoLayout.setVerticalGroup(
            pnlRelatorioAnaliticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatorioAnaliticoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        menuOpcoes.setText("Opções");

        opMenuPrincipal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opMenuPrincipal.setText("Menu Principal");
        opMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMenuPrincipalActionPerformed(evt);
            }
        });
        menuOpcoes.add(opMenuPrincipal);

        opCadastroClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opCadastroClientes.setText("Cadastro de Clientes");
        opCadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadastroClientesActionPerformed(evt);
            }
        });
        menuOpcoes.add(opCadastroClientes);

        opCadastroProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opCadastroProdutos.setText("Casdastro de Produtos");
        opCadastroProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadastroProdutosActionPerformed(evt);
            }
        });
        menuOpcoes.add(opCadastroProdutos);

        opTelaVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opTelaVendas.setText("Tela de Vendas");
        opTelaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opTelaVendasActionPerformed(evt);
            }
        });
        menuOpcoes.add(opTelaVendas);

        opRelatorioSintetico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opRelatorioSintetico.setText("Relatórios");
        opRelatorioSintetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRelatorioSinteticoActionPerformed(evt);
            }
        });
        menuOpcoes.add(opRelatorioSintetico);
        menuOpcoes.add(jSeparator1);

        opSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opSair.setText("Sair");
        opSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSairActionPerformed(evt);
            }
        });
        menuOpcoes.add(opSair);

        jMenuBar1.add(menuOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRelatorioAnalitico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRelatorioAnalitico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMenuPrincipalActionPerformed
        InterfacePrincipal menuPrincipal = new InterfacePrincipal();
        menuPrincipal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opMenuPrincipalActionPerformed

    private void opCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastroClientesActionPerformed
        
    }//GEN-LAST:event_opCadastroClientesActionPerformed

    private void opCadastroProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastroProdutosActionPerformed
        
    }//GEN-LAST:event_opCadastroProdutosActionPerformed

    private void opTelaVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opTelaVendasActionPerformed
        TelaDeVenda telaVenda = new TelaDeVenda();
        telaVenda.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opTelaVendasActionPerformed

    private void opRelatorioSinteticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRelatorioSinteticoActionPerformed
        TelaRelatorioSintetico telaRelatorio = new TelaRelatorioSintetico();
        telaRelatorio.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opRelatorioSinteticoActionPerformed

    private void opSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_opSairActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorioAnalitico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenuItem opCadastroClientes;
    private javax.swing.JMenuItem opCadastroProdutos;
    private javax.swing.JMenuItem opMenuPrincipal;
    private javax.swing.JMenuItem opRelatorioSintetico;
    private javax.swing.JMenuItem opSair;
    private javax.swing.JMenuItem opTelaVendas;
    private javax.swing.JPanel pnlRelatorioAnalitico;
    // End of variables declaration//GEN-END:variables
}
