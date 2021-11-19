/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectofinal.sql.productos;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.proyectofinal.conexion.Conexion;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.proyectofinal.modelos.Usuario;

/**
 *
 * @author Jhair
 */
public class SqlDashboard {

    private final Conexion cc = new Conexion();
    private final Connection con;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;
    private final String[] titulos = {"Id", "Nombre", "Categoría", "Marca", "Precio c/u", "Cantidad", "Proveedor", "Fecha entrada"};
    Usuario us = Usuario.getInstance();

    public SqlDashboard() {
        this.con = cc.getConnection();
    }

    public void buscarDatos(String valor, JTable jtblProductos) {

        Object[] registros = new Object[8];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String SQL = "SELECT * FROM productos WHERE Nombre like '%" + valor.trim() + "%' ";

        try {

            st = (Statement) con.createStatement();
            rs = st.executeQuery(SQL);

            while (rs.next()) {

                registros[0] = rs.getString("Id");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Categoria");
                registros[3] = rs.getString("Marca");
                registros[4] = rs.getString("Precio_unitario");
                registros[5] = rs.getString("Cantidad");
                registros[6] = rs.getString("Proveedor");
                registros[7] = rs.getDate("Fecha_entrada");

                modelo.addRow(registros);
            }

            jtblProductos.setModel(modelo);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al filtrar datos." + e.getMessage());

        }
    }

    public void mostrarDatos(JTable jtblProductos) {

        Object[] registros = new Object[8];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM productos";

        try {

            st = (Statement) con.createStatement();
            rs = st.executeQuery(SQL);

            while (rs.next()) {

                registros[0] = rs.getString("Id");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Categoria");
                registros[3] = rs.getString("Marca");
                registros[4] = rs.getString("Precio_unitario");
                registros[5] = rs.getString("Cantidad");
                registros[6] = rs.getString("Proveedor");
                registros[7] = rs.getDate("Fecha_entrada");

                modelo.addRow(registros);
            }
            jtblProductos.setModel(modelo);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al mostrar los datos." + e.getMessage(), "Error", 0);
        }
    }

    public void actualizarDatosProducto(String nombre, String categoria, String marca, double precioUnitario, double cantidad, String proveedor, int idProducto) {

        String SQL = "UPDATE productos SET Nombre=?, Categoria=?, Marca=? , Precio_unitario=?, Cantidad=?, Proveedor=? WHERE id=?";

        try {

            pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, nombre.trim());
            pst.setString(2, categoria);
            pst.setString(3, marca.trim());
            pst.setDouble(4, precioUnitario);
            pst.setDouble(5, cantidad);
            pst.setString(6, proveedor);
            pst.setInt(7, idProducto);

            int n = pst.executeUpdate();

            if (n >= 0) {

                JOptionPane.showMessageDialog(null, "Los datos se actualizaron correctamente.");

            }

        } catch (HeadlessException | SQLException e) {

            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se actualizaron los datos." + e.getMessage(), "Error", 0);

        }
    }

    public void eliminarProducto(int idProducto) {

        String SQL = "DELETE FROM productos WHERE Id=" + idProducto;

        try {

            st = (Statement) con.createStatement();
            st.executeUpdate(SQL);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar el elemento: " + e.getMessage(), "Error", 0);

        }
    }
}
