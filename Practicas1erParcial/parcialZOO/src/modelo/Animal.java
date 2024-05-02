package modelo;

import Interfaces.IValoracion;

public abstract class Animal implements IValoracion {
    //atributos
    private String especie;
    private String nombre;
    private int edad;

    private String estadoSalud;
    //constructores

    public Animal(String especie, String nombre, int edad, String estadoSalud) {
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.estadoSalud = estadoSalud;
    }
    public Animal()
    {
        especie ="Sin especie";
        nombre = "Sin nombre";
        edad = 0;
        estadoSalud ="Sin estado de salud";
    }
    //getters y setters

    public String getEspecie() {
        return especie;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }
    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    //metodos

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estadoSalud='" + estadoSalud + '\'' +
                '}';
    }
}
