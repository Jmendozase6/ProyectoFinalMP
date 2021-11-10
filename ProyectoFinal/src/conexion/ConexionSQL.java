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

    private Connection connect;
    private final String DB;
    private final String USER;
    private final String PASS;
    private final String URL;

    public ConexionSQL() {
        this.connect = null;
        this.DB = "proyecto_final";
        this.USER = "root";
        this.PASS = "02658817";
        this.URL = "jdbc:mysql://localhost/" + this.DB;
    }

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
