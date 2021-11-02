/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import gui.usuarios.FrmInicioSesion;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author JHAIR
 */
public class Ejecutar {

    public static void main(String[] args) {

        try {

            UIManager.setLookAndFeel(new FlatIntelliJLaf());
//            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            FrmInicioSesion frmInicioSesion = new FrmInicioSesion();
            frmInicioSesion.setVisible(true);

        } catch (UnsupportedLookAndFeelException e) {

            System.err.println(e.getMessage());

        }

    }
}
