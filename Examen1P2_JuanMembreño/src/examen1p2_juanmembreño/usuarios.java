/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_juanmembreño;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class usuarios {
    private String nombre;
    private String apellido;
    private String correo;
    private int num;
    private String tipoplan;
    private ArrayList<servicios> ls=new ArrayList();
    private String usuario;
    private String contrasena;

    public usuarios() {
    }

    public usuarios(String nombre, String apellido, String correo, int num, String tipoplan, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.num = num;
        this.tipoplan = tipoplan;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTipoplan() {
        return tipoplan;
    }

    public void setTipoplan(String tipoplan) {
        this.tipoplan = tipoplan;
    }

    public ArrayList<servicios> getLs() {
        return ls;
    }

    public void setLs(ArrayList<servicios> ls) {
        this.ls = ls;
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
        return "usuarios{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", num=" + num + ", tipoplan=" + tipoplan + ", ls=" + ls + ", usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }
    
}
