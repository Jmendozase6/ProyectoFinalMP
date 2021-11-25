/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.control.sql.admin;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.proyecto.control.conexion.Conexion;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhair
 */
public class SqlCategoria {

    private final Conexion cc = new Conexion();
    private final Connection con;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;
    private String SQL;

    public SqlCategoria() {
        con = cc.getConnection();
    }

    public void mostrarCategorias(JComboBox cbxCategoria) {

        SQL = "SELECT (Nombre) FROM categorias";

        try {

            pst = (PreparedStatement) con.prepareStatement(SQL);
            rs = pst.executeQuery();

            while (rs.next()) {

                cbxCategoria.addItem(rs.getString("Nombre"));

            }

        } catch (SQLException e) {

            System.err.println("Error: " + e.getMessage());

        }
    }

    public void eliminarCategoria(int idCategoria) {

        SQL = "DELETE FROM categorias WHERE idCategoria=" + idCategoria;

        try {

            st = (Statement) con.createStatement();
            st.executeUpdate(SQL);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar la categoría: " + e.getMessage(), "Error", 0);

        }
    }

    public boolean actualizarCategoria(String nombre, int idCategoria) {

        SQL = "UPDATE categorias SET Nombre=? WHERE idCategoria=?";

        try {

            pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, nombre.trim());
            pst.setInt(2, idCategoria);

            int n = pst.executeUpdate();

            if (n >= 0) {

                JOptionPane.showMessageDialog(null, "La categoría se actualizó correctamente");
                return true;
            }

        } catch (HeadlessException | SQLException e) {

            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se actualizaron los datos.", "Error", 0);

        }

        return false;
    }

    public boolean agregarCategoria(String nombre) {

        SQL = "INSERT INTO categorias (Nombre) values(?)";

        try {

            pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, nombre.trim());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro de categoría exitoso");
            return true;

        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error de registro" + e.getMessage(), "Error", 0);

        }

        return false;
    }

    public int buscarId(String nombre) {
        SQL = "SELECT * FROM categorias";
        int id = -1;
        try {

            st = (Statement) con.createStatement();
            rs = st.executeQuery(SQL);

            while (rs.next()) {
                if (rs.getString("Nombre").equals(nombre)) {
                    id = rs.getInt("idCategoria");
                }
            }
            return id;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return id;
    }
}
