package modelo;

import Interfaces.IComportamientoAdicional;
import Interfaces.IPlayer;

public abstract class Personaje extends Juego implements  IComportamientoAdicional {


    //atributos
    private String nombre;
    private String skin;
    private int nivelDeVida;
    private String arma;

    //constructores

    public Personaje(int x, int y, String nombre, String skin, int nivelDeVida, String arma) {
        super(x, y);
        this.nombre = nombre;
        this.skin = skin;
        this.nivelDeVida = nivelDeVida;
        this.arma = arma;
    }

    public Personaje() {
        super(0, 0);
        nombre = "Sin nombre";
        skin = "Sin skin";
        nivelDeVida = 0;
        arma = "Sin arma";
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public String getSkin() {
        return skin;
    }

    public int getNivelDeVida() {
        return nivelDeVida;
    }

    public String getArma() {
        return arma;
    }

    protected void setNivelDeVida(int nivelDeVida) {
        this.nivelDeVida = nivelDeVida;
    }

    protected void setArma(String arma) {
        this.arma = arma;
    }

    //metodos


    @Override
    public String toString() {
        return super.toString() +
                "nombre='" + nombre + '\'' +
                ", skin='" + skin + '\'' +
                ", nivelDeVida=" + nivelDeVida +
                ", arma='" + arma + '\'' +
                '}';
    }
}
