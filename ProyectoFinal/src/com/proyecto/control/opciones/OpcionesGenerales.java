/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.control.opciones;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JHAIR
 */
public class OpcionesGenerales {

    /**
     * AL QUITARLE EL UNDECORATED AL FRAME, DEBEMOS HACER LAS OPERACIONES DE
     * CERRAR Y MINIMIZAR MANUALMENTE Y QUE SE PUEDA MOVER CON EL MOUSE
     */
    /**
     * Permite cerrar la ventana.
     */
    public void cerrarPrograma() {
        if (JOptionPane.showConfirmDialog(null, "¿Desea salir?", "Comprobación", 0) == 0) {
            System.exit(0);
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
     */
    public void modoEmpleado(JButton jbtn1, JButton jbtn2, JButton jbtn3, JButton jbtn4, JButton jbtn5, JButton jbtn6) {
        jbtn1.setEnabled(false);
        jbtn2.setEnabled(false);
        jbtn3.setEnabled(false);
        jbtn4.setEnabled(false);
        jbtn5.setEnabled(false);
        jbtn6.setEnabled(false);
    }
}
