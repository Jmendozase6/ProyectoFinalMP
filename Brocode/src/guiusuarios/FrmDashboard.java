/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiusuarios;

import FiveCodMover.FiveCodMoverJFrame;
import guiproductos.FrmAgregarProducto;
import menusuperior.MenuCierre;

/**
 *
 * @author JHAIR
 */
public class FrmDashboard extends javax.swing.JFrame {

    /**
     * Creates new form FrmDashboard
     */
    MenuCierre mc = new MenuCierre();

    public FrmDashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jbtnDatosPersonales1 = new javax.swing.JLabel();
        jbtnCerrar = new javax.swing.JButton();
        jbtnMinimizar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

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

        jbtnDatosPersonales1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnDatosPersonales1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDatosPersonales1.setText("Agregar producto");
        jbtnDatosPersonales1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnDatosPersonales1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnDatosPersonales1MouseClicked(evt);
            }
        });
        jPanel2.add(jbtnDatosPersonales1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

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

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 470, 40));

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

    private void jbtnDatosPersonales1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnDatosPersonales1MouseClicked
        FrmAgregarProducto frmAgregarProducto = new FrmAgregarProducto();
        frmAgregarProducto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnDatosPersonales1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtnCerrar;
    private javax.swing.JLabel jbtnDatosPersonales;
    private javax.swing.JLabel jbtnDatosPersonales1;
    private javax.swing.JButton jbtnMinimizar;
    private javax.swing.JLabel jbtnPantallaPrincipal;
    // End of variables declaration//GEN-END:variables
}
