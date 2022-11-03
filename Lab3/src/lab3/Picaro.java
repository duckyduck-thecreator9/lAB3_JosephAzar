/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.util.Random;
/**
 *
 * @author joseph
 */
public class Picaro extends Jugador{
    Random r = new Random();
    private int ac = 50;
    private int cs = 80;
    private int dg = 15 + r.nextInt(10);;
    private String instrumento;
    private int cantrob;
    private String Habilidad;

    public Picaro(String nombre, String nacionalidad, String raza, String tipo, String descripcion, double estatura, int anos, double peso, int hp, String instrumento, int cantrob, String Habilidad) {
        super(nombre, nacionalidad, raza, tipo, descripcion, estatura, anos, peso, hp);
    }
  
    public int getCs() {
        return cs;
    }

    public void setCs(int cs) {
        this.cs = cs;
    }

    public int getDg() {
        return dg;
    }

    public void setDg(int dg) {
        this.dg = dg;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getCantrob() {
        return cantrob;
    }

    public void setCantrob(int cantrob) {
        this.cantrob = cantrob;
    }

    public String getHabilidad() {
        return Habilidad;
    }

    public void setHabilidad(String Habilidad) {
        this.Habilidad = Habilidad;
    }
    

    @Override
    public void print() {
        System.out.println("ac: " + ac + " cs: : " + cs + " dg: " + dg + " Instrumento: " + instrumento + " Cantidades de robos: " + cantrob + " Habilidad: " + Habilidad);
    }
}
