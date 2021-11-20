/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.control.sql.productos;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.proyecto.control.conexion.Conexion;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhair
 */
public class SqlAgregarProducto {

    private final Conexion cc = new Conexion();
    private final Connection con;
    private PreparedStatement pst;
    private String SQL;
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
}
