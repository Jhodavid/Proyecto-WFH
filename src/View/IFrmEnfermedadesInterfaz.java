/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import static View.IFrmEnfermedades.idEnfermedad;
import static View.IFrmEnfermedades.nombreEnfer;
import static View.FrmPrincipal.userIni;
import Controller.Operaciones;

/**
 *
 * @author jhoda
 */
public class IFrmEnfermedadesInterfaz extends javax.swing.JInternalFrame {
    
    public Operaciones op;
    /**
     * Creates new form IFrmEnfermedadesInterfaz
     */
    public IFrmEnfermedadesInterfaz() {
        initComponents();
        op = new Operaciones();
        txtAEnfermedades.setLineWrap(true);
        txtAEnfermedades.setWrapStyleWord(true);
        txtSintomas.setLineWrap(true);
        txtSintomas.setWrapStyleWord(true);
    }
    
    public void EnfermedadFrm(String A, String B, String C, String D){
        lblTitulo.setText(A);
        lblTipoEnfer.setText(B);
        txtAEnfermedades.setText(C);
        txtSintomas.setText(D);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAEnfermedades = new javax.swing.JTextArea();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSintomas = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        lblTipoEnfer = new javax.swing.JLabel();
        btnPadezco = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setClosable(true);

        txtAEnfermedades.setEditable(false);
        txtAEnfermedades.setColumns(20);
        txtAEnfermedades.setRows(5);
        txtAEnfermedades.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(txtAEnfermedades);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("T");
        lblTitulo.setToolTipText("");
        lblTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtSintomas.setEditable(false);
        txtSintomas.setColumns(20);
        txtSintomas.setRows(5);
        txtSintomas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane2.setViewportView(txtSintomas);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sintomas:");

        lblTipoEnfer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTipoEnfer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoEnfer.setText("T");
        lblTipoEnfer.setToolTipText("");
        lblTipoEnfer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblTipoEnfer.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnPadezco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconoPadezco.png"))); // NOI18N
        btnPadezco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPadezcoActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ImgEnfermedades.jpg"))); // NOI18N
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton1.setMaximumSize(new java.awt.Dimension(337, 173));
        jButton1.setMinimumSize(new java.awt.Dimension(337, 173));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(btnPadezco)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipoEnfer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(lblTipoEnfer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnPadezco)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPadezcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPadezcoActionPerformed
        if(JOptionPane.showConfirmDialog(null, "¿Padece usted ésta enfermedad?", title, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            op.ImformeEnfermedad(idEnfermedad, userIni.IdUsuario, userIni.Edad, nombreEnfer);
        }
    }//GEN-LAST:event_btnPadezcoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPadezco;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTipoEnfer;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtAEnfermedades;
    private javax.swing.JTextArea txtSintomas;
    // End of variables declaration//GEN-END:variables
}
