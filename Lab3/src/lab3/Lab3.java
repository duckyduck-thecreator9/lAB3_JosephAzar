/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
                System.out.println("Ingrese el arma");
                String arma = lea.next();
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
                                Barbaro b = new Barbaro(nombre, nacionalidad, "Mediano", "Barbaro", descripcion,  estatura, anos, peso, hp, arma);
                                jugadores.add(b);
                            }
                            break;
                            
                            case 2: {
                                hp = 80 + r.nextInt(20);
                                Barbaro b = new Barbaro(nombre, nacionalidad, "Enano", "Barbaro", descripcion,  estatura, anos, peso, hp, arma);
                                jugadores.add(b);
                            }
                            break;
                            
                            case 3: {
                                hp = 50 + r.nextInt(20);
                                Barbaro b = new Barbaro(nombre, nacionalidad, "Elfo", "Barbaro", descripcion,  estatura, anos, peso, hp, arma);
                                jugadores.add(b);
                            }
                            break;
                            
                            case 4: {
                                hp = 40 + r.nextInt(25);
                                Barbaro b = new Barbaro(nombre, nacionalidad, "Humano", "Barbaro", descripcion,  estatura, anos, peso, hp, arma);
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
                                Clerigo c = new Clerigo(nombre, nacionalidad, "Mediano", "Clerigo", descripcion,  estatura, anos, peso, hp, arma);
                                jugadores.add(c);
                            }
                            break;
                            
                            case 2: {
                                hp = 80 + r.nextInt(20);
                                Clerigo c = new Clerigo(nombre, nacionalidad, "Enano", "Clerigo", descripcion,  estatura, anos, peso, hp, arma);
                                jugadores.add(c);
                            }
                            break;
                            
                            case 3: {
                                hp = 50 + r.nextInt(20);
                                Clerigo c = new Clerigo(nombre, nacionalidad, "Elfo", "Clerigo", descripcion,  estatura, anos, peso, hp, arma);
                                jugadores.add(c);
                            }
                            break;
                            
                            case 4: {
                                hp = 40 + r.nextInt(25);
                                Clerigo c = new Clerigo(nombre, nacionalidad, "Humano", "Clerigo", descripcion,  estatura, anos, peso, hp, arma);
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
                                Mago m = new Mago(nombre, nacionalidad, "Mediano", "Mago", descripcion,  estatura, anos, peso, hp, arma);
                                jugadores.add(m);
                            }
                            break;
                            
                            case 2: {
                                hp = 80 + r.nextInt(20);
                                Mago m = new Mago(nombre, nacionalidad, "Enano", "Mago", descripcion,  estatura, anos, peso, hp, arma);
                                jugadores.add(m);
                            }
                            break;
                            
                            case 3: {
                                hp = 50 + r.nextInt(20);
                                Mago m = new Mago(nombre, nacionalidad, "Elfo", "Mago", descripcion,  estatura, anos, peso, hp, arma);
                                jugadores.add(m);
                            }
                            break;
                            
                            case 4: {
                                hp = 40 + r.nextInt(25);
                                Mago m = new Mago(nombre, nacionalidad, "Humano", "Mago", descripcion,  estatura, anos, peso, hp, arma);
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
                                Picaro p = new Picaro(nombre, nacionalidad, "Mediano", "Picaro", descripcion,  estatura, anos, peso, hp, arma);
                                jugadores.add(p);
                            }
                            break;
                            
                            case 2: {
                                hp = 80 + r.nextInt(20);
                                Picaro p = new Picaro(nombre, nacionalidad, "Enano", "Picaro", descripcion,  estatura, anos, peso, hp, arma);
                                jugadores.add(p);
                            }
                            break;
                            
                            case 3: {
                                hp = 50 + r.nextInt(20);
                                Picaro p = new Picaro(nombre, nacionalidad, "Elfo", "Picaro", descripcion,  estatura, anos, peso, hp, arma);
                                jugadores.add(p);
                            }
                            break;
                            
                            case 4: {
                                hp = 40 + r.nextInt(25);
                                Picaro p = new Picaro(nombre, nacionalidad, "Humano", "Picaro", descripcion,  estatura, anos, peso, hp, arma);
                                jugadores.add(p);
                            }
                            break;
                    }
                }
        }
    }
    break;
    
        case 2: {
            
            String salida = "";
                for (Object t: jugadores) {
                    salida += "\n" + jugadores.indexOf(t) + ".- " + ((Jugador)t).toString() + "\n";
                    }
                    System.out.println(salida);
                }
        System.out.println("Que jugador quiere mejorar");
        int opcio = lea.nextInt();
        
            System.out.println("Que quiere modificar?\n"
                    + "1. nombre\n"
                    + "2. peso\n"
                    + "3. anos\n"
                    + "4. Descripcion\n"
                    + "5. arma\n"
                    + "6. nacionalidad\n"
                    + "7. Estatura\n");
            
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
                System.out.println("Ingrese el arma");
                String arma = lea.next();
                ((Jugador)jugadores.get(opcio)).setArma(arma);
                }
                break;
                
                case 6: {
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
                
                case 7: {
                System.out.println("Inserte la estatura");
                double estatura = lea.nextDouble();
                ((Jugador)jugadores.get(opcio)).setEstatura(estatura);
                }
                break;
        }
        break;
        
        case 3: {
            String salida = "";
                for (Object t: jugadores) {
                    salida += "\n" + jugadores.indexOf(t) + ".- " + ((Jugador)t).toString() + "\n";
                    }
                    System.out.println(salida);
                }
        break;
        
        case 4: {
            System.out.println("Que jugador desea eliminar?");
              String salida = "";
                for (Object t: jugadores) {
                    salida += "\n" + jugadores.indexOf(t) + ".- " + ((Jugador)t).toString() + "\n";
                    }
                    System.out.println(salida);                   
                    
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
