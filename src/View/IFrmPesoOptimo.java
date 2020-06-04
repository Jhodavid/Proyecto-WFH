/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import static View.FrmPrincipal.userIni;
import Controller.Operaciones;
import java.math.BigDecimal;
import java.math.RoundingMode;
import Model.SaludFisica;
import javax.swing.JOptionPane;
/**
 *
 * @author CAMILO A TRUYOL O
 */
public class IFrmPesoOptimo extends javax.swing.JInternalFrame {
  Operaciones X= new Operaciones();
  SaludFisica Sf = new SaludFisica();
    /**
     * Creates new form IFrmPesoOptimo
     */
    public IFrmPesoOptimo() {
        initComponents();
        Btncargardatos.setEnabled(false);
       Btncomputar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        Txtpeso = new javax.swing.JTextField();
        Btncargardatos = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtAltura = new javax.swing.JTextField();
        Btncomputar = new javax.swing.JButton();
        TxtIMC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Peso");

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txtpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtpesoActionPerformed(evt);
            }
        });
        getContentPane().add(Txtpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 110, 30));

        Btncargardatos.setBackground(new java.awt.Color(0, 255, 204));
        Btncargardatos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Btncargardatos.setForeground(new java.awt.Color(0, 0, 0));
        Btncargardatos.setText("Cargar Datos");
        Btncargardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncargardatosActionPerformed(evt);
            }
        });
        getContentPane().add(Btncargardatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        btnsalir.setBackground(new java.awt.Color(0, 255, 204));
        btnsalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(0, 0, 0));
        btnsalir.setText("Cerar");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 255, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("¿ Como Utilizar ?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Altura (Cm)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Peso (KG)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("INDICE DE MASA CORPORAL");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        TxtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAlturaActionPerformed(evt);
            }
        });
        getContentPane().add(TxtAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 110, 30));

        Btncomputar.setBackground(new java.awt.Color(0, 255, 204));
        Btncomputar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Btncomputar.setForeground(new java.awt.Color(0, 0, 0));
        Btncomputar.setText("Computar datos");
        Btncomputar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncomputarActionPerformed(evt);
            }
        });
        getContentPane().add(Btncomputar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));
        getContentPane().add(TxtIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 120, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("COMPROBAR PESO OPTIMO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salud.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
      this.setVisible(false);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void TxtpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtpesoActionPerformed

    private void BtncargardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncargardatosActionPerformed

         Txtpeso.setText(Double.toString(userIni.Peso));
         TxtAltura.setText(Double.toString(userIni.Altura));
         Btncomputar.setEnabled(true);
    }//GEN-LAST:event_BtncargardatosActionPerformed

    private void TxtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAlturaActionPerformed

    private void BtncomputarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncomputarActionPerformed
   
     Sf.IMC= X.PesoOptimo(userIni.Altura, userIni.Peso);
     BigDecimal bigDecimal = new BigDecimal(Sf.IMC).setScale(2, RoundingMode.UP);
     System.out.println();
    TxtIMC.setText(Double.toString(bigDecimal.doubleValue()));
        if (Sf.IMC<18) {
            JOptionPane.showMessageDialog(null,"Tu peso es mas bajo de lo normal","Peso no Optimo",JOptionPane.ERROR_MESSAGE);
        }else
        if (Sf.IMC>25 && Sf.IMC < 30) {
            JOptionPane.showMessageDialog(null,"Poesees indices de sobre peso ","Peso no Optimo",JOptionPane.ERROR_MESSAGE);
        }else
            if (Sf.IMC>30) {
            JOptionPane.showMessageDialog(null,"Possees indices de sobre peso , contacta un especilista !","Peso no Optimo",JOptionPane.ERROR_MESSAGE);
        }else{
                JOptionPane.showMessageDialog(null, "Tienes un peso adecuado :D !!!! ");
            }
                
        
    }//GEN-LAST:event_BtncomputarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JOptionPane.showMessageDialog(null, " PARA CALCULAR SI TU PESO ES EL OPTIMO SIGUE LOS SIGUIENTES PASOS :\n"
               + "\n"
               + "1. Cargar tus datos para saber tu altura y tu peso \n"
               + "2. Presione el boton de computar , el programa procedera a hallar su indice de masa coorporal  \n"
               + "Si es mayor a 18.5 y menor a 25 tienes el peso adecuado :D !!! \n"
               + "\n");
       JOptionPane.showMessageDialog(null," Si tu indice de masa coporal marca uno de estos valores tu salud fisica no es optima \n"
               + "intenta contactar con un especialista : \n"
               + "\n"
               + "1. Si es menor a 18.5 posees un peso bajo de lo normal \n"
               + "2. Si es mayor a 25 posees indices de sobre peso \n"
               + "3. Si es mayor a 30 es recomendable contactar a un especialistas ya que presentas indices se obesidad","CASOS A TRATAR CON ESPECIALISTAS !!!",JOptionPane.ERROR_MESSAGE);
            Btncargardatos.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btncargardatos;
    private javax.swing.JButton Btncomputar;
    private javax.swing.JTextField TxtAltura;
    private javax.swing.JTextField TxtIMC;
    private javax.swing.JTextField Txtpeso;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
