package Modelo;

public abstract class Persona
{
    //atributos
    private String nombre;

    //constructores
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //metodos
    public String imprimir()
    {
        return "Nombre ["+getNombre()+"] ";
    }
}
