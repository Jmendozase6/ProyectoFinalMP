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

    private final String host = "smtp.gmail.com";
    private final String correoEnvia = "jhairm064@gmail.com";
    private final String contrasena = "jhairsernaque123";
    private final String destinatario = "jhairmendoza2003@gmail.com"; //Correo
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

            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(new DataHandler(new FileDataSource(ruta)));
            adjunto.setFileName(ruta);
            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(adjunto);

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoEnvia));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            message.setSubject(asunto);
            message.setText(mensaje);
            message.setContent(multiParte);

            Transport.send(message);
            JOptionPane.showMessageDialog(null, "El correo se envió correctamente.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void enviarEmail(String asunto, String mensaje) {

        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(correoEnvia, contrasena);
            }
        });

        try {

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoEnvia));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            message.setSubject(asunto);
            message.setText(mensaje);

            Transport.send(message);
            JOptionPane.showMessageDialog(null, "El correo se envió correctamente.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
