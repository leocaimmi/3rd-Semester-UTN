package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Maestro implements Serializable
{
    //atributos
    private String nombre;
    private boolean es_jedi;
    private ArrayList<String> habilidades;
    //constructores

    public Maestro(String nombre, boolean es_jedi, ArrayList<String> habilidades) {
        this.nombre = nombre;
        this.es_jedi = es_jedi;
        this.habilidades = habilidades;
    }
    public Maestro()
    {
        this.nombre = "nombre";
        this.es_jedi = false;
        this.habilidades = null;
    }
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public boolean isEs_jedi() {
        return es_jedi;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEs_jedi(boolean es_jedi) {
        this.es_jedi = es_jedi;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }
    //metodos

    @Override
    public String toString() {
        return "Maestro{" +
                "nombre='" + nombre + '\'' +
                ", es_jedi=" + es_jedi +
                ", habilidades=" + habilidades +
                '}';
    }
}
