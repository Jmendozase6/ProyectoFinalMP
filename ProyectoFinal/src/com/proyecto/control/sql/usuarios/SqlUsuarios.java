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
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhair
 */
public class SqlUsuarios {

    private final Conexion cc = new Conexion();
    private final Connection con;
    private String SQL;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;

    public SqlUsuarios() {
        this.con = cc.getConnection();
    }

    public boolean agregarUsuario(String nombre, String user, String pass, int tipoUsuario, JLabel error) {

        tipoUsuario++;

        SQL = "INSERT INTO usuarios (Nombre,Usuario,Contrasena,tipoUsuario) values(?,?,?,?)";

        try {

            pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, nombre.trim());
            pst.setString(2, user.trim());
            pst.setString(3, pass.trim());
            pst.setInt(4, tipoUsuario);

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

        SQL = "SELECT (Usuario) FROM usuarios WHERE Usuario = '%" + usuario.trim() + "%' ";

        try {

            st = (Statement) con.createStatement();
            rs = st.executeQuery(SQL);

            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Ocurrió un error." + e.getMessage());

        }
        return false;
    }

    public void mostrarTipoUsuario(JComboBox jcbxTipo) {

        SQL = "SELECT (tipo) FROM tipousuario";

        try {

            pst = (PreparedStatement) con.prepareStatement(SQL);
            rs = pst.executeQuery();

            while (rs.next()) {

                jcbxTipo.addItem(rs.getString("tipo"));

            }
            jcbxTipo.setSelectedIndex(-1);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void actualizarUsuario(String nombre, String usuario, String contrasena, int tipoUsuario, int idUsuario) {

        SQL = "UPDATE usuarios SET Nombre=?, Usuario=?, Contrasena=?, tipoUsuario=? WHERE Id=?";

        try {

            pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, nombre.trim());
            pst.setString(2, usuario.trim());
            pst.setString(3, contrasena.trim());
            pst.setInt(4, tipoUsuario);
            pst.setInt(5, idUsuario);

            int n = pst.executeUpdate();

            if (n >= 0) {

                JOptionPane.showMessageDialog(null, "Los datos se actualizaron correctamente.");

            }

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se actualizaron los datos.", "Error", 0);

        }
    }
}
