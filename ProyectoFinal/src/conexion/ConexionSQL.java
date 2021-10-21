/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author JHAIR
 */
public class ConexionSQL {

    private Connection connect = null;
    private final String DB = "proyecto_final";
    private final String USER = "root";
    private final String PASS = "02658817";
    private final String URL = "jdbc:mysql://localhost/" + DB;

    public Connection getConnection() {

        try {

            Class.forName("org.gjt.mm.mysql.Driver");
            connect = (Connection) DriverManager.getConnection(URL, USER, PASS);

//            JOptionPane.showMessageDialog(null, "Conexión exitosa");
        } catch (ClassNotFoundException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error de conexión" + e.getMessage());

        }

        return connect;
    }

}
