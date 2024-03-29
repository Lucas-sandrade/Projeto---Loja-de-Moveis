package com.minhaempresa.lojademoveis.crudsenac.views;

import com.minhaempresa.lojademoveis.crudsenac.dao.RelatorioDAO;
import com.minhaempresa.lojademoveis.crudsenac.models.Vendas;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author henri
 */
public class TelaRelatorio extends javax.swing.JFrame {

    /**
     * Creates new form TelaRelatório
     */
    public TelaRelatorio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupoRelatSintético = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRelatorio = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnSemanal = new javax.swing.JRadioButton();
        btnMensal = new javax.swing.JRadioButton();
        btnDetalhesCompra = new javax.swing.JButton();
        btnAtualizarRelatorio = new javax.swing.JButton();
        txtTotalVendas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRelatorioAnalitico = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuAbrePrincipal = new javax.swing.JMenuItem();
        mnuSairRelatorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Relatório Sintético"));
        jPanel1.setMaximumSize(new java.awt.Dimension(203, 23));

        tblRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Valor Venda", "Cliente", "Data Compra"
            }
        ));
        jScrollPane1.setViewportView(tblRelatorio);

        jLabel2.setText("Período:");

        btnGrupoRelatSintético.add(btnSemanal);
        btnSemanal.setText("Semanal");
        btnSemanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemanalActionPerformed(evt);
            }
        });

        btnGrupoRelatSintético.add(btnMensal);
        btnMensal.setText("Mensal");

        btnDetalhesCompra.setText("Detalhes Da Compra");
        btnDetalhesCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesCompraActionPerformed(evt);
            }
        });

        btnAtualizarRelatorio.setText("Atualizar Relatório");
        btnAtualizarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarRelatorioActionPerformed(evt);
            }
        });

        txtTotalVendas.setBackground(new java.awt.Color(0, 0, 0));
        txtTotalVendas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSemanal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtualizarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnDetalhesCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtTotalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(1, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDetalhesCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTotalVendas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMensal)
                            .addComponent(btnSemanal)
                            .addComponent(jLabel2)
                            .addComponent(btnAtualizarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Relatório Analítico"));

        tblRelatorioAnalitico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Produtos Vendidos", "Quantidade"
            }
        ));
        jScrollPane2.setViewportView(tblRelatorioAnalitico);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        jMenu1.setText("Opções");

        mnuAbrePrincipal.setText("Tela Principal");
        mnuAbrePrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAbrePrincipalActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAbrePrincipal);

        mnuSairRelatorio.setText("Sair");
        jMenu1.add(mnuSairRelatorio);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuAbrePrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAbrePrincipalActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_mnuAbrePrincipalActionPerformed

    private void btnAtualizarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarRelatorioActionPerformed
        
        if(btnSemanal.isSelected() || btnMensal.isSelected() ){
            
        ArrayList<Vendas> vendas = null;
        try {
            vendas = RelatorioDAO.relatorioSintetico();
  
        } catch (SQLException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (ClassNotFoundException ex) {
                Logger.getLogger(TelaRelatorio.class.getName()).log(Level.SEVERE, null, ex);
            }
        if (vendas != null){
            DefaultTableModel modelo = (DefaultTableModel) tblRelatorio.getModel();
            modelo.setRowCount(0);

            for (Vendas relatorio : vendas) {
                modelo.addRow(new String[]{
                    String.valueOf(relatorio.getTotalPagar()),
                    String.valueOf(relatorio.getNomeCliente()),
                    String.valueOf(relatorio.getData()),

                });
                
            }
            
            int totalValores = 0;
            int rowCount = modelo.getRowCount();
            for(int i = 0; i < rowCount; i++) {
                Object valorUni = modelo.getValueAt(i, 0);
                totalValores += Double.parseDouble((String) valorUni);
            }

            String Total = String.valueOf(totalValores);
            
            txtTotalVendas.setText(Total);
        
        }
        }else {
            JOptionPane.showMessageDialog(rootPane, "Erro ao listar produtos");
        } 
        
    }//GEN-LAST:event_btnAtualizarRelatorioActionPerformed

    private void btnSemanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemanalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSemanalActionPerformed

    private void btnDetalhesCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesCompraActionPerformed
 ArrayList<Vendas> vendas = null;
        try {
            vendas = RelatorioDAO.relatorioAnalitico();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TelaRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultTableModel modelo = (DefaultTableModel) tblRelatorioAnalitico.getModel();

// Limpa o modelo da tabela antes de adicionar novas linhas
        modelo.setRowCount(0);

        if (vendas != null && !vendas.isEmpty()) {
            for (Vendas relatorio : vendas) {
                modelo.addRow(new Object[]{
                    relatorio.getNomeProduto(),
                    relatorio.getQuantidade(),});

                System.out.println(relatorio.getNomeProduto());
                JOptionPane.showMessageDialog(rootPane, relatorio.getNomeProduto());
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro ao buscar informações");
        }
    }//GEN-LAST:event_btnDetalhesCompraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaRelatorio tRelatorio = new TelaRelatorio();
                tRelatorio.setLocationRelativeTo(null);
                tRelatorio.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarRelatorio;
    private javax.swing.JButton btnDetalhesCompra;
    private javax.swing.ButtonGroup btnGrupoRelatSintético;
    private javax.swing.JRadioButton btnMensal;
    private javax.swing.JRadioButton btnSemanal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem mnuAbrePrincipal;
    private javax.swing.JMenuItem mnuSairRelatorio;
    private javax.swing.JTable tblRelatorio;
    private javax.swing.JTable tblRelatorioAnalitico;
    private javax.swing.JLabel txtTotalVendas;
    // End of variables declaration//GEN-END:variables
}
