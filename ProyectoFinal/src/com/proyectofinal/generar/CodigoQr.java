/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectofinal.generar;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.proyectofinal.conexion.Conexion;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhair
 */
public class CodigoQr {

    private final Conexion cc = Conexion.getInstance();
    private final Connection con;
    private Statement st;
    private ResultSet rs;

    public CodigoQr() {
        con = cc.getConnection();
    }

    public void generarQr(int ancho, int alto, String ruta) {

        String SQL = "SELECT * FROM productos";

        try {
            BitMatrix bitMatrix;
            QRCodeWriter writer = new QRCodeWriter();

            st = (Statement) con.createStatement();
            rs = st.executeQuery(SQL);

            while (rs.next()) {

                //Nombre - Marca - Precio c/u
                bitMatrix = writer.encode(rs.getString("Nombre") + " - " + rs.getString("Marca") + " - " + rs.getDouble("Precio_unitario"), BarcodeFormat.QR_CODE, ancho, alto);
                MatrixToImageWriter.writeToStream(bitMatrix, "png", new FileOutputStream(new File(ruta+"//Código QR - " + rs.getString("Nombre") + ".png")));

            }
            JOptionPane.showMessageDialog(null, "Los códigos se han generado con éxito.");

        } catch (SQLException e) {
            System.err.println(e.getMessage());

        } catch (WriterException | FileNotFoundException ex) {

            Logger.getLogger(CodigoQr.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {

            Logger.getLogger(CodigoQr.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

}
