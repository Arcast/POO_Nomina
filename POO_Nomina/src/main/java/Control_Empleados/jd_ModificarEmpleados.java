/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Control_Empleados;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ernes
 */
public class jd_ModificarEmpleados extends javax.swing.JDialog {
    private int FilaSeleccionada;
    private DefaultTableModel modelo;    
    String IdEmpleado, NombreEmpleado, ApellidoEmpleado, PuestoEmpleado, Salario_Fijo;
    /**
     * Creates new form jd_AgregarEmpleado
     */
    public jd_ModificarEmpleados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        modelo =(DefaultTableModel) tblEmpleados.getModel();
        MostrarEmpleados();
        BloqueoDesbloqueo(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtPuesto = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelarE = new javax.swing.JButton();
        btnLimpiarE = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        jspSalarioFijo = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Id del Empleado:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Puesto:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Salario Fijo:");

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido.setEditable(false);
        txtApellido.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        txtPuesto.setEditable(false);
        txtPuesto.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        btnGuardar.setBackground(new java.awt.Color(0, 204, 153));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Modificar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelarE.setBackground(new java.awt.Color(255, 0, 51));
        btnCancelarE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelarE.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelarE.setText("Cancelar");
        btnCancelarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEActionPerformed(evt);
            }
        });

        btnLimpiarE.setBackground(new java.awt.Color(255, 255, 153));
        btnLimpiarE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpiarE.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiarE.setText("Limpiar");
        btnLimpiarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarEActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Modificar Empleado");

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Trabajador", "Nombre", "Apellido", "Puesto", "Salario Fijo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleados);

        jspSalarioFijo.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 0.25f));
        jspSalarioFijo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiarE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                .addComponent(txtNombre)
                                .addComponent(txtApellido)
                                .addComponent(txtPuesto))
                            .addComponent(jspSalarioFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jspSalarioFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarE)
                    .addComponent(btnLimpiarE)
                    .addComponent(btnGuardar))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        ModificarEmpleado();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarEActionPerformed
        // TODO add your handling code here:
        limpiar();
        MostrarEmpleados();        
    }//GEN-LAST:event_btnLimpiarEActionPerformed

    private void btnCancelarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarEActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void tblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadosMouseClicked
        // TODO add your handling code here:
        FilaSeleccionada = tblEmpleados.rowAtPoint(evt.getPoint());
        CapturarEmpleado();
    }//GEN-LAST:event_tblEmpleadosMouseClicked

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
            java.util.logging.Logger.getLogger(jd_ModificarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jd_ModificarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jd_ModificarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jd_ModificarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            jd_ModificarEmpleados dialog = new jd_ModificarEmpleados(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }
    
    public void ModificarEmpleado(){
        try {
        String IdEmpleadoNuevo, NombreEmpleado, ApellidoEmpleado, PuestoEmpleado;
        Double Salario_Fijo;
        
        if (txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese el id del empleado", "Notificación" , JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre del empleado", "Notificación" , JOptionPane.INFORMATION_MESSAGE);
            return;
        }        
        
        if (txtApellido.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese el apellido del empleado", "Notificación" , JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        if (txtPuesto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese el puesto del empleado", "Notificación" , JOptionPane.INFORMATION_MESSAGE);
            return;
        }   
        
        if (Double.parseDouble(jspSalarioFijo.getValue().toString()) <= 0 ) {
            JOptionPane.showMessageDialog(this, "ingrese un salario valido", "Notificación" , JOptionPane.INFORMATION_MESSAGE);
            jspSalarioFijo.setValue(0);
            return;
        }        
                
        IdEmpleadoNuevo = txtID.getText().toString();
        NombreEmpleado= txtNombre.getText().toString();
        ApellidoEmpleado = txtApellido.getText().toString();
        PuestoEmpleado = txtPuesto.getText().toString();
        Salario_Fijo = Double.parseDouble(jspSalarioFijo.getValue().toString());
        
        if (!IdEmpleado.equals(IdEmpleadoNuevo)) {
            boolean EmpleadoExiste = ValidarEmpleado(IdEmpleado, IdEmpleadoNuevo);
            if (EmpleadoExiste) {
               JOptionPane.showMessageDialog(this, "El empleado ya existe", "Error" , JOptionPane.ERROR_MESSAGE);
               return;
           } 
        }        
       
        if (JOptionPane.showConfirmDialog(this, "Desea agregar los datos del empleado ingresado?", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
          return;
        }
        
        Empleado empleado = new Empleado(IdEmpleado, NombreEmpleado, ApellidoEmpleado, PuestoEmpleado, Salario_Fijo);
        
        EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        empleadoDAO.actualizarEmpleado(IdEmpleado, empleado);
                      
        JOptionPane.showMessageDialog(this, "Empleado Actualizado exitosamente", "Notificación" , JOptionPane.INFORMATION_MESSAGE);
        
        limpiar();
        MostrarEmpleados();
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error al actualizar el Empleado", "Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
    
      public void MostrarEmpleados(){
        try {                  
            List<Empleado> empleado = new ArrayList<>();            
            
            EmpleadoDAO empleadoDAO = new EmpleadoDAO(); //Llama al dao de usuario
            empleado = empleadoDAO.leerEmpleado(); 
            
            //Limpieza de la tabla
            int filas = modelo.getRowCount();

            for (int a = 0; filas > a; a++) {
                modelo.removeRow(0);
            }
                        
            for (Empleado emp : empleado) {               
                
                IdEmpleado = emp.getIdEmpleado().toString();
                NombreEmpleado = emp.getNombreEmpleado().toString();
                ApellidoEmpleado = emp.getApellidoEmpleado().toString();
                PuestoEmpleado = emp.getPuestoEmpleado().toString();
                Salario_Fijo = emp.getSalario_Fijo().toString();
                               
                 modelo.addRow(new Object[]{IdEmpleado, NombreEmpleado, ApellidoEmpleado, PuestoEmpleado, Salario_Fijo});
            }
                   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error al cargar usuarios", "Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
    
    public void limpiar(){
        
        txtID.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtPuesto.setText("");
        jspSalarioFijo.setValue(0);
        
        BloqueoDesbloqueo(false);
    }
  public boolean ValidarEmpleado(String IdEmpleado, String IdEmpleadoNuevo){
        
        try {
            boolean existe = false;
            List<Empleado> empleadoList = new ArrayList<>();            
            EmpleadoDAO empleadoDAO = new EmpleadoDAO(); //Llama al dao de usuario
            empleadoList = empleadoDAO.leerEmpleado();
            
            empleadoList.remove(IdEmpleado);
            
            for (Empleado us : empleadoList) {
            
                 if (us.getIdEmpleado().equals(IdEmpleadoNuevo)) {
                    existe = true;
                    break;
                }
            }
            
            return existe;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error al guardar el empleado", "Error" , JOptionPane.ERROR_MESSAGE);
            return false;
        }
    
    }
  
  private void CapturarEmpleado(){      
      try {                  
        //Obtenemmos los datos de la fila seleccionada  
        IdEmpleado = String.valueOf(tblEmpleados.getValueAt(FilaSeleccionada, 0)).toString();
        txtID.setText(IdEmpleado);
        txtNombre.setText(String.valueOf(tblEmpleados.getValueAt(FilaSeleccionada, 1)));
        txtApellido.setText(String.valueOf(tblEmpleados.getValueAt(FilaSeleccionada, 2)));
        txtPuesto.setText(String.valueOf(tblEmpleados.getValueAt(FilaSeleccionada, 3)));
        Double Salario = Double.valueOf(tblEmpleados.getValueAt(FilaSeleccionada, 4).toString());
        jspSalarioFijo.setValue(Salario);
        
        BloqueoDesbloqueo(true);
        
      } catch (Exception e) {
          System.out.println("Error cargando datos");
      }
   
      
  }
  
  private void BloqueoDesbloqueo(boolean valor){
      
      if (valor) {
        txtID.setBackground(Color.GRAY);
      }else{
        txtID.setBackground(Color.ORANGE);
      }
      
       //Desbloqueamos los campos 
        txtNombre.setEditable(valor);
        txtApellido.setEditable(valor);
        txtPuesto.setEditable(valor);
        jspSalarioFijo.setEnabled(valor);       
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarE;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiarE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jspSalarioFijo;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPuesto;
    // End of variables declaration//GEN-END:variables

  
}
