/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opciones;

import java.awt.Frame;
import java.awt.event.KeyEvent;
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
            jtxtContrasena.setEchoChar('*');
        }
    }

    public void soloDigitos(KeyEvent evt) {
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < ',' || car > '.')) {
            evt.consume();
        }
    }

    public void soloLetras(KeyEvent evt) {
        if (!(Character.isLetter(evt.getKeyChar()))) {
            evt.consume();
        }
    }

}
