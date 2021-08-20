/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_juanmembreño;

/**
 *
 * @author usuario
 */
public class miiseries  {
    private String nombre;
    private int cantemporadas;
    private String genero;
    private int duracioncap;
   private String descrp;

    public miiseries() {
    }

    public miiseries(String nombre, int cantemporadas, String genero, int duracioncap, String descrp) {
        this.nombre = nombre;
        this.cantemporadas = cantemporadas;
        this.genero = genero;
        this.duracioncap = duracioncap;
        this.descrp = descrp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantemporadas() {
        return cantemporadas;
    }

    public void setCantemporadas(int cantemporadas) {
        this.cantemporadas = cantemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracioncap() {
        return duracioncap;
    }

    public void setDuracioncap(int duracioncap) {
        this.duracioncap = duracioncap;
    }

    public String getDescrp() {
        return descrp;
    }

    public void setDescrp(String descrp) {
        this.descrp = descrp;
    }

    @Override
    public String toString() {
        return "miiseries{" + "nombre=" + nombre + ", cantemporadas=" + cantemporadas + ", genero=" + genero + ", duracioncap=" + duracioncap + ", descrp=" + descrp + '}';
    }
   
}
