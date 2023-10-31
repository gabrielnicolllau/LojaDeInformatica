package views;

import model.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sqlProdutoDAO.ProdutoDAO;

public class JanelaDeConsulta extends javax.swing.JFrame {
    
    List<Produto> listaDeProdutos = new ArrayList<>();
    private DefaultTableModel tableModel;
    
    public JanelaDeConsulta() {
        
        initComponents();
        setLocationRelativeTo(null);
        tableModel = (DefaultTableModel) tblProdutos.getModel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnInserir = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnInserir.setBackground(new java.awt.Color(102, 255, 102));
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 102, 102));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnConsultar.setBackground(new java.awt.Color(204, 204, 204));
        btnConsultar.setText("Buscar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Tipo", "Preço", "Quantidade", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProdutos);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFiltro))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        //1º Passo:  Resgatar a linha e mandar para um objeto
        int linhaSelecionada = tblProdutos.getSelectedRow();
        
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha para atualizar!", "Nenhuma Linha Selecionada", JOptionPane.WARNING_MESSAGE);
            return; // Sai do método se nenhuma linha foi selecionada
        }

        //2º Passo: acessar a camada Model da tabela
        DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();

        //3º resgatar valores da linha selecionada
        int idSelecionado = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString());
        String tipoSelecionado = modelo.getValueAt(linhaSelecionada, 1).toString();
        double precoSelecionado = Double.parseDouble(modelo.getValueAt(linhaSelecionada, 2).toString());
        int quantidadeSelecionada = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 3).toString());
        String descricaoSelecionada = modelo.getValueAt(linhaSelecionada, 4).toString();

        //4º Passar dados para o objeto
        Produto alterarProduto = new Produto(idSelecionado, tipoSelecionado, precoSelecionado, quantidadeSelecionada, descricaoSelecionada);

        //5° Passar dados para a tela de alteracao
        CadastrarProduto novaJanela = new CadastrarProduto(alterarProduto);
        novaJanela.setVisible(true);
        novaJanela.setLocationRelativeTo(null);
        

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // criar objeto
        CadastrarProduto novaJanelaInserir = new CadastrarProduto(this, true);
        novaJanelaInserir.setVisible(true);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        // 1: Resgatar a linha e mandar para um objeto
        int linhaSelecionada = tblProdutos.getSelectedRow();
        
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha para excluir!", "Nenhuma Linha Selecionada", JOptionPane.WARNING_MESSAGE);
            return; // Sai do método se nenhuma linha foi selecionada
        }

        //2: Acessar a camada Model da tabela
        DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();

        //3: Resgatar valores da linha selecionada
        int idSelecionado = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString());

        //4: Mandar o ID para a DAO excluior
        boolean retorno = ProdutoDAO.excluir(idSelecionado);
        
        if (retorno == true) {
            JOptionPane.showMessageDialog(null, "Computador Excluido");
        } else {
            JOptionPane.showMessageDialog(null, "Nao foi possivel excluir esse computador");
        }
        
        atualizarTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        // Buscar se nada for digitado na barra de pesquisa
        if (txtFiltro.getText().trim().toLowerCase().equals("")) {
            recarregarTabela();
            
        } else {
            String itemBuscado = txtFiltro.getText();

            //Chamar o metodo na DAO que faz a busa
            ArrayList<Produto> listaRetorno = ProdutoDAO.buscarAlgo(itemBuscado);
            
            DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();
            modelo.setRowCount(0);
            
            for (Produto item : listaRetorno) {
                //Atualizar a tabela
                modelo.addRow(new String[]{
                    //Pegar dados do objeto e passar a tabela
                    String.valueOf(item.getIdProduto()),
                    String.valueOf(item.getTipoDaPeca()),
                    String.valueOf(item.getPreco()),
                    String.valueOf(item.getQuantidade()),
                    String.valueOf(item.getDescricao())
                
                });
            }
            
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    // Metodos
    public void atualizarTabela() {
        //Chamar a DAO para consultar notas do banco
        ArrayList<Produto> listaRetorno = ProdutoDAO.listar();

        //Para cada item na lista, vou adicionar à tabela
        DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();
        modelo.setRowCount(0);
        
        for (Produto item : listaRetorno) {
            modelo.addRow(new String[]{
                String.valueOf(item.getIdProduto()),
                String.valueOf(item.getTipoDaPeca()),
                String.valueOf(item.getPreco()),
                String.valueOf(item.getQuantidade()),
                String.valueOf(item.getDescricao()
                )}
            );
        }
        
    }
    
    public void recarregarTabela() {
        
        ArrayList<Produto> lista = ProdutoDAO.listar();
        
        DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();
        modelo.setRowCount(0);
        
        for (Produto item : lista) {
            modelo.addRow(new String[]{
                String.valueOf(item.getIdProduto()),
                String.valueOf(item.getTipoDaPeca()),
                String.valueOf(item.getPreco()),
                String.valueOf(item.getQuantidade()),
                String.valueOf(item.getDescricao())
            }
            );
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(JanelaDeConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaDeConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaDeConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaDeConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaDeConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
