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
public class servicios {

    private String nombre;
    private int preciomen;
    private String clasificacin;
    private String fechalan;
    private String nombreempresaduena;
    private ArrayList<series> listas = new ArrayList();
    private ArrayList<miiseries> listam = new ArrayList();
    private ArrayList<peliculas> listap = new ArrayList();

    public servicios() {
    }

    public servicios(String nombre, int preciomen, String clasificacin, String fechalan, String nombreempresaduena) {
        this.nombre = nombre;
        this.preciomen = preciomen;
        this.clasificacin = clasificacin;
        this.fechalan = fechalan;
        this.nombreempresaduena = nombreempresaduena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPreciomen() {
        return preciomen;
    }

    public void setPreciomen(int preciomen) {
        this.preciomen = preciomen;
    }

    public String getClasificacin() {
        return clasificacin;
    }

    public void setClasificacin(String clasificacin) {
        this.clasificacin = clasificacin;
    }

    public String getFechalan() {
        return fechalan;
    }

    public void setFechalan(String fechalan) {
        this.fechalan = fechalan;
    }

    public String getNombreempresaduena() {
        return nombreempresaduena;
    }

    public void setNombreempresaduena(String nombreempresaduena) {
        this.nombreempresaduena = nombreempresaduena;
    }

    public ArrayList<series> getListas() {
        return listas;
    }

    public void setListas(ArrayList<series> listas) {
        this.listas = listas;
    }

    public ArrayList<miiseries> getListam() {
        return listam;
    }

    public void setListam(ArrayList<miiseries> listam) {
        this.listam = listam;
    }

    public ArrayList<peliculas> getListap() {
        return listap;
    }

    public void setListap(ArrayList<peliculas> listap) {
        this.listap = listap;
    }

    @Override
    public String toString() {
        return "servicios{" + "nombre=" + nombre + ", preciomen=" + preciomen + ", clasificacin=" + clasificacin + ", fechalan=" + fechalan + ", nombreempresaduena=" + nombreempresaduena + '}';
    }

}
