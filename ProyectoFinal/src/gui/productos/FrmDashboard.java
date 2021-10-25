/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.productos;

import FiveCodMover.FiveCodMoverJFrame;
import generadorqr.CodigoQr;
import gui.usuarios.FrmDatosPersonales;
import gui.usuarios.FrmInicioSesion;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import opciones.MenuOpciones;
import modelos.Usuario;
import sql.productos.SqlAgregarProducto;
import sql.productos.SqlDashboard;

/**
 *
 * @author JHAIR
 */
public class FrmDashboard extends javax.swing.JFrame {

    MenuOpciones mc = new MenuOpciones();
    Usuario us = Usuario.getInstance();
    SqlDashboard sqlD = new SqlDashboard();
    //La clase que contiene las consultas sql correspondientes
    SqlAgregarProducto sqlAG = new SqlAgregarProducto();

    public FrmDashboard() {
        initComponents();
        sqlD.mostrarDatos(jtblProductos);
        editarTabla();
        mostrarProveedores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jbtnPantallaPrincipal = new javax.swing.JLabel();
        jbtnDatosPersonales = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jbtnAgregarProd = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jbtnGenerarQr = new javax.swing.JLabel();
        jbtnCerrarSesion1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jbtnCerrar = new javax.swing.JButton();
        jbtnMinimizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblProductos = new javax.swing.JTable();
        jtxtBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        jtxtCategoria = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtIdProducto = new javax.swing.JTextField();
        jbtnEliminar = new javax.swing.JButton();
        jbtnAgregar = new javax.swing.JButton();

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

        jbtnPantallaPrincipal.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnPantallaPrincipal.setForeground(new java.awt.Color(102, 255, 255));
        jbtnPantallaPrincipal.setText("Pantalla Principal");
        jbtnPantallaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jbtnPantallaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jbtnDatosPersonales.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnDatosPersonales.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDatosPersonales.setText("Datos Personales");
        jbtnDatosPersonales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnDatosPersonales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnDatosPersonalesMouseClicked(evt);
            }
        });
        jPanel2.add(jbtnDatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, 10));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 180, 10));

        jbtnAgregarProd.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnAgregarProd.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregarProd.setText("Agregar producto");
        jbtnAgregarProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnAgregarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnAgregarProdMouseClicked(evt);
            }
        });
        jPanel2.add(jbtnAgregarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, 10));

        jbtnGenerarQr.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnGenerarQr.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGenerarQr.setText("Generar Qr");
        jbtnGenerarQr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnGenerarQr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnGenerarQrMouseClicked(evt);
            }
        });
        jPanel2.add(jbtnGenerarQr, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jbtnCerrarSesion1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnCerrarSesion1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCerrarSesion1.setText("Cerrar sesión");
        jbtnCerrarSesion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCerrarSesion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnCerrarSesion1MouseClicked(evt);
            }
        });
        jPanel2.add(jbtnCerrarSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 180, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, 222, 662));

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
        jPanel1.add(jbtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

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
        jPanel1.add(jbtnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jtblProductos = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jtblProductos.setBackground(new java.awt.Color(255, 255, 255));
        jtblProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        jtblProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtblProductosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtblProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 1040, 420));

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
        });
        jPanel1.add(jtxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 18, 750, 31));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgBarraBuscar.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 18, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgLupa.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 18, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(81, 104, 244), new java.awt.Color(81, 104, 244)));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbxProveedor.setBackground(new java.awt.Color(153, 255, 255));
        jcbxProveedor.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        jcbxProveedor.setForeground(new java.awt.Color(0, 0, 0));
        jcbxProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jcbxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 250, 40));

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Proveedor");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, 40));

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cantidad");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, 40));

        jtxtCantidad.setBackground(new java.awt.Color(153, 255, 255));
        jtxtCantidad.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        jtxtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        jtxtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCantidadKeyTyped(evt);
            }
        });
        jPanel3.add(jtxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 250, 40));

        jtxtPrecioUnitario.setBackground(new java.awt.Color(153, 255, 255));
        jtxtPrecioUnitario.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        jtxtPrecioUnitario.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPrecioUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPrecioUnitarioKeyTyped(evt);
            }
        });
        jPanel3.add(jtxtPrecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 250, 40));

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio unitario");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, 40));

        jtxtMarca.setBackground(new java.awt.Color(153, 255, 255));
        jtxtMarca.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        jtxtMarca.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jtxtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 250, 40));

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Marca");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 40));

        jLabel5.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Id Producto");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 40));

        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 40));

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Categoría");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 40));

        jtxtCategoria.setBackground(new java.awt.Color(153, 255, 255));
        jtxtCategoria.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        jtxtCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jtxtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 250, 40));

        jtxtNombre.setBackground(new java.awt.Color(153, 255, 255));
        jtxtNombre.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 250, 40));

        jtxtIdProducto.setBackground(new java.awt.Color(153, 255, 255));
        jtxtIdProducto.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        jtxtIdProducto.setForeground(new java.awt.Color(0, 0, 0));
        jtxtIdProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtxtIdProducto.setFocusable(false);
        jPanel3.add(jtxtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 250, 40));

        jbtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jbtnEliminar.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jbtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgProducto/btnEliminar.png"))); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setBorder(null);
        jbtnEliminar.setContentAreaFilled(false);
        jbtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 175, 190, 40));

        jbtnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        jbtnAgregar.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jbtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgProducto/btnAgregar.png"))); // NOI18N
        jbtnAgregar.setText("Actualizar");
        jbtnAgregar.setBorder(null);
        jbtnAgregar.setContentAreaFilled(false);
        jbtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 175, 190, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 486, 1040, 230));

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

    private void jbtnDatosPersonalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnDatosPersonalesMouseClicked
        FrmDatosPersonales frmDatosPersonales = new FrmDatosPersonales();
        frmDatosPersonales.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnDatosPersonalesMouseClicked

    private void jbtnAgregarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAgregarProdMouseClicked
        FrmAgregarProducto FrmAgregarProducto = new FrmAgregarProducto();
        FrmAgregarProducto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnAgregarProdMouseClicked

    private void jbtnGenerarQrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnGenerarQrMouseClicked
        CodigoQr codigoQr = new CodigoQr();
        codigoQr.generarQr();
    }//GEN-LAST:event_jbtnGenerarQrMouseClicked

    private void jtxtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyReleased
        sqlD.buscarDatos(jtxtBuscar.getText(), jtblProductos, this);
        editarTabla();
    }//GEN-LAST:event_jtxtBuscarKeyReleased

    private void jtxtBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtBuscarFocusGained
        jtxtBuscar.setText("");
    }//GEN-LAST:event_jtxtBuscarFocusGained

    private void jtblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblProductosMouseClicked
        mostrarDatosProductos();
        jtxtNombre.requestFocus();
    }//GEN-LAST:event_jtblProductosMouseClicked

    private void jtblProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtblProductosKeyReleased
        mostrarDatosProductos();
    }//GEN-LAST:event_jtblProductosKeyReleased

    private void jtxtPrecioUnitarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPrecioUnitarioKeyTyped
        mc.soloDigitos(evt);
    }//GEN-LAST:event_jtxtPrecioUnitarioKeyTyped

    private void jtxtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCantidadKeyTyped
        mc.soloDigitos(evt);
    }//GEN-LAST:event_jtxtCantidadKeyTyped

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
        if (validarCamposVacios()) {
            sqlD.actualizarDatosProducto(jtxtNombre.getText(), jtxtCategoria.getText(), jtxtMarca.getText(), Double.parseDouble(jtxtPrecioUnitario.getText()), Double.parseDouble(jtxtCantidad.getText()), jcbxProveedor.getSelectedItem().toString(), Integer.parseInt(jtxtIdProducto.getText()));
            limpiarTabla();
            sqlD.mostrarDatos(jtblProductos);
            editarTabla();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Rellene todos los campos", "Campos vacíos", 2);
        }
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed

        try {
            int id = Integer.parseInt(jtxtIdProducto.getText());
            if (id == -1) {

            } else {
                if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar?", "Comprobación", 0) == 0) {
                    sqlD.eliminarProducto(id);
                    limpiarTabla();
                    sqlD.mostrarDatos(jtblProductos);
                    editarTabla();
                    limpiarCampos();
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No seleccionó ninguna fila", "Error", 0);
        }

    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jtxtBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtBuscarFocusLost
        jtxtBuscar.setText("Buscar...");
    }//GEN-LAST:event_jtxtBuscarFocusLost

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

    private void editarTabla() {
        //Editar las propiedades(fuente,tamaño,color) de los titulos de la tabla
        jtblProductos.getTableHeader().setFont(new Font("Montserrat Medium", 1, 16));
        jtblProductos.getTableHeader().setForeground(Color.BLACK);

        TableColumnModel columnModel = jtblProductos.getColumnModel();

        //Colocar el ancho de las columnas de la tabla
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(170);
        columnModel.getColumn(2).setPreferredWidth(170);
        columnModel.getColumn(3).setPreferredWidth(140);
        columnModel.getColumn(4).setPreferredWidth(170);
        columnModel.getColumn(5).setPreferredWidth(80);
        columnModel.getColumn(6).setPreferredWidth(170);

        jtblProductos.setColumnModel(columnModel);
    }

    private void mostrarProveedores() {
        sqlAG.mostrarProveedores(jcbxProveedor);
        jcbxProveedor.setSelectedIndex(-1);
    }

    private boolean validarCamposVacios() {
        if (jtxtNombre.getText().isEmpty()) {
            return false;
        } else if (jtxtCategoria.getText().isEmpty()) {
            return false;
        } else if (jtxtMarca.getText().isEmpty()) {
            return false;
        } else if (jtxtPrecioUnitario.getText().isEmpty()) {
            return false;
        } else if (jtxtCantidad.getText().isEmpty()) {
            return false;
        } else if (jcbxProveedor.getSelectedIndex() == -1) {
            return false;
        }
        return true;
    }

    private void limpiarCampos() {
        jtxtCantidad.setText("");
        jtxtCategoria.setText("");
        jtxtIdProducto.setText("");
        jtxtMarca.setText("");
        jtxtNombre.setText("");
        jtxtPrecioUnitario.setText("");
        jcbxProveedor.setSelectedIndex(-1);
    }

    private void mostrarDatosProductos() {
        int nFila = jtblProductos.getSelectedRow();
        if (nFila == -1) {
            JOptionPane.showMessageDialog(rootPane, "No seleccionó ninguna fila", "Error", 2);
        } else {
            jtxtIdProducto.setText(jtblProductos.getValueAt(nFila, 0).toString());
            jtxtNombre.setText(jtblProductos.getValueAt(nFila, 1).toString());
            jtxtCategoria.setText(jtblProductos.getValueAt(nFila, 2).toString());
            jtxtMarca.setText(jtblProductos.getValueAt(nFila, 3).toString());
            jtxtPrecioUnitario.setText(jtblProductos.getValueAt(nFila, 4).toString());
            jtxtCantidad.setText(jtblProductos.getValueAt(nFila, 5).toString());
            jcbxProveedor.setSelectedItem(jtblProductos.getValueAt(nFila, 6).toString());
        }
    }

    private void limpiarTabla() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) jtblProductos.getModel();
            int filas = jtblProductos.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JLabel jbtnAgregarProd;
    private javax.swing.JButton jbtnCerrar;
    private javax.swing.JLabel jbtnCerrarSesion1;
    private javax.swing.JLabel jbtnDatosPersonales;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JLabel jbtnGenerarQr;
    private javax.swing.JButton jbtnMinimizar;
    private javax.swing.JLabel jbtnPantallaPrincipal;
    private javax.swing.JComboBox<String> jcbxProveedor;
    private javax.swing.JTable jtblProductos;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JTextField jtxtCantidad;
    private javax.swing.JTextField jtxtCategoria;
    private javax.swing.JTextField jtxtIdProducto;
    private javax.swing.JTextField jtxtMarca;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtPrecioUnitario;
    // End of variables declaration//GEN-END:variables
}
