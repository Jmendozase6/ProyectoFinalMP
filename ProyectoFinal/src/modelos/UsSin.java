/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Jhair
 */
public class UsSin {

    private static UsSin uss;
    private String nombre;
    private String usuario;
    private String contrasena;

    private UsSin() {

    }

    public static UsSin getInstance() {
        if (uss == null) {
            uss = new UsSin();
        }
        return uss;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UsSin{nombre=").append(nombre);
        sb.append(", usuario=").append(usuario);
        sb.append(", contrasena=").append(contrasena);
        sb.append('}');
        return sb.toString();
    }

}
