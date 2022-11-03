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
public class Barbaro extends Jugador{
    Random r = new Random();
    private int ac = 65;
    private int cs = 93;
    private int dg = 15 + r.nextInt(15);
    private String arma;
    private int xp;
    private String abilidad;

    public Barbaro(String nombre, String nacionalidad, String raza, String tipo, String descripcion, double estatura, int anos, double peso, int hp, String arma, int xp, String abilidad) {
        super(nombre, nacionalidad, raza, tipo, descripcion, estatura, anos, peso, hp);
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
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

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public void print() {
        System.out.println("ac: " + ac + " cs: : " + cs + " dg: " + dg + " Arma: " + arma + " cantidad de xp: " + xp + " Habilidad: " + abilidad);
    }

    public String getAbilidad() {
        return abilidad;
    }

    public void setAbilidad(String abilidad) {
        this.abilidad = abilidad;
    }

    
}
