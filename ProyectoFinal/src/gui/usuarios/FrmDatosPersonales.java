/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.usuarios;

import gui.productos.FrmDashboard;
import gui.productos.FrmAgregarProducto;
import opciones.MenuOpciones;
import FiveCodMover.FiveCodMoverJFrame;
import generadorqr.CodigoQr;
import java.awt.Color;
import javax.swing.JOptionPane;
import modelos.Usuario;
import sql.usuarios.SqlDatosPersonales;

/**
 *
 * @author JHAIR
 */
public class FrmDatosPersonales extends javax.swing.JFrame {

    MenuOpciones mc = new MenuOpciones();
    SqlDatosPersonales sqlDP = new SqlDatosPersonales();
    Usuario us = Usuario.getInstance();

    public FrmDatosPersonales() {
        initComponents();
        sqlDP.mostrarDatos(jtxtNombre, jtxtUsuario, jtxtContrasena);
        us.setNombre(jtxtNombre.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jbtnCerrar = new javax.swing.JButton();
        jbtnMinimizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtxtNombre = new javax.swing.JTextField();
        lblUs = new javax.swing.JLabel();
        lblCon = new javax.swing.JLabel();
        jtxtContrasena = new javax.swing.JPasswordField();
        lblNombre = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jtgbtnVerPass = new javax.swing.JToggleButton();
        jlblError = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jbtnPantallaPrincipal = new javax.swing.JLabel();
        jbtnDatosPersonales = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jbtnAgregarProd = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jbtnCerrarSesion1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jbtnGenerarQr = new javax.swing.JLabel();
        jbtnGuardarCambios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DASHBOARD");
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(26, 28, 32));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(jbtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

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
        jPanel2.add(jbtnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user-config.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtNombre.setBackground(new java.awt.Color(243, 242, 245));
        jtxtNombre.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(0, 0, 0));
        jtxtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 250, 40));

        lblUs.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lblUs.setForeground(new java.awt.Color(0, 0, 0));
        lblUs.setText("Usuario");
        jPanel1.add(lblUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblCon.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lblCon.setForeground(new java.awt.Color(0, 0, 0));
        lblCon.setText("Contraseña");
        jPanel1.add(lblCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jtxtContrasena.setBackground(new java.awt.Color(243, 242, 245));
        jtxtContrasena.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jtxtContrasena.setForeground(new java.awt.Color(0, 0, 0));
        jtxtContrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jtxtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 250, 40));

