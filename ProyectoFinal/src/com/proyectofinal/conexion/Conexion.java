/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectofinal.conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author JHAIR
 */
public class Conexion {

    private static Connection connect;
    private static Conexion instancia;
    private static final String DB = "bd_proyecto_final";
    private static final String USER = "root";
    private static final String PASS = "02658817";
    private static final String URL = "jdbc:mysql://localhost/" + DB;

    public Connection getConnection() {

        try {

            Class.forName("org.gjt.mm.mysql.Driver");
            connect = (Connection) DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexión exitosa");
            return connect;

        } catch (ClassNotFoundException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error de conexión" + e.getMessage());

        }

        return connect;
    }

    public void closeConnection() throws SQLException {
        try {
            connect.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            connect.close();
        } finally {
            connect.close();
        }
    }

    public Conexion getInstance() {
        if(instancia==null){
            instancia = new Conexion();
        }
        return instancia;
    }
}
