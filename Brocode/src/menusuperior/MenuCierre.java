/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menusuperior;

import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 *
 * @author JHAIR
 */
public class MenuCierre {

    public void cerrarPrograma() {
        if (JOptionPane.showConfirmDialog(null, "¿Desea salir?", "Comprobación", 0) == 0) {
            System.exit(0);
        }
    }

    public void minimizarPrograma(Frame frm) {
        frm.setExtendedState(Frame.ICONIFIED);
    }
}
