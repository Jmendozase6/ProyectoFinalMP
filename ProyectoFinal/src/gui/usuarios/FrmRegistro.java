/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.usuarios;

import FiveCodMover.FiveCodMoverJFrame;
import opciones.MenuOpciones;
import java.awt.Color;
import javax.swing.JOptionPane;
import sql.usuarios.SqlRegistro;

/**
 *
 * @author JHAIR
 */
public class FrmRegistro extends javax.swing.JFrame {

    MenuOpciones mc = new MenuOpciones();
    SqlRegistro sqlR = new SqlRegistro();

    public FrmRegistro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtxtNombre = new javax.swing.JTextField();
        lblUs = new javax.swing.JLabel();
        lblCon = new javax.swing.JLabel();
        jtxtContrasena = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jbtnRegistrarse = new javax.swing.JButton();
        jtgbtnVerPass = new javax.swing.JToggleButton();
        jlblError = new javax.swing.JLabel();
        jbtnCerrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jbtnIniciarSesion = new javax.swing.JButton();
        jlblRegistro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbtnMinimizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO");
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

        BackGround.setBackground(new java.awt.Color(26, 28, 32));
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(34, 35, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtNombre.setBackground(new java.awt.Color(34, 35, 40));
        jtxtNombre.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(153, 153, 153));
        jtxtNombre.setText("   Ingrese su nombre");
        jtxtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jtxtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxtNombreMousePressed(evt);
            }
        });
        jPanel2.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 250, 40));

        lblUs.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lblUs.setForeground(new java.awt.Color(255, 255, 255));
        lblUs.setText("Usuario");
        jPanel2.add(lblUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        lblCon.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lblCon.setForeground(new java.awt.Color(255, 255, 255));
        lblCon.setText("Contraseña");
        jPanel2.add(lblCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jtxtContrasena.setBackground(new java.awt.Color(34, 35, 40));
        jtxtContrasena.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jtxtContrasena.setForeground(new java.awt.Color(153, 153, 153));
        jtxtContrasena.setText("********");
        jtxtContrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jtxtContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxtContrasenaMousePressed(evt);
            }
        });
        jPanel2.add(jtxtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 250, 40));

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTRO");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 140, -1));

        lblNombre.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-password.png"))); // NOI18N
        jLabel8.setToolTipText("");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-name.png"))); // NOI18N
        jLabel9.setToolTipText("");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-user.png"))); // NOI18N
        jLabel10.setToolTipText("");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jtxtUsuario.setBackground(new java.awt.Color(34, 35, 40));
        jtxtUsuario.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        jtxtUsuario.setText("   Ingrese su nombre de usuario");
        jtxtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jtxtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxtUsuarioMousePressed(evt);
            }
        });
        jPanel2.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 250, 40));

        jbtnRegistrarse.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jbtnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIniciarSesion.png"))); // NOI18N
        jbtnRegistrarse.setText("Registrarse");
        jbtnRegistrarse.setBorderPainted(false);
        jbtnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegistrarse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarseActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 250, 40));

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
        jPanel2.add(jtgbtnVerPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        jlblError.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jlblError.setForeground(new java.awt.Color(34, 35, 40));
        jlblError.setText("Error: rellene todos los campos");
        jPanel2.add(jlblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        BackGround.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 450, 500));

        jbtnCerrar.setBackground(new java.awt.Color(26, 28, 32));
        jbtnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgCerrar.png"))); // NOI18N
        jbtnCerrar.setBorder(null);
        jbtnCerrar.setContentAreaFilled(false);
        jbtnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCerrarActionPerformed(evt);
            }
        });
        BackGround.add(jbtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, 20));

        jPanel3.setBackground(new java.awt.Color(81, 104, 244));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BIENVENIDO");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 250, -1));

        jbtnIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        jbtnIniciarSesion.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jbtnIniciarSesion.setForeground(new java.awt.Color(0, 62, 195));
        jbtnIniciarSesion.setText("Iniciar sesión");
        jbtnIniciarSesion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnIniciarSesion.setBorderPainted(false);
        jbtnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 250, 40));

        jlblRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgInicioSesion.png"))); // NOI18N
        jPanel3.add(jlblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 215, 168));

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Si ya tienes una cuenta puedes");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 488, -1));

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("iniciar sesión aquí");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 480, -1));

        BackGround.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 500, 590));

        jbtnMinimizar.setBackground(new java.awt.Color(26, 28, 32));
        jbtnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgMinimizar.png"))); // NOI18N
        jbtnMinimizar.setBorder(null);
        jbtnMinimizar.setBorderPainted(false);
        jbtnMinimizar.setContentAreaFilled(false);
        jbtnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinimizarActionPerformed(evt);
            }
        });
        BackGround.add(jbtnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 20, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean validarCamposVacios() {
        if (jtxtNombre.getText().isBlank() || jtxtNombre.getText().equals("   Ingrese su nombre")) {
            return false;
        } else if (jtxtUsuario.getText().isBlank() || jtxtUsuario.getText().equals("   Ingrese su nombre de usuario")) {
            return false;
        } else if (String.valueOf(jtxtContrasena.getPassword()).isBlank() || String.valueOf(jtxtContrasena.getPassword()).equals("********")) {
            return false;
        }
        return true;
    }

    private void jbtnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIniciarSesionActionPerformed
        FrmInicioSesion frmInicioSesion = new FrmInicioSesion();
        this.dispose();
        frmInicioSesion.setVisible(true);

    }//GEN-LAST:event_jbtnIniciarSesionActionPerformed

    private void jtxtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtNombreMousePressed
        if (jtxtNombre.getText().equals("   Ingrese su nombre")) {
            jtxtNombre.setText("");
            jtxtNombre.setForeground(Color.WHITE);
        }
        if (jtxtUsuario.getText().isBlank()) {
            usuarioPlaceH();
        }
        if (String.valueOf(jtxtContrasena.getPassword()).isBlank()) {
            contraPlaceH();
        }
    }//GEN-LAST:event_jtxtNombreMousePressed

    private void jtxtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtUsuarioMousePressed
        if (jtxtUsuario.getText().equals("   Ingrese su nombre de usuario")) {
            jtxtUsuario.setText("");
            jtxtUsuario.setForeground(Color.WHITE);
        }
        if (jtxtNombre.getText().isBlank()) {
            nombrePlaceH();
        }
        if (String.valueOf(jtxtContrasena.getPassword()).isBlank()) {
            contraPlaceH();
        }
    }//GEN-LAST:event_jtxtUsuarioMousePressed

    private void jtxtContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtContrasenaMousePressed
        if (String.valueOf(jtxtContrasena.getPassword()).equals("********")) {
            jtxtContrasena.setText("");
            jtxtContrasena.setForeground(Color.WHITE);
        }
        if (jtxtUsuario.getText().isBlank()) {
            usuarioPlaceH();
        }
        if (jtxtNombre.getText().isBlank()) {
            nombrePlaceH();
        }
    }//GEN-LAST:event_jtxtContrasenaMousePressed

    private void jbtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarActionPerformed
        mc.cerrarPrograma();
    }//GEN-LAST:event_jbtnCerrarActionPerformed

    private void jbtnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinimizarActionPerformed
        mc.minimizarPrograma(this);
    }//GEN-LAST:event_jbtnMinimizarActionPerformed

    private void jbtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarseActionPerformed
        if (validarCamposVacios()) {
            if (!(sqlR.verificarExistente(jtxtUsuario.getText()))) {
                sqlR.agregarUsuario(jtxtNombre.getText(), jtxtUsuario.getText(), String.valueOf(jtxtContrasena.getPassword()), jlblError);
                limpiarCampos();
                nombrePlaceH();
                usuarioPlaceH();
                contraPlaceH();
            } else{
                JOptionPane.showMessageDialog(rootPane, "El nombre de usuario ya existe");
            }

        } else {

            jlblError.setForeground(Color.decode("#E83232"));

        }
    }//GEN-LAST:event_jbtnRegistrarseActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_formMouseDragged

    private void jtgbtnVerPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtgbtnVerPassActionPerformed
        mc.verPass(jtgbtnVerPass, jtxtContrasena);
    }//GEN-LAST:event_jtgbtnVerPassActionPerformed

    private void limpiarCampos() {
        jtxtNombre.setText("");
        jtxtUsuario.setText("");
        jtxtContrasena.setText("");
    }

    private void nombrePlaceH() {
        jtxtNombre.setText("   Ingrese su nombre");
        jtxtNombre.setForeground(Color.GRAY);
    }

    private void usuarioPlaceH() {
        jtxtUsuario.setText("   Ingrese su nombre de usuario");
        jtxtUsuario.setForeground(Color.GRAY);
    }

    private void contraPlaceH() {
        jtxtContrasena.setText("********");
        jtxtContrasena.setForeground(Color.GRAY);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtnCerrar;
    private javax.swing.JButton jbtnIniciarSesion;
    private javax.swing.JButton jbtnMinimizar;
    private javax.swing.JButton jbtnRegistrarse;
    private javax.swing.JLabel jlblError;
    private javax.swing.JLabel jlblRegistro;
    private javax.swing.JToggleButton jtgbtnVerPass;
    private javax.swing.JPasswordField jtxtContrasena;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtUsuario;
    private javax.swing.JLabel lblCon;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUs;
    // End of variables declaration//GEN-END:variables
}
