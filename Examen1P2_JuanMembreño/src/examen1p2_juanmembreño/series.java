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
public class series {
    private String nombre;
    private int cantetm;
   private String clasificaion;
   private int anoestreno;
   private int cantactorees;

    public series() {
    }

    public series(String nombre, int cantetm, String clasificaion, int anoestreno, int cantactorees) {
        this.nombre = nombre;
        this.cantetm = cantetm;
        this.clasificaion = clasificaion;
        this.anoestreno = anoestreno;
        this.cantactorees = cantactorees;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantetm() {
        return cantetm;
    }

    public void setCantetm(int cantetm) {
        this.cantetm = cantetm;
    }

    public String getClasificaion() {
        return clasificaion;
    }

    public void setClasificaion(String clasificaion) {
        this.clasificaion = clasificaion;
    }

    public int getAnoestreno() {
        return anoestreno;
    }

    public void setAnoestreno(int anoestreno) {
        this.anoestreno = anoestreno;
    }

    public int getCantactorees() {
        return cantactorees;
    }

    public void setCantactorees(int cantactorees) {
        this.cantactorees = cantactorees;
    }

    @Override
    public String toString() {
        return "series{" + "nombre=" + nombre + ", cantetm=" + cantetm + ", clasificaion=" + clasificaion + ", anoestreno=" + anoestreno + ", cantactorees=" + cantactorees + '}';
    }
   
}
