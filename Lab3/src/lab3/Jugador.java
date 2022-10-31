/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author joseph
 */
public class Jugador {
    private String nombre;
    private String nacionalidad;
    private String raza;
    private String tipo;
    private String descripcion;
    private double estatura;
    private int anos;
    private double peso;
    private int hp;

    public Jugador(String nombre, String nacionalidad, String raza, String tipo, String descripcion, double estatura, int anos, double peso, int hp) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.raza = raza;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.estatura = estatura;
        this.anos = anos;
        this.peso = peso;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Jugador{" + " nombre= " + nombre + ", nacionalidad= " + nacionalidad + ", raza= " + raza + ", tipo= " + tipo + ", descripcion= " + descripcion + ", estatura= " + estatura + ", anos= " + anos + ", peso= " + peso + ", hp= " + hp + '}';
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public void print() {
        System.out.println("");
    }
}
