/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.controller.EmployeeController;
import com.mycompany.model.Employee;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author hernan
 */
public class Staff extends javax.swing.JFrame {

    /**
     * Creates new form Staff
     */
    public Staff() {
        initComponents();
        setLocationRelativeTo(null); 
        EmployeeController employeeController = new EmployeeController(this, StaffTable);
        employeeController.updateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        StaffTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NameEmployee = new javax.swing.JTextField();
        BirthDate = new javax.swing.JTextField();
        identification = new javax.swing.JTextField();
        StatusID = new javax.swing.JTextField();
        RoleID = new javax.swing.JTextField();
        UpdateEmployee = new javax.swing.JButton();
        DeleteEmployee = new javax.swing.JButton();
        back4 = new javax.swing.JButton();
        textSearch = new javax.swing.JTextField();
        SearchEmployee = new javax.swing.JButton();
        Create = new javax.swing.JButton();
        back5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(246, 243, 235));

        StaffTable.setBackground(new java.awt.Color(236, 231, 215));
        StaffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Name", "Identification", "Birth_date", "Role_id", "Status_id"
            }
        ));
        jScrollPane1.setViewportView(StaffTable);

        jLabel1.setFont(new java.awt.Font("Bradley Hand", 0, 48)); // NOI18N
        jLabel1.setText("Employees");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(246, 243, 235));

        jLabel2.setFont(new java.awt.Font("Bradley Hand", 0, 24)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Bradley Hand", 0, 24)); // NOI18N
        jLabel3.setText("Identification");

        jLabel4.setFont(new java.awt.Font("Bradley Hand", 0, 24)); // NOI18N
        jLabel4.setText("Birth Date");

        jLabel5.setFont(new java.awt.Font("Bradley Hand", 0, 24)); // NOI18N
        jLabel5.setText("Status_id");

        jLabel6.setFont(new java.awt.Font("Bradley Hand", 0, 24)); // NOI18N
        jLabel6.setText("Role Id");

        UpdateEmployee.setFont(new java.awt.Font("Bradley Hand", 0, 18)); // NOI18N
        UpdateEmployee.setText("Update");
        UpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateEmployeeActionPerformed(evt);
            }
        });

        DeleteEmployee.setFont(new java.awt.Font("Bradley Hand", 0, 18)); // NOI18N
        DeleteEmployee.setText("Delete");
        DeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEmployeeActionPerformed(evt);
            }
        });

        back4.setBackground(new java.awt.Color(232, 224, 194));
        back4.setFont(new java.awt.Font("Bradley Hand", 0, 18)); // NOI18N
        back4.setText("Back");
        back4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back4ActionPerformed(evt);
            }
        });

        textSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSearchActionPerformed(evt);
            }
        });

        SearchEmployee.setBackground(new java.awt.Color(232, 224, 194));
        SearchEmployee.setFont(new java.awt.Font("Bradley Hand", 0, 18)); // NOI18N
        SearchEmployee.setText("Search");
        SearchEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchEmployeeActionPerformed(evt);
            }
        });

        Create.setFont(new java.awt.Font("Bradley Hand", 0, 18)); // NOI18N
        Create.setText("Create");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });

        back5.setBackground(new java.awt.Color(232, 224, 194));
        back5.setFont(new java.awt.Font("Bradley Hand", 0, 18)); // NOI18N
        back5.setText("Back");
        back5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(identification, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RoleID, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StatusID, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(back5)
                        .addGap(32, 32, 32)
                        .addComponent(SearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(UpdateEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DeleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(back4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Create, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NameEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(RoleID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UpdateEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(identification, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(StatusID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(BirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(back5))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(Create, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(back4)))
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back4ActionPerformed
        Software soft = new Software();
        soft.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back4ActionPerformed

    private void textSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSearchActionPerformed

    private void UpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateEmployeeActionPerformed
        try {
        int employeeId = Integer.parseInt(textSearch.getText());
        String name = NameEmployee.getText();
        String id = identification.getText();  // Ahora usando correctamente el JTextField
        LocalDate birthDate = LocalDate.parse(BirthDate.getText());
        int roleId = Integer.parseInt(RoleID.getText());
        int statusId = Integer.parseInt(StatusID.getText());

        if (name.isEmpty() || id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos requeridos.");
            return;
        }

        EmployeeController employeeController = new EmployeeController(this, StaffTable);
        Employee employee = new Employee(name, id, birthDate, roleId, statusId);

        boolean success = employeeController.updateEmployee(employeeId, employee);

        if (success) {
            JOptionPane.showMessageDialog(this, "Empleado actualizado exitosamente.");
            employeeController.updateTable(); 
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar el empleado.");
        }
    } catch (NumberFormatException | DateTimeParseException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa datos válidos.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_UpdateEmployeeActionPerformed

    private void DeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteEmployeeActionPerformed
        try {
        int employeeId = Integer.parseInt(textSearch.getText());

        int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este empleado?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return; 
        }

        EmployeeController employeeController = new EmployeeController(this, StaffTable);
        boolean success = employeeController.deleteEmployee(employeeId);

        if (success) {
            JOptionPane.showMessageDialog(this, "Empleado eliminado exitosamente.");
            employeeController.updateTable(); 
            NameEmployee.setText("");
            identification.setText("");
            BirthDate.setText("");
            RoleID.setText("");
            StatusID.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar el empleado.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un ID válido.");
    }
    }//GEN-LAST:event_DeleteEmployeeActionPerformed

    private void SearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchEmployeeActionPerformed
        try {
        int employeeId = Integer.parseInt(textSearch.getText());
        EmployeeController employeeController = new EmployeeController(this, StaffTable);
        Employee employee = employeeController.searchEmployee(employeeId);

        if (employee != null) {
            NameEmployee.setText(employee.getName());
            identification.setText(employee.getIdentification());
            BirthDate.setText(employee.getBirthDate().toString());  // Asegúrate de que el formato sea correcto
            RoleID.setText(String.valueOf(employee.getRoleId()));
            StatusID.setText(String.valueOf(employee.getStatusId()));
        } else {
            JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un ID válido.");
    }
    }//GEN-LAST:event_SearchEmployeeActionPerformed

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        try {
        String name = NameEmployee.getText();  // Obtén el nombre del empleado
        String id = identification.getText();  // Obtén la identificación del empleado
        LocalDate birthDate = LocalDate.parse(BirthDate.getText());  // Convierte la fecha de nacimiento
        int roleId = Integer.parseInt(RoleID.getText());  // Obtén el ID del rol
        int statusId = Integer.parseInt(StatusID.getText());  // Obtén el ID del estado

        // Validación de campos vacíos
        if (name.isEmpty() || id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos requeridos.");
            return;
        }

        // Crear un nuevo controlador de empleados
        EmployeeController employeeController = new EmployeeController(this, StaffTable);
        Employee employee = new Employee(name, id, birthDate, roleId, statusId);

        // Llamar al método para crear el empleado
        boolean success = employeeController.createEmployee(name, id, birthDate, roleId, statusId);

        if (success) {
            JOptionPane.showMessageDialog(this, "Empleado creado exitosamente.");
            employeeController.updateTable();  // Actualizar la tabla para mostrar el nuevo empleado
        } else {
            JOptionPane.showMessageDialog(this, "Error al crear el empleado.");
        }
    } catch (NumberFormatException | DateTimeParseException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa datos válidos.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_CreateActionPerformed

    private void back5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back5ActionPerformed
        Software soft = new Software();
        soft.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back5ActionPerformed

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
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BirthDate;
    private javax.swing.JButton Create;
    private javax.swing.JButton DeleteEmployee;
    private javax.swing.JTextField NameEmployee;
    private javax.swing.JTextField RoleID;
    private javax.swing.JButton SearchEmployee;
    private javax.swing.JTable StaffTable;
    private javax.swing.JTextField StatusID;
    private javax.swing.JButton UpdateEmployee;
    private javax.swing.JButton back4;
    private javax.swing.JButton back5;
    private javax.swing.JTextField identification;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textSearch;
    // End of variables declaration//GEN-END:variables
}
