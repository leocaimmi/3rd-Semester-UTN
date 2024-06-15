package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Personaje implements Serializable
{
    //atributos
    private String nombre;
    private int edad;
    private boolean jedi;
    private String planeta_nacimiento;
    private Maestro maestro;
    private ArrayList<Amigo> amigo;
    private ArrayList<Evento> evento;
    //constructores

    public Personaje(String nombre, int edad, boolean jedi, String planeta_nacimiento, Maestro maestro, ArrayList<Amigo> amigo, ArrayList<Evento> evento) {
        this.nombre = nombre;
        this.edad = edad;
        this.jedi = jedi;
        this.planeta_nacimiento = planeta_nacimiento;
        this.maestro = maestro;
        this.amigo = amigo;
        this.evento = evento;
    }
    public Personaje()
    {
        this.nombre = "nombre";
        this.edad = 0;
        this.jedi = false;
        this.planeta_nacimiento = "planeta_nacimiento";
        this.maestro = null;
        this.amigo = null;
        this.evento = null;
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isJedi() {
        return jedi;
    }

    public String getPlaneta_nacimiento() {
        return planeta_nacimiento;
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public ArrayList<Amigo> getAmigo() {
        return amigo;
    }

    public ArrayList<Evento> getEvento() {
        return evento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setJedi(boolean jedi) {
        this.jedi = jedi;
    }

    public void setPlaneta_nacimiento(String planeta_nacimiento) {
        this.planeta_nacimiento = planeta_nacimiento;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    public void setAmigo(ArrayList<Amigo> amigo) {
        this.amigo = amigo;
    }

    public void setEvento(ArrayList<Evento> evento) {
        this.evento = evento;
    }
    //metodos

    @Override
    public String toString() {
        return "Personaje{" +"\n"+
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", jedi=" + jedi +
                ", planeta_nacimiento='" + planeta_nacimiento + '\'' +
                ", maestro=" + maestro +
                ", amigo=" + amigo +
                ", evento=" + evento +
                '}';
    }
}
