/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.controller.VisitorController;
import com.mycompany.model.Visitor;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author hernan
 */
public class Visitors extends javax.swing.JFrame {

    /**
     * Creates new form Visitors
     */
    public Visitors() {
        initComponents();
        setLocationRelativeTo(null); 
        VisitorController visitorController = new VisitorController(this, Visitors);
        visitorController.updateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NameVisitors = new javax.swing.JTextField();
        PhoneNumberVisitor = new javax.swing.JTextField();
        BirthDateVisitor = new javax.swing.JTextField();
        EmailVisitor = new javax.swing.JTextField();
        IdentificationVisitor = new javax.swing.JTextField();
        AddVisitor = new javax.swing.JButton();
        Searchvisitor = new javax.swing.JButton();
        DeleteVisitor = new javax.swing.JButton();
        EditVisitors = new javax.swing.JButton();
        SearchVisitor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Visitors = new javax.swing.JTable();
        jComboBoxGender = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bradley Hand", 0, 48)); // NOI18N
        jLabel1.setText("Visitors");

        jLabel2.setFont(new java.awt.Font("Bradley Hand", 0, 24)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Bradley Hand", 0, 24)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Bradley Hand", 0, 24)); // NOI18N
        jLabel4.setText("Identification");

        jLabel5.setFont(new java.awt.Font("Bradley Hand", 0, 24)); // NOI18N
        jLabel5.setText("Birth Date");

        jLabel6.setFont(new java.awt.Font("Bradley Hand", 0, 24)); // NOI18N
        jLabel6.setText("Gender");

        jLabel7.setFont(new java.awt.Font("Bradley Hand", 0, 24)); // NOI18N
        jLabel7.setText("Phone Number");

        AddVisitor.setFont(new java.awt.Font("Bradley Hand", 0, 18)); // NOI18N
        AddVisitor.setText("Add");
        AddVisitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddVisitorActionPerformed(evt);
            }
        });

        Searchvisitor.setFont(new java.awt.Font("Bradley Hand", 0, 18)); // NOI18N
        Searchvisitor.setText("Search");
        Searchvisitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchvisitorActionPerformed(evt);
            }
        });

        DeleteVisitor.setFont(new java.awt.Font("Bradley Hand", 0, 18)); // NOI18N
        DeleteVisitor.setText("Delete");
        DeleteVisitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteVisitorActionPerformed(evt);
            }
        });

        EditVisitors.setFont(new java.awt.Font("Bradley Hand", 0, 18)); // NOI18N
        EditVisitors.setText("Edit");
        EditVisitors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditVisitorsActionPerformed(evt);
            }
        });

        Visitors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Identification", "Gender", "Birth Date", "Email", "Phone Number"
            }
        ));
        jScrollPane1.setViewportView(Visitors);

        jComboBoxGender.setFont(new java.awt.Font("Bradley Hand", 0, 18)); // NOI18N
        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        back.setBackground(new java.awt.Color(234, 230, 230));
        back.setFont(new java.awt.Font("Bradley Hand", 0, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(207, 207, 207)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(AddVisitor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(EditVisitors, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(DeleteVisitor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(Searchvisitor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchVisitor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(NameVisitors, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(IdentificationVisitor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BirthDateVisitor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailVisitor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PhoneNumberVisitor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(105, 105, 105))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(NameVisitors, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BirthDateVisitor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(EmailVisitor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdentificationVisitor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(PhoneNumberVisitor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddVisitor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditVisitors, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteVisitor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Searchvisitor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchVisitor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddVisitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddVisitorActionPerformed
        try {
        String name = NameVisitors.getText();
        String identification = IdentificationVisitor.getText();
        String gender = jComboBoxGender.getSelectedItem().toString();
        LocalDate birthDate = LocalDate.parse(BirthDateVisitor.getText());
        String email = EmailVisitor.getText();
        String phoneNumber = PhoneNumberVisitor.getText();

        VisitorController visitorController = new VisitorController(this, Visitors);
        boolean success = visitorController.createVisitor(name, identification, gender, birthDate, email, phoneNumber);

        if (success) {
            JOptionPane.showMessageDialog(this, "Visitante creado exitosamente.");
            visitorController.updateTable();  
        } else {
            JOptionPane.showMessageDialog(this, "Error al crear el visitante.");
        }
    } catch (NumberFormatException | DateTimeParseException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa datos válidos.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_AddVisitorActionPerformed

    private void EditVisitorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditVisitorsActionPerformed
        try {
        int visitorId = Integer.parseInt(SearchVisitor.getText());
        String name = NameVisitors.getText();
        String identification = IdentificationVisitor.getText();
        String gender = jComboBoxGender.getSelectedItem().toString();
        LocalDate birthDate = LocalDate.parse(BirthDateVisitor.getText());
        String email = EmailVisitor.getText();
        String phoneNumber = PhoneNumberVisitor.getText();

        if (name.isEmpty() || identification.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos requeridos.");
            return;
        }

        VisitorController visitorController = new VisitorController(this, Visitors);
        Visitor visitor = new Visitor(name, identification, gender, birthDate, email, phoneNumber);

        boolean success = visitorController.updateVisitor(visitorId, visitor);

        if (success) {
            JOptionPane.showMessageDialog(this, "Visitante actualizado exitosamente.");
            visitorController.updateTable();  
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar el visitante.");
        }
    } catch (NumberFormatException | DateTimeParseException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa datos válidos.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_EditVisitorsActionPerformed

    private void DeleteVisitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteVisitorActionPerformed
        try {
        int visitorId = Integer.parseInt(SearchVisitor.getText());

        int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este visitante?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return; 
        }

        VisitorController visitorController = new VisitorController(this, Visitors);
        boolean success = visitorController.deleteVisitor(visitorId);

        if (success) {
            JOptionPane.showMessageDialog(this, "Visitante eliminado exitosamente.");
            visitorController.updateTable();
            NameVisitors.setText("");
            IdentificationVisitor.setText("");
            BirthDateVisitor.setText("");
            EmailVisitor.setText("");
            PhoneNumberVisitor.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar el visitante.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un ID válido.");
    }
    }//GEN-LAST:event_DeleteVisitorActionPerformed

    private void SearchvisitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchvisitorActionPerformed
        try {
        int visitorId = Integer.parseInt(SearchVisitor.getText());
        VisitorController visitorController = new VisitorController(this, Visitors);
        Visitor visitor = visitorController.searchVisitor(visitorId);

        if (visitor != null) {
            NameVisitors.setText(visitor.getName());
            IdentificationVisitor.setText(visitor.getIdentificationDocument());
            jComboBoxGender.setSelectedItem(visitor.getGender());
            BirthDateVisitor.setText(visitor.getBirthDate().toString());
            EmailVisitor.setText(visitor.getEmail());
            PhoneNumberVisitor.setText(visitor.getPhoneNumber());
        } else {
            JOptionPane.showMessageDialog(this, "Visitante no encontrado.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un ID válido.");
    }
    }//GEN-LAST:event_SearchvisitorActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Welcome welcome = new Welcome();
        welcome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visitors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddVisitor;
    private javax.swing.JTextField BirthDateVisitor;
    private javax.swing.JButton DeleteVisitor;
    private javax.swing.JButton EditVisitors;
    private javax.swing.JTextField EmailVisitor;
    private javax.swing.JTextField IdentificationVisitor;
    private javax.swing.JTextField NameVisitors;
    private javax.swing.JTextField PhoneNumberVisitor;
    private javax.swing.JTextField SearchVisitor;
    private javax.swing.JButton Searchvisitor;
    private javax.swing.JTable Visitors;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
