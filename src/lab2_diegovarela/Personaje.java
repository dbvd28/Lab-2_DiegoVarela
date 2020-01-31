/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_diegovarela;

import java.util.Random;

/**
 *
 * @author diego
 */
public class Personaje {

    Random random = new Random();
    private String clase;
    private String nombre;
    private String raza;
    private String estatura;
    private String descripcion;
    private String nacionalidad;
    private String años;
    private String peso;
    private int hp;
    private int dg;
    private int cs;
    private int ac;

    public Personaje() {

    }

    public Personaje(String c, String n, String r, String e, String d, String nac,String p,String an) {
        clase = c;
        nombre = n;
        if (r == "Mediano" || r == "Enano" || r == "Humano" || r == "Elfo") {
            raza = r;
        }
        estatura = e;
        descripcion = d;
        if (nac == "Norfair" || nac == "Brinstar" || nac == "Maridia" || nac == "Zebes" || nac == "Crateria") {
            nacionalidad = nac;
        }
        peso=p;
        años=an;
        setHp();
        setAc();
        setDg();
        setCs();

    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String n) {
        this.nombre = n;
    }

    public String getclase() {
        return clase;
    }

    public void setclase(String clas) {
        this.clase = clas;
    }

    public String getraza() {
        return raza;
    }

    public void setraza(String raz) {
        this.raza = raz;
    }

    public String getestatura() {
        return estatura;
    }

    public void setestatura(String est) {
        this.estatura = est;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String des) {
        this.descripcion = des;
    }

    public String getnacionalidad() {
        return nacionalidad;
    }

    public void setnacionalidad(String nac) {
        this.nacionalidad = nac;
    }
     public String getpeso() {
        return peso;
    }

    public void setpeso(String pe) {
        this.peso = pe;
    }
     public String getaños() {
        return años;
    }

    public void setaños(String ano) {
        this.años = ano;
    }

    public int getHp() {
        return hp;
    }

    public void setHp() {
        if (raza == "Enano") {
            hp = 80 + random.nextInt(100);
        }
        if (raza == "Humano") {
            hp = 40 + random.nextInt(75);
        }
        if (raza == "Mediano") {
            hp = 50 + random.nextInt(60);
        }
        if (raza == "Elfo") {
            hp = 50 + random.nextInt(70);
        }
    }

    public int getCs() {
        return cs;
    }

    public void setCs() {
        if (clase == "Barbaro") {
            cs = 97;
        }
        if (clase == "Clerigo") {
            cs = 97;
        }
        if (clase == "Mago") {
            cs = 101;
        }
        if (clase == "Picaro") {
            cs = 80;
        }
    }

    public int getDg() {
        return dg;
    }

    public void setDg() {
        if (clase == "Barbaro") {
            dg = 15 + random.nextInt(30);
        }
        if (clase == "Clerigo") {
            dg = 5 + random.nextInt(15);
        }
        if (clase == "Mago") {
            dg = 5 + random.nextInt(10);
        }
        if (clase == "Picaro") {
            dg = 15 + random.nextInt(25);
        }
    }

    public int getAc() {
        return ac;
    }

    public void setAc() {
        if (clase == "Barbaro") {
            ac = 65;
        }
        if (clase == "Clerigo") {
            ac = 40;
        }
        if (clase == "Mago") {
            ac = 20;
        }
        if (clase == "Picaro") {
            ac = 50;
        }
    }
    public void sethpat(int at){
    this.hp=hp-at;
    }
    public void setacdef(int def){
    this.ac=ac+def;
    }
    @Override
     public String toString() {
        return nombre;
    }

}
