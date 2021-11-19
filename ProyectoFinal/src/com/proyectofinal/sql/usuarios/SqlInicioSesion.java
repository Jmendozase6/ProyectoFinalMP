/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectofinal.sql.usuarios;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.proyectofinal.conexion.Conexion;
import com.proyectofinal.vista.productos.FrmDashboard;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.proyectofinal.modelos.Usuario;

/**
 *
 * @author Jhair
 */
public class SqlInicioSesion {

    private final Conexion cc = new Conexion();
    private final Connection con;
    Usuario us = Usuario.getInstance();
    ResultSet rs;
    Statement st;

    public SqlInicioSesion() {
        this.con = cc.getConnection();
    }

    public void validarUsuario(String usuario, String pass, JFrame rootPane) {

        int resultado;
        String SQL = "SELECT * FROM usuarios WHERE Usuario='" + usuario.trim() + "' AND Contrasena='" + pass.trim() + "'";

        try {

            st = (Statement) con.createStatement();
            rs = st.executeQuery(SQL);

            if (rs.next()) {

                resultado = 1;

                if (resultado == 1) {

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
