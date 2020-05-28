/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author CAMILO A TRUYOL O
 */
public class IFrmRitmoCardiaco extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmRitmoCardiaco
     */
    public IFrmRitmoCardiaco() {
        initComponents();
         t = new Timer(10, acciones);
          BtnIniciar.setEnabled(false);
          Btnpausar.setEnabled(false);
          Btndetener.setEnabled(false);
          
    }

     private Timer t;
    private int  m, s, cs;
    private ActionListener acciones = new ActionListener(){
              @Override
        public void actionPerformed(ActionEvent ae) {
            ++cs; 
            if(cs==100){
                cs = 0;
                ++s;
            }
            if(s==60) 
            {
                s = 0;
                ++m;
            }
           
            actualizarLabel();
        }
        
    };
    private void actualizarLabel() {
        String tiempo = (m<=9?"0":"")+m+":"+(s<=9?"0":"")+s+":"+(cs<=9?"0":"")+cs;
        etiquetaTiempo.setText(tiempo);
    }
           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        etiquetaTiempo = new javax.swing.JLabel();
        Btnpausar = new javax.swing.JButton();
        BtnUso = new javax.swing.JButton();
        Btndetener = new javax.swing.JButton();
        BtnIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 71, 75));
        setPreferredSize(new java.awt.Dimension(526, 192));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Medidor de ritmo caridiaco");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        etiquetaTiempo.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        etiquetaTiempo.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTiempo.setText("00:00:00");
        getContentPane().add(etiquetaTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        Btnpausar.setBackground(new java.awt.Color(0, 204, 204));
        Btnpausar.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        Btnpausar.setForeground(new java.awt.Color(0, 0, 0));
        Btnpausar.setText("PAUSAR");
        Btnpausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnpausarActionPerformed(evt);
            }
        });
        getContentPane().add(Btnpausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        BtnUso.setBackground(new java.awt.Color(0, 204, 204));
        BtnUso.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BtnUso.setForeground(new java.awt.Color(0, 0, 0));
        BtnUso.setText(" ¿ COMO UTILIZAR  ?");
        BtnUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnUso, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        Btndetener.setBackground(new java.awt.Color(0, 204, 204));
        Btndetener.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        Btndetener.setForeground(new java.awt.Color(0, 0, 0));
        Btndetener.setText("DETENER");
        Btndetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtndetenerActionPerformed(evt);
            }
        });
        getContentPane().add(Btndetener, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        BtnIniciar.setBackground(new java.awt.Color(0, 204, 204));
        BtnIniciar.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        BtnIniciar.setForeground(new java.awt.Color(0, 0, 0));
        BtnIniciar.setText("INICIAR");
        BtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ritmo cardiaco.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnpausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnpausarActionPerformed
       t.stop();
        BtnIniciar.setEnabled(true);
        Btnpausar.setEnabled(false);
    }//GEN-LAST:event_BtnpausarActionPerformed

    private void BtnUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsoActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null, "Para medir el ritmo cardiaco los pasos a hacer son :\n"
                + "1. ");
        BtnIniciar.setEnabled(true);
    }//GEN-LAST:event_BtnUsoActionPerformed

    private void BtndetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtndetenerActionPerformed
       if(t.isRunning()) 
        {
            t.stop();
            BtnIniciar.setEnabled(true);
        }
        BtnIniciar.setText("Iniciar");
        Btnpausar.setEnabled(false);
        Btndetener.setEnabled(false);
        m=0; s=0; cs=0;
        actualizarLabel();
    }//GEN-LAST:event_BtndetenerActionPerformed

    private void BtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarActionPerformed
        t.start();
        BtnIniciar.setEnabled(false);
        BtnIniciar.setText("Reanudar");
        Btnpausar.setEnabled(true);
        Btndetener.setEnabled(true);
    }//GEN-LAST:event_BtnIniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIniciar;
    private javax.swing.JButton BtnUso;
    private javax.swing.JButton Btndetener;
    private javax.swing.JButton Btnpausar;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
