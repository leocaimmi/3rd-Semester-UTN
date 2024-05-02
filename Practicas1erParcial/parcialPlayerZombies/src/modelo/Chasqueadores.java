package modelo;

import Interfaces.IZombie;

public class Chasqueadores extends Personaje implements IZombie {

    //atributos
    private int potenciaChasqueo;

    //constructores

    public Chasqueadores(int x, int y, String nombre, String skin, int nivelDeVida, String arma, int potenciaChasqueo) {
        super(x, y, nombre, skin, nivelDeVida, arma);
        this.potenciaChasqueo = potenciaChasqueo;
    }
    public Chasqueadores()
    {
        super(0,0,"Sin nombre","Sin skin",0,"Sin arma");
        potenciaChasqueo = 0;
    }

    //getters y setters

    public int getPotenciaChasqueo() {
        return potenciaChasqueo;
    }

    private void setPotenciaChasqueo(int potenciaChasqueo) {
        this.potenciaChasqueo = potenciaChasqueo;
    }

    //metodos

    @Override
    public String toString() {
        return super.toString() +
                "potenciaChasqueo=" + potenciaChasqueo +
                '}';
    }

    @Override
    public String morder() {
        return "Mordida en el tobillo";
    }
    public String chasquear()
    {
        return "CHA CHA CHA";
    }

    @Override
    public String atacar() {
        return morder();
    }

    @Override
    public String defenderse() {
        return "Chasquido sonico";
    }

    @Override
    public String morir() {
        setNivelDeVida(0);
        return "Espadazo en la nuca";
    }

    @Override
    public String cargarEnergia() {
        return "Energia al 8%";
    }
}
