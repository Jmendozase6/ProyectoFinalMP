/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios.sql;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexion.ConexionSQL;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhair
 */
public class SqlRegistro {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.getConnection();

    public boolean agregarUsuario(String nombre, String user, String pass, JFrame rootPane) {

        String SQL = "INSERT INTO usuarios (Nombre,Usuario,Contrasena) values(?,?,?)";

        try {

            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, nombre);
            pst.setString(2, user);
            pst.setString(3, pass);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Registro exitoso");
            return true;

        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(rootPane, "Error de registro" + e.getMessage(), "Error", 0);

        }

        return false;
    }
}
