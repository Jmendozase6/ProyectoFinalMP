/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectofinal.sql.usuarios;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.proyectofinal.conexion.Conexion;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhair
 */
public class SqlRegistro {

    private final Conexion cc = new Conexion();
    private final Connection con;
    private String SQL;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;

    public SqlRegistro() {
        this.con = cc.getConnection();
    }

    public boolean agregarUsuario(String nombre, String user, String pass, JLabel error) {

        SQL = "INSERT INTO usuarios (Nombre,Usuario,Contrasena) values(?,?,?)";

        try {

            pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, nombre.trim());
            pst.setString(2, user.trim());
            pst.setString(3, pass.trim());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro exitoso.");
            error.setForeground(new Color(34, 35, 40));
            return true;

        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error de registro." + e.getMessage(), "Error", 0);
            return false;
        }

    }

    public boolean verificarExistente(String usuario) {

        SQL = "SELECT (Usuario) FROM usuarios WHERE Usuario like '%" + usuario.trim() + "%' ";

        try {

            st = (Statement) con.createStatement();
            rs = st.executeQuery(SQL);

            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Ocurrió un error." + e.getMessage());

        }
        return false;
    }

}
