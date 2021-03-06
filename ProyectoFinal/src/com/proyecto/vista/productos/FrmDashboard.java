/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.vista.productos;

import com.proyecto.control.sql.productos.SqlDashboard;
import com.proyecto.control.sql.productos.SqlAgregarProducto;
import com.proyecto.vista.usuarios.FrmDatosPersonales;
import com.proyecto.vista.admin.FrmProveedores;
import com.proyecto.control.opciones.OpcionesGenerales;
import com.proyecto.modelos.Usuario;
import FiveCodMover.FiveCodMoverJFrame;
import com.proyecto.control.sql.admin.SqlCategoria;
import com.proyecto.control.sql.admin.SqlProveedor;
import com.proyecto.vista.admin.DialogCategoria;
import com.proyecto.vista.usuarios.FrmUsuarios;
import javax.swing.table.TableColumnModel;
import javax.swing.JOptionPane;

/**
 *
 * @author JHAIR
 */
public class FrmDashboard extends javax.swing.JFrame {

    OpcionesGenerales mc = new OpcionesGenerales();
    Usuario us = Usuario.getInstance();
    SqlDashboard sqlD = new SqlDashboard();
    SqlAgregarProducto sqlAG = new SqlAgregarProducto();
    SqlProveedor sqlP = new SqlProveedor();
    SqlCategoria sqlC = new SqlCategoria();

    public FrmDashboard() {
        initComponents();
        mc.editarHeaderTabla(jtblProductos);
        sqlD.mostrarDatos(jtblProductos);
        anchoColumnas();
        mostrarProveedores();
        mostrarCategorias();
        if (us.getTipoUsuario() == 2) {
            mc.modoEmpleado(jbtnProveedores, jbtnCategorias, jbtnUsuarios, j1, j2);
            modoEmpleado();
        }
    }

