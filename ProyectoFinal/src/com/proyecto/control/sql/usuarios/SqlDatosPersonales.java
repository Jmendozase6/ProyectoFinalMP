/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.control.sql.usuarios;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.proyecto.control.conexion.Conexion;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import com.proyecto.modelos.Usuario;

/**
 *
 * @author Jhair
 */
public class SqlDatosPersonales {

    private final Conexion cc = new Conexion();
    private final Connection con;
    Usuario us = Usuario.getInstance();
    ResultSet rs;
    PreparedStatement pst;
    Statement st;

    public SqlDatosPersonales() {
        this.con = cc.getConnection();
    }

    public void actualizarUsuario(String nombre, String usuario, String contrasena) {

        String SQL = "UPDATE usuarios SET Nombre=?, Usuario=?, Contrasena=? WHERE id=?";

        try {
            us.setNombre(nombre.trim());
            us.setUsuario(usuario.trim());
            us.setContrasena(contrasena.trim());

            pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, us.getNombre());
            pst.setString(2, us.getUsuario());
            pst.setString(3, us.getContrasena());

            pst.setInt(4, us.getIdUsuario());

            int n = pst.executeUpdate();

            if (n >= 0) {

                JOptionPane.showMessageDialog(null, "Los datos se actualizaron correctamente.");

            }

        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "No se actualizaron los datos.", "Error", 0);

        }
    }

    public void mostrarDatos(JTextField jtxtNombre, JTextField jtxtUsuario, JPasswordField jtxtContrasena) {

        String SQL = "SELECT * FROM usuarios where Usuario ='" + us.getUsuario() + "' and Contrasena='" + us.getContrasena() + "'";

        try {
            st = (Statement) con.createStatement();
            rs = st.executeQuery(SQL);

            if (rs.next()) {
                jtxtNombre.setText(rs.getString("Nombre"));
                jtxtUsuario.setText(rs.getString("Usuario"));
                jtxtContrasena.setText(rs.getString("Contrasena"));
            }
            us.setNombre(jtxtNombre.getText());

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);

        }
    }

}
