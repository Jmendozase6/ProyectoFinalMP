/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectofinal.vista.usuarios;

import FiveCodMover.FiveCodMoverJFrame;
import com.proyectofinal.opciones.MenuOpciones;
import java.awt.Color;
import javax.swing.JOptionPane;
import com.proyectofinal.sql.usuarios.SqlRegistro;

/**
 *
 * @author JHAIR
 */
public class FrmRegistro extends javax.swing.JFrame {

    MenuOpciones mc = new MenuOpciones();
    SqlRegistro sqlR = new SqlRegistro();

    public FrmRegistro() {
        initComponents();
        sqlR.mostrarTipoUsuario(jcbxTipoUsuario);
        jlblError.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblUs = new javax.swing.JLabel();
        lblCon = new javax.swing.JLabel();
        jtxtContrasena = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jbtnRegistrarse = new javax.swing.JButton();
        jtgbtnVerPass = new javax.swing.JToggleButton();
        jlblError = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jcbxTipoUsuario = new javax.swing.JComboBox<>();
        lblCon1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jbtnCerrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jbtnIniciarSesion = new javax.swing.JButton();
        jlblRegistro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelIcon = new javax.swing.JLabel();
        jbtnMinimizar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jbtnCerrarSesion = new javax.swing.JButton();
        jbtnPantallaPrincipal = new javax.swing.JButton();
        jbtnAgregarProducto = new javax.swing.JButton();
        jbtnGenerarQR = new javax.swing.JButton();
        jbtnDatosPersonales = new javax.swing.JButton();
        labelIcon1 = new javax.swing.JLabel();

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
        BackGround.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(34, 35, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUs.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lblUs.setForeground(new java.awt.Color(255, 255, 255));
        lblUs.setText("Usuario");
        jPanel2.add(lblUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        lblCon.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lblCon.setForeground(new java.awt.Color(255, 255, 255));
        lblCon.setText("Tipo de usuario");
        jPanel2.add(lblCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        jtxtContrasena.setBackground(new java.awt.Color(34, 35, 40));
        jtxtContrasena.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
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
        jPanel2.add(jtxtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 250, 40));

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTRO");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 140, -1));

        lblNombre.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-tipo.png"))); // NOI18N
        jLabel8.setToolTipText("");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 355, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-name.png"))); // NOI18N
        jLabel9.setToolTipText("");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-user.png"))); // NOI18N
        jLabel10.setToolTipText("");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jbtnRegistrarse.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jbtnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgBnIniciarSesion.png"))); // NOI18N
        jbtnRegistrarse.setText("Registrarse");
        jbtnRegistrarse.setToolTipText("Clic aquí");
        jbtnRegistrarse.setBorderPainted(false);
        jbtnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegistrarse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarseActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 250, 40));

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
        jPanel2.add(jtgbtnVerPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        jlblError.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jlblError.setForeground(new java.awt.Color(232, 50, 50));
        jlblError.setText("Error: rellene todos los campos");
        jPanel2.add(jlblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        jtxtUsuario.setBackground(new java.awt.Color(34, 35, 40));
        jtxtUsuario.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        jtxtUsuario.setText("Ingrese su nombre de usuario");
        jtxtUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        jtxtUsuario.setMargin(new java.awt.Insets(2, 10, 2, 6));
        jtxtUsuario.setSelectionColor(new java.awt.Color(81, 104, 244));
        jtxtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtUsuarioFocusGained(evt);
            }
        });
        jPanel2.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 250, 40));

        jtxtNombre.setBackground(new java.awt.Color(34, 35, 40));
        jtxtNombre.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(153, 153, 153));
        jtxtNombre.setText("Ingrese su nombre");
        jtxtNombre.setToolTipText("");
        jtxtNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        jtxtNombre.setMargin(new java.awt.Insets(2, 10, 2, 6));
        jtxtNombre.setSelectionColor(new java.awt.Color(81, 104, 244));
        jtxtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtNombreFocusGained(evt);
            }
        });
        jPanel2.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 250, 40));

        jcbxTipoUsuario.setBackground(new java.awt.Color(34, 35, 40));
        jcbxTipoUsuario.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jcbxTipoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jcbxTipoUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jcbxTipoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jcbxTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 250, 40));

        lblCon1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lblCon1.setForeground(new java.awt.Color(255, 255, 255));
        lblCon1.setText("Contraseña");
        jPanel2.add(lblCon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-password.png"))); // NOI18N
        jLabel11.setToolTipText("");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        BackGround.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 450, 500));

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
        jbtnIniciarSesion.setToolTipText("Clic aquí");
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
        jLabel4.setText("Recuerda que los nombres de usuario");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 488, -1));

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("no se pueden repetir");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 480, -1));

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgLogo.png"))); // NOI18N
        jPanel3.add(labelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        BackGround.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 500, 590));

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
        BackGround.add(jbtnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 20, 20));

        jPanel4.setBackground(new java.awt.Color(81, 104, 244));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, 10));

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SySout");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 30, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, 10));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 180, 10));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, 10));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 180, 10));

        jbtnCerrarSesion.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCerrarSesion.setText("Cerrar sesión");
        jbtnCerrarSesion.setContentAreaFilled(false);
        jbtnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel4.add(jbtnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 380, 200, 20));

        jbtnPantallaPrincipal.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnPantallaPrincipal.setForeground(new java.awt.Color(102, 255, 255));
        jbtnPantallaPrincipal.setText("Pantalla Principal");
        jbtnPantallaPrincipal.setContentAreaFilled(false);
        jbtnPantallaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnPantallaPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnPantallaPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel4.add(jbtnPantallaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 100, 200, 20));

        jbtnAgregarProducto.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregarProducto.setText("Agregar producto");
        jbtnAgregarProducto.setContentAreaFilled(false);
        jbtnAgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnAgregarProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnAgregarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel4.add(jbtnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 240, 210, 20));

        jbtnGenerarQR.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnGenerarQR.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGenerarQR.setText("Generar QR");
        jbtnGenerarQR.setContentAreaFilled(false);
        jbtnGenerarQR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnGenerarQR.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnGenerarQR.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel4.add(jbtnGenerarQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 310, 200, 20));

        jbtnDatosPersonales.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnDatosPersonales.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDatosPersonales.setText("Datos Personales");
        jbtnDatosPersonales.setContentAreaFilled(false);
        jbtnDatosPersonales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnDatosPersonales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnDatosPersonales.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel4.add(jbtnDatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 170, 200, 20));

        labelIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgLogo.png"))); // NOI18N
        jPanel4.add(labelIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        BackGround.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, 222, 662));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean validarCamposVacios() {
        if (jtxtNombre.getText().isBlank() || jtxtNombre.getText().equals("Ingrese su nombre")) {
            return false;
        } else if (jtxtUsuario.getText().isBlank() || jtxtUsuario.getText().equals("Ingrese su nombre de usuario")) {
            return false;
        } else if (String.valueOf(jtxtContrasena.getPassword()).isBlank() || String.valueOf(jtxtContrasena.getPassword()).equals("********")) {
            return false;
        } else if (jcbxTipoUsuario.getSelectedIndex() == -1) {
            return false;
        }
        return true;
    }

    private void jbtnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIniciarSesionActionPerformed
        FrmInicioSesion frmInicioSesion = new FrmInicioSesion();
        this.dispose();
        frmInicioSesion.setVisible(true);

    }//GEN-LAST:event_jbtnIniciarSesionActionPerformed
    private void nombrePlaceH() {
        jtxtNombre.setText("Ingrese su nombre");
        jtxtNombre.setForeground(Color.GRAY);
    }

    private void usuarioPlaceH() {
        jtxtUsuario.setText("Ingrese su nombre de usuario");
        jtxtUsuario.setForeground(Color.GRAY);
    }

    private void contraPlaceH() {
        jtxtContrasena.setText("********");
        jtxtContrasena.setForeground(Color.GRAY);
    }

    private void jbtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarActionPerformed
        mc.cerrarPrograma();
    }//GEN-LAST:event_jbtnCerrarActionPerformed

    private void jbtnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinimizarActionPerformed
        mc.minimizarPrograma(this);
    }//GEN-LAST:event_jbtnMinimizarActionPerformed

    private void jbtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarseActionPerformed
        if (validarCamposVacios()) {
            if (!(sqlR.verificarExistente(jtxtUsuario.getText()))) {
                sqlR.agregarUsuario(jtxtNombre.getText(), jtxtUsuario.getText(), String.valueOf(jtxtContrasena.getPassword()), jcbxTipoUsuario.getSelectedItem().toString(), jlblError);
                limpiarCampos();
                nombrePlaceH();
                usuarioPlaceH();
                contraPlaceH();
            } else {
                JOptionPane.showMessageDialog(rootPane, "El nombre de usuario ya existe.", "Error", 0);
            }

        } else {

            jlblError.setVisible(true);

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

    private void jtxtContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtContrasenaFocusGained
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
    }//GEN-LAST:event_jtxtContrasenaFocusGained

    private void jtxtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtUsuarioFocusGained
        if (jtxtUsuario.getText().equals("Ingrese su nombre de usuario")) {
            jtxtUsuario.setText("");
            jtxtUsuario.setForeground(Color.WHITE);
        }
        if (jtxtNombre.getText().isBlank()) {
            nombrePlaceH();
        }
        if (String.valueOf(jtxtContrasena.getPassword()).isBlank()) {
            contraPlaceH();
        }
    }//GEN-LAST:event_jtxtUsuarioFocusGained

    private void jtxtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNombreFocusGained
        if (jtxtNombre.getText().equals("Ingrese su nombre")) {
            jtxtNombre.setText("");
            jtxtNombre.setForeground(Color.WHITE);
        }
        if (jtxtUsuario.getText().isBlank()) {
            usuarioPlaceH();
        }
        if (String.valueOf(jtxtContrasena.getPassword()).isBlank()) {
            contraPlaceH();
        }
    }//GEN-LAST:event_jtxtNombreFocusGained

    private void limpiarCampos() {
        jtxtNombre.setText("");
        jtxtUsuario.setText("");
        jtxtContrasena.setText("");
        jcbxTipoUsuario.setSelectedIndex(-1);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton jbtnAgregarProducto;
    private javax.swing.JButton jbtnCerrar;
    private javax.swing.JButton jbtnCerrarSesion;
    private javax.swing.JButton jbtnDatosPersonales;
    private javax.swing.JButton jbtnGenerarQR;
    private javax.swing.JButton jbtnIniciarSesion;
    private javax.swing.JButton jbtnMinimizar;
    private javax.swing.JButton jbtnPantallaPrincipal;
    private javax.swing.JButton jbtnRegistrarse;
    private javax.swing.JComboBox<String> jcbxTipoUsuario;
    private javax.swing.JLabel jlblError;
    private javax.swing.JLabel jlblRegistro;
    private javax.swing.JToggleButton jtgbtnVerPass;
    private javax.swing.JPasswordField jtxtContrasena;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtUsuario;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelIcon1;
    private javax.swing.JLabel lblCon;
    private javax.swing.JLabel lblCon1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUs;
    // End of variables declaration//GEN-END:variables
}
