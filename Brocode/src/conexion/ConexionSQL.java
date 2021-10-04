/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author JHAIR
 */
public class ConexionSQL {

    Connection conectar = null;

    public Connection conexion() {

        try {

            Class.forName("org.gjt.mm.mysql.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/proyectofinal", "root", "");

//            JOptionPane.showMessageDialog(null, "Conexión exitosa");

        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error de conexión" + e.getMessage());
        }
        return conectar;
    }
}
