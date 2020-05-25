/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ConexionDB.ConexionDB;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author angel
 */
public class RegistroUsuario extends javax.swing.JInternalFrame {
 int contador = 0;
    /**
     * Creates new form RegistroUsuario
     */
    public RegistroUsuario() {
        initComponents();

 
    }

    public void Nuevo() {
        txtnombre.setText("");
        txtapellido.setText("");
        txtcedula.setText("");
        txttelefono.setText("");
        cmbsexo.setSelectedIndex(0);
        txtaltura.setText("");
        txtpeso.setText("");
        txtedad.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        cmbsexo = new javax.swing.JComboBox<>();
        txtapellido = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtpeso = new javax.swing.JTextField();
        txtaltura = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Registrate ");

        txtcedula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cedula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcedulaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });

        txttelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        cmbsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Masculino", "Femenino" }));
        cmbsexo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N

        txtapellido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });

        txtedad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });

        txtnombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N

        txtpeso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Peso  KG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        txtpeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpesoKeyTyped(evt);
            }
        });

        txtaltura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Altura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        txtaltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalturaActionPerformed(evt);
            }
        });
        txtaltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtalturaKeyTyped(evt);
            }
        });

        btnregistrar.setText("Registrar");
        btnregistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                    .addComponent(txtcedula))
                                .addGap(21, 21, 21)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtapellido)
                            .addComponent(txttelefono)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtedad, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(292, 292, 292))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtapellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // TODO add your handling code here:
         if (txtnombre.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Debe ingresar al menos un  nombre","ARVERTENCIA",JOptionPane.WARNING_MESSAGE);
        txtnombre.requestFocus();
        }else if (txtapellido.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Debe ingresar al menos un apellido","ARVERTENCIA",JOptionPane.WARNING_MESSAGE);
        txtapellido.requestFocus();
        }else if (txtcedula.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Debe ingresar su No. de documento","ARVERTENCIA",JOptionPane.WARNING_MESSAGE);
        txtcedula.requestFocus();
        }else if (txttelefono.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Debe ingresar su telefono","ARVERTENCIA",JOptionPane.WARNING_MESSAGE);
        txttelefono.requestFocus();
        }else if (cmbsexo.getSelectedItem().equals("-Seleccione-")){
        JOptionPane.showMessageDialog(null,"Debe ingresar su cedula","ARVERTENCIA",JOptionPane.WARNING_MESSAGE);
        }else if (txtaltura.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Debe ingresar su altura","ARVERTENCIA",JOptionPane.WARNING_MESSAGE);
        txtaltura.requestFocus();
        }else if (txtpeso.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Debe ingresar su peso","ARVERTENCIA",JOptionPane.WARNING_MESSAGE);
        txtpeso.requestFocus();
        }else if (txtedad.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Debe ingresar su edad","ARVERTENCIA",JOptionPane.WARNING_MESSAGE);
        txtedad.requestFocus();
        }else{
        try{

              Connection con = null;
                ConexionDB conect = new ConexionDB();
                con = conect.getConnection();
                Statement st = con.createStatement();
                String sql = "insert into Usuario (Cedula,Nombre,Apellidos,Sexo,Telefono,Edad,Altura,Peso) values (?,?,?,?,?,?,?,?)";
                
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, txtcedula.getText());
                pst.setString(2, txtnombre.getText());
                pst.setString(3, txtapellido.getText());
                pst.setString(4, cmbsexo.getSelectedItem().toString());
                pst.setString(5, txttelefono.getText());
                pst.setString(6, txtedad.getText());
                pst.setString(7, txtaltura.getText());
                pst.setString(8, txtpeso.getText());
                
                int n = pst.executeUpdate();
                if (n > 0)
                {
                JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORRECTAMENTE");
                }
        }   catch(SQLException | HeadlessException e){
        JOptionPane.showMessageDialog(this, "LOS DATOS NO HAN SIDO GUARDADOS CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
        Nuevo();
        }     
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void txtcedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyPressed

    }//GEN-LAST:event_txtcedulaKeyPressed

    private void txttelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyPressed
   
    }//GEN-LAST:event_txttelefonoKeyPressed

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
 char Validacion = evt.getKeyChar();
        if (Validacion < '0' || Validacion > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
 char Validacion = evt.getKeyChar();
        if (Validacion < '0' || Validacion > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtalturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalturaActionPerformed
       
    }//GEN-LAST:event_txtalturaActionPerformed

    private void txtalturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtalturaKeyTyped
    
    }//GEN-LAST:event_txtalturaKeyTyped

    private void txtpesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesoKeyTyped
       
    }//GEN-LAST:event_txtpesoKeyTyped

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped
 char Validacion = evt.getKeyChar();
        if (Validacion < '0' || Validacion > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtedadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregistrar;
    private javax.swing.JComboBox<String> cmbsexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtaltura;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}