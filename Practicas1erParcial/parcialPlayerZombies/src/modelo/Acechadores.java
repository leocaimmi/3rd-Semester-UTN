package modelo;

import Interfaces.IZombie;

public class Acechadores extends Personaje implements IZombie {

    //atributos
    private String vision;
    //constructores

    public Acechadores(int x, int y, String nombre, String skin, int nivelDeVida, String arma, String vision) {
        super(x, y, nombre, skin, nivelDeVida, arma);

        this.vision = vision;
    }
    public Acechadores()
    {
        super(0,0,"Sin nombre","Sin skin",0,"Sin arma");
        vision = "Sin vision";
    }

    //getters y setters

    public String getVision() {
        return vision;
    }

    private void setVision(String vision) {
        this.vision = vision;
    }

    //metodos
    public String acechar()
    {
        return "Objetivo a la vista";
    }
    @Override
    public String morder() {
        return "Mordida en el cuello";
    }

    @Override
    public String toString() {
        return super.toString() +
                "vision='" + vision + '\'' +
                '}';
    }

    @Override
    public String atacar() {
        return morder();
    }

    @Override
    public String defenderse() {
        return "Tijeretazo";
    }

    @Override
    public String morir() {
        setNivelDeVida(0);
        return "Bala en la cabeza";
    }

    @Override
    public String cargarEnergia() {
        return "Energia al 10%";
    }
}
