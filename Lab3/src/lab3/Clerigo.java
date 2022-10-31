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
public class Clerigo extends Jugador{
    Random r = new Random();
    private int ac = 40;
    private int cs = 97;
    private int dg = 5 + r.nextInt(15);
    private String dem;
    private String tipoinv;

    public Clerigo(String dem, String tipoinv, String nombre, String nacionalidad, String raza, String tipo, String descripcion, double estatura, int anos, double peso, int hp) {
        super(nombre, nacionalidad, raza, tipo, descripcion, estatura, anos, peso, hp);
        this.dem = dem;
        this.tipoinv = tipoinv;
    }

    

    @Override
    public String toString() {
        return "Picaro{" + " ac=" + ac + ", cs=" + cs + ", dg=" + dg + '}';
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

    public String getDem() {
        return dem;
    }

    public void setDem(String dem) {
        this.dem = dem;
    }

    public String getTipoinv() {
        return tipoinv;
    }

    public void setTipoinv(String tipoinv) {
        this.tipoinv = tipoinv;
    }

    @Override
    public void print() {
        System.out.println("ac: " + ac + " cs: : " + cs + " dg: " + dg + " Demonio: " + dem + " Tipo de invocacion" + tipoinv);
    }
}
