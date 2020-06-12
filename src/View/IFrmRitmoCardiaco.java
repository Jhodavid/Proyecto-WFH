/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import static View.FrmPrincipal.userIni;
import javax.swing.JOptionPane;
import Controller.Operaciones;
import java.awt.event.KeyEvent;

/**
 *
 * @author CAMILO A TRUYOL O
 */
public class IFrmRitmoCardiaco extends javax.swing.JInternalFrame {
   Operaciones O = new Operaciones();
    IFrmSaludFisica X = new IFrmSaludFisica();
    
    public int seg = 0;

    /**
     * Creates new form IFrmRitmoCardiaco
     */
    public IFrmRitmoCardiaco() {
        initComponents();
        t = new Timer(10, acciones);

        Btncalcular.setEnabled(false);
        Btnpausar.setEnabled(false);
        BtnReiniciar.setEnabled(false);
        Btn10.setEnabled(false);
        Btn20.setEnabled(false);
        Btn30.setEnabled(false);
        Txtlatidos.setEnabled(false);

    }

    private Timer t;
    private int m, s, cs;
    private ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            ++cs;
            if (cs == 100) {
                cs = 0;
                ++s;
            }
            if (s == 60) {
                s = 0;
                ++m;
            }

            actualizarLabel();
        }

    };

    private void actualizarLabel() {
        String tiempo = (m <= 9 ? "0" : "") + m + ":" + (s <= 9 ? "0" : "") + s + ":" + (cs <= 9 ? "0" : "") + cs;
        if (seg == 10) {
            if (tiempo.equals("00:10:00")) {
                t.stop();
                Btn20.setEnabled(false);
                Btn30.setEnabled(false);
                BtnReiniciar.setEnabled(true);
                Btncalcular.setEnabled(true);
                Btnpausar.setEnabled(false);
            }
            etiquetaTiempo.setText(tiempo);
        } else if (seg == 20) {
            if (tiempo.equals("00:20:00")) {
                t.stop();
                Btn10.setEnabled(false);
                Btn30.setEnabled(false);
                BtnReiniciar.setEnabled(true);
                Btncalcular.setEnabled(true);
                Btnpausar.setEnabled(false);
            }
            etiquetaTiempo.setText(tiempo);
        } else if (seg == 30) {
            if (tiempo.equals("00:30:00")) {
                t.stop();
                Btn10.setEnabled(false);
                Btn20.setEnabled(false);
                BtnReiniciar.setEnabled(true);
                Btncalcular.setEnabled(true);
                Btnpausar.setEnabled(false);
            }
            etiquetaTiempo.setText(tiempo);
        }
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
        BtnReiniciar = new javax.swing.JButton();
        Btn10 = new javax.swing.JButton();
        Btn20 = new javax.swing.JButton();
        Btn30 = new javax.swing.JButton();
        Btncalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 71, 75));
        setPreferredSize(new java.awt.Dimension(526, 192));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txtlatidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtlatidosActionPerformed(evt);
            }
        });
        getContentPane().add(Txtlatidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 110, 30));

        Btnsalir.setBackground(new java.awt.Color(0, 204, 204));
        Btnsalir.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        Btnsalir.setText("Cerrar");
        Btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(Btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Latidos por minuto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Medidor de ritmo cardiaco");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        etiquetaTiempo.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        etiquetaTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTiempo.setText("00:00:00");
        getContentPane().add(etiquetaTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        Txtpulso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtpulsoActionPerformed(evt);
            }
        });
        Txtpulso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtpulsoKeyTyped(evt);
            }
        });
        getContentPane().add(Txtpulso, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 110, 30));

        Btnpausar.setBackground(new java.awt.Color(0, 204, 204));
        Btnpausar.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        Btnpausar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pause.png"))); // NOI18N
        Btnpausar.setPreferredSize(new java.awt.Dimension(10, 15));
        Btnpausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnpausarActionPerformed(evt);
            }
        });
        getContentPane().add(Btnpausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 40, 40));

        BtnUso.setBackground(new java.awt.Color(0, 204, 204));
        BtnUso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnUso.setText(" ¿ COMO UTILIZAR  ?");
        BtnUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnUso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 180, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Registre pulso");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        BtnReiniciar.setBackground(new java.awt.Color(204, 255, 255));
        BtnReiniciar.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        BtnReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/recargar (1).png"))); // NOI18N
        BtnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 50, 50));

        Btn10.setBackground(new java.awt.Color(0, 204, 204));
        Btn10.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        Btn10.setText("10 SEGUNDOS");
        Btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn10ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        Btn20.setBackground(new java.awt.Color(0, 204, 204));
        Btn20.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        Btn20.setText("20 SEGUDNOS");
        Btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn20ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        Btn30.setBackground(new java.awt.Color(0, 204, 204));
        Btn30.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        Btn30.setText("30 SEGUNDOS");
        Btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn30ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        Btncalcular.setBackground(new java.awt.Color(0, 204, 204));
        Btncalcular.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        Btncalcular.setText("Calcular");
        Btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncalcularActionPerformed(evt);
            }
        });
        getContentPane().add(Btncalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ritmo cardiaco.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnpausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnpausarActionPerformed
        t.stop();
        BtnReiniciar.setEnabled(true);
        Btn10.setEnabled(false);
        Btn20.setEnabled(false);
        Btn30.setEnabled(false);
        Btnpausar.setEnabled(false);

    }//GEN-LAST:event_BtnpausarActionPerformed

    private void BtnUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsoActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null, "Para medir el ritmo cardiaco los pasos a hacer son :\n"
                + "- Hay 3 formas de saber su ritmo cardiaco , entre mas segundos dure mas exacto sera. \n"
                + "\n"
                + "1. Escoge uno de los 3 marcadores ya sea el de 10 20 o 30 segundos \n "
                + "\n"
                + "2. El cronometro se activara automaticamente y se detendra dependiendo en cual haya escogido : \n"
                + "- Coloca tu índice y tercer dedo en el cuello, a un costado costado de la tráquea. Para encontrar tu pulso en la muñeca \n "
                + "coloca 2 dedos entre el hueso y el tendón sobre tu arteria radial, que se encuentra en el lado del pulgar de la muñeca. \n"
                + " espere a que el cronometro se pause meintras mides tu pulso.\n"
                + "\n"
                + "3.Registra tu marca en el cuadro correspondiente a los segundos empleados y dale a calcular. \n"
                + "de esta forma sabras tus latidos por minuto ");

        javax.swing.JOptionPane.showMessageDialog(null, " - Una fracuencia cardiaca normal ocsila entre los 100 y 60 latidos por minuto. \n"
                + "- Si se tiene menos representa mejor capacidad cardiovascular hasta ciertos niveles. \n"
                + "- Si es mas de 110 puedes tener problemas de taquicardia !!!! Consulta un especialista.", "RANGOS DE BUENOS LATIDOS POR MINUTO", JOptionPane.ERROR_MESSAGE);
        Btn10.setEnabled(true);
        Btn20.setEnabled(true);
        Btn30.setEnabled(true);
    }//GEN-LAST:event_BtnUsoActionPerformed

    private void BtncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncalcularActionPerformed
        if (seg == 10) {
            userIni.RitmoCardiaco = Integer.parseInt(Txtpulso.getText());
            userIni.RitmoCardiaco = userIni.RitmoCardiaco * 6;
            if (userIni.RitmoCardiaco < 100 && userIni.RitmoCardiaco > 60) {
                javax.swing.JOptionPane.showMessageDialog(null, "Tus latidos por minuto son normales !");
                Txtlatidos.setText(Double.toString(userIni.RitmoCardiaco));
            } else if (userIni.RitmoCardiaco >= 100) {
                javax.swing.JOptionPane.showMessageDialog(null, "Tus latidos por minuto son muy altos !!!!", "PROBLEMAS ", JOptionPane.ERROR_MESSAGE);
                Txtlatidos.setText(Double.toString(userIni.RitmoCardiaco));
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Tus latidos son muy buenos !");
            }
            Txtlatidos.setText(Double.toString(userIni.RitmoCardiaco));
            userIni.RitmoCardiaco = userIni.RitmoCardiaco;
        } else if (seg == 20) {
            userIni.RitmoCardiaco = Integer.parseInt(Txtpulso.getText());
            userIni.RitmoCardiaco = userIni.RitmoCardiaco * 3;
            if (userIni.RitmoCardiaco < 100 && userIni.RitmoCardiaco > 60) {
                javax.swing.JOptionPane.showMessageDialog(null, "Tus latidos por minuto son normales !");
                Txtlatidos.setText(Double.toString(userIni.RitmoCardiaco));
            } else if (userIni.RitmoCardiaco >= 100) {
                javax.swing.JOptionPane.showMessageDialog(null, "Tus latidos por minuto son muy altos !!!!", "PROBLEMAS ", JOptionPane.ERROR_MESSAGE);
                Txtlatidos.setText(Double.toString(userIni.RitmoCardiaco));
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Tus latidos son muy buenos !");
            }
            Txtlatidos.setText(Double.toString(userIni.RitmoCardiaco));
            userIni.RitmoCardiaco = userIni.RitmoCardiaco;
        } else if (seg == 30) {
            userIni.RitmoCardiaco = Integer.parseInt(Txtpulso.getText());
            userIni.RitmoCardiaco = userIni.RitmoCardiaco * 2;

            if (userIni.RitmoCardiaco < 100 && userIni.RitmoCardiaco > 60) {
                javax.swing.JOptionPane.showMessageDialog(null, "Tus latidos por minuto son normales !");
                Txtlatidos.setText(Double.toString(userIni.RitmoCardiaco));
            } else if (userIni.RitmoCardiaco >= 100) {
                javax.swing.JOptionPane.showMessageDialog(null, "Tus latidos por minuto son muy altos !!!!", "PROBLEMAS ", JOptionPane.ERROR_MESSAGE);
                Txtlatidos.setText(Double.toString(userIni.RitmoCardiaco));
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Tus latidos son muy buenos !");
            }
            Txtlatidos.setText(Double.toString(userIni.RitmoCardiaco));
            userIni.RitmoCardiaco = userIni.RitmoCardiaco;
        }
        
           O.GuardarSaludFisica(userIni);

    }//GEN-LAST:event_BtncalcularActionPerformed

    private void BtnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_BtnsalirActionPerformed

    private void Btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn10ActionPerformed
        t.start();
        Btnpausar.setEnabled(false);
        BtnReiniciar.setEnabled(false);
        seg = 10;
        Btnpausar.setEnabled(true);
        Btn10.setEnabled(false);
        Btn20.setEnabled(false);
        Btn30.setEnabled(false);

    }//GEN-LAST:event_Btn10ActionPerformed

    private void Btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn20ActionPerformed
        t.start();
        Btnpausar.setEnabled(false);
        BtnReiniciar.setEnabled(false);
        seg = 20;
        Btnpausar.setEnabled(true);
        Btn10.setEnabled(false);
        Btn20.setEnabled(false);
        Btn30.setEnabled(false);
    }//GEN-LAST:event_Btn20ActionPerformed

    private void Btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn30ActionPerformed
        t.start();
        Btnpausar.setEnabled(false);
        BtnReiniciar.setEnabled(false);
        seg = 30;
        Btnpausar.setEnabled(true);
        Btn10.setEnabled(false);
        Btn20.setEnabled(false);
        Btn30.setEnabled(false);
    }//GEN-LAST:event_Btn30ActionPerformed

    private void TxtlatidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtlatidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtlatidosActionPerformed

    private void BtnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReiniciarActionPerformed
        if (t.isRunning()) {
            t.stop();
            Btncalcular.setEnabled(true);
        }
        Btnpausar.setEnabled(false);
        BtnReiniciar.setEnabled(false);

        m = 0;
        s = 0;
        cs = 0;
        actualizarLabel();
        Btn10.setEnabled(true);
        Btn20.setEnabled(true);
        Btn30.setEnabled(true);
    }//GEN-LAST:event_BtnReiniciarActionPerformed

    private void TxtpulsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtpulsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtpulsoActionPerformed

    private void TxtpulsoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtpulsoKeyTyped
        char Validacion = evt.getKeyChar();
        if (Validacion != KeyEvent.VK_BACK_SPACE) {
            if (Validacion < '0' || Validacion > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_TxtpulsoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn10;
    private javax.swing.JButton Btn20;
    private javax.swing.JButton Btn30;
    private javax.swing.JButton BtnReiniciar;
    private javax.swing.JButton BtnUso;
    private javax.swing.JButton Btncalcular;
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
