/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectofinal.vista.admin;

import com.proyectofinal.vista.productos.FrmGenerarQr;
import com.proyectofinal.opciones.MenuOpciones;
import com.proyectofinal.sql.admin.SqlProveedores;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Jhair
 */
public class FrmProveedores extends javax.swing.JFrame {

    MenuOpciones mc = new MenuOpciones();
    SqlProveedores sqlP = new SqlProveedores();

    public FrmProveedores() {
        initComponents();
        sqlP.mostrarDatosTabla(jtblProveedores);
        editarTabla();
        jlblError.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtnCerrar = new javax.swing.JButton();
        jbtnMinimizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jbtnCerrarSesion = new javax.swing.JButton();
        jbtnPantallaPrincipal = new javax.swing.JButton();
        jbtnAgregarProducto = new javax.swing.JButton();
        jbtnProveedores = new javax.swing.JButton();
        jbtnDatosPersonales = new javax.swing.JButton();
        labelIcon = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jbtnCategorias = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jbtnUsuarios = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        jbtnGenerarQr = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        lblUs = new javax.swing.JLabel();
        lblCon = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlblError = new javax.swing.JLabel();
        jtxtNombreR = new javax.swing.JTextField();
        jtxtEmpresaR = new javax.swing.JTextField();
        jbtnRegistrarProveedor = new javax.swing.JButton();
        jtxtDniR = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblProveedores = new javax.swing.JTable();
        jtxtIdDatos = new javax.swing.JTextField();
        jtxtNombreDatos = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        lblCon1 = new javax.swing.JLabel();
        lblUs1 = new javax.swing.JLabel();
        jbtnActualizar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        lblNombre2 = new javax.swing.JLabel();
        jtxtDniDatos = new javax.swing.JTextField();
        jtxtEmpresaDatos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(26, 28, 32));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgUserConfig.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 60, -1, -1));

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
        jPanel1.add(jbtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, 20));

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
        jPanel1.add(jbtnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 20, 20));

        jPanel2.setBackground(new java.awt.Color(81, 104, 244));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, 10));

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SySout");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 30, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, 10));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 180, 10));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 180, 10));

        jbtnCerrarSesion.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCerrarSesion.setText("Cerrar sesión");
        jbtnCerrarSesion.setContentAreaFilled(false);
        jbtnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnCerrarSesion.setInheritsPopupMenu(true);
        jPanel2.add(jbtnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 200, 20));

        jbtnPantallaPrincipal.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnPantallaPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jbtnPantallaPrincipal.setText("Pantalla Principal");
        jbtnPantallaPrincipal.setContentAreaFilled(false);
        jbtnPantallaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnPantallaPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnPantallaPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jbtnPantallaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 100, 200, 20));

        jbtnAgregarProducto.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregarProducto.setText("Agregar producto");
        jbtnAgregarProducto.setContentAreaFilled(false);
        jbtnAgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnAgregarProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnAgregarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jbtnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 240, 210, 20));

        jbtnProveedores.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnProveedores.setForeground(new java.awt.Color(102, 255, 255));
        jbtnProveedores.setText("Proveedores");
        jbtnProveedores.setContentAreaFilled(false);
        jbtnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnProveedores.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jbtnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 200, 20));

        jbtnDatosPersonales.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnDatosPersonales.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDatosPersonales.setText("Datos Personales");
        jbtnDatosPersonales.setContentAreaFilled(false);
        jbtnDatosPersonales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnDatosPersonales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnDatosPersonales.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jbtnDatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 170, 200, 20));

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgLogo.png"))); // NOI18N
        jPanel2.add(labelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 180, 10));

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
        jPanel2.add(jbtnCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 200, 20));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 180, 10));

        jbtnUsuarios.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jbtnUsuarios.setText("Usuarios");
        jbtnUsuarios.setContentAreaFilled(false);
        jbtnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUsuariosActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 200, 20));

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 180, 10));

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
        jPanel2.add(jbtnGenerarQr, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 310, 200, 20));

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, 222, 662));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUs.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lblUs.setForeground(new java.awt.Color(0, 0, 0));
        lblUs.setText("DNI");
        jPanel3.add(lblUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblCon.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lblCon.setForeground(new java.awt.Color(0, 0, 0));
        lblCon.setText("Empresa");
        jPanel3.add(lblCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        lblNombre.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombres y apellidos");
        jPanel3.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgPasswordBlanco.png"))); // NOI18N
        jLabel8.setToolTipText("");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 265, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-name.png"))); // NOI18N
        jLabel9.setToolTipText("");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-user.png"))); // NOI18N
        jLabel10.setToolTipText("");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 185, -1, -1));

        jlblError.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jlblError.setForeground(new java.awt.Color(232, 50, 50));
        jlblError.setText("Error: rellene todos los campos");
        jPanel3.add(jlblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jtxtNombreR.setBackground(new java.awt.Color(243, 242, 245));
        jtxtNombreR.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jtxtNombreR.setForeground(new java.awt.Color(0, 0, 0));
        jtxtNombreR.setMargin(new java.awt.Insets(2, 10, 2, 6));
        jPanel3.add(jtxtNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 250, 40));

        jtxtEmpresaR.setBackground(new java.awt.Color(243, 242, 245));
        jtxtEmpresaR.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jtxtEmpresaR.setForeground(new java.awt.Color(0, 0, 0));
        jtxtEmpresaR.setMargin(new java.awt.Insets(2, 10, 2, 6));
        jPanel3.add(jtxtEmpresaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 250, 40));

        jbtnRegistrarProveedor.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jbtnRegistrarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistrarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgBnIniciarSesion.png"))); // NOI18N
        jbtnRegistrarProveedor.setText("Registrar proveedor");
        jbtnRegistrarProveedor.setBorderPainted(false);
        jbtnRegistrarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegistrarProveedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnRegistrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarProveedorActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnRegistrarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 250, 40));

        jtxtDniR.setBackground(new java.awt.Color(243, 242, 245));
        jtxtDniR.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jtxtDniR.setForeground(new java.awt.Color(0, 0, 0));
        jtxtDniR.setMargin(new java.awt.Insets(2, 10, 2, 6));
        jtxtDniR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDniRKeyTyped(evt);
            }
        });
        jPanel3.add(jtxtDniR, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 250, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 350, 420));

        jtblProveedores = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jtblProveedores.setBackground(new java.awt.Color(255, 255, 255));
        jtblProveedores.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jtblProveedores.setForeground(new java.awt.Color(0, 0, 0));
        jtblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtblProveedores.setFocusable(false);
        jtblProveedores.setGridColor(new java.awt.Color(102, 102, 102));
        jtblProveedores.setRowHeight(30);
        jtblProveedores.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jtblProveedores.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jtblProveedores.setShowGrid(true);
        jtblProveedores.getTableHeader().setResizingAllowed(false);
        jtblProveedores.getTableHeader().setReorderingAllowed(false);
        jtblProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblProveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblProveedores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 100, 650, 420));

        jtxtIdDatos.setBackground(new java.awt.Color(243, 242, 245));
        jtxtIdDatos.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jtxtIdDatos.setForeground(new java.awt.Color(0, 0, 0));
        jtxtIdDatos.setFocusable(false);
        jtxtIdDatos.setMargin(new java.awt.Insets(2, 10, 2, 6));
        jPanel1.add(jtxtIdDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1115, 540, 150, 40));

        jtxtNombreDatos.setBackground(new java.awt.Color(243, 242, 245));
        jtxtNombreDatos.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jtxtNombreDatos.setForeground(new java.awt.Color(0, 0, 0));
        jtxtNombreDatos.setMargin(new java.awt.Insets(2, 10, 2, 6));
        jPanel1.add(jtxtNombreDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, 220, 40));

        lblNombre1.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre1.setText("ID");
        jPanel1.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 550, -1, -1));

        lblCon1.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lblCon1.setForeground(new java.awt.Color(255, 255, 255));
        lblCon1.setText("Empresa");
        jPanel1.add(lblCon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 670, -1, -1));

        lblUs1.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lblUs1.setForeground(new java.awt.Color(255, 255, 255));
        lblUs1.setText("DNI");
        jPanel1.add(lblUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 610, -1, -1));

        jbtnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jbtnActualizar.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jbtnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgProducto/btnAgregar.png"))); // NOI18N
        jbtnActualizar.setText("Actualizar");
        jbtnActualizar.setToolTipText("Clic aquí");
        jbtnActualizar.setBorder(null);
        jbtnActualizar.setContentAreaFilled(false);
        jbtnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1075, 600, 190, 40));

        jbtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jbtnEliminar.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jbtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgProducto/btnEliminar.png"))); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setToolTipText("Clic aquí");
        jbtnEliminar.setBorder(null);
        jbtnEliminar.setContentAreaFilled(false);
        jbtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1075, 660, 190, 40));

        lblNombre2.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre2.setText("Nombres y apellidos");
        jPanel1.add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 550, -1, -1));

        jtxtDniDatos.setBackground(new java.awt.Color(243, 242, 245));
        jtxtDniDatos.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jtxtDniDatos.setForeground(new java.awt.Color(0, 0, 0));
        jtxtDniDatos.setMargin(new java.awt.Insets(2, 10, 2, 6));
        jPanel1.add(jtxtDniDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 600, 220, 40));

        jtxtEmpresaDatos.setBackground(new java.awt.Color(243, 242, 245));
        jtxtEmpresaDatos.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jtxtEmpresaDatos.setForeground(new java.awt.Color(0, 0, 0));
        jtxtEmpresaDatos.setMargin(new java.awt.Insets(2, 10, 2, 6));
        jPanel1.add(jtxtEmpresaDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 660, 220, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAdmin/imgActualizar.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 190, 170));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAdmin/imgBienActualizar.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 180, 180));

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Proveedores");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 130, 20));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 130, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarActionPerformed
        mc.cerrarPrograma();
    }//GEN-LAST:event_jbtnCerrarActionPerformed

    private void jbtnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinimizarActionPerformed
        mc.minimizarPrograma(this);
    }//GEN-LAST:event_jbtnMinimizarActionPerformed

    private void jbtnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCategoriasActionPerformed

    }//GEN-LAST:event_jbtnCategoriasActionPerformed

    private void jbtnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUsuariosActionPerformed

    }//GEN-LAST:event_jbtnUsuariosActionPerformed

    private void jbtnRegistrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarProveedorActionPerformed
        if (verificarCamposRegistro()) {

            if (jtxtDniR.getText().length() == 8) {
                sqlP.agregarProveedor(jtxtNombreR.getText(), Integer.parseInt(jtxtDniR.getText()), jtxtEmpresaR.getText());
                jlblError.setVisible(false);
                limpiarCampos();
                editarTabla();
                mc.limpiarTabla(jtblProveedores);
                sqlP.mostrarDatosTabla(jtblProveedores);
            } else {
                JOptionPane.showMessageDialog(rootPane, "El número de DNI es incorrecto", "Error", 0);
            }

        } else {
            jlblError.setVisible(true);
        }

    }//GEN-LAST:event_jbtnRegistrarProveedorActionPerformed

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed
        if (verificarCamposDatos()) {

            if (jtxtDniDatos.getText().length() == 8) {
                sqlP.actualizarDatosProveedor(jtxtNombreDatos.getText(), Integer.parseInt(jtxtDniDatos.getText()), jtxtEmpresaDatos.getText(), Integer.parseInt(jtxtIdDatos.getText()));
                mc.limpiarTabla(jtblProveedores);
                sqlP.mostrarDatosTabla(jtblProveedores);
                editarTabla();
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(rootPane, "El número de DNI es incorrecto", "Error", 0);
            }

        } else {

            JOptionPane.showMessageDialog(rootPane, "No seleccionó ninguna fila \no dejó campos vacíos", "Error al actualizar", 2);

        }
    }//GEN-LAST:event_jbtnActualizarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        try {

            int id = Integer.parseInt(jtxtIdDatos.getText());

            if (id != -1) {

                if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar?", "Comprobación", 2) == 0) {
                    sqlP.eliminarProveedor(id);
                    mc.limpiarTabla(jtblProveedores);
                    sqlP.mostrarDatosTabla(jtblProveedores);
                    editarTabla();
                    limpiarCampos();
                }
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "No seleccionó ninguna fila.", "Error", 0);

        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jtblProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblProveedoresMouseClicked
        mostrarDatosTextField();
    }//GEN-LAST:event_jtblProveedoresMouseClicked

    private void jbtnGenerarQrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGenerarQrActionPerformed
        jbtnProveedores.setForeground(new Color(102, 255, 255));
        new FrmGenerarQr().setVisible(true);
        jbtnProveedores.setForeground(Color.white);
    }//GEN-LAST:event_jbtnGenerarQrActionPerformed

    private void jtxtDniRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDniRKeyTyped
        if (!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_jtxtDniRKeyTyped

    private void mostrarDatosTextField() {
        int nFila = jtblProveedores.getSelectedRow();
        if (nFila == -1) {
            JOptionPane.showMessageDialog(rootPane, "No seleccionó ninguna fila.", "Error", 2);
        } else {
            jtxtIdDatos.setText(jtblProveedores.getValueAt(nFila, 0).toString());
            jtxtNombreDatos.setText(jtblProveedores.getValueAt(nFila, 1).toString());
            jtxtDniDatos.setText(jtblProveedores.getValueAt(nFila, 2).toString());
            jtxtEmpresaDatos.setText(jtblProveedores.getValueAt(nFila, 3).toString());
        }
    }

    private void limpiarCampos() {
        jtxtNombreR.setText("");
        jtxtDniR.setText("");
        jtxtEmpresaR.setText("");
        jtxtIdDatos.setText("");
        jtxtEmpresaDatos.setText("");
        jtxtNombreDatos.setText("");
        jtxtDniDatos.setText("");
    }

    private boolean verificarCamposRegistro() {
        return !(jtxtNombreR.getText().isBlank() || jtxtDniR.getText().isBlank() || jtxtEmpresaR.getText().isBlank());
    }

    private boolean verificarCamposDatos() {
        return !(jtxtNombreDatos.getText().isBlank() || jtxtDniDatos.getText().isBlank() || jtxtEmpresaDatos.getText().isBlank() || jtxtIdDatos.getText().isBlank());
    }

    private void editarTabla() {
        //Editar las propiedades(fuente,tamaño,color) de los titulos de la tabla
        jtblProveedores.getTableHeader().setFont(new Font("Montserrat Medium", 1, 16));
        jtblProveedores.getTableHeader().setForeground(Color.BLACK);

        TableColumnModel columnModel = jtblProveedores.getColumnModel();

        //Colocar el ancho de las columnas de la tabla
        columnModel.getColumn(0).setPreferredWidth(80);
        columnModel.getColumn(1).setPreferredWidth(250);
        columnModel.getColumn(2).setPreferredWidth(140);
        columnModel.getColumn(3).setPreferredWidth(150);

        jtblProveedores.setColumnModel(columnModel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton jbtnActualizar;
    private javax.swing.JButton jbtnAgregarProducto;
    private javax.swing.JButton jbtnCategorias;
    private javax.swing.JButton jbtnCerrar;
    private javax.swing.JButton jbtnCerrarSesion;
    private javax.swing.JButton jbtnDatosPersonales;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnGenerarQr;
    private javax.swing.JButton jbtnMinimizar;
    private javax.swing.JButton jbtnPantallaPrincipal;
    private javax.swing.JButton jbtnProveedores;
    private javax.swing.JButton jbtnRegistrarProveedor;
    private javax.swing.JButton jbtnUsuarios;
    private javax.swing.JLabel jlblError;
    private javax.swing.JTable jtblProveedores;
    private javax.swing.JTextField jtxtDniDatos;
    private javax.swing.JTextField jtxtDniR;
    private javax.swing.JTextField jtxtEmpresaDatos;
    private javax.swing.JTextField jtxtEmpresaR;
    private javax.swing.JTextField jtxtIdDatos;
    private javax.swing.JTextField jtxtNombreDatos;
    private javax.swing.JTextField jtxtNombreR;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel lblCon;
    private javax.swing.JLabel lblCon1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblUs;
    private javax.swing.JLabel lblUs1;
    // End of variables declaration//GEN-END:variables
}
