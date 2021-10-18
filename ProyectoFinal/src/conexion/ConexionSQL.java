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

    private Connection conectar = null;
    private final String url = "jdbc:mysql://localhost/proyecto_final";
    private final String user = "root";
    private final String pass = "02658817";

    public Connection conexion() {

        try {

            Class.forName("org.gjt.mm.mysql.Driver");
            conectar = (Connection) DriverManager.getConnection(url, user, pass);

//            JOptionPane.showMessageDialog(null, "Conexión exitosa");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error de conexión" + e.getMessage());

        }

        return conectar;
    }

    public static void main(String[] args) {
        new ConexionSQL().conexion();
    }
}
