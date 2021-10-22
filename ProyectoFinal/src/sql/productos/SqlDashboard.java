/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql.productos;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexion.ConexionSQL;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.Usuario;

/**
 *
 * @author Jhair
 */
public class SqlDashboard {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.getConnection();
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    Usuario us = Usuario.getInstance();

    public void buscarDatos(String valor, JTable jtblProductos, JFrame rootPane) {

        String[] titulos = {"Id", "Nombre", "Marca", "Precio Unitario", "Cantidad", "Proveedor", "Fecha entrada"};
        Object[] registros = new Object[7];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String SQL = "SELECT * FROM productos WHERE Nombre like '%" + valor + "%' ";

        try {

            st = (Statement) con.createStatement();
            rs = st.executeQuery(SQL);

            while (rs.next()) {

                registros[0] = rs.getInt("Id");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Marca");
                registros[3] = rs.getDouble("Precio_unitario");
                registros[4] = rs.getString("Cantidad");
                registros[5] = rs.getString("Proveedor");
                registros[6] = rs.getDate("Fecha_entrada");

                modelo.addRow(registros);
            }

            jtblProductos.setModel(modelo);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(rootPane, "Error al filtrar datos" + e.getMessage());

        }
    }

    public void mostrarDatos(JTable jtblProductos, JFrame rootPane) {

        String[] titulos = {"Id", "Nombre", "Marca", "Precio Unitario", "Cantidad", "Proveedor", "Fecha entrada"};

        Object[] registros = new Object[7];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM productos";
        try {

            st = (Statement) con.createStatement();
            rs = st.executeQuery(SQL);

            while (rs.next()) {

                registros[0] = rs.getString("Id");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Marca");
                registros[3] = rs.getString("Precio_unitario");
                registros[4] = rs.getString("Cantidad");
                registros[5] = rs.getString("Proveedor");
                registros[6] = rs.getString("Fecha_entrada");
//                registros[7] = //AÑADIR AQUI EL CHECKBOX

                modelo.addRow(registros);
            }

            jtblProductos.setModel(modelo);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(rootPane, "Error al mostrar los datos" + e.getMessage(), "Error", 0);
        }
    }

    public void actualizarDatosProducto(String nombre, String marca, double precioUnitario, double cantidad, String proveedor, int idProducto) {

        String SQL = "UPDATE productos SET Nombre=?, Marca=?, Precio_unitario=?, Cantidad=?, Proveedor=? WHERE id=?";

        try {

            pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, nombre);
            pst.setString(2, marca);
            pst.setDouble(3, precioUnitario);
            pst.setDouble(4, cantidad);
            pst.setString(5, proveedor);
            pst.setInt(6, idProducto);

            int n = pst.executeUpdate();

            if (n >= 0) {

                JOptionPane.showMessageDialog(null, "Los datos se actualizaron correctamente");

            }

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se actualizaron los datos", "Error", 0);

        }
    }
}
