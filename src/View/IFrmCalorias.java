/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;
import static View.FrmPrincipal.userIni;
import Controller.Operaciones;
/**
 *
 * @author CAMILO A TRUYOL O
 */
public class IFrmCalorias extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmCalorias
     */
    public IFrmCalorias() {
        initComponents();
        Btncargardatos.setEnabled(false);
        MenuCalculat.setEnabled(false);
        CMBestado.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CMBestado = new javax.swing.JComboBox<>();
        TxtAlltura = new javax.swing.JTextField();
        Txtpeso = new javax.swing.JTextField();
        TxtSExo = new javax.swing.JTextField();
        Txtedad = new javax.swing.JTextField();
        Btncargardatos = new javax.swing.JButton();
        Btnsalir = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Jmenuusar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuCalculat = new javax.swing.JMenu();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Actividades  diarias");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Peso (Kg)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Altura (Cm)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Edad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Sexo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        CMBestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione una opcion --", "1. No muy activo ( Sobre todo sentado ej. trabajo de oficina)", "2. Medianamente activo ( Sobre todo de pie ej. cajero, profesor)", "3. Activo ( Sobre todo andando ej. vendedor, camarero)", "4. Muy activo ( Trabajos físicos ej. construcción)" }));
        CMBestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMBestadoActionPerformed(evt);
            }
        });
        getContentPane().add(CMBestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));
        getContentPane().add(TxtAlltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 100, 30));
        getContentPane().add(Txtpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 100, 30));
        getContentPane().add(TxtSExo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 100, 30));
        getContentPane().add(Txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 100, 30));

        Btncargardatos.setBackground(new java.awt.Color(0, 255, 204));
        Btncargardatos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Btncargardatos.setForeground(new java.awt.Color(0, 0, 0));
        Btncargardatos.setText("Cargar Datos");
        Btncargardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncargardatosActionPerformed(evt);
            }
        });
        getContentPane().add(Btncargardatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        Btnsalir.setBackground(new java.awt.Color(0, 255, 204));
        Btnsalir.setForeground(new java.awt.Color(0, 0, 0));
        Btnsalir.setText("SALIR");
        Btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(Btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, -1));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(51, 255, 204));
        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setText("Calculador de calorias diarias");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 220, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondi isi.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Jmenuusar.setText("Ayuda");
        Jmenuusar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JmenuusarKeyPressed(evt);
            }
        });

        jMenuItem1.setText("Como usar ??");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Jmenuusar.add(jMenuItem1);

        jMenuBar1.add(Jmenuusar);

        MenuCalculat.setText("Calcular");
        jMenuBar1.add(MenuCalculat);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsalirActionPerformed
     this.setVisible(false);
     
    }//GEN-LAST:event_BtnsalirActionPerformed

    private void JmenuusarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JmenuusarKeyPressed
      
    }//GEN-LAST:event_JmenuusarKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      JOptionPane.showMessageDialog(null, "");
        Btncargardatos.setEnabled(true);
        CMBestado.setEnabled(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void CMBestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMBestadoActionPerformed
   MenuCalculat.setEnabled(true);
    }//GEN-LAST:event_CMBestadoActionPerformed

    private void BtncargardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncargardatosActionPerformed
    TxtAlltura.setText(Double.toString(userIni.Altura));
    TxtSExo.setText(userIni.Sexo);
    Txtedad.setText(Integer.toString(userIni.Edad));
    Txtpeso.setText(Double.toString(userIni.Peso));
    }//GEN-LAST:event_BtncargardatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btncargardatos;
    private javax.swing.JButton Btnsalir;
    private javax.swing.JComboBox<String> CMBestado;
    private javax.swing.JMenu Jmenuusar;
    private javax.swing.JMenu MenuCalculat;
    private javax.swing.JTextField TxtAlltura;
    private javax.swing.JTextField TxtSExo;
    private javax.swing.JTextField Txtedad;
    private javax.swing.JTextField Txtpeso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
