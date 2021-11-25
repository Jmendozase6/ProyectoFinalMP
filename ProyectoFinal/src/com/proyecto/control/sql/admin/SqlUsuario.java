/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.control.sql.admin;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.proyecto.control.conexion.Conexion;
import com.proyecto.modelos.Usuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

/**
 *
 * @author Jhair
 */
public class SqlUsuario {

    private final Conexion cc = Conexion.getInstance();
    private final Connection con;
    private String SQL;
    private Statement st;
    private ResultSet rs;
    Usuario us = Usuario.getInstance();
    String[] titulos = {"Id", "Nombre", "Usuario", "Contraseña", "Rol"};

    public SqlUsuario() {
        con = cc.getConnection();
    }

    public void eliminarUsuario(int idUsuario) {

        SQL = "DELETE FROM usuarios WHERE Id=" + idUsuario;

        try {

            st = (Statement) con.createStatement();
            st.executeUpdate(SQL);

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al eliminar el usuario", "Error", 0);

        }
    }

    public void mostrarDatos(JTable jtblUsuarios) {

        Object[] registros = new Object[5];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT * FROM usuarios";

        try {

            st = (Statement) con.createStatement();
            rs = st.executeQuery(SQL);

            while (rs.next()) {

                registros[0] = rs.getString("Id");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Usuario");
                registros[3] = rs.getString("Contrasena");
                registros[4] = rs.getInt("tipoUsuario") == 1 ? "Administrador" : "Usuario";

                modelo.addRow(registros);
            }
            jtblUsuarios.setModel(modelo);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al mostrar los datos." + e.getMessage(), "Error", 0);
        }
    }
}
