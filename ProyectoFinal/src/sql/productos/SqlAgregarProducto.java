/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql.productos;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexion.ConexionSQL;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author Jhair
 */
public class SqlAgregarProducto {

    private final ConexionSQL cc = new ConexionSQL();
    private final Connection con;
    PreparedStatement pst;
    ResultSet rs;
    String SQL;

    public SqlAgregarProducto() {
        this.con = cc.getConnection();
    }

    public boolean agregarProducto(Date date, String nombre, String categoria, String marca, double precioUnitario, double cantidad, String proveedor) {

        SQL = "INSERT INTO productos (Nombre,Categoria,Marca,Precio_unitario,Cantidad,Proveedor,Fecha_entrada) values(?,?,?,?,?,?,?)";

        java.sql.Date date2 = new java.sql.Date(date.getTime());

        try {

            pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, nombre.trim());
            pst.setString(2, categoria.trim());
            pst.setString(3, marca.trim());
            pst.setDouble(4, precioUnitario);
            pst.setDouble(5, cantidad);
            pst.setString(6, proveedor);
            pst.setDate(7, date2);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro de producto exitoso");
            return true;

        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error de registro" + e.getMessage(), "Error", 0);

        }

        return false;
    }

    public void mostrarProveedores(JComboBox cbxProveedores) {

        SQL = "SELECT * FROM proveedores";

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
}
