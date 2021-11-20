/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.vista.admin;

import com.proyecto.control.sql.admin.SqlCategoria;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class DialogCategoria extends javax.swing.JDialog {

    private int idCategoria;
    SqlCategoria sqlC = new SqlCategoria();

    public DialogCategoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mostrarCategorias();
        labelError.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jbtnCerrar = new javax.swing.JButton();
        jtxtCategoria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbtnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jbtnAgregar = new javax.swing.JButton();
        jcbxCategoria = new javax.swing.JComboBox<>();
        jbtnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
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

        jtxtCategoria.setBackground(new java.awt.Color(255, 255, 255));
        jtxtCategoria.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jtxtCategoria.setForeground(new java.awt.Color(51, 51, 51));
        jtxtCategoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxtCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtxtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCategoriaKeyTyped(evt);
            }
        });
        jPanel2.add(jtxtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 360, 40));

        jLabel5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CATEGORÍAS");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jbtnEliminar.setBackground(new java.awt.Color(232, 50, 50));
        jbtnEliminar.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jbtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setBorderPainted(false);
        jbtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEliminar.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 130, 40));

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nueva");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jbtnAgregar.setBackground(new java.awt.Color(76, 196, 76));
        jbtnAgregar.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jbtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregar.setText("Agregar");
        jbtnAgregar.setBorderPainted(false);
        jbtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnAgregar.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, 40));

        jcbxCategoria.setBackground(new java.awt.Color(153, 255, 255));
        jcbxCategoria.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        jcbxCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jcbxCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbxCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbxCategoriaItemStateChanged(evt);
            }
        });
        jcbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxCategoriaActionPerformed(evt);
            }
        });
        jPanel2.add(jcbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 430, 60));

        jbtnActualizar.setBackground(new java.awt.Color(102, 204, 255));
        jbtnActualizar.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jbtnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnActualizar.setText("Actualizar");
        jbtnActualizar.setBorderPainted(false);
        jbtnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnActualizar.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jbtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAdmin/imgLogoCategorias.png"))); // NOI18N
        jLabel1.setFocusable(false);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 380));

        labelError.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        labelError.setForeground(new java.awt.Color(232, 50, 50));
        labelError.setText("Error: el nombre está vacío");
        jPanel2.add(labelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 712));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarCategorias() {
        sqlC.mostrarCategorias(jcbxCategoria);
        jcbxCategoria.setSelectedIndex(-1);
    }
    private void jbtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnCerrarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        try {

            labelError.setVisible(false);
            idCategoria = sqlC.buscarId(jcbxCategoria.getSelectedItem().toString());
            System.out.println("ID ELIMINAR" + idCategoria);
            if (idCategoria > -1) {
                sqlC.eliminarCategoria(idCategoria);
                jcbxCategoria.removeAllItems();
                sqlC.mostrarCategorias(jcbxCategoria);
                jtxtCategoria.setText("");

            } else {

                JOptionPane.showMessageDialog(rootPane, "No seleccionó ninguna categoría.", "Error", 0);
            }

        } catch (NullPointerException | HeadlessException e) {

            JOptionPane.showMessageDialog(rootPane, "No seleccionó ninguna categoría.", "Error", 0);
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
        if (!jtxtCategoria.getText().isBlank()) {
            if (sqlC.agregarCategoria(jtxtCategoria.getText())) {
                jcbxCategoria.removeAllItems();
                sqlC.mostrarCategorias(jcbxCategoria);
                jtxtCategoria.setText("");

            }
            labelError.setVisible(false);
        } else {
            labelError.setVisible(true);
        }
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed
        try {
            idCategoria = sqlC.buscarId(jcbxCategoria.getSelectedItem().toString());
            if (!jtxtCategoria.getText().isBlank()) {
                if (sqlC.actualizarCategoria(jtxtCategoria.getText(), idCategoria)) {
                    jcbxCategoria.removeAllItems();
                    sqlC.mostrarCategorias(jcbxCategoria);
                    jtxtCategoria.setText("");
                    labelError.setVisible(false);
                }
            } else {
                labelError.setVisible(true);
            }
        } catch (NullPointerException | HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, "No seleccionó ninguna categoría.", "Error", 0);
        }
    }//GEN-LAST:event_jbtnActualizarActionPerformed

    private void jtxtCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCategoriaKeyTyped
        if (!Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtCategoriaKeyTyped

    private void jcbxCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbxCategoriaItemStateChanged

    }//GEN-LAST:event_jcbxCategoriaItemStateChanged

    private void jcbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxCategoriaActionPerformed
        jtxtCategoria.setText("");
        if (jcbxCategoria.getSelectedItem() != null)
            jtxtCategoria.setText(jcbxCategoria.getSelectedItem().toString());
    }//GEN-LAST:event_jcbxCategoriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnActualizar;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnCerrar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JComboBox<String> jcbxCategoria;
    private javax.swing.JTextField jtxtCategoria;
    private javax.swing.JLabel labelError;
    // End of variables declaration//GEN-END:variables
}
