/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_diegovarela;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Lab2_DiegoVarela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random=new Random();
        ArrayList<Personaje> lista = new ArrayList();
        lista.add(new Personaje("Barbaro", "Claus", "Enano", "90cm", "El no reparte regalos", "Brinstar", "60lbs", "40"));
        lista.add(new Personaje("Mago", "Anakin", "Humano", "2mts", "El elegido", "Crateria", "80lbs", "17"));
        lista.add(new Personaje("Clerigo", "Ragnar", "Mediano", "3.5mts", "el sabio", "Maridia", "60lbs", "100"));
        lista.add(new Personaje("Picaro", "Clept", "Elfo", "45cm", "El te robo la novia", "Brinstar", "79lbs", "5"));
        char resp = 's';
        int p = 3;
        while (resp == 's' || resp == 'S') {
            System.out.println("Menu");
            System.out.println("1) Creacion de personaje");
            System.out.println("2) Modificar de personajes");
            System.out.println("3) Ver atribuutos de personaje");
            System.out.println("4) Eliminar Personajes");
            System.out.println("5) Combate");
            System.out.println("6) Salida");
            int opcion = entrada.nextInt();
            switch (opcion) {
                //Opcion de crear personaje
                case 1:
                    System.out.println("Ingrese la clase personaje que desea ser(Mago,Barbaro,Clerigo O Picaro)");
                    String clase = entrada.next();
                    System.out.println("Ingrese el nombre del personaje sin espacios");
                    String nombre = entrada.next();
                    System.out.println("Ingrese la raza(Mediano, Enano, Elfo y Humano)");
                    String raza = entrada.next();
                    System.out.println("Ingrese la descripcion del personaje");
                    entrada = new Scanner(System.in);
                    String des = entrada.nextLine();
                    des = entrada.nextLine();
                    System.out.println("Ingrese la estatura");
                    String estatura = entrada.next();
                    System.out.println("Ingrese el peso");
                    String peso = entrada.next();
                    System.out.println("Ingrese la nacionalidad(Norfair ,Brinstar , Maridia,Zebes ,Crateria)");
                    String nac = entrada.next();
                    System.out.println("Ingrese la edad");
                    String años = entrada.next();
                    lista.add(new Personaje(clase, nombre, raza, estatura, des, nac, peso, años));
                    System.out.println(lista.get(p++));
                    break;
                //Opcion de modificar
                case 2:
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(((Personaje) lista.get(i)));
                    }
                    System.out.println("Que posicion desea modificar");
                    int pos = entrada.nextInt();
                    //menu de modificaciones
                    System.out.println("¿Que desea modificar?");
                    System.out.println("1) Clase");
                    System.out.println("2) Raza");
                    System.out.println("3) Nombre");
                    System.out.println("4) Nacionalidad");
                    System.out.println("5) Años");
                    System.out.println("6) Peso");
                    System.out.println("7) Descripcion");
                    System.out.println("8) Estatura");
                    int opcion2 = entrada.nextInt();
                    switch (opcion2) {
                        case 1:
                            System.out.println("Escriba ahora");
                            String cl = entrada.next();
                            ((Personaje) lista.get(pos)).setclase(cl);
                            break;
                        case 2:
                            System.out.println("Escriba ahora");
                            String rac = entrada.next();
                            ((Personaje) lista.get(pos)).setraza(rac);
                            break;
                        case 3:
                            System.out.println("Escriba ahora");
                            String no = entrada.next();
                            ((Personaje) lista.get(pos)).setnombre(no);
                            break;
                        case 4:
                            System.out.println("Escriba ahora");
                            String naci = entrada.next();
                            ((Personaje) lista.get(pos)).setnacionalidad(naci);
                            break;
                        case 5:
                            System.out.println("Escriba ahora");
                            String añ = entrada.next();
                            ((Personaje) lista.get(pos)).setaños(añ);
                            break;
                        case 6:
                            System.out.println("Escriba ahora");
                            String pes = entrada.next();
                            ((Personaje) lista.get(pos)).setpeso(pes);
                            break;
                        case 7:
                            System.out.println("Escriba ahora");
                            String esta = entrada.next();
                            ((Personaje) lista.get(pos)).setestatura(esta);
                            break;
                        case 8:
                            System.out.println("Escriba ahora");
                            String desi = entrada.next();
                            ((Personaje) lista.get(pos)).setdescripcion(desi);
                            break;
                    }
                    break;
                case 3:
                    //ver atributos de personaje
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i));
                    }
                    System.out.println("¿De que jugador desea ver los atributos?");
                    int pos2 = entrada.nextInt();
                    System.out.println("Raza:" + ((Personaje) lista.get(pos2)).getraza());
                    System.out.println("Nombre:" + ((Personaje) lista.get(pos2)).getnombre());
                    System.out.println("Nacionalidad:" + ((Personaje) lista.get(pos2)).getnacionalidad());
                    System.out.println("Estatura:" + ((Personaje) lista.get(pos2)).getestatura());
                    System.out.println("Peso:" + ((Personaje) lista.get(pos2)).getpeso());
                    System.out.println("Años:" + ((Personaje) lista.get(pos2)).getaños());
                    System.out.println("Descripcion:" + ((Personaje) lista.get(pos2)).getdescripcion());
                    break;
                case 4:
                    //eliminar personaje
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i));
                    }
                    System.out.println("¿Que personaje desea borrar?");
                    int num = entrada.nextInt();
                    lista.remove(num);
                    break;
                case 5:
                    //Inicia el combate
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i));
                    }
                    System.out.println("Elija el jugador que elije");
                    int al = entrada.nextInt();
                    System.out.println("Contra quien deseas enfrentarte:");
                    int en = entrada.nextInt();
                    while (((Personaje) lista.get(al)).getHp() == 0 || ((Personaje) lista.get(en)).getHp() == 0) {
                        System.out.println("Empiezas tu jugador 1");
                        System.out.println("1) Atacas o 2) Defiendes");
                        int comb = entrada.nextInt();
                        switch(comb){
                            case 1:
                                System.out.println("Acertaste el golpe");
                                int d;
                            d=1+random.nextInt(100);
                            if(d>((Personaje)lista.get(en)).getAc()){
                            int at=((Personaje)lista.get(al)).getDg();
                            ((Personaje)lista.get(en)).sethpat(at);
                            }else if(d>((Personaje)lista.get(en)).getCs()){
                            int at2=((Personaje)lista.get(al)).getDg()*2;
                            ((Personaje)lista.get(en)).sethpat(at2);
                            }else if(d<((Personaje)lista.get(en)).getCs()){
                                System.out.println("No acertaste");
                            }
                                break;
                            case 2:
                                ((Personaje)lista.get(en)).setacdef(15);
                                break;
                        }
                        
                            
                        
                    }
                    break;
                case 6:
                    resp = 'n';
                    break;

            }
        }
    }

}
