/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import static Controller.Operaciones.user;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.*;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class IFrmEstadisticasSaludFisica extends javax.swing.JInternalFrame {

     
     JFreeChart Grafica;
        DefaultCategoryDataset Dato = new DefaultCategoryDataset();
      
    public IFrmEstadisticasSaludFisica() {
        
        initComponents();     
     }
    
    public DefaultCategoryDataset mostrar (){
        
        
        Dato.addValue(1,  " Grafica de Peso Obtimo ", " 1 año");
        Dato.addValue(2,  " Grafica de Peso Obtimo ", " 2 año");
        Dato.addValue(3,  " Grafica de Peso Obtimo ", " 3 año");
        Dato.addValue(4,  " Grafica de Peso Obtimo ", " 4 año");
        Dato.addValue(5,  " Grafica de Peso Obtimo ", " 5 año");
        Dato.addValue(6,  " Grafica de Peso Obtimo ", " 6 año");
        Dato.addValue(7,  " Grafica de Peso Obtimo ", " 7 año");
        Dato.addValue(10, " Grafica de Peso Obtimo ", " 8 año");
        Dato.addValue(11, " Grafica de Peso Obtimo ", " 9 año");
        
        Dato.addValue(15,  " Grafica de Sobre Peso ", " 1 año");
        Dato.addValue(16,  " Grafica de Sobre Peso ", " 2 año");
        Dato.addValue(17,  " Grafica de Sobre Peso ", " 3 año");
        Dato.addValue(18,  " Grafica de Sobre Peso ", " 4 año");
        Dato.addValue(19,  " Grafica de Sobre Peso ", " 5 año");
        Dato.addValue(20,  " Grafica de Sobre Peso ", " 6 año");
        Dato.addValue(21,  " Grafica de Sobre Peso ", " 7 año");
        Dato.addValue(22,  " Grafica de Sobre Peso ", " 8 año");
        Dato.addValue(54,  " Grafica de Sobre Peso ", " 9 año");
        
        return Dato;
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollBar1 = new javax.swing.JScrollBar();
        jCheckBox2 = new javax.swing.JCheckBox();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jPopupMenu5 = new javax.swing.JPopupMenu();
        jPopupMenu6 = new javax.swing.JPopupMenu();
        BTNPESO_OBTIMO = new javax.swing.JButton();
        BTN_SOBRE_PESO = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jCheckBox1.setText("jCheckBox1");

        jCheckBox2.setText("jCheckBox2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        jMenu7.setText("File");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar2.add(jMenu8);

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        BTNPESO_OBTIMO.setText("PESO OBTIMO");
        BTNPESO_OBTIMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNPESO_OBTIMOActionPerformed(evt);
            }
        });

        BTN_SOBRE_PESO.setText("SOBRE PESO");
        BTN_SOBRE_PESO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SOBRE_PESOActionPerformed(evt);
            }
        });

        jButton2.setText("PESO GENERAL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Estadistica General De Salud Fisica");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        jButton6.setText("jButton6");

        jButton7.setText("jButton7");

        jButton8.setText("jButton8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNPESO_OBTIMO, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_SOBRE_PESO, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton3)
                            .addGap(46, 46, 46)
                            .addComponent(jButton6))))
                .addGap(0, 252, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_SOBRE_PESO)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNPESO_OBTIMO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4)
                    .addComponent(jButton7))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8)
                        .addComponent(jButton5)))
                .addGap(342, 342, 342))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNPESO_OBTIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNPESO_OBTIMOActionPerformed
        // TODO add your handling code here:
        
        DefaultCategoryDataset Datoss = new DefaultCategoryDataset();
        
        Datoss.addValue(1,  " Grafica de Peso Obtimo ", " 1 año");
        Datoss.addValue(2,  " Grafica de Peso Obtimo ", " 2 año");
        Datoss.addValue(3,  " Grafica de Peso Obtimo ", " 3 año");
        Datoss.addValue(4,  " Grafica de Peso Obtimo ", " 4 año");
        Datoss.addValue(5,  " Grafica de Peso Obtimo ", " 5 año");
        Datoss.addValue(6,  " Grafica de Peso Obtimo ", " 6 año");
        Datoss.addValue(7,  " Grafica de Peso Obtimo ", " 7 año");
        Datoss.addValue(10, " Grafica de Peso Obtimo ", " 8 año");
        Datoss.addValue(11, " Grafica de Peso Obtimo ", " 9 año");
        
        Grafica = ChartFactory.createBarChart3D(" GRAFICA DE PESO OBTIMO"," RANGO DE EDADES", "CANTIDAD DE PERSONAS"
                , Datoss,PlotOrientation.VERTICAL, true, true, false);
         ChartPanel Panel = new ChartPanel(Grafica);
         JFrame Ventana;
        Ventana = new JFrame("JFreeChart");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setLocationRelativeTo(null);

    }//GEN-LAST:event_BTNPESO_OBTIMOActionPerformed

    private void BTN_SOBRE_PESOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SOBRE_PESOActionPerformed
        // TODO add your handling code here: 
         JFreeChart Grafica2;
        DefaultCategoryDataset Datos = new DefaultCategoryDataset();
        
        Datos.addValue(15,  " Grafica de Sobre Peso ", " 1 año");
        Datos.addValue(16,  " Grafica de Sobre Peso ", " 2 año");
        Datos.addValue(17,  " Grafica de Sobre Peso ", " 3 año");
        Datos.addValue(18,  " Grafica de Sobre Peso ", " 4 año");
        Datos.addValue(19,  " Grafica de Sobre Peso ", " 5 año");
        Datos.addValue(20,  " Grafica de Sobre Peso ", " 6 año");
        Datos.addValue(21,  " Grafica de Sobre Peso ", " 7 año");
        Datos.addValue(22,  " Grafica de Sobre Peso ", " 8 año");
        Datos.addValue(54,  " Grafica de Sobre Peso ", " 9 año");
        
         Grafica2 = ChartFactory.createBarChart3D("GRAFICA DE SOBRE PESO"," RANGO DE EDADES", "CANTIDAD DE PERSONAS"
                , Datos,PlotOrientation.VERTICAL, true, true, false);
        ChartPanel Panel = new ChartPanel(Grafica2);
        JFrame Ventana;
        Ventana = new JFrame("JFreeChart");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_BTN_SOBRE_PESOActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         // TODO add your handling code here:
         
        Grafica = ChartFactory.createBarChart3D("GRAFICA DE PESO "," RANGO DE EDADES", "CANTIDAD DE PERSONAS"
                , mostrar(),PlotOrientation.VERTICAL, true, true, false);
        ChartPanel Panel = new ChartPanel(Grafica);
        JFrame Ventana;
        Ventana = new JFrame("JFreeChart");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNPESO_OBTIMO;
    private javax.swing.JButton BTN_SOBRE_PESO;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu jPopupMenu5;
    private javax.swing.JPopupMenu jPopupMenu6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables

    
}