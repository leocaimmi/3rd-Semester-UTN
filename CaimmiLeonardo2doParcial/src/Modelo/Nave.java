package Modelo;

import java.io.Serializable;

public class Nave implements Serializable
{
    //atributos
    private String nave;
    private String modelo;
//constructores
    public Nave(String nave, String modelo) {
        this.nave = nave;
        this.modelo = modelo;
    }
    public Nave()
    {
        this.nave = null;
        this.modelo = null;
    }
    //getters y setters

    public String getNave() {
        return nave;
    }

    public String getModelo() {
        return modelo;
    }

    public void setNave(String nave) {
        this.nave = nave;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    //metodos

    @Override
    public String toString() {
        return "Nave{" +
                "nave='" + nave + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
