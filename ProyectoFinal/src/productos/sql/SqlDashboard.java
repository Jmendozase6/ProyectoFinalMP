/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.sql;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import conexion.ConexionSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhair
 */
public class SqlDashboard {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.getConnection();

    public void buscarDatos(String valor, JTable jtblProductos, JFrame rootPane) {

        String[] titulos = {"Id", "Nombre", "Marca", "Precio Unitario", "Cantidad", "Proveedor", "Fecha entrada"};
        Object[] registros = new Object[7];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String SQL = "SELECT * FROM productos WHERE Nombre like '%" + valor + "%' ";

        try {

            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {

                registros[0] = rs.getInt("Id");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Marca");
                registros[3] = rs.getDouble("Precio_unitario");
                registros[4] = rs.getDouble("Cantidad");
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

        String[] registros = new String[7];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM productos";

        try {

            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {

                registros[0] = rs.getString("Id");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Marca");
                registros[3] = rs.getString("Precio_unitario");
                registros[4] = rs.getString("Cantidad");
                registros[5] = rs.getString("Proveedor");
                registros[6] = rs.getString("Fecha_entrada");

                modelo.addRow(registros);
            }

            jtblProductos.setModel(modelo);
//            editarTabla();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(rootPane, "Error al mostrar los datos" + e.getMessage(), "Error", 0);
        }
    }
}
