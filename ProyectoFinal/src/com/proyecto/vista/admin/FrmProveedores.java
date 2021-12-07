/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.vista.admin;

import FiveCodMover.FiveCodMoverJFrame;
import com.proyecto.modelos.Usuario;
import com.proyecto.control.opciones.OpcionesGenerales;
import com.proyecto.control.sql.admin.SqlProveedor;
import com.proyecto.vista.productos.DialogCodigoQr;
import com.proyecto.vista.productos.FrmAgregarProducto;
import com.proyecto.vista.productos.FrmDashboard;
import com.proyecto.vista.usuarios.FrmDatosPersonales;
import com.proyecto.vista.usuarios.FrmUsuarios;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Jhair
 */
public class FrmProveedores extends javax.swing.JFrame {

    OpcionesGenerales mc = new OpcionesGenerales();
    SqlProveedor sqlP = new SqlProveedor();
    private int idProveedor;
    private int nFila;
    Usuario us = Usuario.getInstance();

    public FrmProveedores() {
        initComponents();
        mc.editarHeaderTabla(jtblProveedores);
        sqlP.mostrarDatosTabla(jtblProveedores);
        anchoColumnas();
        labelError.setVisible(false);
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
        jbtnCerrarSesion = new javax.swing.JButton();
        jbtnPantallaPrincipal = new javax.swing.JButton();
        jbtnAgregarProducto = new javax.swing.JButton();
        jbtnProveedores = new javax.swing.JButton();
        jbtnDatosPersonales = new javax.swing.JButton();
        labelIcon = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jbtnCategorias = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jbtnGenerarQr = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        jbtnUsuarios = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblUs = new javax.swing.JLabel();
        lblCon = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelError = new javax.swing.JLabel();
        jtxtNombreR = new javax.swing.JTextField();
        jtxtEmpresaR = new javax.swing.JTextField();
        jbtnActualizar = new javax.swing.JButton();
        jtxtDniR = new javax.swing.JTextField();
        jbtnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblProveedores = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jbtnEliminar = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();

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
        jPanel2.add(jbtnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 200, 20));

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
        jPanel2.add(jbtnPantallaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 100, 200, 20));

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
        jPanel2.add(jbtnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 240, 210, 20));

        jbtnProveedores.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnProveedores.setForeground(new java.awt.Color(102, 255, 255));
        jbtnProveedores.setText("Proveedores");
        jbtnProveedores.setContentAreaFilled(false);
        jbtnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnProveedores.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jbtnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 200, 20));

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
        jPanel2.add(jbtnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 200, 20));

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

        labelError.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        labelError.setForeground(new java.awt.Color(232, 50, 50));
        labelError.setText("Error: rellene todos los campos");
        jPanel3.add(labelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

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

        jbtnActualizar.setBackground(new java.awt.Color(102, 204, 255));
        jbtnActualizar.setFont(new java.awt.Font("Montserrat Medium", 0, 17)); // NOI18N
        jbtnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAdmin/imgBtnActualizar.png"))); // NOI18N
        jbtnActualizar.setText("Actualizar");
        jbtnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbtnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtnActualizar.setMargin(new java.awt.Insets(2, 8, 2, 14));
        jbtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 150, 40));

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

        jbtnRegistrar.setBackground(new java.awt.Color(76, 196, 76));
        jbtnRegistrar.setFont(new java.awt.Font("Montserrat Medium", 0, 17)); // NOI18N
        jbtnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAdmin/imgBtnRegistro.png"))); // NOI18N
        jbtnRegistrar.setText("Registrar");
        jbtnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbtnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 150, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 350, 420));

        jtblProveedores = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jtblProveedores.setBackground(new java.awt.Color(255, 255, 255));
        jtblProveedores.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 100, 650, 560));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAdmin/imgActualizar.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 190, 170));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAdmin/imgBienActualizar.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 180, 180));

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Proveedores");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 130, 20));

        jbtnEliminar.setBackground(new java.awt.Color(232, 50, 50));
        jbtnEliminar.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jbtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAdmin/imgEliminar.png"))); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 670, 150, 40));

        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 130, 20));

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
        DialogCategoria dialog = new DialogCategoria(this, true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_jbtnCategoriasActionPerformed

    private void jtblProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblProveedoresMouseClicked
        mostrarDatosFormulario();
    }//GEN-LAST:event_jtblProveedoresMouseClicked

    private void jbtnGenerarQrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGenerarQrActionPerformed
        DialogCodigoQr dialog = new DialogCodigoQr(this, true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_jbtnGenerarQrActionPerformed

    private void jtxtDniRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDniRKeyTyped
        if (!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_jtxtDniRKeyTyped

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed
        if (validarCampos()) {

            nFila = jtblProveedores.getSelectedRow();
            idProveedor = Integer.parseInt(jtblProveedores.getValueAt(nFila, 0).toString());

            if (jtxtDniR.getText().length() == 8) {
                sqlP.registrarProveedor(jtxtNombreR.getText(), Integer.parseInt(jtxtDniR.getText()), jtxtEmpresaR.getText());
                mc.limpiarTabla(jtblProveedores);
                sqlP.mostrarDatosTabla(jtblProveedores);
                anchoColumnas();
                limpiarCampos();
                labelError.setVisible(false);

            } else {

                JOptionPane.showMessageDialog(rootPane, "El número de DNI es incorrecto.", "Error", 0);

            }

        } else {

            labelError.setVisible(true);

        }
    }//GEN-LAST:event_jbtnRegistrarActionPerformed

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed
        if (validarCampos()) {

            nFila = jtblProveedores.getSelectedRow();
            idProveedor = Integer.parseInt(jtblProveedores.getValueAt(nFila, 0).toString());

            if (jtxtDniR.getText().length() == 8) {
                sqlP.actualizarDatosProveedor(jtxtNombreR.getText(), Integer.parseInt(jtxtDniR.getText()), jtxtEmpresaR.getText(), idProveedor);
                mc.limpiarTabla(jtblProveedores);
                sqlP.mostrarDatosTabla(jtblProveedores);
                anchoColumnas();
                limpiarCampos();
                labelError.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(rootPane, "El número de DNI es incorrecto.", "Error", 0);
            }

        } else {

            labelError.setVisible(true);

        }
    }//GEN-LAST:event_jbtnActualizarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        try {

            nFila = jtblProveedores.getSelectedRow();
            idProveedor = Integer.parseInt(jtblProveedores.getValueAt(nFila, 0).toString());

            if (idProveedor != -1) {
                sqlP.eliminarProveedor(idProveedor);
                sqlP.mostrarDatosTabla(jtblProveedores);
                anchoColumnas();
                limpiarCampos();
            }

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {

            JOptionPane.showMessageDialog(rootPane, "No seleccionó ningun proveedor.", "Error", 0);
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_formMouseDragged

    private void jbtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarSesionActionPerformed
        mc.cerrarSesion(this);
    }//GEN-LAST:event_jbtnCerrarSesionActionPerformed

    private void jbtnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarProductoActionPerformed
        new FrmAgregarProducto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnAgregarProductoActionPerformed

    private void jbtnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUsuariosActionPerformed
        new FrmUsuarios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnUsuariosActionPerformed

    private void jbtnPantallaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPantallaPrincipalActionPerformed
        new FrmDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnPantallaPrincipalActionPerformed

    private void jbtnDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDatosPersonalesActionPerformed
        new FrmDatosPersonales().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnDatosPersonalesActionPerformed

    private void mostrarDatosFormulario() {
        nFila = jtblProveedores.getSelectedRow();

        if (nFila == -1) {

            JOptionPane.showMessageDialog(rootPane, "No seleccionó ninguna fila.", "Error", 2);

        } else {

            jtxtNombreR.setText(jtblProveedores.getValueAt(nFila, 1).toString());
            jtxtDniR.setText(jtblProveedores.getValueAt(nFila, 2).toString());
            jtxtEmpresaR.setText(jtblProveedores.getValueAt(nFila, 3).toString());

        }
    }

    private void limpiarCampos() {
        jtxtNombreR.setText("");
        jtxtDniR.setText("");
        jtxtEmpresaR.setText("");
    }

    private boolean validarCampos() {
        return !(jtxtNombreR.getText().isBlank() || jtxtDniR.getText().isBlank() || jtxtEmpresaR.getText().isBlank());
    }

    private void anchoColumnas() {

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
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
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
    private javax.swing.JButton jbtnRegistrar;
    private javax.swing.JButton jbtnUsuarios;
    private javax.swing.JTable jtblProveedores;
    private javax.swing.JTextField jtxtDniR;
    private javax.swing.JTextField jtxtEmpresaR;
    private javax.swing.JTextField jtxtNombreR;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel lblCon;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUs;
    // End of variables declaration//GEN-END:variables
}
