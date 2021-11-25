/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.vista.email;

import com.proyecto.control.sql.usuarios.SqlInicioSesion;
import java.awt.Color;
import java.awt.Cursor;
import FiveCodMover.FiveCodMoverJDialog;
import com.proyecto.control.generar.RutaArchivo;
import javax.swing.BorderFactory;

/**
 *
 * @author Jhair
 */
public class DialogContacto extends javax.swing.JDialog {

    EnviarEmail ee = new EnviarEmail();
    SqlInicioSesion sqlI = new SqlInicioSesion();
    RutaArchivo ra = new RutaArchivo();
    String ruta;

    public DialogContacto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jbtnCerrar = new javax.swing.JButton();
        jtxtAsunto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jrbtn1 = new javax.swing.JRadioButton();
        jrbtn2 = new javax.swing.JRadioButton();
        jrbtn3 = new javax.swing.JRadioButton();
        jrbtn5 = new javax.swing.JRadioButton();
        jrbtn4 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtMensaje = new javax.swing.JTextArea();
        jbtnEnviar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbtnAdjuntar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(26, 28, 32));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnCerrar.setBackground(new java.awt.Color(26, 28, 32));
        jbtnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgCerrar.png"))); // NOI18N
        jbtnCerrar.setToolTipText("Cerrar");
        jbtnCerrar.setBorder(null);
        jbtnCerrar.setContentAreaFilled(false);
        jbtnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCerrarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jtxtAsunto.setBackground(new java.awt.Color(204, 204, 204));
        jtxtAsunto.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jtxtAsunto.setForeground(new java.awt.Color(51, 51, 51));
        jtxtAsunto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtAsunto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtxtAsunto.setFocusable(false);
        jPanel2.add(jtxtAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 320, 50));

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mensaje (Opcional)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 415, -1, -1));

        jLabel5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CONTACTO");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        buttonGroup1.add(jrbtn1);
        jrbtn1.setFont(new java.awt.Font("Montserrat", 2, 14)); // NOI18N
        jrbtn1.setForeground(new java.awt.Color(255, 255, 255));
        jrbtn1.setText("No puedo ingresar a mi cuenta.");
        jrbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbtn1MouseClicked(evt);
            }
        });
        jPanel2.add(jrbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        buttonGroup1.add(jrbtn2);
        jrbtn2.setFont(new java.awt.Font("Montserrat", 2, 14)); // NOI18N
        jrbtn2.setForeground(new java.awt.Color(255, 255, 255));
        jrbtn2.setText("No puedo agregar un producto.");
        jrbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbtn2MouseClicked(evt);
            }
        });
        jPanel2.add(jrbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        buttonGroup1.add(jrbtn3);
        jrbtn3.setFont(new java.awt.Font("Montserrat", 2, 14)); // NOI18N
        jrbtn3.setForeground(new java.awt.Color(255, 255, 255));
        jrbtn3.setText("No puedo actualizar mis datos personales.");
        jrbtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbtn3MouseClicked(evt);
            }
        });
        jPanel2.add(jrbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        buttonGroup1.add(jrbtn5);
        jrbtn5.setFont(new java.awt.Font("Montserrat", 2, 14)); // NOI18N
        jrbtn5.setForeground(new java.awt.Color(255, 255, 255));
        jrbtn5.setText("Otro (Especifica)");
        jrbtn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbtn5MouseClicked(evt);
            }
        });
        jPanel2.add(jrbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        buttonGroup1.add(jrbtn4);
        jrbtn4.setFont(new java.awt.Font("Montserrat", 2, 14)); // NOI18N
        jrbtn4.setForeground(new java.awt.Color(255, 255, 255));
        jrbtn4.setText("No puedo editar una tabla.");
        jrbtn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbtn4MouseClicked(evt);
            }
        });
        jPanel2.add(jrbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jtxtMensaje.setBackground(new java.awt.Color(255, 255, 255));
        jtxtMensaje.setColumns(10);
        jtxtMensaje.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jtxtMensaje.setLineWrap(true);
        jtxtMensaje.setRows(5);
        jtxtMensaje.setTabSize(5);
        jtxtMensaje.setWrapStyleWord(true);
        jtxtMensaje.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtMensaje.setMargin(new java.awt.Insets(6, 6, 6, 6));
        jScrollPane1.setViewportView(jtxtMensaje);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 320, 170));

        jbtnEnviar.setBackground(new java.awt.Color(102, 204, 255));
        jbtnEnviar.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jbtnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAdmin/imgBtnEnviarEmail.png"))); // NOI18N
        jbtnEnviar.setText(" Enviar");
        jbtnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEnviar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEnviarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, 150, 40));

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¿Qué problema tienes?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Asunto");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 325, -1, -1));

        jbtnAdjuntar.setBackground(new java.awt.Color(76, 196, 76));
        jbtnAdjuntar.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jbtnAdjuntar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAdjuntar.setText("Adjuntar");
        jbtnAdjuntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdjuntarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnAdjuntar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnCerrarActionPerformed

    private void jrbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbtn1MouseClicked
        jtxtAsunto.setText(jrbtn1.getText());
        desactivarAsunto();
    }//GEN-LAST:event_jrbtn1MouseClicked

    private void jrbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbtn2MouseClicked
        jtxtAsunto.setText(jrbtn2.getText());
        desactivarAsunto();
    }//GEN-LAST:event_jrbtn2MouseClicked

    private void jrbtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbtn3MouseClicked
        jtxtAsunto.setText(jrbtn3.getText());
        desactivarAsunto();
    }//GEN-LAST:event_jrbtn3MouseClicked

    private void jrbtn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbtn5MouseClicked
        jtxtAsunto.setText("");
        jtxtAsunto.setFocusable(jrbtn5.isSelected());
        jtxtAsunto.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        jtxtAsunto.requestFocus();
        jtxtAsunto.setBackground(Color.white);
    }//GEN-LAST:event_jrbtn5MouseClicked

    private void jrbtn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbtn4MouseClicked
        jtxtAsunto.setText(jrbtn4.getText());
        desactivarAsunto();
    }//GEN-LAST:event_jrbtn4MouseClicked

    private void jbtnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEnviarActionPerformed
        if (!jtxtAsunto.getText().isBlank()) {

            if (ruta.isBlank()) {

                ee.enviarEmail(jtxtAsunto.getText(), jtxtMensaje.getText());

            } else {

                ee.enviarEmail(jtxtAsunto.getText(), jtxtMensaje.getText(), ruta);

            }

            jtxtAsunto.setBorder(BorderFactory.createEtchedBorder());
            jtxtAsunto.setText("");
            ruta = "";
            buttonGroup1.clearSelection();

        } else {

            jtxtAsunto.setBorder(BorderFactory.createLineBorder(Color.decode("#E83232")));

        }

    }//GEN-LAST:event_jbtnEnviarActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        FiveCodMoverJDialog.MouseDraggedJDialog(evt, this);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        FiveCodMoverJDialog.MousePressed(evt);
    }//GEN-LAST:event_formMousePressed

    private void jbtnAdjuntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdjuntarActionPerformed
        ruta = ra.seleccionarRuta(2);
    }//GEN-LAST:event_jbtnAdjuntarActionPerformed

    private void desactivarAsunto() {
        jtxtAsunto.setFocusable(false);
        jtxtAsunto.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        jtxtAsunto.setBackground(new Color(204, 204, 204));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAdjuntar;
    private javax.swing.JButton jbtnCerrar;
    private javax.swing.JButton jbtnEnviar;
    private javax.swing.JRadioButton jrbtn1;
    private javax.swing.JRadioButton jrbtn2;
    private javax.swing.JRadioButton jrbtn3;
    private javax.swing.JRadioButton jrbtn4;
    private javax.swing.JRadioButton jrbtn5;
    private javax.swing.JTextField jtxtAsunto;
    private javax.swing.JTextArea jtxtMensaje;
    // End of variables declaration//GEN-END:variables
}
