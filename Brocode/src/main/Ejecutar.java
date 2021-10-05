/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import gui.FrmPantallaPrincipal;
import gui.FrmRegistro;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author JHAIR
 */
public class Ejecutar {

    public static void main(String[] args) {

        try {

            UIManager.setLookAndFeel(new NimbusLookAndFeel()); //Deja bordes redondos

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        FrmRegistro frmRegistro = new FrmRegistro();
        frmRegistro.setVisible(true);

    }
}
