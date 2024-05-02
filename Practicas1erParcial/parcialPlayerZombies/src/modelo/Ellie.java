package modelo;

import Interfaces.IPlayer;

public class Ellie extends Personaje implements IPlayer
{

    //atributos
    private int gradoDeHumor;
    private int cantidadChistesMalos;
    //constructores

    public Ellie(int x, int y, String nombre, String skin, int nivelDeVida, String arma, int gradoDeHumor, int cantidadChistesMalos) {
        super(x, y, nombre, skin, nivelDeVida, arma);
        this.gradoDeHumor = gradoDeHumor;
        this.cantidadChistesMalos = cantidadChistesMalos;
    }
    public Ellie()
    {
        super(0,0,"Sin nombre","Sin skin",0,"Sin arma");
        gradoDeHumor = 0;
        cantidadChistesMalos = 0;

    }

    //getters y setters

    public int getGradoDeHumor() {
        return gradoDeHumor;
    }

    public int getCantidadChistesMalos() {
        return cantidadChistesMalos;
    }

    private void setGradoDeHumor(int gradoDeHumor) {
        this.gradoDeHumor = gradoDeHumor;
    }

    private void setCantidadChistesMalos(int cantidadChistesMalos) {
        this.cantidadChistesMalos = cantidadChistesMalos;
    }

    //metodos
    @Override
    public String curarse() {
       setNivelDeVida(100);
        return "Vida al 100%";
    }

    @Override
    public String recargarArma() {
        return "30 balas cargadas";
    }

    @Override
    public String toString() {
        return super.toString() +
                "gradoDeHumor=" + gradoDeHumor +
                ", cantidadChistesMalos=" + cantidadChistesMalos +
                '}';
    }

    @Override
    public String atacar() {
        return "HeadShot";
    }

    @Override
    public String defenderse() {
        return "Voltereta triple";
    }

    @Override
    public String morir() {
        setNivelDeVida(0);
        return "Fue mordida";
    }

    @Override
    public String cargarEnergia() {
        return "La energia esta al 100%";
    }
}
