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
public class peliculas extends servicios {
    private String nombre;
    private int duracion;
    private String fechaestreno;
    private String estrenostreaming;
    private String trama;

    public peliculas() {
    }

    public peliculas(String nombre, int duracion, String fechaestreno, String estrenostreaming, String trama) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.fechaestreno = fechaestreno;
        this.estrenostreaming = estrenostreaming;
        this.trama = trama;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getFechaestreno() {
        return fechaestreno;
    }

    public void setFechaestreno(String fechaestreno) {
        this.fechaestreno = fechaestreno;
    }

    public String getEstrenostreaming() {
        return estrenostreaming;
    }

    public void setEstrenostreaming(String estrenostreaming) {
        this.estrenostreaming = estrenostreaming;
    }

    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }

    @Override
    public String toString() {
        return "peliculas{" + "nombre=" + nombre + ", duracion=" + duracion + ", fechaestreno=" + fechaestreno + ", estrenostreaming=" + estrenostreaming + ", trama=" + trama + '}';
    }
    
}
