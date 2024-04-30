package modelo;

import Interfaces.IPlayer;

public class Joel extends Personaje implements IPlayer
{

    //atributos
    private int cuanMalaOnda;
    private int cuanTestarudo;
    //constructores

    public Joel(int x, int y, String nombre, String skin, int nivelDeVida, String arma, int cuanMalaOnda, int cuanTestarudo) {
        super(x, y, nombre, skin, nivelDeVida, arma);
        this.cuanMalaOnda = cuanMalaOnda;
        this.cuanTestarudo = cuanTestarudo;
    }
    public Joel()
    {
        super(0,0,"Sin nombre","Sin skin",0,"Sin arma");
        cuanTestarudo = 0;
        cuanMalaOnda = 0;
    }
    //getters y setters


    public int getCuanMalaOnda() {
        return cuanMalaOnda;
    }

    public int getCuanTestarudo() {
        return cuanTestarudo;
    }

    private void setCuanMalaOnda(int cuanMalaOnda) {
        this.cuanMalaOnda = cuanMalaOnda;
    }

    private void setCuanTestarudo(int cuanTestarudo) {
        this.cuanTestarudo = cuanTestarudo;
    }

    //metodos
    @Override
    public String curarse() {
        setNivelDeVida(85);
        return "Vida curada al 85%";
    }

    @Override
    public String recargarArma() {
        return "25 balas cargadas";
    }

    @Override
    public String toString() {
        return super.toString() +
                "cuanMalaOnda=" + cuanMalaOnda +
                ", cuanTestarudo=" + cuanTestarudo +
                '}';
    }

    @Override
    public String atacar() {
        return "Espadazo triple";
    }

    @Override
    public String defenderse() {
        return "Mortal para atras";
    }

    @Override
    public String morir() {
        setNivelDeVida(0);
        return "Ha sido atacado por un zombie en la cabeza";
    }

    @Override
    public String cargarEnergia() {
        return "La energia esta al 86%";
    }
}