        lblNombre.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/passwordBlanco.png"))); // NOI18N
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 265, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-name.png"))); // NOI18N
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 105, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-user.png"))); // NOI18N
        jLabel10.setToolTipText("");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 185, -1, -1));

        jtxtUsuario.setBackground(new java.awt.Color(243, 242, 245));
        jtxtUsuario.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jtxtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 250, 40));

        jtgbtnVerPass.setBackground(new java.awt.Color(255, 255, 255));
        jtgbtnVerPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgClosedEye.png"))); // NOI18N
        jtgbtnVerPass.setBorder(null);
        jtgbtnVerPass.setBorderPainted(false);
        jtgbtnVerPass.setContentAreaFilled(false);
        jtgbtnVerPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtgbtnVerPass.setDisabledIcon(null);
        jtgbtnVerPass.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgOpenEye.png"))); // NOI18N
        jtgbtnVerPass.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgOpenEye.png"))); // NOI18N
        jtgbtnVerPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtgbtnVerPassActionPerformed(evt);
            }
        });
        jPanel1.add(jtgbtnVerPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 266, -1, -1));

        jlblError.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jlblError.setForeground(new java.awt.Color(255, 255, 255));
        jlblError.setText("Error: rellene todos los campos");
        jPanel1.add(jlblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 360, 370));

        jPanel4.setBackground(new java.awt.Color(81, 104, 244));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, 460, 70));

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Datos Personales");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 77, -1, -1));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgDatosPersonales.png"))); // NOI18N
        imagen.setFocusable(false);
        jPanel2.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 311, 432));

        jPanel3.setBackground(new java.awt.Color(81, 104, 244));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 240, 70));

        jPanel5.setBackground(new java.awt.Color(81, 104, 244));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, 10));

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SySout");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 30, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, 10));

        jbtnPantallaPrincipal.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnPantallaPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jbtnPantallaPrincipal.setText("Pantalla Principal");
        jbtnPantallaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPantallaPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPantallaPrincipalMouseClicked(evt);
            }
        });
        jPanel5.add(jbtnPantallaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jbtnDatosPersonales.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnDatosPersonales.setForeground(new java.awt.Color(102, 255, 255));
        jbtnDatosPersonales.setText("Datos Personales");
        jbtnDatosPersonales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.add(jbtnDatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, 10));

        jbtnAgregarProd.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnAgregarProd.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregarProd.setText("Agregar producto");
        jbtnAgregarProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnAgregarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnAgregarProdMouseClicked(evt);
            }
        });
        jPanel5.add(jbtnAgregarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 180, 10));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 180, 10));

        jbtnCerrarSesion1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnCerrarSesion1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCerrarSesion1.setText("Cerrar sesión");
        jbtnCerrarSesion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCerrarSesion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnCerrarSesion1MouseClicked(evt);
            }
        });
        jPanel5.add(jbtnCerrarSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, 10));

        jbtnGenerarQr.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnGenerarQr.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGenerarQr.setText("Generar Qr");
        jbtnGenerarQr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnGenerarQr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnGenerarQrMouseClicked(evt);
            }
        });
        jPanel5.add(jbtnGenerarQr, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, 222, 662));

        jbtnGuardarCambios.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jbtnGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGuardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIniciarSesion.png"))); // NOI18N
        jbtnGuardarCambios.setText("Guardar cambios");
        jbtnGuardarCambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnGuardarCambios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarCambiosActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 610, 250, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarActionPerformed
        mc.cerrarPrograma();
    }//GEN-LAST:event_jbtnCerrarActionPerformed

    private void jbtnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinimizarActionPerformed
        mc.minimizarPrograma(this);
    }//GEN-LAST:event_jbtnMinimizarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_formMouseDragged

    private void jbtnPantallaPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPantallaPrincipalMouseClicked
        FrmDashboard frmDashboard = new FrmDashboard();
        frmDashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnPantallaPrincipalMouseClicked

    private void jbtnAgregarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAgregarProdMouseClicked
        FrmAgregarProducto frmAgregarProducto = new FrmAgregarProducto();
        frmAgregarProducto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnAgregarProdMouseClicked

    private void jtgbtnVerPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtgbtnVerPassActionPerformed
        mc.verPass(jtgbtnVerPass, jtxtContrasena);
    }//GEN-LAST:event_jtgbtnVerPassActionPerformed

    private void jbtnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarCambiosActionPerformed
        if (verificarCampos()) {
            sqlDP.actualizarUsuario(jtxtNombre.getText(), jtxtUsuario.getText(), String.valueOf(jtxtContrasena.getPassword()));
            sqlDP.mostrarDatos(jtxtNombre, jtxtUsuario, jtxtContrasena);
            jlblError.setForeground(Color.white);
        } else {
            jlblError.setForeground(Color.decode("#E83232"));
        }
    }//GEN-LAST:event_jbtnGuardarCambiosActionPerformed

    private void jbtnCerrarSesion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCerrarSesion1MouseClicked
        jbtnGenerarQr.setForeground(new Color(102, 255, 255));
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?", "Comprobación", 0) == 0) {
            us.setNombre("");
            FrmInicioSesion frmInicioSesion = new FrmInicioSesion();
            frmInicioSesion.setVisible(true);
            this.dispose();
        }
        jbtnGenerarQr.setForeground(Color.white);
    }//GEN-LAST:event_jbtnCerrarSesion1MouseClicked

    private void jbtnGenerarQrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnGenerarQrMouseClicked
        CodigoQr codigoQr = new CodigoQr();
        codigoQr.generarQr();
    }//GEN-LAST:event_jbtnGenerarQrMouseClicked

    //Validar que los campos no estén vacíos
    private boolean verificarCampos() {
        if (jtxtNombre.getText().isEmpty()) {
            return false;
        } else if (jtxtUsuario.getText().isEmpty()) {
            return false;
        } else if (jtxtContrasena.getPassword().length == 0) {
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel jbtnAgregarProd;
    private javax.swing.JButton jbtnCerrar;
    private javax.swing.JLabel jbtnCerrarSesion1;
    private javax.swing.JLabel jbtnDatosPersonales;
    private javax.swing.JLabel jbtnGenerarQr;
    private javax.swing.JButton jbtnGuardarCambios;
    private javax.swing.JButton jbtnMinimizar;
    private javax.swing.JLabel jbtnPantallaPrincipal;
    private javax.swing.JLabel jlblError;
    private javax.swing.JToggleButton jtgbtnVerPass;
    private javax.swing.JPasswordField jtxtContrasena;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtUsuario;
    private javax.swing.JLabel lblCon;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUs;
    // End of variables declaration//GEN-END:variables

}
