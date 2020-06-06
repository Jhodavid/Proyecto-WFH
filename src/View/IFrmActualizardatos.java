/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Operaciones;
import static View.FrmPrincipal.userIni;
import javax.swing.JOptionPane;
import Controller.Encriptacion;
import Model.Usuario;
/**
 *
 * @author angel
 */
public class IFrmActualizardatos extends javax.swing.JInternalFrame {

    Operaciones op = new Operaciones();
    public Encriptacion en;
    public Usuario Actualizar;
    /**
     * Creates new form IFrmActualizardatos
     */
    public IFrmActualizardatos() {
        initComponents();
        VerDatos();
        en = new Encriptacion();
        Actualizar = new Usuario();
    }

    public void VerDatos() {

        txtnombre.setText(userIni.Nombre);
        txtid.setText(Integer.toString(userIni.IdUsuario));
        txtcedula.setText(Integer.toString(userIni.Cedula));
        txtapellido.setText(userIni.Apellidos);
        txtelefono.setText(Integer.toString(userIni.Telefono));
        txtpeso.setText(Integer.toString((int) userIni.Peso));
        txtestatura.setText(Integer.toString((int) userIni.Altura));
        txtedad.setText(Integer.toString(userIni.Edad));
        txtcontraseña.setText(userIni.Contraseña);
        cmbsexo.setSelectedItem(userIni.Sexo);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtid = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        cmbsexo = new javax.swing.JComboBox<>();
        txtnombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtpeso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtestatura = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JPasswordField();
        txtconfirmarcontraseña = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Su ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        txtid.setFocusable(false);
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidKeyTyped(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 72, -1));

        btnregistrar.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        btnregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_download2_3592678.png"))); // NOI18N
        btnregistrar.setBorder(null);
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 284, -1, 80));

        cmbsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Masculino", "Femenino" }));
        cmbsexo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexualidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        getContentPane().add(cmbsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 213, 281, -1));
        cmbsexo.getAccessibleContext().setAccessibleName("Sexo");
        cmbsexo.getAccessibleContext().setAccessibleDescription("");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 67, 201, 29));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 100, 29));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel2.setText("Apellido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 65, 76, 29));

        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        getContentPane().add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 104, 201, 29));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel3.setText("Cedula");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, 100, 29));

        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 67, 201, 29));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel4.setText("Contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 138, 100, 29));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 102, 76, 29));

        txtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 104, 201, 29));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel6.setText("Confime");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 138, 76, 29));

        txtedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadActionPerformed(evt);
            }
        });
        getContentPane().add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 176, 201, 29));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel7.setText("Edad");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 176, 100, 29));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel8.setText("Peso KG");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 176, 77, 29));

        txtpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesoActionPerformed(evt);
            }
        });
        getContentPane().add(txtpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 178, 200, 29));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel9.setText("Estatura");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 213, 100, 29));

        txtestatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestaturaActionPerformed(evt);
            }
        });
        getContentPane().add(txtestatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 215, 201, 29));
        getContentPane().add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 139, 201, 31));
        getContentPane().add(txtconfirmarcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 139, 201, 31));

        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 375, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        if (txtcontraseña.getText().isEmpty() || txtconfirmarcontraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar la contraseña en ambos campos", "ARVERTENCIA", JOptionPane.WARNING_MESSAGE);
            txtcontraseña.requestFocus();
        } else if (!txtcontraseña.getText().equals(txtconfirmarcontraseña.getText())) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "ARVERTENCIA", JOptionPane.WARNING_MESSAGE);
            txtcontraseña.requestFocus();
        } else if (txtnombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar al menos un  nombre", "ARVERTENCIA", JOptionPane.WARNING_MESSAGE);
            txtnombre.requestFocus();
        } else if (txtapellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar al menos un apellido", "ARVERTENCIA", JOptionPane.WARNING_MESSAGE);
            txtapellido.requestFocus();
        } else if (txtcedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar su No. de documento", "ARVERTENCIA", JOptionPane.WARNING_MESSAGE);
            txtcedula.requestFocus();
        } else if (txtelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar su telefono", "ARVERTENCIA", JOptionPane.WARNING_MESSAGE);
            txtelefono.requestFocus();
        } else if (cmbsexo.getSelectedItem().equals("-Seleccione-")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar su sexo", "ARVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } else if (txtestatura.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar su altura", "ARVERTENCIA", JOptionPane.WARNING_MESSAGE);
            txtestatura.requestFocus();
        } else if (txtpeso.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar su peso", "ARVERTENCIA", JOptionPane.WARNING_MESSAGE);
            txtpeso.requestFocus();
        } else if (txtedad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar su edad", "ARVERTENCIA", JOptionPane.WARNING_MESSAGE);
            txtedad.requestFocus();
        } else {

            Actualizar.Nombre = txtnombre.getText();
            Actualizar.Apellidos = txtapellido.getText();
            Actualizar.Cedula = Integer.parseInt(txtcedula.getText());
            Actualizar.Telefono = Integer.parseInt(txtelefono.getText());
            Actualizar.Contraseña = en.Cifrado(txtcontraseña.getText());
            Actualizar.Edad = Integer.parseInt(txtedad.getText());
            Actualizar.Peso = Double.parseDouble(txtpeso.getText());
            Actualizar.Altura = Double.parseDouble(txtestatura.getText());
            Actualizar.Sexo = (String) cmbsexo.getSelectedItem();
            Actualizar.IdUsuario = Integer.parseInt(txtid.getText());
            op.Actualizar(Actualizar);

        }

    }//GEN-LAST:event_btnregistrarActionPerformed

    private void txtidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyTyped

    }//GEN-LAST:event_txtidKeyTyped

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtelefonoActionPerformed

    private void txtedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadActionPerformed

    private void txtpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesoActionPerformed

    private void txtestaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestaturaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregistrar;
    private javax.swing.JComboBox<String> cmbsexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JPasswordField txtconfirmarcontraseña;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtelefono;
    private javax.swing.JTextField txtestatura;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
}
