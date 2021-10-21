/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios.sql;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexion.ConexionSQL;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import modelos.Usuarios;

/**
 *
 * @author Jhair
 */
public class SqlDatosPersonales {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.getConnection();
    Usuarios us = Usuarios.getInstance();
    ResultSet rs;
    PreparedStatement pst;
    Statement st;

    public void guardarCambios(String nombre, String usuario, String contrasena, JFrame rootPane) {

        String SQL = "UPDATE usuarios SET Nombre=?, Usuario=?, Contrasena=?";

        try {

            pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, nombre);
            pst.setString(2, usuario);
            pst.setString(3, contrasena);

            int n = pst.executeUpdate();

            if (n >= 0) {

                JOptionPane.showMessageDialog(rootPane, "Los datos se actualizaron correctamente");

            }

        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(rootPane, "No se actualizaron los datos", "Error", 0);

        }
    }

    public void mostrarDatos(JTextField jtxtNombre, JTextField jtxtUsuario, JPasswordField jtxtContrasena) {

        String SQL = "SELECT * FROM usuarios where Usuario ='" + us.getUsuario() + "' and Contrasena='" + us.getContrasena() + "'";

        try {
            st = (Statement) con.createStatement();
            rs = st.executeQuery(SQL);

            while (rs.next()) {
                jtxtNombre.setText(rs.getString("Nombre"));
                jtxtUsuario.setText(rs.getString("Usuario"));
                jtxtContrasena.setText(rs.getString("Contrasena"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
