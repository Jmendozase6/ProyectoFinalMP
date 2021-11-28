package com.proyecto.vista.email;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class EnviarEmail {

    private final String host = "smtp.gmail.com";                       //Servidor
    private final String correoEnvia = "jhairm064@gmail.com";           //Cuenta que envía el correo
    private final String contrasena = "jhairsernaque123";               //Contraseña
    private final String destinatario = "ManagementSySout@gmail.com";   //Correo destinatario

    Properties prop = new Properties();

    public EnviarEmail() {
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", host);
        prop.put("mail.smtp.port", "587");
    }

    public void enviarEmail(String asunto, String mensaje, String ruta) {

        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(correoEnvia, contrasena);
            }
        });

        try {

            BodyPart bpAdjunto = new MimeBodyPart();
            BodyPart bpMensaje = new MimeBodyPart();
            bpMensaje.setText(mensaje);

            bpAdjunto.setDataHandler(new DataHandler(new FileDataSource(ruta)));
            bpAdjunto.setFileName(ruta);

            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(bpMensaje);
            multiParte.addBodyPart(bpAdjunto);

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoEnvia));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));

            message.setSubject(asunto);

            message.setContent(multiParte);

            Transport.send(message);
            JOptionPane.showMessageDialog(null, "El correo se envió correctamente.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
