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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.Usuario;

/**
 *
 * @author Jhair
 */
public class SqlDashboard {

    private final ConexionSQL cc = new ConexionSQL();
    private final Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    Usuario us = Usuario.getInstance();

    public SqlDashboard() {
        this.con = cc.getConnection();
    }

    public void buscarDatos(String valor, JTable jtblProductos) {

        String[] titulos = {"Id", "Nombre", "Categoría", "Marca", "Precio Unitario", "Cantidad", "Proveedor"};
        Object[] registros = new Object[7];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String SQL = "SELECT * FROM productos WHERE Nombre like '%" + valor + "%' ";

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

                modelo.addRow(registros);
            }

            jtblProductos.setModel(modelo);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al filtrar datos" + e.getMessage());

        }
    }

    public void mostrarDatos(JTable jtblProductos) {

        String[] titulos = {"Id", "Nombre", "Categoría", "Marca", "Precio Unitario", "Cantidad", "Proveedor"};

        Object[] registros = new Object[7];

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

                modelo.addRow(registros);
            }

            jtblProductos.setModel(modelo);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al mostrar los datos" + e.getMessage(), "Error", 0);
        }
    }

    public void actualizarDatosProducto(String nombre, String categoria, String marca, double precioUnitario, double cantidad, String proveedor, int idProducto) {

        String SQL = "UPDATE productos SET Nombre=?, Categoria=?, Marca=? , Precio_unitario=?, Cantidad=?, Proveedor=? WHERE id=?";

        try {

            pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, nombre);
            pst.setString(2, categoria);
            pst.setString(3, marca);
            pst.setDouble(4, precioUnitario);
            pst.setDouble(5, cantidad);
            pst.setString(6, proveedor);
            pst.setInt(7, idProducto);

            int n = pst.executeUpdate();

            if (n >= 0) {

                JOptionPane.showMessageDialog(null, "Los datos se actualizaron correctamente");

            }

        } catch (HeadlessException | SQLException e) {

            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se actualizaron los datos" + e.getMessage(), "Error", 0);

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
