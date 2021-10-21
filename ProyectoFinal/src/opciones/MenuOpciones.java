/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opciones;

import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;

/**
 *
 * @author JHAIR
 */
public class MenuOpciones {

    public void cerrarPrograma() {
        if (JOptionPane.showConfirmDialog(null, "¿Desea salir?", "Comprobación", 0) == 0) {
            System.exit(0);
        }
    }

    public void minimizarPrograma(Frame frm) {
        frm.setExtendedState(Frame.ICONIFIED);
    }

    public void verPass(JToggleButton jbtnVer, JPasswordField jtxtContrasena) {
        if (jbtnVer.isSelected()) {
            jtxtContrasena.setEchoChar((char) 0);
        } else {
            jtxtContrasena.setEchoChar('*');
        }
    }
}
