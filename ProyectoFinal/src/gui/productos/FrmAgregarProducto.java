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
import java.util.Date;
import javax.swing.JOptionPane;
import modelos.Usuario;
import opciones.MenuOpciones;
import sql.productos.SqlAgregarProducto;

/**
 *
 * @author JHAIR
 */
public class FrmAgregarProducto extends javax.swing.JFrame {

    //Opciones de cerrar
    MenuOpciones mc = new MenuOpciones();
    //La clase que contiene las consultas sql correspondientes
    SqlAgregarProducto sqlAG = new SqlAgregarProducto();
    //Agregar la fecha
    Date date = new Date();
    //Usuario 
    Usuario us = Usuario.getInstance();

    public FrmAgregarProducto() {
        initComponents();
        mostrarProveedores();
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
        jcbxProveedor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxtMarca = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jbtnAgregar = new javax.swing.JButton();
        lblMarca1 = new javax.swing.JLabel();
        jtxtCategoria = new javax.swing.JTextField();
        jbtnCerrar = new javax.swing.JButton();
        jbtnMinimizar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jbtnPantallaPrincipal = new javax.swing.JLabel();
        jbtnDatosPersonales = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jbtnDatosPersonales1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jbtnGenerarQr = new javax.swing.JLabel();
        jbtnCerrarSesion = new javax.swing.JLabel();
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

        jcbxProveedor.setBackground(new java.awt.Color(204, 204, 204));
        jcbxProveedor.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jcbxProveedor.setForeground(new java.awt.Color(0, 0, 0));
        jcbxProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jcbxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 250, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgProducto/Borde1.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgProducto/Borde2.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 603, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgInicioSesion.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jtxtMarca.setBackground(new java.awt.Color(243, 242, 245));
        jtxtMarca.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jtxtMarca.setForeground(new java.awt.Color(0, 0, 0));
        jtxtMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jtxtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 250, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgProducto/Borde1.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgProducto/Borde2.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgProducto/Borde1.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, -1, -1));

        jbtnAgregar.setBackground(new java.awt.Color(243, 242, 245));
        jbtnAgregar.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jbtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgProducto/btnAgregar.png"))); // NOI18N
        jbtnAgregar.setText("Agregar");
        jbtnAgregar.setBorder(null);
        jbtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 570, 190, 40));

        lblMarca1.setFont(new java.awt.Font("Montserrat Medium", 0, 20)); // NOI18N
        lblMarca1.setForeground(new java.awt.Color(0, 0, 0));
        lblMarca1.setText("Categoría");
        jPanel2.add(lblMarca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jtxtCategoria.setBackground(new java.awt.Color(243, 242, 245));
        jtxtCategoria.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jtxtCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jtxtCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jtxtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 250, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 90, 1060, 630));

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
        jbtnDatosPersonales.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDatosPersonales.setText("Datos Personales");
        jbtnDatosPersonales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnDatosPersonales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnDatosPersonalesMouseClicked(evt);
            }
        });
        jPanel5.add(jbtnDatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, 10));

        jbtnDatosPersonales1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnDatosPersonales1.setForeground(new java.awt.Color(102, 255, 255));
        jbtnDatosPersonales1.setText("Agregar producto");
        jbtnDatosPersonales1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.add(jbtnDatosPersonales1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 180, 10));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, 10));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 180, 10));

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

        jbtnCerrarSesion.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCerrarSesion.setText("Cerrar sesión");
        jbtnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnCerrarSesionMouseClicked(evt);
            }
        });
        jPanel5.add(jbtnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

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

            if (sqlAG.agregarProducto(date, jtxtNombre.getText(), jtxtCategoria.getText(), jtxtMarca.getText(), Double.parseDouble(jtxtPrecioUni.getText()), Double.parseDouble(jtxtCantidad.getText()), jcbxProveedor.getSelectedItem().toString())) {
                limpiarCampos();
            }

        } else {

            JOptionPane.showMessageDialog(rootPane, "Rellene todos los campos", "Campos vacíos", 2);

        }
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    //Instanciar la pantalla principal
    private void jbtnPantallaPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPantallaPrincipalMouseClicked
        FrmDashboard frmDashboard = new FrmDashboard();
        frmDashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnPantallaPrincipalMouseClicked

    //Instanciar la ventana de datos personales
    private void jbtnDatosPersonalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnDatosPersonalesMouseClicked
        FrmDatosPersonales frmDatosPersonales = new FrmDatosPersonales();
        frmDatosPersonales.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnDatosPersonalesMouseClicked

    private void jtxtPrecioUniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPrecioUniKeyTyped
        mc.soloDigitos(evt);
    }//GEN-LAST:event_jtxtPrecioUniKeyTyped

    private void jtxtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCantidadKeyTyped
        mc.soloDigitos(evt);
    }//GEN-LAST:event_jtxtCantidadKeyTyped

    private void jbtnGenerarQrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnGenerarQrMouseClicked
        jbtnGenerarQr.setForeground(new Color(102, 255, 255));
        CodigoQr codigoQr = new CodigoQr();
        codigoQr.generarQr();
        jbtnGenerarQr.setForeground(Color.white);
    }//GEN-LAST:event_jbtnGenerarQrMouseClicked

    private void jbtnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCerrarSesionMouseClicked
        jbtnCerrarSesion.setForeground(new Color(102, 255, 255));

        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?", "Comprobación", 0) == 0) {

            us.setNombre("");
            FrmInicioSesion frmInicioSesion = new FrmInicioSesion();
            frmInicioSesion.setVisible(true);
            this.dispose();

        }
        jbtnCerrarSesion.setForeground(Color.white);
    }//GEN-LAST:event_jbtnCerrarSesionMouseClicked

    // Limpia los textfield
    private void limpiarCampos() {
        jtxtNombre.setText("");
        jtxtCategoria.setText("");
        jtxtMarca.setText("");
        jtxtPrecioUni.setText("");
        jtxtCantidad.setText("");
        jcbxProveedor.setSelectedIndex(-1);
    }

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
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnCerrar;
    private javax.swing.JLabel jbtnCerrarSesion;
    private javax.swing.JLabel jbtnDatosPersonales;
    private javax.swing.JLabel jbtnDatosPersonales1;
    private javax.swing.JLabel jbtnGenerarQr;
    private javax.swing.JButton jbtnMinimizar;
    private javax.swing.JLabel jbtnPantallaPrincipal;
    private javax.swing.JComboBox<String> jcbxProveedor;
    private javax.swing.JTextField jtxtCantidad;
    private javax.swing.JTextField jtxtCategoria;
    private javax.swing.JTextField jtxtMarca;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtPrecioUni;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMarca1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecioUni;
    private javax.swing.JLabel lblProveedor;
    // End of variables declaration//GEN-END:variables
}
