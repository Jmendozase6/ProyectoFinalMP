/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.control.generar;

import java.awt.Component;
import javax.swing.JFileChooser;

/**
 *
 * @author Jhair
 */
public class RutaArchivo {

    public String seleccionarRuta(int filechooserOption) {
        String rutaSeleccionada = "";
        //Seteamos una ruta por defecto
        JFileChooser chooser = new JFileChooser("C:\\Users\\Jhair\\OneDrive\\Escritorio");

        /*   De acuerdo con JFileChooser para seleccionar el cuadro de carpeta emergente
        *    0. Seleccione solo el archivo JFileChooser.FILES_ONLY
        *    1. Sólo seleccione el directorio JFileChooser.DIRECTORIES_ONLY
        *    2. Tanto los directorios como los archivos pueden ser JFileChooser.FILES_AND_DIRECTORIES
         */
        chooser.setFileSelectionMode(filechooserOption);

        // Guardar el directorio seleccionado chooser.showSaveDialog (parent);
        Component parent = null;
        int returnVal = chooser.showSaveDialog(parent);

        // Obtener el objeto de archivo seleccionado JFileChooser.APPROVE_OPTION
        // Si el directorio guardado es consistente con el objeto de archivo seleccionado, devolverá 0 si tiene éxito
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            //Obtener la ruta
            rutaSeleccionada = chooser.getSelectedFile().getPath();
        }

        return rutaSeleccionada;
    }

}
