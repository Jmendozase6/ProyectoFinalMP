/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectofinal.vista.productos;

import FiveCodMover.FiveCodMoverJFrame;
import com.proyectofinal.vista.usuarios.FrmDatosPersonales;
import com.proyectofinal.vista.usuarios.FrmInicioSesion;
import java.awt.Color;
import javax.swing.JOptionPane;
import com.proyectofinal.modelos.Usuario;
import com.proyectofinal.opciones.MenuOpciones;
import com.proyectofinal.sql.productos.SqlAgregarProducto;
import com.proyectofinal.vista.admin.FrmProveedores;

/**
 *
 * @author JHAIR
 */
public class FrmAgregarProducto extends javax.swing.JFrame {

    //Opciones de cerrar
    MenuOpciones mc = new MenuOpciones();
    //La clase que contiene las consultas sql correspondientes
    SqlAgregarProducto sqlAG = new SqlAgregarProducto();
    Usuario us = Usuario.getInstance();

    public FrmAgregarProducto() {
        initComponents();
        mostrarProveedores();
        mostrarCategorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jtxtPrecioUni = new javax.swing.JTextField();
        jtxtCantidad = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblPrecioUni = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblProveedor = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxtMarca = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jbtnAgregar = new javax.swing.JButton();
        lblMarca1 = new javax.swing.JLabel();
        jcbxProveedor = new javax.swing.JComboBox<>();
        jcbxCategoria = new javax.swing.JComboBox<>();
        jbtnCerrar = new javax.swing.JButton();
        jbtnMinimizar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jbtnUsuarios = new javax.swing.JButton();
        jbtnPantallaPrincipal = new javax.swing.JButton();
        jbtnAgregarProducto = new javax.swing.JButton();
        jbtnGenerarQr = new javax.swing.JButton();
        jbtnDatosPersonales = new javax.swing.JButton();
        labelIcon = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jbtnProveedores = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jbtnCategorias = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        jbtnCerrarSesion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jPanel1.setBackground(new java.awt.Color(26, 28, 32));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(243, 242, 245));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGREGAR UN NUEVO PRODUCTO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("COMPLETE TODOS LOS CAMPOS PARA ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jtxtNombre.setBackground(new java.awt.Color(243, 242, 245));
        jtxtNombre.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(0, 0, 0));
        jtxtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 250, 40));

        jtxtPrecioUni.setBackground(new java.awt.Color(243, 242, 245));
        jtxtPrecioUni.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jtxtPrecioUni.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPrecioUni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtxtPrecioUni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPrecioUniKeyTyped(evt);
            }
        });
        jPanel2.add(jtxtPrecioUni, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 250, 40));

        jtxtCantidad.setBackground(new java.awt.Color(243, 242, 245));
        jtxtCantidad.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jtxtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        jtxtCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtxtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCantidadKeyTyped(evt);
            }
        });
        jPanel2.add(jtxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 250, 40));

        lblNombre.setFont(new java.awt.Font("Montserrat Medium", 0, 20)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        lblMarca.setFont(new java.awt.Font("Montserrat Medium", 0, 20)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(0, 0, 0));
        lblMarca.setText("Marca");
        jPanel2.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        lblPrecioUni.setFont(new java.awt.Font("Montserrat Medium", 0, 20)); // NOI18N
        lblPrecioUni.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioUni.setText("Precio unitario");
        jPanel2.add(lblPrecioUni, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));

        lblCantidad.setFont(new java.awt.Font("Montserrat Medium", 0, 20)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad.setText("Cantidad");
        jPanel2.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        lblProveedor.setFont(new java.awt.Font("Montserrat Medium", 0, 20)); // NOI18N
        lblProveedor.setForeground(new java.awt.Color(0, 0, 0));
        lblProveedor.setText("Proveedor");
        jPanel2.add(lblProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgProducto/imgBorde1.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgProducto/imgBorde2.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 603, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgInicioSesion.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, 180));

        jtxtMarca.setBackground(new java.awt.Color(243, 242, 245));
        jtxtMarca.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jtxtMarca.setForeground(new java.awt.Color(0, 0, 0));
        jtxtMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jtxtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 250, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgProducto/imgBorde1.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgProducto/imgBorde2.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jbtnAgregar.setBackground(new java.awt.Color(243, 242, 245));
        jbtnAgregar.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jbtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgProducto/btnAgregar.png"))); // NOI18N
        jbtnAgregar.setText("Agregar");
        jbtnAgregar.setToolTipText("Clic aquí");
        jbtnAgregar.setBorder(null);
        jbtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, 190, 40));

        lblMarca1.setFont(new java.awt.Font("Montserrat Medium", 0, 20)); // NOI18N
        lblMarca1.setForeground(new java.awt.Color(0, 0, 0));
        lblMarca1.setText("Categoría");
        jPanel2.add(lblMarca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jcbxProveedor.setBackground(new java.awt.Color(243, 242, 245));
        jcbxProveedor.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jcbxProveedor.setForeground(new java.awt.Color(0, 0, 0));
        jcbxProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jcbxProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jcbxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 250, 40));

        jcbxCategoria.setBackground(new java.awt.Color(243, 242, 245));
        jcbxCategoria.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jcbxCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jcbxCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jcbxCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jcbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 250, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 90, 1060, 630));

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
        jbtnPantallaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPantallaPrincipalActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnPantallaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 100, 200, 20));

        jbtnAgregarProducto.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnAgregarProducto.setForeground(new java.awt.Color(102, 255, 255));
        jbtnAgregarProducto.setText("Agregar producto");
        jbtnAgregarProducto.setContentAreaFilled(false);
        jbtnAgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnAgregarProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnAgregarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarProductoActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 240, 210, 20));

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

        jbtnDatosPersonales.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnDatosPersonales.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDatosPersonales.setText("Datos Personales");
        jbtnDatosPersonales.setContentAreaFilled(false);
        jbtnDatosPersonales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, 222, 662));

        jPanel3.setBackground(new java.awt.Color(81, 104, 244));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 58, 1060, 32));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarActionPerformed
        mc.cerrarPrograma();
    }//GEN-LAST:event_jbtnCerrarActionPerformed

    private void jbtnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinimizarActionPerformed
        mc.minimizarPrograma(this);
    }//GEN-LAST:event_jbtnMinimizarActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_formMousePressed

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
        if (validarCamposVacios()) {

            if (sqlAG.agregarProducto(jtxtNombre.getText(), jcbxCategoria.getSelectedItem().toString(), jtxtMarca.getText(), Double.parseDouble(jtxtPrecioUni.getText()), Double.parseDouble(jtxtCantidad.getText()), jcbxProveedor.getSelectedItem().toString())) {
                limpiarCampos();
            }

        } else {

            JOptionPane.showMessageDialog(rootPane, "Rellene todos los campos", "Error", 2);

        }
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    private void jtxtPrecioUniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPrecioUniKeyTyped
        mc.soloDigitos(evt);
    }//GEN-LAST:event_jtxtPrecioUniKeyTyped

    private void jtxtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCantidadKeyTyped
        mc.soloDigitos(evt);
    }//GEN-LAST:event_jtxtCantidadKeyTyped

    private void jbtnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUsuariosActionPerformed
        jbtnUsuarios.setForeground(new Color(102, 255, 255));
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea cerrar la sesión?", "Comprobación", 0) == 0) {
            us.setNombre("");
            new FrmInicioSesion().setVisible(true);
            this.dispose();
        }
        jbtnUsuarios.setForeground(Color.white);
    }//GEN-LAST:event_jbtnUsuariosActionPerformed

    private void jbtnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarProductoActionPerformed
        new FrmAgregarProducto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnAgregarProductoActionPerformed

    private void jbtnGenerarQrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGenerarQrActionPerformed
        jbtnGenerarQr.setForeground(new Color(102, 255, 255));
        new FrmGenerarQr().setVisible(true);
        jbtnGenerarQr.setForeground(Color.white);
    }//GEN-LAST:event_jbtnGenerarQrActionPerformed

    private void jbtnDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDatosPersonalesActionPerformed
        new FrmDatosPersonales().setVisible(true);
    }//GEN-LAST:event_jbtnDatosPersonalesActionPerformed

    private void jbtnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProveedoresActionPerformed
        new FrmProveedores().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnProveedoresActionPerformed

    private void jbtnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCategoriasActionPerformed

    }//GEN-LAST:event_jbtnCategoriasActionPerformed

    private void jbtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarSesionActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea cerrar la sesión?", "Comprobación", 0) == 0) {
            us.setNombre("");
            new FrmInicioSesion().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jbtnCerrarSesionActionPerformed

    private void jbtnPantallaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPantallaPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPantallaPrincipalActionPerformed

    // Limpia los textfield
    private void limpiarCampos() {
        jtxtNombre.setText("");
        jtxtMarca.setText("");
        jtxtPrecioUni.setText("");
        jtxtCantidad.setText("");
        jcbxCategoria.setSelectedIndex(-1);
        jcbxProveedor.setSelectedIndex(-1);
    }

    //Ejecuta el método mostrarCategorias de la clase SqlAgregarProducto y el primer valor que se muestra en blanco
    private void mostrarCategorias() {
        sqlAG.mostrarCategorias(jcbxCategoria);
        jcbxCategoria.setSelectedIndex(-1);
    }

    //Ejecuta el método mostrarProveedores de la clase SqlAgregarProducto y el primer valor que se muestra en blanco
    private void mostrarProveedores() {
        sqlAG.mostrarProveedores(jcbxProveedor);
        jcbxProveedor.setSelectedIndex(-1);
    }

    //Valida que ninguno de los campos estén vacios o que no hayan sido seleccionados
    private boolean validarCamposVacios() {
        if (jtxtNombre.getText().isBlank()) {
            return false;
        } else if (jtxtMarca.getText().isBlank()) {
            return false;
        } else if (jtxtPrecioUni.getText().isBlank()) {
            return false;
        } else if (jtxtCantidad.getText().isBlank()) {
            return false;
        } else if (jcbxProveedor.getSelectedIndex() == -1) {
            return false;
        } else if (jcbxCategoria.getSelectedIndex() == -1) {
            return false;
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnAgregarProducto;
    private javax.swing.JButton jbtnCategorias;
    private javax.swing.JButton jbtnCerrar;
    private javax.swing.JButton jbtnCerrarSesion;
    private javax.swing.JButton jbtnDatosPersonales;
    private javax.swing.JButton jbtnGenerarQr;
    private javax.swing.JButton jbtnMinimizar;
    private javax.swing.JButton jbtnPantallaPrincipal;
    private javax.swing.JButton jbtnProveedores;
    private javax.swing.JButton jbtnUsuarios;
    private javax.swing.JComboBox<String> jcbxCategoria;
    private javax.swing.JComboBox<String> jcbxProveedor;
    private javax.swing.JTextField jtxtCantidad;
    private javax.swing.JTextField jtxtMarca;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtPrecioUni;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMarca1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecioUni;
    private javax.swing.JLabel lblProveedor;
    // End of variables declaration//GEN-END:variables
}
