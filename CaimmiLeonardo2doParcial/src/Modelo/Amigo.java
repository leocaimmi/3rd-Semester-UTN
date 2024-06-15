package Modelo;

import java.io.Serializable;

public class Amigo implements Serializable
{
    //atributos
    private String nombre;
    private boolean piloto;
    private Nave nave;

    //constructores

    public Amigo(String nombre, boolean piloto, Nave nave) {
        this.nombre = nombre;
        this.piloto = piloto;
        this.nave = nave;
    }
    public Amigo()
    {
        this.nombre = "nombre";
        this.piloto = false;
        this.nave = null;
    }
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public boolean isPiloto() {
        return piloto;
    }

    public Nave getNave() {
        return nave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPiloto(boolean piloto) {
        this.piloto = piloto;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }
    //metodos

    @Override
    public String toString() {
        return "Amigo{" +
                "nombre='" + nombre + '\'' +
                ", piloto=" + piloto +
                ", nave=" + nave +
                '}';
    }
}
