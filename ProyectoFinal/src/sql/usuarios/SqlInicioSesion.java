/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql.usuarios;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import conexion.ConexionSQL;
import gui.productos.FrmDashboard;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelos.Usuario;

/**
 *
 * @author Jhair
 */
public class SqlInicioSesion {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.getConnection();
    Usuario us = Usuario.getInstance();
    ResultSet rs;
    Statement st;

    public void validarUsuario(String usuario, String pass, JFrame rootPane) {

        int resultado;
        String SQL = "select * from usuarios where Usuario='" + usuario + "' and Contrasena='" + pass + "'";

        try {

            st = (Statement) con.createStatement();
            rs = st.executeQuery(SQL);

            if (rs.next()) {

                resultado = 1;

                if (resultado == 1) {
                    us.setUsuario(usuario);
                    us.setContrasena(pass);
                    us.setIdUsuario(rs.getInt("Id"));
                    
                    FrmDashboard f = new FrmDashboard();
                    f.setVisible(true);
                    rootPane.dispose();
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Error de acceso: Usuario no registrado.");
            }

        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }

    }

}
