/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectofinal.opciones;

import com.proyectofinal.conexion.Conexion;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;

/**
 *
 * @author JHAIR
 */
public class MenuOpciones {

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

}