    private void modoEmpleado() {
        jtxtIdProducto.setEnabled(false);
        jbtnEliminar.setEnabled(false);
        jcbxProveedor.setEnabled(false);
        jcbxCategoria.setEnabled(false);
        jcbxCategoria.setEnabled(false);
        jtxtNombre.setEnabled(false);
        jtxtMarca.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jbtnPantallaPrincipal = new javax.swing.JButton();
        jbtnAgregarProducto = new javax.swing.JButton();
        jbtnDatosPersonales = new javax.swing.JButton();
        labelIcon = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jbtnProveedores = new javax.swing.JButton();
        j1 = new javax.swing.JSeparator();
        jbtnCategorias = new javax.swing.JButton();
        j2 = new javax.swing.JSeparator();
        jbtnCerrarSesion = new javax.swing.JButton();
        jbtnGenerarQr = new javax.swing.JButton();
        jbtnUsuarios = new javax.swing.JButton();
        jbtnCerrar = new javax.swing.JButton();
        jbtnMinimizar = new javax.swing.JButton();
        jtxtBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblProductos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jcbxProveedor = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtCantidad = new javax.swing.JTextField();
        jtxtPrecioUnitario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtMarca = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jtxtIdProducto = new javax.swing.JTextField();
        jbtnEliminar = new javax.swing.JButton();
        jbtnActualizar = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jcbxCategoria = new javax.swing.JComboBox<>();

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
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 180, 10));

        jbtnPantallaPrincipal.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnPantallaPrincipal.setForeground(new java.awt.Color(102, 255, 255));
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
        jbtnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarProductoActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 240, 210, 20));

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
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, 10));

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
        jPanel2.add(jbtnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 200, 20));

        j1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 180, 10));

        jbtnCategorias.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnCategorias.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCategorias.setText("Categor??as");
        jbtnCategorias.setContentAreaFilled(false);
        jbtnCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCategorias.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCategoriasActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 200, 20));

        j2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 180, 10));

        jbtnCerrarSesion.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCerrarSesion.setText("Cerrar sesi??n");
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

        jtxtBuscar.setBackground(new java.awt.Color(243, 242, 245));
        jtxtBuscar.setFont(new java.awt.Font("Montserrat", 2, 18)); // NOI18N
        jtxtBuscar.setForeground(new java.awt.Color(51, 51, 51));
        jtxtBuscar.setText("Buscar...");
        jtxtBuscar.setBorder(null);
        jtxtBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtBuscarFocusLost(evt);
            }
        });
        jtxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtBuscarKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 18, 750, 31));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgBarraBuscar.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 18, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgLupa.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 18, -1, -1));

        content.setBackground(new java.awt.Color(26, 28, 32));

        jtblProductos = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jtblProductos.setBackground(new java.awt.Color(255, 255, 255));
        jtblProductos.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
        jtblProductos.setForeground(new java.awt.Color(0, 0, 0));
        jtblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtblProductos.setFocusable(false);
        jtblProductos.setGridColor(new java.awt.Color(102, 102, 102));
        jtblProductos.setRowHeight(30);
        jtblProductos.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jtblProductos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jtblProductos.setShowGrid(true);
        jtblProductos.getTableHeader().setResizingAllowed(false);
        jtblProductos.getTableHeader().setReorderingAllowed(false);
        jtblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblProductos);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(81, 104, 244), new java.awt.Color(81, 104, 244)));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbxProveedor.setBackground(new java.awt.Color(153, 255, 255));
        jcbxProveedor.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        jcbxProveedor.setForeground(new java.awt.Color(0, 0, 0));
        jcbxProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jcbxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 250, 40));

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Proveedor");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, 40));

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cantidad");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, 40));

        jtxtCantidad.setBackground(new java.awt.Color(153, 255, 255));
        jtxtCantidad.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        jtxtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        jtxtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCantidadKeyTyped(evt);
            }
        });
        jPanel3.add(jtxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 250, 40));

        jtxtPrecioUnitario.setBackground(new java.awt.Color(153, 255, 255));
        jtxtPrecioUnitario.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        jtxtPrecioUnitario.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPrecioUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPrecioUnitarioKeyTyped(evt);
            }
        });
        jPanel3.add(jtxtPrecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 250, 40));

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio unitario");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, 40));

        jtxtMarca.setBackground(new java.awt.Color(153, 255, 255));
        jtxtMarca.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        jtxtMarca.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jtxtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 250, 40));

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Marca");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 40));

        jLabel5.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Id Producto");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 40));

        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 40));

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Categor??a");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 40));

        jtxtNombre.setBackground(new java.awt.Color(153, 255, 255));
        jtxtNombre.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 250, 40));

        jtxtIdProducto.setBackground(new java.awt.Color(153, 255, 255));
        jtxtIdProducto.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        jtxtIdProducto.setForeground(new java.awt.Color(0, 0, 0));
        jtxtIdProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtxtIdProducto.setFocusable(false);
        jPanel3.add(jtxtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 250, 40));

        jbtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jbtnEliminar.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jbtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgProducto/btnEliminar.png"))); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setToolTipText("Clic aqu??");
        jbtnEliminar.setBorder(null);
        jbtnEliminar.setContentAreaFilled(false);
        jbtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 190, 40));

        jbtnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jbtnActualizar.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jbtnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgProducto/btnAgregar.png"))); // NOI18N
        jbtnActualizar.setText("Actualizar");
        jbtnActualizar.setToolTipText("Clic aqu??");
        jbtnActualizar.setBorder(null);
        jbtnActualizar.setContentAreaFilled(false);
        jbtnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 190, 40));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 10, 190));

        jcbxCategoria.setBackground(new java.awt.Color(153, 255, 255));
        jcbxCategoria.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        jcbxCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jcbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 250, 40));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 1050, 670));

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

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_formMouseDragged

    private void jtxtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyReleased
        sqlD.buscarDatos(jtxtBuscar.getText(), jtblProductos);
        anchoColumnas();
    }//GEN-LAST:event_jtxtBuscarKeyReleased

    private void jtxtBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtBuscarFocusGained
        jtxtBuscar.setText("");
        limpiarCampos();
    }//GEN-LAST:event_jtxtBuscarFocusGained

    private void jtxtPrecioUnitarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPrecioUnitarioKeyTyped
        mc.soloDigitos(evt);
    }//GEN-LAST:event_jtxtPrecioUnitarioKeyTyped

    private void jtxtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCantidadKeyTyped
        mc.soloDigitos(evt);
    }//GEN-LAST:event_jtxtCantidadKeyTyped

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed
        if (validarCamposVacios()) {
            
            if (!(jtxtIdProducto.getText().isBlank())) {
                
                sqlD.actualizarDatosProducto(jtxtNombre.getText().trim(), jcbxCategoria.getSelectedItem().toString(), jtxtMarca.getText().trim(), Double.parseDouble(jtxtPrecioUnitario.getText()), Double.parseDouble(jtxtCantidad.getText()), jcbxProveedor.getSelectedItem().toString(), Integer.parseInt(jtxtIdProducto.getText()));
                mc.limpiarTabla(jtblProductos);
                sqlD.mostrarDatos(jtblProductos);
                anchoColumnas();
                limpiarCampos();
                
            }

        } else {

            JOptionPane.showMessageDialog(rootPane, "No seleccion?? ninguna fila \no dej?? campos vac??os", "Error al actualizar", 2);

        }
    }//GEN-LAST:event_jbtnActualizarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        try {

            int id = Integer.parseInt(jtxtIdProducto.getText());
            if (id != -1) {
                if (JOptionPane.showConfirmDialog(null, "??Seguro que desea eliminar?", "Comprobaci??n", 2) == 0) {
                    sqlD.eliminarProducto(id);
                    mc.limpiarTabla(jtblProductos);
                    sqlD.mostrarDatos(jtblProductos);
                    anchoColumnas();
                    limpiarCampos();
                }
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "No seleccion?? ninguna fila", "Error", 0);

        }

    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jtxtBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtBuscarFocusLost
        jtxtBuscar.setText("Buscar...");
        sqlD.mostrarDatos(jtblProductos);
        anchoColumnas();
    }//GEN-LAST:event_jtxtBuscarFocusLost

    private void jtxtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyTyped
        mc.soloLetras(evt);
    }//GEN-LAST:event_jtxtBuscarKeyTyped

    private void jtblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblProductosMouseClicked
        mostrarDatosProductos();
        jtxtNombre.requestFocus();
    }//GEN-LAST:event_jtblProductosMouseClicked

    private void jbtnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarProductoActionPerformed
        new FrmAgregarProducto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnAgregarProductoActionPerformed

    private void jbtnDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDatosPersonalesActionPerformed
        new FrmDatosPersonales().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnDatosPersonalesActionPerformed

    private void jbtnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProveedoresActionPerformed
        new FrmProveedores().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnProveedoresActionPerformed

    private void jbtnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCategoriasActionPerformed
        DialogCategoria dialog = new DialogCategoria(this, true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_jbtnCategoriasActionPerformed

    private void jbtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarSesionActionPerformed
        mc.cerrarSesion(this);
    }//GEN-LAST:event_jbtnCerrarSesionActionPerformed

    private void jbtnGenerarQrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGenerarQrActionPerformed
        DialogCodigoQr dialog = new DialogCodigoQr(this, true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_jbtnGenerarQrActionPerformed

    private void jbtnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUsuariosActionPerformed
        new FrmUsuarios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnUsuariosActionPerformed

    private void anchoColumnas() {

        TableColumnModel columnModel = jtblProductos.getColumnModel();

        //Colocar el ancho de las columnas de la tabla
        columnModel.getColumn(0).setPreferredWidth(25);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(140);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(95);
        columnModel.getColumn(6).setPreferredWidth(155);
        columnModel.getColumn(7).setPreferredWidth(135);

        jtblProductos.setColumnModel(columnModel);
    }

    private void mostrarCategorias() {
        sqlC.mostrarCategorias(jcbxCategoria);
        jcbxCategoria.setSelectedIndex(-1);
    }

    private void mostrarProveedores() {
        sqlP.mostrarComboProveedores(jcbxProveedor);
        jcbxProveedor.setSelectedIndex(-1);
    }

    private boolean validarCamposVacios() {
        return !(jtxtNombre.getText().isBlank() || jtxtCantidad.getText().isBlank() || jtxtMarca.getText().isBlank() || jtxtPrecioUnitario.getText().isBlank() || jcbxCategoria.getSelectedIndex() == -1 || jcbxProveedor.getSelectedIndex() == -1);
    }

    private void limpiarCampos() {
        jtxtCantidad.setText("");
        jtxtIdProducto.setText("");
        jtxtMarca.setText("");
        jtxtNombre.setText("");
        jtxtPrecioUnitario.setText("");
        jcbxCategoria.setSelectedIndex(-1);
        jcbxProveedor.setSelectedIndex(-1);
    }

    //Muestra el producto seleccionado en los texfields
    private void mostrarDatosProductos() {
        int nFila = jtblProductos.getSelectedRow();
        if (nFila == -1) {
            JOptionPane.showMessageDialog(rootPane, "No seleccion?? ninguna fila", "Error", 2);
        } else {
            jtxtIdProducto.setText(jtblProductos.getValueAt(nFila, 0).toString());
            jtxtNombre.setText(jtblProductos.getValueAt(nFila, 1).toString());
            jcbxCategoria.setSelectedItem(jtblProductos.getValueAt(nFila, 2));
            jtxtMarca.setText(jtblProductos.getValueAt(nFila, 3).toString());
            jtxtPrecioUnitario.setText(jtblProductos.getValueAt(nFila, 4).toString());
            jtxtCantidad.setText(jtblProductos.getValueAt(nFila, 5).toString());
            jcbxProveedor.setSelectedItem(jtblProductos.getValueAt(nFila, 6).toString());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JSeparator j1;
    private javax.swing.JSeparator j2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
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
    private javax.swing.JButton jbtnUsuarios;
    private javax.swing.JComboBox<String> jcbxCategoria;
    private javax.swing.JComboBox<String> jcbxProveedor;
    private javax.swing.JTable jtblProductos;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JTextField jtxtCantidad;
    private javax.swing.JTextField jtxtIdProducto;
    private javax.swing.JTextField jtxtMarca;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtPrecioUnitario;
    private javax.swing.JLabel labelIcon;
    // End of variables declaration//GEN-END:variables
}
