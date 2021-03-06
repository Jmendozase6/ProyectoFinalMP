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
import com.proyecto.modelos.Usuario;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhair
 */
public class SqlProveedor {

    private final Conexion cc = Conexion.getInstance();
    private final Connection con;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;
    private String SQL;
    Usuario us = Usuario.getInstance();
    private final String[] titulos = {"Id", "Nombres", "DNI", "Empresa"};

    public SqlProveedor() {
        this.con = cc.getConnection();
    }

    public boolean registrarProveedor(String nombre, int dni, String empresa) {

        SQL = "INSERT INTO proveedores (Nombres,DNI,Empresa) values(?,?,?)";

        try {

            pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, nombre.trim());
            pst.setInt(2, dni);
            pst.setString(3, empresa.trim());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro de proveedor exitoso");
            return true;

        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error de registro" + e.getMessage(), "Error", 0);

        }

        return false;
    }

    public void mostrarComboProveedores(JComboBox cbxProveedores) {

        SQL = "SELECT (Nombres) FROM proveedores";

        try {

            pst = (PreparedStatement) con.prepareStatement(SQL);
            rs = pst.executeQuery();

            while (rs.next()) {

                cbxProveedores.addItem(rs.getString("Nombres"));

            }

        } catch (SQLException e) {

            System.err.println("Error: " + e.getMessage());

        }

    }

    public void mostrarDatosTabla(JTable jtblProductos) {

        Object[] registros = new Object[4];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT * FROM proveedores";

        try {

            st = (Statement) con.createStatement();
            rs = st.executeQuery(SQL);

            while (rs.next()) {

                registros[0] = rs.getString("idProveedor");
                registros[1] = rs.getString("Nombres");
                registros[2] = rs.getString("DNI");
                registros[3] = rs.getString("Empresa");

                modelo.addRow(registros);
            }
            jtblProductos.setModel(modelo);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al mostrar los datos." + e.getMessage(), "Error", 0);
        }
    }

    public void eliminarProveedor(int idProducto) {

        SQL = "DELETE FROM proveedores WHERE idProveedor=" + idProducto;

        try {

            st = (Statement) con.createStatement();
            st.executeUpdate(SQL);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar al proveedor: " + e.getMessage(), "Error", 0);

        }
    }

    public void actualizarDatosProveedor(String nombre, int dni, String empresa, int idProveedor) {

        SQL = "UPDATE proveedores SET Nombres=?, DNI=?, Empresa=? WHERE idProveedor=?";

        try {

            pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, nombre.trim());
            pst.setInt(2, dni);
            pst.setString(3, empresa.trim());
            pst.setInt(4, idProveedor);

            int n = pst.executeUpdate();
            
            if (n >= 0) {

                JOptionPane.showMessageDialog(null, "Los datos se actualizaron correctamente.");

            }

        } catch (HeadlessException | SQLException e) {

            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se actualizaron los datos." + e.getMessage(), "Error", 0);

        }
    }
}
