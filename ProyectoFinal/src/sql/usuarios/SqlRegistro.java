/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql.usuarios;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexion.ConexionSQL;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhair
 */
public class SqlRegistro {

    private final ConexionSQL cc = new ConexionSQL();
    private final Connection con;
    private String SQL;
    private PreparedStatement pst;

    public SqlRegistro() {
        this.con = cc.getConnection();
    }

    public boolean agregarUsuario(String nombre, String user, String pass, JFrame rootPane, JLabel error) {

        SQL = "INSERT INTO usuarios (Nombre,Usuario,Contrasena) values(?,?,?)";

        try {

            pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, nombre);
            pst.setString(2, user);
            pst.setString(3, pass);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Registro exitoso");
            error.setForeground(new Color(34, 35, 40));
            return true;
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(rootPane, "Error de registro" + e.getMessage(), "Error", 0);
            return false;

        }

    }

}
