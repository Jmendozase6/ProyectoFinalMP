/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectofinal.vista.usuarios;

import FiveCodMover.FiveCodMoverJFrame;
import com.proyectofinal.opciones.MenuOpciones;
import java.awt.Color;
import com.proyectofinal.sql.usuarios.SqlInicioSesion;

/**
 *
 * @author JHAIR
 */
public class FrmInicioSesion extends javax.swing.JFrame {

    MenuOpciones mc = new MenuOpciones();
    SqlInicioSesion sqlI = new SqlInicioSesion();

    public FrmInicioSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jbtnIniciarSesion = new javax.swing.JButton();
        jtgbtnVerPass = new javax.swing.JToggleButton();
        jlblError = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jtxtContrasena = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlblInicioSesion = new javax.swing.JLabel();
        jbtnRegistrarse = new javax.swing.JButton();
        labelIcon = new javax.swing.JLabel();
        jbtnEnviarEmail = new javax.swing.JButton();
        jbtnMinimizar = new javax.swing.JButton();
        jbtnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIO DE SESIÓN");
        setUndecorated(true);
        setResizable(false);
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

        jPanel1.setBackground(new java.awt.Color(26, 28, 32));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(34, 35, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INICIO DE SESIÓN");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 250, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-user.png"))); // NOI18N
        jLabel10.setToolTipText("");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 165, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-password.png"))); // NOI18N
        jLabel8.setToolTipText("");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 255, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jbtnIniciarSesion.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jbtnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jbtnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgBnIniciarSesion.png"))); // NOI18N
        jbtnIniciarSesion.setText("Iniciar sesión");
        jbtnIniciarSesion.setToolTipText("Clic aquí");
        jbtnIniciarSesion.setBorderPainted(false);
        jbtnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnIniciarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 250, 40));

        jtgbtnVerPass.setBackground(new java.awt.Color(255, 255, 255));
        jtgbtnVerPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgClosedEyeBlanco.png"))); // NOI18N
        jtgbtnVerPass.setBorder(null);
        jtgbtnVerPass.setBorderPainted(false);
        jtgbtnVerPass.setContentAreaFilled(false);
        jtgbtnVerPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtgbtnVerPass.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgOpenEyeBlanco.png"))); // NOI18N
        jtgbtnVerPass.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgOpenEyeBlanco.png"))); // NOI18N
        jtgbtnVerPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtgbtnVerPassActionPerformed(evt);
            }
        });
        jPanel2.add(jtgbtnVerPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 255, -1, -1));

        jlblError.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jlblError.setForeground(new java.awt.Color(34, 35, 40));
        jlblError.setText("Error: rellene todos los campos");
        jPanel2.add(jlblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 307, -1, -1));

        jtxtUsuario.setBackground(new java.awt.Color(34, 35, 40));
        jtxtUsuario.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        jtxtUsuario.setText("Ingrese su nombre de usuario");
        jtxtUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        jtxtUsuario.setMargin(new java.awt.Insets(2, 10, 2, 6));
        jtxtUsuario.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jtxtUsuario.setSelectionColor(new java.awt.Color(81, 104, 244));
        jtxtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtUsuarioFocusGained(evt);
            }
        });
        jPanel2.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 250, 40));

        jtxtContrasena.setBackground(new java.awt.Color(34, 35, 40));
        jtxtContrasena.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jtxtContrasena.setForeground(new java.awt.Color(153, 153, 153));
        jtxtContrasena.setText("********");
        jtxtContrasena.setCaretColor(new java.awt.Color(255, 255, 255));
        jtxtContrasena.setMargin(new java.awt.Insets(2, 10, 2, 6));
        jtxtContrasena.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jtxtContrasena.setSelectionColor(new java.awt.Color(81, 104, 244));
        jtxtContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtContrasenaFocusGained(evt);
            }
        });
        jPanel2.add(jtxtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 250, 40));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 450, 500));

        jPanel3.setBackground(new java.awt.Color(81, 104, 244));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("¿Tienes algún problema?");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 480, -1));

        jLabel5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BIENVENIDO");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 250, -1));

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Puedes contactar al administrador");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 480, -1));

        jlblInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgRegistro.png"))); // NOI18N
        jPanel3.add(jlblInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 333, 250));

        jbtnRegistrarse.setBackground(new java.awt.Color(255, 255, 255));
        jbtnRegistrarse.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jbtnRegistrarse.setForeground(new java.awt.Color(0, 62, 195));
        jbtnRegistrarse.setText("Registrarse");
        jbtnRegistrarse.setToolTipText("Clic aquí");
        jbtnRegistrarse.setBorder(null);
        jbtnRegistrarse.setBorderPainted(false);
        jbtnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarseActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 250, 40));

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgLogo.png"))); // NOI18N
        jPanel3.add(labelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jbtnEnviarEmail.setBackground(new java.awt.Color(255, 255, 255));
        jbtnEnviarEmail.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jbtnEnviarEmail.setForeground(new java.awt.Color(0, 62, 195));
        jbtnEnviarEmail.setText("Enviar E-mail");
        jbtnEnviarEmail.setToolTipText("Clic aquí");
        jbtnEnviarEmail.setBorder(null);
        jbtnEnviarEmail.setBorderPainted(false);
        jbtnEnviarEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEnviarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEnviarEmailActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnEnviarEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 250, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 500, 590));

        jbtnMinimizar.setBackground(new java.awt.Color(26, 28, 32));
        jbtnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgMinimizar.png"))); // NOI18N
        jbtnMinimizar.setToolTipText("Minimizar");
        jbtnMinimizar.setBorder(null);
        jbtnMinimizar.setBorderPainted(false);
        jbtnMinimizar.setContentAreaFilled(false);
        jbtnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinimizarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

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
        jPanel1.add(jbtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean validarCamposVacios() {
        if (jtxtUsuario.getText().isBlank() || jtxtUsuario.getText().equals("Ingrese su nombre de usuario")) {
            return false;
        } else if (String.valueOf(jtxtContrasena.getPassword()).isBlank() || String.valueOf(jtxtContrasena.getPassword()).equals("********")) {
            return false;
        }
        return true;
    }

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_formMousePressed

    private void jbtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarActionPerformed
        mc.cerrarPrograma();
    }//GEN-LAST:event_jbtnCerrarActionPerformed

    private void jbtnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinimizarActionPerformed
        mc.minimizarPrograma(this);
    }//GEN-LAST:event_jbtnMinimizarActionPerformed

    private void jbtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarseActionPerformed
        new FrmRegistro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnRegistrarseActionPerformed

    private void jtxtContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtContrasenaFocusGained
        if (String.valueOf(jtxtContrasena.getPassword()).equals("********")) {
            jtxtContrasena.setText("");
            jtxtContrasena.setForeground(Color.WHITE);
        }
        if (jtxtUsuario.getText().isBlank()) {
            usuarioPlaceH();
        }
    }//GEN-LAST:event_jtxtContrasenaFocusGained

    private void jtxtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtUsuarioFocusGained
        if (jtxtUsuario.getText().equals("Ingrese su nombre de usuario")) {
            jtxtUsuario.setText("");
            jtxtUsuario.setForeground(Color.WHITE);
        }
        if (String.valueOf(jtxtContrasena.getPassword()).isBlank()) {
            contraPlaceH();
        }
    }//GEN-LAST:event_jtxtUsuarioFocusGained

    private void jtgbtnVerPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtgbtnVerPassActionPerformed
        mc.verPass(jtgbtnVerPass, jtxtContrasena);
    }//GEN-LAST:event_jtgbtnVerPassActionPerformed

    private void jbtnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIniciarSesionActionPerformed
        if (validarCamposVacios() == true) {

            sqlI.validarUsuario(jtxtUsuario.getText(), String.valueOf(jtxtContrasena.getPassword()), this);

        } else {

            jlblError.setForeground(Color.decode("#E83232"));

        }
    }//GEN-LAST:event_jbtnIniciarSesionActionPerformed

    private void jbtnEnviarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEnviarEmailActionPerformed
        
    }//GEN-LAST:event_jbtnEnviarEmailActionPerformed

    private void usuarioPlaceH() {
        jtxtUsuario.setText("Ingrese su nombre de usuario");
        jtxtUsuario.setForeground(Color.GRAY);
    }

    private void contraPlaceH() {
        jtxtContrasena.setText("********");
        jtxtContrasena.setForeground(Color.GRAY);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtnCerrar;
    private javax.swing.JButton jbtnEnviarEmail;
    private javax.swing.JButton jbtnIniciarSesion;
    private javax.swing.JButton jbtnMinimizar;
    private javax.swing.JButton jbtnRegistrarse;
    private javax.swing.JLabel jlblError;
    private javax.swing.JLabel jlblInicioSesion;
    private javax.swing.JToggleButton jtgbtnVerPass;
    private javax.swing.JPasswordField jtxtContrasena;
    private javax.swing.JTextField jtxtUsuario;
    private javax.swing.JLabel labelIcon;
    // End of variables declaration//GEN-END:variables
}
