/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.sql;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexion.ConexionSQL;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Jhair
 */
public class SqlAgregarProducto {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.getConnection();

    public boolean agregarProducto(Date date, JTextField jtxtNombre, JTextField jtxtMarca, JTextField jtxtPrecioUni, JTextField jtxtCantidad, JComboBox jcbxProveedor, JFrame rootPane) {
        String nombre, marca, proveedor, SQL;
        double precioUnitario, cantidad;
        SQL = "INSERT INTO productos (Nombre,Marca,Precio_unitario,Cantidad,Proveedor,Fecha_entrada) values(?,?,?,?,?,?)";

        nombre = jtxtNombre.getText();
        marca = jtxtMarca.getText();
        precioUnitario = Double.parseDouble(jtxtPrecioUni.getText());
        cantidad = Double.parseDouble(jtxtCantidad.getText());
        proveedor = jcbxProveedor.getSelectedItem().toString();
        java.sql.Date date2 = new java.sql.Date(date.getTime());

        try {

            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, nombre);
            pst.setString(2, marca);
            pst.setDouble(3, precioUnitario);
            pst.setDouble(4, cantidad);
            pst.setString(5, proveedor);
            pst.setDate(6, date2);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Registro de producto exitoso");
            return true;

        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(rootPane, "Error de registro" + e.getMessage(), "Error", 0);

        }

        return false;
    }
}
