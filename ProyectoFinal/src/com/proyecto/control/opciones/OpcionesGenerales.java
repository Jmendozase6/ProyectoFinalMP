/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.control.opciones;

import com.proyecto.control.conexion.Conexion;
import com.proyecto.modelos.Usuario;
import com.proyecto.vista.usuarios.FrmInicioSesion;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JHAIR
 */
public class OpcionesGenerales {

    Usuario us = Usuario.getInstance();

    /**
     * AL QUITARLE EL UNDECORATED AL FRAME, DEBEMOS HACER LAS OPERACIONES DE
     * CERRAR Y MINIMIZAR MANUALMENTE Y QUE SE PUEDA MOVER CON EL MOUSE
     */
    /**
     * Permite cerrar la ventana.
     */
    private final Conexion cc = Conexion.getInstance();

    public void cerrarPrograma() {
        try {
            if (JOptionPane.showConfirmDialog(null, "¿Desea salir?", "Comprobación", 0) == 0) {
                cc.closeConnection();
                System.exit(0);
            }
        } catch (HeadlessException | SQLException e) {
        }
    }

    /**
     * Permite minimizar la ventana.
     *
     * @param frm
     */
    public void minimizarPrograma(Frame frm) {
        frm.setExtendedState(Frame.ICONIFIED);
    }

    /**
     * Permite hacer visible la contraseña del PasswordField.
     *
     * @param jbtnVer
     * @param jtxtContrasena
     */
    public void verPass(JToggleButton jbtnVer, JPasswordField jtxtContrasena) {
        if (jbtnVer.isSelected()) {
            jtxtContrasena.setEchoChar((char) 0);
        } else {
            jtxtContrasena.setEchoChar('·');
        }
    }

    /**
     * Solo permite la entrada de digitos, así como puntos y comas
     *
     * @param evt
     */
    public void soloDigitos(KeyEvent evt) {
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < ',' || car > '.')) {
            evt.consume();
        }
    }

    /**
     * Admite solo la entrada de letras
     *
     * @param evt
     */
    public void soloLetras(KeyEvent evt) {
        if (!(Character.isLetter(evt.getKeyChar()))) {
            evt.consume();
        }
    }

    /**
     * Permite limpiar las tablas
     *
     * @param jtblLimpiar
     */
    public void limpiarTabla(JTable jtblLimpiar) {
        DefaultTableModel model = (DefaultTableModel) jtblLimpiar.getModel();
        model.setRowCount(0);
        jtblLimpiar.setModel(model);
    }

    /**
     *
     *
     * @param jtblEditar
     */
    public void editarHeaderTabla(JTable jtblEditar) {
        jtblEditar.getTableHeader().setFont(new Font("Montserrat Medium", 1, 15));
        jtblEditar.getTableHeader().setForeground(Color.BLACK);
        jtblEditar.getTableHeader().setBackground(Color.decode("#CCCCCC"));
    }

    /**
     *
     * @param jbtnProveedores
     * @param jbtnCategorias
     * @param jbtnUsuarios
     * @param j1
     * @param j2
     */
    public void modoEmpleado(JButton jbtnProveedores, JButton jbtnCategorias, JButton jbtnUsuarios, JSeparator j1, JSeparator j2) {
        jbtnProveedores.setVisible(false);
        jbtnCategorias.setVisible(false);
        jbtnUsuarios.setVisible(false);
        j1.setVisible(false);
        j2.setVisible(false);
    }

    /**
     *
     * @param JFrameCerrar
     */
    public void cerrarSesion(JFrame JFrameCerrar) {
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea cerrar la sesión?", "Comprobación", 0) == 0) {
            us.setNombre("");
            new FrmInicioSesion().setVisible(true);
            JFrameCerrar.dispose();
        }
    }
}
