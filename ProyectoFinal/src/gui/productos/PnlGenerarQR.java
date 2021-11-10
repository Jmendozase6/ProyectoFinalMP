/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.productos;

import generarqr.CodigoQr;
import opciones.MenuOpciones;

/**
 *
 * @author Jhair
 */
public class PnlGenerarQR extends javax.swing.JPanel {

    MenuOpciones mc = new MenuOpciones();
    CodigoQr codigoQr = new CodigoQr();

    public PnlGenerarQR() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtAlto = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtAncho = new javax.swing.JSpinner();
        panelModelo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbtnGenerarQR = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jtxtAlto.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jtxtAlto.setModel(new javax.swing.SpinnerNumberModel(150, 150, 300, 10));
        jtxtAlto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtxtAlto.setEditor(new javax.swing.JSpinner.NumberEditor(jtxtAlto, ""));
        jtxtAlto.setFocusCycleRoot(true);
        jtxtAlto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtxtAltoStateChanged(evt);
            }
        });
        add(jtxtAlto);
        jtxtAlto.setBounds(132, 112, 150, 40);

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Alto");
        add(jLabel1);
        jLabel1.setBounds(42, 122, 36, 23);

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ancho");
        add(jLabel2);
        jLabel2.setBounds(42, 182, 58, 23);

        jtxtAncho.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jtxtAncho.setModel(new javax.swing.SpinnerNumberModel(150, 150, 300, 10));
        jtxtAncho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtxtAncho.setEditor(new javax.swing.JSpinner.NumberEditor(jtxtAncho, ""));
        jtxtAncho.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtxtAnchoStateChanged(evt);
            }
        });
        add(jtxtAncho);
        jtxtAncho.setBounds(132, 172, 150, 40);

        panelModelo.setBackground(new java.awt.Color(51, 51, 51));
        panelModelo.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout panelModeloLayout = new javax.swing.GroupLayout(panelModelo);
        panelModelo.setLayout(panelModeloLayout);
        panelModeloLayout.setHorizontalGroup(
            panelModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        panelModeloLayout.setVerticalGroup(
            panelModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        add(panelModelo);
        panelModelo.setBounds(347, 62, 150, 150);

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Defina las dimensiones");
        add(jLabel3);
        jLabel3.setBounds(42, 32, 211, 23);

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("de las imágenes");
        add(jLabel4);
        jLabel4.setBounds(72, 62, 148, 23);

        jbtnGenerarQR.setBackground(new java.awt.Color(51, 51, 51));
        jbtnGenerarQR.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jbtnGenerarQR.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGenerarQR.setText("Generar códigos");
        jbtnGenerarQR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnGenerarQR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnGenerarQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGenerarQRActionPerformed(evt);
            }
        });
        add(jbtnGenerarQR);
        jbtnGenerarQR.setBounds(72, 242, 170, 33);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTamanoCodigoQr.png"))); // NOI18N
        jLabel5.setFocusable(false);
        add(jLabel5);
        jLabel5.setBounds(51, 281, 231, 140);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgConexionTamano.png"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(282, 132, 29, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGenerarQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGenerarQRActionPerformed
        codigoQr.generarQr((int) jtxtAncho.getValue(), (int) jtxtAlto.getValue());
        this.setVisible(false);
    }//GEN-LAST:event_jbtnGenerarQRActionPerformed

    private void jtxtAnchoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtxtAnchoStateChanged
        jtxtAlto.setValue(jtxtAncho.getValue());
        panelModelo.setSize((int) jtxtAncho.getValue(), (int) jtxtAlto.getValue());
    }//GEN-LAST:event_jtxtAnchoStateChanged

    private void jtxtAltoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtxtAltoStateChanged
        jtxtAncho.setValue(jtxtAlto.getValue());
        panelModelo.setSize((int) jtxtAncho.getValue(), (int) jtxtAlto.getValue());
    }//GEN-LAST:event_jtxtAltoStateChanged
    public static void main(String[] args) {
        PnlGenerarQR a = new PnlGenerarQR();
        a.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbtnGenerarQR;
    private javax.swing.JSpinner jtxtAlto;
    private javax.swing.JSpinner jtxtAncho;
    private javax.swing.JPanel panelModelo;
    // End of variables declaration//GEN-END:variables
}
