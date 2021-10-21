/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigobarras.sql;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.Barcode;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.Barcode39;
import com.itextpdf.text.pdf.BarcodeCodabar;
import com.itextpdf.text.pdf.BarcodePDF417;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexion.ConexionSQL;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jhair
 */
public class CodigoBar {

    PreparedStatement pst;
    ResultSet rs;
    Connection con;
    Image img;
    ConexionSQL conn = new ConexionSQL();

    public CodigoBar() throws SQLException {
        con = conn.getConnection();
        pst = (PreparedStatement) con.prepareStatement("SELECT * FROM productos");
        rs = pst.executeQuery();
    }

    private void generarCodigo() throws SQLException {

        try {
            Document doc = new Document();
            PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream("Códigos generados.pdf"));
            doc.open();

            Barcode128 code = new Barcode128();

            while (rs.next()) {
//                doc.add(new Paragraph(rs.getString("Nombre") + " - " + rs.getString("Marca")));

                code.setCode(rs.getString("Nombre") + " - " + rs.getString("Marca") + " - " + rs.getString("Precio_unitario"));
                img = code.createImageWithBarcode(pdf.getDirectContent(), BaseColor.BLACK, BaseColor.BLACK);
//                img.scalePercent(120);
                doc.add(new Paragraph(" "));
                doc.add(img);
            }

            doc.close();

        } catch (FileNotFoundException | DocumentException ex) {

            Logger.getLogger(CodigoBar.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public static void main(String[] args) throws SQLException {
        CodigoBar a = new CodigoBar();
        a.generarCodigo();
    }

}
