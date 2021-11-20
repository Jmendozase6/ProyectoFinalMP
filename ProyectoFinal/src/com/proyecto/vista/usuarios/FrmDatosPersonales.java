/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.vista.usuarios;

import com.proyecto.vista.productos.FrmAgregarProducto;
import com.proyecto.control.opciones.OpcionesGenerales;
import FiveCodMover.FiveCodMoverJFrame;
import javax.swing.JOptionPane;
import com.proyecto.modelos.Usuario;
import com.proyecto.control.sql.usuarios.SqlDatosPersonales;
import com.proyecto.vista.admin.FrmProveedores;
import com.proyecto.vista.productos.DialogCodigoQr;

/**
 *
 * @author JHAIR
 */
public class FrmDatosPersonales extends javax.swing.JFrame {

    OpcionesGenerales mc = new OpcionesGenerales();
    SqlDatosPersonales sqlDP = new SqlDatosPersonales();
    Usuario us = Usuario.getInstance();

    public FrmDatosPersonales() {
        initComponents();
        sqlDP.mostrarDatos(jtxtNombre, jtxtUsuario, jtxtContrasena);
        jlblError.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jbtnCerrar = new javax.swing.JButton();
        jbtnMinimizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblUs = new javax.swing.JLabel();
        lblCon = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtgbtnVerPass = new javax.swing.JToggleButton();
        jlblError = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jtxtUsuario = new javax.swing.JTextField();
        jtxtContrasena = new javax.swing.JPasswordField();
        lblNombre1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jbtnUsuarios = new javax.swing.JButton();
        jbtnPantallaPrincipal = new javax.swing.JButton();
        jbtnAgregarProducto = new javax.swing.JButton();
        jbtnDatosPersonales = new javax.swing.JButton();
        labelIcon = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jbtnProveedores = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jbtnCategorias = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        jbtnCerrarSesion = new javax.swing.JButton();
        jbtnGenerarQr = new javax.swing.JButton();
        jbtnGuardarCambios = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

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
        jPanel2.add(jbtnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgDatosPersonales.png"))); // NOI18N
        jLabel3.setFocusable(false);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, -1, 450));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgUserConfig.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 156, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUs.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lblUs.setForeground(new java.awt.Color(0, 0, 0));
        lblUs.setText("Usuario");
        jPanel1.add(lblUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblCon.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lblCon.setForeground(new java.awt.Color(0, 0, 0));
        lblCon.setText("Contraseña");
        jPanel1.add(lblCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgPasswordBlanco.png"))); // NOI18N
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 265, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-name.png"))); // NOI18N
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 105, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-user.png"))); // NOI18N
        jLabel10.setToolTipText("");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 185, -1, -1));

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
        jPanel1.add(jtgbtnVerPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 266, -1, -1));

        jlblError.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jlblError.setForeground(new java.awt.Color(232, 50, 50));
        jlblError.setText("Error: rellene todos los campos");
        jPanel1.add(jlblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jtxtNombre.setBackground(new java.awt.Color(243, 242, 245));
        jtxtNombre.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(0, 0, 0));
        jtxtNombre.setMargin(new java.awt.Insets(2, 10, 2, 6));
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 250, 40));

        jtxtUsuario.setBackground(new java.awt.Color(243, 242, 245));
        jtxtUsuario.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jtxtUsuario.setMargin(new java.awt.Insets(2, 10, 2, 6));
        jPanel1.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 250, 40));

        jtxtContrasena.setBackground(new java.awt.Color(243, 242, 245));
        jtxtContrasena.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jtxtContrasena.setForeground(new java.awt.Color(0, 0, 0));
        jtxtContrasena.setCaretColor(new java.awt.Color(255, 255, 255));
        jtxtContrasena.setMargin(new java.awt.Insets(2, 10, 2, 6));
        jtxtContrasena.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jtxtContrasena.setSelectionColor(new java.awt.Color(81, 104, 244));
        jPanel1.add(jtxtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 250, 40));

        lblNombre1.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre1.setText("Nombre");
        jPanel1.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 360, 370));

        jPanel4.setBackground(new java.awt.Color(81, 104, 244));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 523, 70));

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Datos personales");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 360, -1));

        jPanel3.setBackground(new java.awt.Color(81, 104, 244));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 240, 70));

        jPanel5.setBackground(new java.awt.Color(81, 104, 244));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, 10));

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SySout");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 30, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, 10));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 180, 10));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 180, 10));

        jbtnUsuarios.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jbtnUsuarios.setText("Usuarios");
        jbtnUsuarios.setContentAreaFilled(false);
        jbtnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnUsuarios.setInheritsPopupMenu(true);
        jbtnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUsuariosActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 200, 20));

        jbtnPantallaPrincipal.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnPantallaPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jbtnPantallaPrincipal.setText("Pantalla Principal");
        jbtnPantallaPrincipal.setContentAreaFilled(false);
        jbtnPantallaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPantallaPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnPantallaPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(jbtnPantallaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 100, 200, 20));

        jbtnAgregarProducto.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregarProducto.setText("Agregar producto");
        jbtnAgregarProducto.setContentAreaFilled(false);
        jbtnAgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnAgregarProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnAgregarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarProductoActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 240, 210, 20));

        jbtnDatosPersonales.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnDatosPersonales.setForeground(new java.awt.Color(102, 255, 255));
        jbtnDatosPersonales.setText("Datos Personales");
        jbtnDatosPersonales.setContentAreaFilled(false);
        jbtnDatosPersonales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnDatosPersonales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnDatosPersonales.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnDatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDatosPersonalesActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnDatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 170, 200, 20));

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgLogo.png"))); // NOI18N
        jPanel5.add(labelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, 10));

        jbtnProveedores.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnProveedores.setForeground(new java.awt.Color(255, 255, 255));
        jbtnProveedores.setText("Proveedores");
        jbtnProveedores.setContentAreaFilled(false);
        jbtnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnProveedores.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnProveedoresActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 200, 20));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 180, 10));

        jbtnCategorias.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnCategorias.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCategorias.setText("Categorías");
        jbtnCategorias.setContentAreaFilled(false);
        jbtnCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCategorias.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCategoriasActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 200, 20));

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 180, 10));

        jbtnCerrarSesion.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCerrarSesion.setText("Cerrar sesión");
        jbtnCerrarSesion.setContentAreaFilled(false);
        jbtnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnCerrarSesion.setInheritsPopupMenu(true);
        jbtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 200, 20));

        jbtnGenerarQr.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnGenerarQr.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGenerarQr.setText("Generar QR");
        jbtnGenerarQr.setContentAreaFilled(false);
        jbtnGenerarQr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnGenerarQr.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnGenerarQr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGenerarQrActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnGenerarQr, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 310, 200, 20));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, 222, 662));

        jbtnGuardarCambios.setBackground(new java.awt.Color(81, 104, 244));
        jbtnGuardarCambios.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jbtnGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGuardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgBnIniciarSesion.png"))); // NOI18N
        jbtnGuardarCambios.setText("Guardar cambios");
        jbtnGuardarCambios.setBorderPainted(false);
        jbtnGuardarCambios.setContentAreaFilled(false);
        jbtnGuardarCambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnGuardarCambios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarCambiosActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, 250, 40));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 130, 20));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 180, 130, 20));

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

    private void jtgbtnVerPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtgbtnVerPassActionPerformed
        mc.verPass(jtgbtnVerPass, jtxtContrasena);
    }//GEN-LAST:event_jtgbtnVerPassActionPerformed

    private void jbtnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarCambiosActionPerformed
        if (verificarCampos()) {
            
            sqlDP.actualizarUsuario(jtxtNombre.getText(), jtxtUsuario.getText(), String.valueOf(jtxtContrasena.getPassword()));
            sqlDP.mostrarDatos(jtxtNombre, jtxtUsuario, jtxtContrasena);
            jlblError.setVisible(false);
            
        } else {

            jlblError.setVisible(true);

        }
    }//GEN-LAST:event_jbtnGuardarCambiosActionPerformed

    private void jbtnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUsuariosActionPerformed
        new FrmUsuarios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnUsuariosActionPerformed

    private void jbtnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarProductoActionPerformed
        new FrmAgregarProducto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnAgregarProductoActionPerformed

    private void jbtnDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDatosPersonalesActionPerformed
        new FrmDatosPersonales().setVisible(true);
    }//GEN-LAST:event_jbtnDatosPersonalesActionPerformed

    private void jbtnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProveedoresActionPerformed
        new FrmProveedores().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnProveedoresActionPerformed

    private void jbtnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnCategoriasActionPerformed

    private void jbtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarSesionActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea cerrar la sesión?", "Comprobación", 0) == 0) {
            us.setNombre("");
            new FrmInicioSesion().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jbtnCerrarSesionActionPerformed

    private void jbtnGenerarQrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGenerarQrActionPerformed
        DialogCodigoQr dialog = new DialogCodigoQr(this, true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_jbtnGenerarQrActionPerformed

    //Validar que los campos no estén vacíos
    private boolean verificarCampos() {
        return !(jtxtNombre.getText().isBlank() || jtxtUsuario.getText().isBlank() || String.valueOf(jtxtContrasena.getPassword()).isBlank());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton jbtnAgregarProducto;
    private javax.swing.JButton jbtnCategorias;
    private javax.swing.JButton jbtnCerrar;
    private javax.swing.JButton jbtnCerrarSesion;
    private javax.swing.JButton jbtnDatosPersonales;
    private javax.swing.JButton jbtnGenerarQr;
    private javax.swing.JButton jbtnGuardarCambios;
    private javax.swing.JButton jbtnMinimizar;
    private javax.swing.JButton jbtnPantallaPrincipal;
    private javax.swing.JButton jbtnProveedores;
    private javax.swing.JButton jbtnUsuarios;
    private javax.swing.JLabel jlblError;
    private javax.swing.JToggleButton jtgbtnVerPass;
    private javax.swing.JPasswordField jtxtContrasena;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtUsuario;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel lblCon;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblUs;
    // End of variables declaration//GEN-END:variables

}
