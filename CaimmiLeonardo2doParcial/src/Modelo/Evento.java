package Modelo;

import java.io.Serializable;

public class Evento implements Serializable
{
    //atributos
    private String nombre;
    private int anio;
    private boolean ganada;
    //constructores

    public Evento(String nombre, int anio, boolean ganada) {
        this.nombre = nombre;
        this.anio = anio;
        this.ganada = ganada;
    }
    public Evento()
    {
        this.nombre = "nombre";
        this.anio = 0;
        this.ganada = false;
    }
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public int getAnio() {
        return anio;
    }

    public boolean isGanada() {
        return ganada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setGanada(boolean ganada) {
        this.ganada = ganada;
    }
    //metodos

    @Override
    public String toString() {
        return "Evento{" +
                "nombre='" + nombre + '\'' +
                ", anio=" + anio +
                ", ganada=" + ganada +
                '}';
    }
}
