/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.modelos;

/**
 *
 * @author Jhair
 */
public class Usuario {

    private static Usuario uss;
    private int idUsuario;
    private String nombre;
    private String usuario;
    private String contrasena;
    private int tipoUsuario;

    private Usuario() {

    }

    /**
     * El modelo singleton solo permite la instancia de solo un objeto a lo
     * largo de todo el programa, cada instancia creada tendrá como referencia
     * al mismo objeto
     *
     * @return
     */
    public static Usuario getInstance() {
        if (uss == null) {
            uss = new Usuario();
        }
        return uss;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{idUsuario=").append(idUsuario);
        sb.append(", nombre=").append(nombre);
        sb.append(", usuario=").append(usuario);
        sb.append(", contrasena=").append(contrasena);
        sb.append(", tipoUsuario=").append(tipoUsuario);
        sb.append('}');
        return sb.toString();
    }

}
