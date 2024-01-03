package views;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.RelatorioVenda;
import sqlDAO.RelatorioVendaDAO;
import views.InterfacePrincipal;
import views.TelaDeVenda;

/**
 * A classe TelaRelatorioVenda representa a interface gráfica para exibição de
 * relatórios de vendas. Permite a pesquisa e exibição de relatórios sintéticos
 * e detalhados de vendas. Permite também a navegação para outras telas do
 * sistema.
 *
 * @author Luiz Augusto
 * @author Lucca Leonardo
 */
public class TelaRelatorioVenda extends javax.swing.JFrame {

    /**
     * Cria uma nova instância da tela de relatórios de venda.
     */
    public TelaRelatorioVenda() {
        initComponents();
        setResizable(false); //Impedir alteração no tamanho da tela       
        setLocationRelativeTo(null); //deixar centralizado na tela do monitor
        this.setTitle("Loja de Informática - Tela de Relatórios");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblRelatorioDetalhes = new javax.swing.JTable();
        pnlRelatorioSintetico = new javax.swing.JPanel();
        txtPeriodoAte = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPeriodoDe = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRelatorioSintetico = new javax.swing.JTable();
        txtTotalPeriodo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDetalhes = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRelatorioAnalitico = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuOpcoes1 = new javax.swing.JMenu();
        opMenuPrincipal1 = new javax.swing.JMenuItem();
        opCadastroClientes1 = new javax.swing.JMenuItem();
        opCadastroProdutos1 = new javax.swing.JMenuItem();
        opTelaVendas1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        opSair1 = new javax.swing.JMenuItem();

        tblRelatorioDetalhes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produto", "Quantidade", "Valor Unitário", "Valor Total"
            }
        ));
        jScrollPane2.setViewportView(tblRelatorioDetalhes);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlRelatorioSintetico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relatórios de Vendas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        try {
            txtPeriodoAte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Até");

        try {
            txtPeriodoDe.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setText("Pesquise pelo período:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tblRelatorioSintetico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data da Venda", "Cliente", "Valor Total da Venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRelatorioSintetico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRelatorioSinteticoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRelatorioSintetico);

        txtTotalPeriodo.setText("Valor Total do Período:");

        jLabel4.setText("De:");

        btnDetalhes.setText("Detalhes");
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRelatorioSinteticoLayout = new javax.swing.GroupLayout(pnlRelatorioSintetico);
        pnlRelatorioSintetico.setLayout(pnlRelatorioSinteticoLayout);
        pnlRelatorioSinteticoLayout.setHorizontalGroup(
            pnlRelatorioSinteticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatorioSinteticoLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPeriodoDe, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPeriodoAte, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisar)
                .addGap(35, 35, 35)
                .addComponent(btnDetalhes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlRelatorioSinteticoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRelatorioSinteticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRelatorioSinteticoLayout.createSequentialGroup()
                        .addGroup(pnlRelatorioSinteticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                            .addGroup(pnlRelatorioSinteticoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnlRelatorioSinteticoLayout.createSequentialGroup()
                        .addComponent(txtTotalPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 383, Short.MAX_VALUE))))
        );

        pnlRelatorioSinteticoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPeriodoAte, txtPeriodoDe});

        pnlRelatorioSinteticoLayout.setVerticalGroup(
            pnlRelatorioSinteticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatorioSinteticoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRelatorioSinteticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeriodoAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtPeriodoDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar)
                    .addComponent(jLabel4)
                    .addComponent(btnDetalhes))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalPeriodo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlRelatorioSinteticoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtPeriodoAte, txtPeriodoDe});

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhe da Venda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tblRelatorioAnalitico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produto", "Quantidade", "Valor Unitário", "Valor Total"
            }
        ));
        jScrollPane3.setViewportView(tblRelatorioAnalitico);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuOpcoes1.setText("Opções");

        opMenuPrincipal1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opMenuPrincipal1.setText("Menu Principal");
        opMenuPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMenuPrincipal1ActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opMenuPrincipal1);

        opCadastroClientes1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opCadastroClientes1.setText("Cadastro de Clientes");
        opCadastroClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadastroClientes1ActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opCadastroClientes1);

        opCadastroProdutos1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opCadastroProdutos1.setText("Casdastro de Produtos");
        opCadastroProdutos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadastroProdutos1ActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opCadastroProdutos1);

        opTelaVendas1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opTelaVendas1.setText("Tela de Vendas");
        opTelaVendas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opTelaVendas1ActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opTelaVendas1);
        menuOpcoes1.add(jSeparator2);

        opSair1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opSair1.setText("Sair");
        opSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSair1ActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opSair1);

        jMenuBar1.add(menuOpcoes1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRelatorioSintetico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlRelatorioSintetico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Fecha a tela de relatórios ao selecionar a opção "Sair" no menu.
     *
     * @param evt O evento de clique no item de menu "Sair".
     */
    private void opSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSair1ActionPerformed
        dispose();
    }//GEN-LAST:event_opSair1ActionPerformed

    /**
     * Navega para a tela de vendas ao selecionar a opção "Tela de Vendas" no
     * menu.
     *
     * @param evt O evento de clique no item de menu "Tela de Vendas".
     */
    private void opTelaVendas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opTelaVendas1ActionPerformed
        TelaDeVenda telaVenda = new TelaDeVenda();
        telaVenda.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opTelaVendas1ActionPerformed

    private void opCadastroProdutos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastroProdutos1ActionPerformed

    }//GEN-LAST:event_opCadastroProdutos1ActionPerformed

    private void opCadastroClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastroClientes1ActionPerformed

    }//GEN-LAST:event_opCadastroClientes1ActionPerformed

    /**
     * Ação executada ao selecionar a opção "Menu Principal" no menu. Navega
     * para a interface principal e torna a tela atual invisível.
     *
     * @param evt O evento de clique no item de menu "Menu Principal".
     */
    private void opMenuPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMenuPrincipal1ActionPerformed
        InterfacePrincipal menuPrincipal = new InterfacePrincipal();
        menuPrincipal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opMenuPrincipal1ActionPerformed

    /**
     * Atualiza a tabela de detalhes com os itens da venda selecionada ao clicar
     * no botão "Detalhes".
     *
     * @param evt O evento de clique no botão "Detalhes".
     */
    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed
        int produtoEncontrado = tblRelatorioSintetico.getSelectedRow();

        ArrayList<RelatorioVenda> listaRetorno = RelatorioVendaDAO.buscarDetalhes(produtoEncontrado);

        DefaultTableModel modelo = (DefaultTableModel) tblRelatorioAnalitico.getModel();
        modelo.setRowCount(0);

        for (RelatorioVenda dados : listaRetorno) {
            //Atualizar a tabela
            modelo.addRow(new String[]{
                //Pegar dados do objeto e passar a tabela
                String.valueOf(dados.getNomeProduto()),
                String.valueOf(dados.getQuantidadeComprada()),
                String.valueOf(dados.getValorUnitario()),
                String.valueOf(dados.getValorTotal()),});
        }
    }//GEN-LAST:event_btnDetalhesActionPerformed

    private void tblRelatorioSinteticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRelatorioSinteticoMouseClicked
        //não funciona mais
    }//GEN-LAST:event_tblRelatorioSinteticoMouseClicked

    /**
     * Executa a ação de pesquisa de relatórios ao clicar no botão "Pesquisar".
     *
     * @param evt O evento de clique no botão "Pesquisar".
     */
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        if (txtPeriodoDe.getText() != null || txtPeriodoAte != null) {

            String produtoBuscado = txtPeriodoDe.getText();
            String produtoEncontrado = txtPeriodoAte.getText();

            ArrayList<RelatorioVenda> listaRetorno = RelatorioVendaDAO.buscarRelatorio(produtoBuscado, produtoEncontrado);

            DefaultTableModel modelo = (DefaultTableModel) tblRelatorioSintetico.getModel();
            modelo.setRowCount(0);

            for (RelatorioVenda dados : listaRetorno) {
                //Atualizar a tabela
                modelo.addRow(new String[]{
                    //Pegar dados do objeto e passar a tabela
                    String.valueOf(dados.getDataVenda()),
                    String.valueOf(dados.getIdCliente()),
                    String.valueOf(dados.getValorTotal()),});
            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    /**
     * O método principal que inicia a aplicação.
     *
     * @param args Os argumentos da linha de comando (não utilizados).
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorioVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu menuOpcoes1;
    private javax.swing.JMenuItem opCadastroClientes1;
    private javax.swing.JMenuItem opCadastroProdutos1;
    private javax.swing.JMenuItem opMenuPrincipal1;
    private javax.swing.JMenuItem opSair1;
    private javax.swing.JMenuItem opTelaVendas1;
    private javax.swing.JPanel pnlRelatorioSintetico;
    private javax.swing.JTable tblRelatorioAnalitico;
    private javax.swing.JTable tblRelatorioDetalhes;
    private javax.swing.JTable tblRelatorioSintetico;
    private javax.swing.JFormattedTextField txtPeriodoAte;
    private javax.swing.JFormattedTextField txtPeriodoDe;
    private javax.swing.JLabel txtTotalPeriodo;
    // End of variables declaration//GEN-END:variables
}
