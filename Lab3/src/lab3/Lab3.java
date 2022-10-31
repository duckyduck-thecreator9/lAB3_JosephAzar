/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
//update
/**
 *
 * @author joseph
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Random r = new Random();
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        
        boolean running = true;
        while (running == true) {
        System.out.println("|-------------------------------|\n"
                         + "1. Crear jugador\n"
                         + "2. Modificar personaje\n"
                         + "3. Ver informacion de personajes\n"
                         + "4. Eliminar personajes\n"
                         + "5. Combate\n"
                         + "6. Salir\n"
                         + "|-------------------------------|");
        int opcion = lea.nextInt();
        
        switch (opcion) {
            case 1: {
                String nacionalidad = "";
                System.out.println("Igngrese el nombre del jugador");
                String nombre = lea.next();
                
                System.out.println("Cual nacionalidad va a queres\n\n"
                        + "1. Norfair\n"
                        + "2. Brinstar\n"
                        + "3. Maridia\n"
                        + "4. Zebes\n"
                        + "5. Crateria\n");
                int op1 = lea.nextInt();
                
                switch (op1) {
                    case 1: {
                        nacionalidad = "Norfair";
                    }
                    break;
                    
                    case 2: {
                        nacionalidad = "Brinstar";
                    }
                    break;
                    
                    case 3: {
                        nacionalidad = "Maridia";
                    }
                    break;
                    
                    case 4: {
                        nacionalidad = "Zebes";
                    }
                    break;
                    
                    case 5: {
                        nacionalidad = "Crateria";
                    }
                    break;
                }
                System.out.println("Inserte la estatura");
                double estatura = lea.nextDouble();
                System.out.println("Inserte el peso");
                double peso = lea.nextDouble();
                System.out.println("Ingrese los anos del jugador");//no tengo la enie
                int anos = lea.nextInt();
                System.out.println("Ingrese la descripcion de el jugador (no se puede usar espacios)");
                String descripcion = lea.next();
                System.out.println("Que clase va a ser?\n\n"
                        + "1. Barbaro\n"
                        + "2. Clerigo\n"
                        + "3. Mago\n"
                        + "4. Picaro\n");
                int op2 = lea.nextInt();
                int hp = 0;
                        
                switch (op2) {
                    case 1: {
                        System.out.println("Cual raza va a queres?\n\n"
                                + "1. Mediano\n"
                                + "2. Enano\n"
                                + "3. Elfo\n"
                                + "4. Humano\n");
                        int op = lea.nextInt();
                        
                        switch (op) {
                            case 1: {
                                hp = 50 + r.nextInt(10);
                                System.out.println("Cual arma va a queres\n"
                                        + "1. Pesada\n"
                                        + "2. Ligera\n"
                                        + "3. Escudo");
                                int x = lea.nextInt();
                                String arma = "";
                                if (x == 1) {
                                   arma = "Pesada"; 
                                }
                                if (x == 2) {
                                   arma = "Ligera"; 
                                }
                                if (x == 3) {
                                   arma = "Escudo"; 
                                }
                                System.out.println("Ingrese la cantidad de xp");
                                int xp = lea.nextInt();
                                Barbaro b = new Barbaro(nombre, nacionalidad, "Mediano", "Barbaro", descripcion,  estatura, anos, peso, hp, arma, xp);
                                b.setArma(arma);
                                b.setXp(xp);
                                jugadores.add(b);
                            }
                            break;
                            
                            case 2: {
                                hp = 80 + r.nextInt(20);
                                System.out.println("Ingrese el arma");
                                String arma = lea.next();
                                System.out.println("Ingrese la cantidad de xp");
                                int xp = lea.nextInt();
                                Barbaro b = new Barbaro(nombre, nacionalidad, "Mediano", "Barbaro", descripcion,  estatura, anos, peso, hp, arma, xp);
                                b.setArma(arma);
                                b.setXp(xp);
                                jugadores.add(b);
                            }
                            break;
                            
                            case 3: {
                                hp = 50 + r.nextInt(20);
                                System.out.println("Ingrese el arma");
                                String arma = lea.next();
                                System.out.println("Ingrese la cantidad de xp");
                                int xp = lea.nextInt();
                                Barbaro b = new Barbaro(nombre, nacionalidad, "Mediano", "Barbaro", descripcion,  estatura, anos, peso, hp, arma, xp);
                                b.setArma(arma);
                                b.setXp(xp);
                                jugadores.add(b);
                            }
                            break;
                            
                            case 4: {
                                hp = 40 + r.nextInt(25);
                                System.out.println("Ingrese el arma");
                                String arma = lea.next();
                                System.out.println("Ingrese la cantidad de xp");
                                int xp = lea.nextInt();
                                Barbaro b = new Barbaro(nombre, nacionalidad, "Mediano", "Barbaro", descripcion,  estatura, anos, peso, hp, arma, xp);
                                b.setArma(arma);
                                b.setXp(xp);
                                jugadores.add(b);
                            }
                            break;
                        }
                        
                    }
                    break;
                    
                    case 2: {
                        System.out.println("Cual raza va a queres?\n\n"
                                + "1. Mediano\n"
                                + "2. Enano\n"
                                + "3. Elfo\n"
                                + "3. Humano\n");
                        int op = lea.nextInt();
                        
                        switch (op) {
                            case 1: {
                                hp = 50 + r.nextInt(10);
                                System.out.println("En que demonio o dios es creyente?");
                                String dem = lea.next();
                                System.out.println("Cual es el tipo de invocacion");
                                String tipoinv = lea.next();
                                Clerigo c = new Clerigo(dem, tipoinv, nombre, nacionalidad, "Mediano", "Clerigo", descripcion,  estatura, anos, peso, hp);
                                c.setTipoinv(tipoinv);
                                c.setDem(dem);
                                jugadores.add(c);
                            }
                            break;
                            
                            case 2: {
                                hp = 80 + r.nextInt(20);
                                String dem = lea.next();
                                System.out.println("Cual es el tipo de invocacion");
                                String tipoinv = lea.next();
                                Clerigo c = new Clerigo(dem, tipoinv, nombre, nacionalidad, "Mediano", "Clerigo", descripcion,  estatura, anos, peso, hp);
                                c.setTipoinv(tipoinv);
                                c.setDem(dem);
                                jugadores.add(c);
                            }
                            break;
                            
                            case 3: {
                                hp = 50 + r.nextInt(20);
                                String dem = lea.next();
                                System.out.println("Cual es el tipo de invocacion");
                                String tipoinv = lea.next();
                                Clerigo c = new Clerigo(dem, tipoinv, nombre, nacionalidad, "Mediano", "Clerigo", descripcion,  estatura, anos, peso, hp);
                                c.setTipoinv(tipoinv);
                                c.setDem(dem);
                                jugadores.add(c);
                            }
                            break;
                            
                            case 4: {
                                hp = 40 + r.nextInt(25);
                                String dem = lea.next();
                                System.out.println("Cual es el tipo de invocacion");
                                String tipoinv = lea.next();
                                Clerigo c = new Clerigo(dem, tipoinv, nombre, nacionalidad, "Mediano", "Clerigo", descripcion,  estatura, anos, peso, hp);
                                c.setTipoinv(tipoinv);
                                c.setDem(dem);
                                jugadores.add(c);
                            }
                            break;
                        }
                    }
                    break;
                    
                    case 3: {
                        System.out.println("Cual raza va a queres?\n\n"
                                + "1. Mediano\n"
                                + "2. Enano\n"
                                + "3. Elfo\n"
                                + "4. Humano\n");
                        int op = lea.nextInt();
                        
                        switch (op) {
                            case 1: {
                                hp = 50 + r.nextInt(10);
                                System.out.println("Que tipo de magia va a usar?\n"
                                        + "1. Magoblanco\n"
                                        + "2. Magonegro\n"
                                        + "3. sanador\n");
                                int opi = lea.nextInt();
                                String magia = "";
                                if (opi == 1) {
                                    magia = "MagoBlanco";
                                }
                                if (opi == 2) {
                                    magia = "MagoBlanco";
                                }
                                if (opi == 3) {
                                    magia = "MagoBlanco";
                                }
                                
                                Mago m = new Mago(nombre, nacionalidad, "Mediano", "Mago", descripcion,  estatura, anos, peso, hp, magia);
                                m.setMagia(magia);
                                jugadores.add(m);
                            }
                            break;
                            
                            case 2: {
                                hp = 80 + r.nextInt(20);
                                System.out.println("Que tipo de magia va a usar?\n"
                                        + "1. Magoblanco\n"
                                        + "2. Magonegro\n"
                                        + "3. sanador\n");
                                int opi = lea.nextInt();
                                String magia = "";
                                if (opi == 1) {
                                    magia = "MagoBlanco";
                                }
                                if (opi == 2) {
                                    magia = "MagoBlanco";
                                }
                                if (opi == 3) {
                                    magia = "MagoBlanco";
                                }
                                
                                Mago m = new Mago(nombre, nacionalidad, "Mediano", "Mago", descripcion,  estatura, anos, peso, hp, magia);
                                m.setMagia(magia);
                                jugadores.add(m);
                            }
                            break;
                            
                            case 3: {
                                hp = 50 + r.nextInt(20);
                                System.out.println("Que tipo de magia va a usar?\n"
                                        + "1. Magoblanco\n"
                                        + "2. Magonegro\n"
                                        + "3. sanador\n");
                                int opi = lea.nextInt();
                                String magia = "";
                                if (opi == 1) {
                                    magia = "MagoBlanco";
                                }
                                if (opi == 2) {
                                    magia = "MagoBlanco";
                                }
                                if (opi == 3) {
                                    magia = "MagoBlanco";
                                }
                                
                                Mago m = new Mago(nombre, nacionalidad, "Mediano", "Mago", descripcion,  estatura, anos, peso, hp, magia);
                                m.setMagia(magia);
                                jugadores.add(m);
                            }
                            break;
                            
                            case 4: {
                                hp = 40 + r.nextInt(25);
                                System.out.println("Que tipo de magia va a usar?\n"
                                        + "1. Magoblanco\n"
                                        + "2. Magonegro\n"
                                        + "3. sanador\n");
                                int opi = lea.nextInt();
                                String magia = "";
                                if (opi == 1) {
                                    magia = "MagoBlanco";
                                }
                                if (opi == 2) {
                                    magia = "MagoBlanco";
                                }
                                if (opi == 3) {
                                    magia = "MagoBlanco";
                                }
                                
                                Mago m = new Mago(nombre, nacionalidad, "Mediano", "Mago", descripcion,  estatura, anos, peso, hp, magia);
                                m.setMagia(magia);
                                jugadores.add(m);
                            }
                            break;
                    }
                    break;
                    }
                    
                    case 4: {
                        System.out.println("Cual raza va a queres?\n\n"
                                + "1. Mediano\n"
                                + "2. Enano\n"
                                + "3. Elfo\n"
                                + "4. Humano\n");
                        int op = lea.nextInt();
                        
                        switch (op) {
                            case 1: {
                                hp = 50 + r.nextInt(10);
                                System.out.println("Cual instrumento va a usar?\n"
                                        + "1. Amuleto\n"
                                        + "2. Arma\n"
                                        + "2. Piedra antigua\n");
                                String instrumento  = "";
                                int opi = lea.nextInt();
                                if (opi == 1) {
                                    instrumento = "Amuleto";
                                }
                                if (opi == 2) {
                                    instrumento = "Arma";
                                }
                                if (opi == 3) {
                                    instrumento = "PiedraAntigua";
                                }
                                System.out.println("Ingrese la cantidad de robos exitosos");
                                int cantrob = lea.nextInt();
                                Picaro p = new Picaro(nombre, nacionalidad, "Mediano", "Picaro", descripcion,  estatura, anos, peso, hp, instrumento, cantrob);
                                p.setInstrumento(instrumento);
                                p.setCantrob(cantrob);
                                jugadores.add(p);
                            }
                            break;
                            
                            case 2: {
                                hp = 80 + r.nextInt(20);
                                System.out.println("Cual instrumento va a usar?\n"
                                        + "1. Amuleto\n"
                                        + "2. Arma\n"
                                        + "2. Piedra antigua\n");
                                String instrumento  = "";
                                int opi = lea.nextInt();
                                if (opi == 1) {
                                    instrumento = "Amuleto";
                                }
                                if (opi == 2) {
                                    instrumento = "Arma";
                                }
                                if (opi == 3) {
                                    instrumento = "PiedraAntigua";
                                }
                                System.out.println("Ingrese la cantidad de robos exitosos");
                                int cantrob = lea.nextInt();
                                Picaro p = new Picaro(nombre, nacionalidad, "Mediano", "Picaro", descripcion,  estatura, anos, peso, hp, instrumento, cantrob);
                                p.setInstrumento(instrumento);
                                p.setCantrob(cantrob);
                                jugadores.add(p);
                            }
                            break;
                            
                            case 3: {
                                hp = 50 + r.nextInt(20);
                                System.out.println("Cual instrumento va a usar?\n"
                                        + "1. Amuleto\n"
                                        + "2. Arma\n"
                                        + "2. Piedra antigua\n");
                                String instrumento  = "";
                                int opi = lea.nextInt();
                                if (opi == 1) {
                                    instrumento = "Amuleto";
                                }
                                if (opi == 2) {
                                    instrumento = "Arma";
                                }
                                if (opi == 3) {
                                    instrumento = "PiedraAntigua";
                                }
                                System.out.println("Ingrese la cantidad de robos exitosos");
                                int cantrob = lea.nextInt();
                                Picaro p = new Picaro(nombre, nacionalidad, "Mediano", "Picaro", descripcion,  estatura, anos, peso, hp, instrumento, cantrob);
                                p.setInstrumento(instrumento);
                                p.setCantrob(cantrob);
                                jugadores.add(p);
                            }
                            break;
                            
                            case 4: {
                                hp = 40 + r.nextInt(25);
                                System.out.println("Cual instrumento va a usar?\n"
                                        + "1. Amuleto\n"
                                        + "2. Arma\n"
                                        + "2. Piedra antigua\n");
                                String instrumento  = "";
                                int opi = lea.nextInt();
                                if (opi == 1) {
                                    instrumento = "Amuleto";
                                }
                                if (opi == 2) {
                                    instrumento = "Arma";
                                }
                                if (opi == 3) {
                                    instrumento = "PiedraAntigua";
                                }
                                System.out.println("Ingrese la cantidad de robos exitosos");
                                int cantrob = lea.nextInt();
                                Picaro p = new Picaro(nombre, nacionalidad, "Mediano", "Picaro", descripcion,  estatura, anos, peso, hp, instrumento, cantrob);
                                p.setInstrumento(instrumento);
                                p.setCantrob(cantrob);
                                jugadores.add(p);
                            }
                            break;
                    }
                }
        }
    }
    break;
    
        case 2: {
            
                for (Object t: jugadores) {
                    
                    System.out.println("\n" + jugadores.indexOf(t) + ".- " + ((Jugador)t).toString());
                    if (jugadores.get(jugadores.indexOf(t)) instanceof Barbaro) {
                    ((Barbaro)t).print();
                    }
                    if (jugadores.get(jugadores.indexOf(t)) instanceof Clerigo) {
                    ((Clerigo)t).print();
                    }
                    if (jugadores.get(jugadores.indexOf(t)) instanceof Mago) {
                    ((Mago)t).print();
                    }
                    if (jugadores.get(jugadores.indexOf(t)) instanceof Picaro) {
                    ((Picaro)t).print();
                    }
                    System.out.println("");
                    }

         
        System.out.println("Que jugador quiere modificar");
        int opcio = lea.nextInt();
        
        if (jugadores.get(opcio) instanceof Picaro) {
            System.out.println("Que quiere modificar?\n"
                    + "1. nombre\n"
                    + "2. peso\n"
                    + "3. anos\n"
                    + "4. Descripcion\n"
                    + "5. nacionalidad\n"
                    + "6. Estatura\n"
                    + "7. Instrumeno\n"
                    + "8. Cantidad de robos");
            
            int opi = lea.nextInt();
            
            switch (opi) {
                case 1: {
                System.out.println("Ingrese el nombre");
                String nombre = lea.next();
                ((Jugador)jugadores.get(opcio)).setNombre(nombre);
                }
                break;
                
                case 2: {
                System.out.println("Ingrese el peso");
                double peso = lea.nextDouble();
                ((Jugador)jugadores.get(opcio)).setPeso(peso);
                }
                break;
                
                case 3: {
                System.out.println("Ingrese los anos");
                int anos = lea.nextInt();
                ((Jugador)jugadores.get(opcio)).setAnos(anos);
                }
                break;
                
                case 4: {
                System.out.println("Ingrese la descripcion de el jugador (no se puede usar espacios)");
                String descripcion = lea.next();
                ((Jugador)jugadores.get(opcio)).setDescripcion(descripcion);
                }
                break;
                
                case 5: {
                System.out.println("Cual raza va a queres?\n\n"
                                + "1. Mediano\n"
                                + "2. Enano\n"
                                + "3. Elfo\n"
                                + "4. Humano\n");
                int op2 = lea.nextInt();
                switch (op2) {
                    case 1: {
                        ((Jugador)jugadores.get(opcio)).setNacionalidad("Mediano");
                    }
                    break;
                    
                    case 2: {
                        ((Jugador)jugadores.get(opcio)).setNacionalidad("Enano");
                    }
                    break;
                    
                    case 3: {
                        ((Jugador)jugadores.get(opcio)).setNacionalidad("Elfo");
                    }
                    break;
                    
                    case 4: {
                        ((Jugador)jugadores.get(opcio)).setNacionalidad("Humano");
                    }
                    break;
                }
                }
                break;
                
                case 6: {
                System.out.println("Inserte la estatura");
                double estatura = lea.nextDouble();
                ((Jugador)jugadores.get(opcio)).setEstatura(estatura);
                }
                break;
                
                case 7: {
                    System.out.println("Cual instrumento va a usar?\n"
                                        + "1. Amuleto\n"
                                        + "2. Arma\n"
                                        + "2. Piedra antigua\n");
                                String instrumento  = "";
                                int opila = lea.nextInt();
                                if (opila == 1) {
                                    instrumento = "Amuleto";
                                }
                                if (opila == 2) {
                                    instrumento = "Arma";
                                }
                                if (opila == 3) {
                                    instrumento = "PiedraAntigua";
                                }
                    ((Picaro)jugadores.get(opcio)).setInstrumento(instrumento);
                }
                break;
                
                case 8: {
                    System.out.println("Ingrese la cantidad de robos exitosos");
                    int cantrob = lea.nextInt();
                    ((Picaro)jugadores.get(opcio)).setCantrob(cantrob);
                }
            }
        }
        
        if (jugadores.get(opcio) instanceof Mago) {
            System.out.println("Que quiere modificar?\n"
                    + "1. nombre\n"
                    + "2. peso\n"
                    + "3. anos\n"
                    + "4. Descripcion\n"
                    + "5. nacionalidad\n"
                    + "6. Estatura\n"
                    + "7. Magia\n");
            
            int opir = lea.nextInt();
            
            switch (opir) {
                case 1: {
                System.out.println("Ingrese el nombre");
                String nombre = lea.next();
                ((Jugador)jugadores.get(opcio)).setNombre(nombre);
                }
                break;
                
                case 2: {
                System.out.println("Ingrese el peso");
                double peso = lea.nextDouble();
                ((Jugador)jugadores.get(opcio)).setPeso(peso);
                }
                break;
                
                case 3: {
                System.out.println("Ingrese los anos");
                int anos = lea.nextInt();
                ((Jugador)jugadores.get(opcio)).setAnos(anos);
                }
                break;
                
                case 4: {
                System.out.println("Ingrese la descripcion de el jugador (no se puede usar espacios)");
                String descripcion = lea.next();
                ((Jugador)jugadores.get(opcio)).setDescripcion(descripcion);
                }
                break;
                
                case 5: {
                System.out.println("Cual raza va a queres?\n\n"
                                + "1. Mediano\n"
                                + "2. Enano\n"
                                + "3. Elfo\n"
                                + "4. Humano\n");
                int op2 = lea.nextInt();
                switch (op2) {
                    case 1: {
                        ((Jugador)jugadores.get(opcio)).setNacionalidad("Mediano");
                    }
                    break;
                    
                    case 2: {
                        ((Jugador)jugadores.get(opcio)).setNacionalidad("Enano");
                    }
                    break;
                    
                    case 3: {
                        ((Jugador)jugadores.get(opcio)).setNacionalidad("Elfo");
                    }
                    break;
                    
                    case 4: {
                        ((Jugador)jugadores.get(opcio)).setNacionalidad("Humano");
                    }
                    break;
                }
                }
                break;
                
                case 6: {
                System.out.println("Inserte la estatura");
                double estatura = lea.nextDouble();
                ((Jugador)jugadores.get(opcio)).setEstatura(estatura);
                }
                break;
                
                case 7: {
                    System.out.println("Que tipo de magia va a usar?\n"
                                        + "1. Magoblanco\n"
                                        + "2. Magonegro\n"
                                        + "3. sanador\n");
                                int opil = lea.nextInt();
                                String magia = "";
                                if (opil == 1) {
                                    magia = "MagoBlanco";
                                }
                                if (opil == 2) {
                                    magia = "MagoBlanco";
                                }
                                if (opil == 3) {
                                    magia = "MagoBlanco";
                                }
                }
                break;
            }
        }
        
        if (jugadores.get(opcio) instanceof Barbaro) {
            System.out.println("Que quiere modificar?\n"
                    + "1. nombre\n"
                    + "2. peso\n"
                    + "3. anos\n"
                    + "4. Descripcion\n"
                    + "5. nacionalidad\n"
                    + "6. Estatura\n"
                    + "7. Arma\n"
                    + "8. xp");
            
            int opia = lea.nextInt();
            
            switch (opia) {
                case 1: {
                System.out.println("Ingrese el nombre");
                String nombre = lea.next();
                ((Jugador)jugadores.get(opcio)).setNombre(nombre);
                }
                break;
                
                case 2: {
                System.out.println("Ingrese el peso");
                double peso = lea.nextDouble();
                ((Jugador)jugadores.get(opcio)).setPeso(peso);
                }
                break;
                
                case 3: {
                System.out.println("Ingrese los anos");
                int anos = lea.nextInt();
                ((Jugador)jugadores.get(opcio)).setAnos(anos);
                }
                break;
                
                case 4: {
                System.out.println("Ingrese la descripcion de el jugador (no se puede usar espacios)");
                String descripcion = lea.next();
                ((Jugador)jugadores.get(opcio)).setDescripcion(descripcion);
                }
                break;
                
                case 5: {
                System.out.println("Cual raza va a queres?\n\n"
                                + "1. Mediano\n"
                                + "2. Enano\n"
                                + "3. Elfo\n"
                                + "4. Humano\n");
                int op2 = lea.nextInt();
                switch (op2) {
                    case 1: {
                        ((Jugador)jugadores.get(opcio)).setNacionalidad("Mediano");
                    }
                    break;
                    
                    case 2: {
                        ((Jugador)jugadores.get(opcio)).setNacionalidad("Enano");
                    }
                    break;
                    
                    case 3: {
                        ((Jugador)jugadores.get(opcio)).setNacionalidad("Elfo");
                    }
                    break;
                    
                    case 4: {
                        ((Jugador)jugadores.get(opcio)).setNacionalidad("Humano");
                    }
                    break;
                }
                }
                break;
                
                case 6: {
                System.out.println("Inserte la estatura");
                double estatura = lea.nextDouble();
                ((Jugador)jugadores.get(opcio)).setEstatura(estatura);
                }
                break;
                
                case 7: {
                    System.out.println("Cual arma va a queres\n"
                                        + "1. Pesada\n"
                                        + "2. Ligera\n"
                                        + "3. Escudo");
                                int x = lea.nextInt();
                                String arma = "";
                                if (x == 1) {
                                   arma = "Pesada"; 
                                }
                                if (x == 2) {
                                   arma = "Ligera"; 
                                }
                                if (x == 3) {
                                   arma = "Escudo"; 
                                }
                    ((Barbaro)jugadores.get(opcio)).setArma(arma);
                }
                break;
                
                case 8: {
                    System.out.println("Ingrese la cantidad de xp");
                    int xp = lea.nextInt();
                    ((Barbaro)jugadores.get(opcio)).setXp(xp);
                }
            }
        }
        
        if (jugadores.get(opcio) instanceof Clerigo) {
            System.out.println("Que quiere modificar?\n"
                    + "1. nombre\n"
                    + "2. peso\n"
                    + "3. anos\n"
                    + "4. Descripcion\n"
                    + "5. nacionalidad\n"
                    + "6. Estatura\n"
                    + "7. Dios o demonio\n"
                    + "8 tipo de invocacion");
            
            int opin = lea.nextInt();
            
            switch (opin) {
                case 1: {
                System.out.println("Ingrese el nombre");
                String nombre = lea.next();
                ((Jugador)jugadores.get(opcio)).setNombre(nombre);
                }
                break;
                
                case 2: {
                System.out.println("Ingrese el peso");
                double peso = lea.nextDouble();
                ((Jugador)jugadores.get(opcio)).setPeso(peso);
                }
                break;
                
                case 3: {
                System.out.println("Ingrese los anos");
                int anos = lea.nextInt();
                ((Jugador)jugadores.get(opcio)).setAnos(anos);
                }
                break;
                
                case 4: {
                System.out.println("Ingrese la descripcion de el jugador (no se puede usar espacios)");
                String descripcion = lea.next();
                ((Jugador)jugadores.get(opcio)).setDescripcion(descripcion);
                }
                break;
                
                case 5: {
                System.out.println("Cual raza va a queres?\n\n"
                                + "1. Mediano\n"
                                + "2. Enano\n"
                                + "3. Elfo\n"
                                + "4. Humano\n");
                int op2 = lea.nextInt();
                switch (op2) {
                    case 1: {
                        ((Jugador)jugadores.get(opcio)).setNacionalidad("Mediano");
                    }
                    break;
                    
                    case 2: {
                        ((Jugador)jugadores.get(opcio)).setNacionalidad("Enano");
                    }
                    break;
                    
                    case 3: {
                        ((Jugador)jugadores.get(opcio)).setNacionalidad("Elfo");
                    }
                    break;
                    
                    case 4: {
                        ((Jugador)jugadores.get(opcio)).setNacionalidad("Humano");
                    }
                    break;
                }
                }
                break;
                
                case 6: {
                System.out.println("Inserte la estatura");
                double estatura = lea.nextDouble();
                ((Jugador)jugadores.get(opcio)).setEstatura(estatura);
                }
                break;
                
                case 7: {
                    System.out.println("Ingrese el dios o demonio que quiera odificar");
                    String dem = lea.next();
                    ((Clerigo)jugadores.get(opcio)).setDem(dem);
                }
                break;
                case 8: {
                    System.out.println("Ingrese el tipo de invocacion");
                    String invo = lea.next();
                    ((Clerigo)jugadores.get(opcio)).setTipoinv(invo);
                }
        }
        break;
        }       
        
        }
        break;
        
        case 3: {
            for (Object t: jugadores) {
                    
                    System.out.println("\n" + jugadores.indexOf(t) + ".- " + ((Jugador)t).toString());
                    if (jugadores.get(jugadores.indexOf(t)) instanceof Barbaro) {
                    ((Barbaro)t).print();
                    }
                    if (jugadores.get(jugadores.indexOf(t)) instanceof Clerigo) {
                    ((Clerigo)t).print();
                    }
                    if (jugadores.get(jugadores.indexOf(t)) instanceof Mago) {
                    ((Mago)t).print();
                    }
                    if (jugadores.get(jugadores.indexOf(t)) instanceof Picaro) {
                    ((Picaro)t).print();
                    }
                    System.out.println("");
                    }
                }
        break;
        
        case 4: {
            System.out.println("Que jugador desea eliminar?");
              for (Object t: jugadores) {
                    
                    System.out.println("\n" + jugadores.indexOf(t) + ".- " + ((Jugador)t).toString());
                    if (jugadores.get(jugadores.indexOf(t)) instanceof Barbaro) {
                    ((Barbaro)t).print();
                    }
                    if (jugadores.get(jugadores.indexOf(t)) instanceof Clerigo) {
                    ((Clerigo)t).print();
                    }
                    if (jugadores.get(jugadores.indexOf(t)) instanceof Mago) {
                    ((Mago)t).print();
                    }
                    if (jugadores.get(jugadores.indexOf(t)) instanceof Picaro) {
                    ((Picaro)t).print();
                    }
                    System.out.println("");
                    }                  
                    
                    int opc = lea.nextInt();
                    jugadores.remove(opc);
                }  
        break;
        
        case 5: {
              //Otro dia men que hueva  
        }
        break;
        
        case 6: {
               System.out.println("Saliendo del programa");
               running = false;
        }
        break;
      }
    }
  }
}
