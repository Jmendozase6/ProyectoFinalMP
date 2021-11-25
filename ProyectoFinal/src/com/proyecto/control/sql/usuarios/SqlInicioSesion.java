/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.control.sql.usuarios;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.proyecto.control.conexion.Conexion;
import com.proyecto.vista.productos.FrmDashboard;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.proyecto.modelos.Usuario;

/**
 *
 * @author Jhair
 */
public class SqlInicioSesion {

    private final Conexion cc = Conexion.getInstance();
    private final Connection con;
    private static ResultSet rs;
    private static Statement st;
    Usuario us = Usuario.getInstance();
    private String SQL;

    public SqlInicioSesion() {
        this.con = cc.getConnection();
    }

    public void validarUsuario(String usuario, String pass, JFrame rootPane) {

        int resultado;
        SQL = "SELECT * FROM usuarios WHERE Usuario='" + usuario.trim() + "' AND Contrasena='" + pass.trim() + "'";

        try {

            st = (Statement) con.createStatement();
            rs = st.executeQuery(SQL);

            if (rs.next()) {

                resultado = 1;

                if (resultado == 1) {

                    us.setTipoUsuario(rs.getInt("tipoUsuario"));
                    us.setIdUsuario(rs.getInt("Id"));
                    us.setUsuario(usuario.trim());
                    us.setContrasena(pass.trim());

                    FrmDashboard f = new FrmDashboard();
                    f.setVisible(true);
                    rootPane.dispose();

                }

            } else {
                JOptionPane.showMessageDialog(null, "Usuario no registrado.", "Error", 0);
            }

        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

}
