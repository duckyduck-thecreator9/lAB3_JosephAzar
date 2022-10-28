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

    public Barbaro(String nombre, String nacionalidad, String raza, String tipo, String descripcion, double estatura, int anos, double peso, int hp, String arma) {
        super(nombre, nacionalidad, raza, tipo, descripcion, estatura, anos, peso, hp, arma);
    }

    @Override
    public String toString() {
        return "Picaro{" +" ac=" + ac + ", cs=" + cs + ", dg=" + dg + '}';
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

    

    
}
