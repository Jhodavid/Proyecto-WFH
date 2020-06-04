/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import  View.IFrmSaludFisica;
import javax.swing.JOptionPane;
import static View.IFrmSaludFisica.SaludDatos;
import Model.SaludFisica;

/**
 *
 * @author CAMILO A TRUYOL O
 */
public class IFrmRitmoCardiaco extends javax.swing.JInternalFrame { 
    IFrmSaludFisica X= new  IFrmSaludFisica();
    SaludFisica p = new SaludFisica();
    /**
     * Creates new form IFrmRitmoCardiaco
     */
    public IFrmRitmoCardiaco() {
        initComponents();
         t = new Timer(10, acciones);
          BtnIniciar.setEnabled(false);
          Btnpausar.setEnabled(false);
          Btndetener.setEnabled(false);
          Btn10.setEnabled(false);
          Btn20.setEnabled(false);
          Btn30.setEnabled(false);
       
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

        Txtlatidos = new javax.swing.JTextField();
        Btnsalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        etiquetaTiempo = new javax.swing.JLabel();
        Txtpulso = new javax.swing.JTextField();
        Btnpausar = new javax.swing.JButton();
        BtnUso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Btndetener = new javax.swing.JButton();
        Btn10 = new javax.swing.JButton();
        Btn20 = new javax.swing.JButton();
        Btn30 = new javax.swing.JButton();
        BtnIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 71, 75));
        setPreferredSize(new java.awt.Dimension(526, 192));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Txtlatidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 110, 30));

        Btnsalir.setBackground(new java.awt.Color(0, 204, 204));
        Btnsalir.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        Btnsalir.setForeground(new java.awt.Color(0, 0, 0));
        Btnsalir.setText("SALIR");
        Btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(Btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Latidos por minuto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Medidor de ritmo caridiaco");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        etiquetaTiempo.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        etiquetaTiempo.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTiempo.setText("00:00:00");
        getContentPane().add(etiquetaTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));
        getContentPane().add(Txtpulso, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 110, 30));

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
        BtnUso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnUso.setForeground(new java.awt.Color(0, 0, 0));
        BtnUso.setText(" ¿ COMO UTILIZAR  ?");
        BtnUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnUso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 180, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Registre pulso");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

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

        Btn10.setBackground(new java.awt.Color(0, 204, 204));
        Btn10.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        Btn10.setForeground(new java.awt.Color(0, 0, 0));
        Btn10.setText("10 SEGUNDOS");
        Btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn10ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        Btn20.setBackground(new java.awt.Color(0, 204, 204));
        Btn20.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        Btn20.setForeground(new java.awt.Color(0, 0, 0));
        Btn20.setText("20 SEGUDNOS");
        Btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn20ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        Btn30.setBackground(new java.awt.Color(0, 204, 204));
        Btn30.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        Btn30.setForeground(new java.awt.Color(0, 0, 0));
        Btn30.setText("30 SEGUNDOS");
        Btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn30ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn30, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

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
         Btn10.setEnabled(true);
          Btn20.setEnabled(true);
          Btn30.setEnabled(true);
       
    }//GEN-LAST:event_BtnpausarActionPerformed

    private void BtnUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsoActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null, "Para medir el ritmo cardiaco los pasos a hacer son :\n"
                + "- Hay 3 formas de saber su ritmo cardiaco , entre mas segundos dure mas exacto sera. \n"
                + "\n"
                + "1. Escoge uno de los 3 marcadores ya sea el de 10 20 o 30 segundos \n "
                + "\n"
                + "2. active el cronometro y posterirmente tome su pulso hay varias formas algunas son : \n"
                + "- Coloca tu índice y tercer dedo en el cuello, a un costado costado de la tráquea. Para encontrar tu pulso en la muñeca \n "
                + "coloca 2 dedos entre el hueso y el tendón sobre tu arteria radial, que se encuentra en el lado del pulgar de la muñeca. \n"
                + "\n"
                + "3.Registra tu marca en el cuadro correspondiente a los segundos empleados y dale a calcular. \n"
                + "de esta forma sabras tus latidos por minuto ");
        
        javax.swing.JOptionPane.showMessageDialog(null, " - Una fracuencia cardiaca normal ocsila entre los 100 y 60 latidos por minuto. \n"
                + "- Si se tiene menos representa mejor capacidad cardiovascular hasta ciertos niveles. \n"
                + "- Si es mas de 110 puedes tener problemas de taquicardia !!!! Consulta un especialista.", "RANGOS DE BUENOS LATIDOS POR MINUTO", JOptionPane.ERROR_MESSAGE);
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

    private void BtnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsalirActionPerformed
      this.setVisible(false);
    }//GEN-LAST:event_BtnsalirActionPerformed

    private void Btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn10ActionPerformed
    
     p.Rc = Integer.parseInt(Txtpulso.getText());
     p.Rc= p.Rc* 6 ;
        if (p.Rc<100 && p.Rc > 60) {
            javax.swing.JOptionPane.showMessageDialog(null, "Tus latidos por minuto son normales !");
        }else
            if (p.Rc >= 100) {
            javax.swing.JOptionPane.showMessageDialog(null, "Tus latidos por minuto son muy altos !!!!", "PROBLEMAS ", JOptionPane.ERROR_MESSAGE);
        }else
     Txtlatidos.setText(Double.toString(p.Rc));
     SaludDatos.Rc=p.Rc;
     
    }//GEN-LAST:event_Btn10ActionPerformed

    private void Btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn20ActionPerformed
   p.Rc = Integer.parseInt(Txtpulso.getText());
     p.Rc= p.Rc* 3 ;
     Txtlatidos.setText(Double.toString(p.Rc));
     SaludDatos.Rc=p.Rc;
     
    }//GEN-LAST:event_Btn20ActionPerformed

    private void Btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn30ActionPerformed
       p.Rc = Integer.parseInt(Txtpulso.getText());
     p.Rc= p.Rc* 2 ;
     Txtlatidos.setText(Double.toString(p.Rc));
     SaludDatos.Rc=p.Rc;
     
    }//GEN-LAST:event_Btn30ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn10;
    private javax.swing.JButton Btn20;
    private javax.swing.JButton Btn30;
    private javax.swing.JButton BtnIniciar;
    private javax.swing.JButton BtnUso;
    private javax.swing.JButton Btndetener;
    private javax.swing.JButton Btnpausar;
    private javax.swing.JButton Btnsalir;
    private javax.swing.JTextField Txtlatidos;
    private javax.swing.JTextField Txtpulso;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
