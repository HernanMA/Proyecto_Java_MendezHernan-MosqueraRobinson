/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.controller.CashRegisterController;
import com.mycompany.model.CashRegister;
import javax.swing.JOptionPane;

/**
 *
 * @author hernan
 */
public class Commerce extends javax.swing.JFrame {
private CashRegisterController cashRegisterController;
    /**
     * Creates new form Commerce
     */
    public Commerce() {
        initComponents();
        setLocationRelativeTo(null); 
        cashRegisterController = new CashRegisterController(this, CommerceTable);
        System.out.println("cashRegisterController inicializado: " + (cashRegisterController != null));
        cashRegisterController.updateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        OperatorCommerce = new javax.swing.JTextField();
        OpeningAmountCommerce = new javax.swing.JTextField();
        ClosingAmountCommerce = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxCommerce = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        UpdateCommerce = new javax.swing.JButton();
        DeleteCommerce = new javax.swing.JButton();
        SearchCommerce = new javax.swing.JButton();
        CreateCommerce = new javax.swing.JButton();
        SearchCommerceText = new javax.swing.JTextField();
        back5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CommerceTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(246, 243, 235));

        jLabel1.setFont(new java.awt.Font("Bradley Hand", 0, 48)); // NOI18N
        jLabel1.setText("Commerce");

        jLabel2.setFont(new java.awt.Font("Bradley Hand", 0, 24)); // NOI18N
        jLabel2.setText("Status");

        jComboBoxCommerce.setFont(new java.awt.Font("Bradley Hand", 0, 18)); // NOI18N
        jComboBoxCommerce.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVE ", "INACTIVE" }));

        jLabel3.setFont(new java.awt.Font("Bradley Hand", 0, 24)); // NOI18N
        jLabel3.setText("Operator Id");

        jLabel4.setFont(new java.awt.Font("Bradley Hand", 0, 24)); // NOI18N
        jLabel4.setText("Opening amount");

        jLabel5.setFont(new java.awt.Font("Bradley Hand", 0, 24)); // NOI18N
        jLabel5.setText("Closing amount");

        UpdateCommerce.setBackground(new java.awt.Color(232, 224, 194));
        UpdateCommerce.setFont(new java.awt.Font("Bradley Hand", 0, 18)); // NOI18N
        UpdateCommerce.setText("Update");
        UpdateCommerce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCommerceActionPerformed(evt);
            }
        });

        DeleteCommerce.setBackground(new java.awt.Color(232, 224, 194));
        DeleteCommerce.setFont(new java.awt.Font("Bradley Hand", 0, 18)); // NOI18N
        DeleteCommerce.setText("Delete");
        DeleteCommerce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCommerceActionPerformed(evt);
            }
        });

        SearchCommerce.setBackground(new java.awt.Color(232, 224, 194));
        SearchCommerce.setFont(new java.awt.Font("Bradley Hand", 0, 18)); // NOI18N
        SearchCommerce.setText("Search");
        SearchCommerce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchCommerceActionPerformed(evt);
            }
        });

        CreateCommerce.setBackground(new java.awt.Color(232, 224, 194));
        CreateCommerce.setFont(new java.awt.Font("Bradley Hand", 0, 18)); // NOI18N
        CreateCommerce.setText("Create");
        CreateCommerce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateCommerceActionPerformed(evt);
            }
        });

        back5.setBackground(new java.awt.Color(234, 230, 230));
        back5.setFont(new java.awt.Font("Bradley Hand", 0, 18)); // NOI18N
        back5.setText("Back");
        back5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(232, 232, 232)
                .addComponent(back5)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ClosingAmountCommerce, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OperatorCommerce, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCommerce, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OpeningAmountCommerce, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreateCommerce)
                    .addComponent(UpdateCommerce)
                    .addComponent(DeleteCommerce)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SearchCommerce)
                        .addGap(18, 18, 18)
                        .addComponent(SearchCommerceText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCommerce, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreateCommerce))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OperatorCommerce, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateCommerce))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(OpeningAmountCommerce, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DeleteCommerce))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClosingAmountCommerce, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchCommerce)
                    .addComponent(SearchCommerceText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(246, 243, 235));

        CommerceTable.setBackground(new java.awt.Color(236, 231, 215));
        CommerceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Status", "Operator Id", "Opening A mount", "Closing Amount"
            }
        ));
        jScrollPane1.setViewportView(CommerceTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back5ActionPerformed
        Software soft = new Software();
        soft.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back5ActionPerformed

    private void CreateCommerceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateCommerceActionPerformed
        try {
        String status = jComboBoxCommerce.getSelectedItem().toString();
        int operatorId = Integer.parseInt(OperatorCommerce.getText());
        double openingAmount = Double.parseDouble(OpeningAmountCommerce.getText());
        double closingAmount = Double.parseDouble(ClosingAmountCommerce.getText());

        cashRegisterController.createCashRegister(status, operatorId, openingAmount, closingAmount);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa valores válidos.");
    }
    }//GEN-LAST:event_CreateCommerceActionPerformed

    private void UpdateCommerceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCommerceActionPerformed
        try {
        int cashRegisterId = Integer.parseInt(SearchCommerceText.getText());
        String status = jComboBoxCommerce.getSelectedItem().toString();
        int operatorId = Integer.parseInt(OperatorCommerce.getText());
        double openingAmount = Double.parseDouble(OpeningAmountCommerce.getText());
        double closingAmount = Double.parseDouble(ClosingAmountCommerce.getText());

        CashRegister cashRegister = new CashRegister(status, operatorId, openingAmount, closingAmount);
        cashRegisterController.updateCashRegister(cashRegisterId, cashRegister);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa valores válidos.");
    }
    }//GEN-LAST:event_UpdateCommerceActionPerformed

    private void DeleteCommerceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCommerceActionPerformed
        try {
        int cashRegisterId = Integer.parseInt(SearchCommerceText.getText());

        int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar esta caja registradora?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        cashRegisterController.deleteCashRegister(cashRegisterId);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un ID válido.");
    }
    }//GEN-LAST:event_DeleteCommerceActionPerformed

    private void SearchCommerceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchCommerceActionPerformed
        try {
        int cashRegisterId = Integer.parseInt(SearchCommerceText.getText());
        CashRegister cashRegister = cashRegisterController.searchCashRegister(cashRegisterId);

        if (cashRegister != null) {
            jComboBoxCommerce.setSelectedItem(cashRegister.getStatus());
            OperatorCommerce.setText(String.valueOf(cashRegister.getOperatorId()));
            OpeningAmountCommerce.setText(String.valueOf(cashRegister.getOpeningAmount()));
            ClosingAmountCommerce.setText(String.valueOf(cashRegister.getClosingAmount()));
        } else {
            JOptionPane.showMessageDialog(this, "Caja registradora no encontrada.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un ID válido.");
    }
    }//GEN-LAST:event_SearchCommerceActionPerformed

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
            java.util.logging.Logger.getLogger(Commerce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Commerce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Commerce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Commerce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Commerce().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClosingAmountCommerce;
    private javax.swing.JTable CommerceTable;
    private javax.swing.JButton CreateCommerce;
    private javax.swing.JButton DeleteCommerce;
    private javax.swing.JTextField OpeningAmountCommerce;
    private javax.swing.JTextField OperatorCommerce;
    private javax.swing.JButton SearchCommerce;
    private javax.swing.JTextField SearchCommerceText;
    private javax.swing.JButton UpdateCommerce;
    private javax.swing.JButton back5;
    private javax.swing.JComboBox<String> jComboBoxCommerce;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
