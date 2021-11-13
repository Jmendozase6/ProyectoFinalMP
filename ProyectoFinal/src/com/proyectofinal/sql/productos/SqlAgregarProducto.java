/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectofinal.sql.productos;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.proyectofinal.conexion.Conexion;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author Jhair
 */
public class SqlAgregarProducto {

    private final Conexion cc = new Conexion();
    private final Connection con;
    PreparedStatement pst;
    ResultSet rs;
    String SQL;
    java.util.Date dateUtil = new java.util.Date();
    java.sql.Date dateSql = new java.sql.Date(dateUtil.getTime());
    

    public SqlAgregarProducto() {
        this.cc.getInstance();
        this.con = cc.getConnection();
    }

    public boolean agregarProducto(String nombre, String categoria, String marca, double precioUnitario, double cantidad, String proveedor) {

        SQL = "INSERT INTO productos (Nombre,Categoria,Marca,Precio_unitario,Cantidad,Proveedor,Fecha_entrada) values(?,?,?,?,?,?,?)";

        try {

            pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, nombre.trim());
            pst.setString(2, categoria);
            pst.setString(3, marca.trim());
            pst.setDouble(4, precioUnitario);
            pst.setDouble(5, cantidad);
            pst.setString(6, proveedor);
            pst.setDate(7, dateSql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro de producto exitoso");
            return true;

        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error de registro" + e.getMessage(), "Error", 0);

        }

        return false;
    }

    public void mostrarProveedores(JComboBox cbxProveedores) {

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
}
