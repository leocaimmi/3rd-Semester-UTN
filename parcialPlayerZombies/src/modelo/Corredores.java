package modelo;

import Interfaces.IZombie;

public class Corredores extends Personaje implements IZombie {


    //atributos
    private int velocidad;

    //constructores

    public Corredores(int x, int y, String nombre, String skin, int nivelDeVida, String arma, int velocidad) {
        super(x, y, nombre, skin, nivelDeVida, arma);
        this.velocidad = velocidad;
    }
    public Corredores()
    {
        super(0,0,"Sin nombre","Sin skin",0,"Sin arma");
        velocidad = 0;
    }

    //getters y setters

    public int getVelocidad() {
        return velocidad;
    }

    private void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //metodos
    @Override
    public String morder() {
        return "Mordida en el brazo";
    }
    public String correr()
    {
        return "Esta corriendo";
    }

    @Override
    public String toString() {
        return super.toString() +
                "velocidad=" + velocidad +
                '}';
    }

    @Override
    public String atacar() {
        return morder();
    }

    @Override
    public String defenderse() {
        return "CORRE PERRA CORRE";
    }

    @Override
    public String morir() {
        setNivelDeVida(0);
        return "Apunta de espada";
    }

    @Override
    public String cargarEnergia() {
        return "Enegia al 40%";
    }
}
