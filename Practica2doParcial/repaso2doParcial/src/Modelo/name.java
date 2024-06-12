package Modelo;

import java.io.Serializable;

public class name implements Serializable
{
    //atributos
    private String first;
    private String last;
    //constructores
    public name(String first, String last)
    {
        this.first = first;
        this.last = last;
    }
    public name()
    {
        first = "No first";
        last =  "No last";
    }
    //getters y setters

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    //metodos

    @Override
    public String toString() {
        return "Name{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}
