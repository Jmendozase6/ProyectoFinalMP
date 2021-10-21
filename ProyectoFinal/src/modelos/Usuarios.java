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
public class Usuarios {

    private static Usuarios uss;
    private int idUsuario;
    private String nombre;
    private String usuario;
    private String contrasena;

    private Usuarios() {

    }

    //El modelo singleton solo permite la instancia de solo un objeto a lo largo de todo el programa, 
    //cada instancia creada tendrá como referencia al mismo objeto
    public static Usuarios getInstance() {
        if (uss == null) {
            uss = new Usuarios();
        }
        return uss;
    }

    public int getIdUsuario() {
        return idUsuario;
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
        sb.append("Usuarios{idUsuario=").append(idUsuario);
        sb.append(", nombre=").append(nombre);
        sb.append(", usuario=").append(usuario);
        sb.append(", contrasena=").append(contrasena);
        sb.append('}');
        return sb.toString();
    }

}
