package modelo;

import Interfaces.ICamuflarse;
import Interfaces.IPlayer;
import Interfaces.IZombie;

public class Gordinflones extends Personaje implements IZombie, ICamuflarse {

    //atributos
    private int gordinflonidad;//grado de gordo

    //constructores

    public Gordinflones(int x, int y, String nombre, String skin, int nivelDeVida, String arma, int gordinflonidad) {
        super(x, y, nombre, skin, nivelDeVida, arma);
        this.gordinflonidad = gordinflonidad;
    }
    public Gordinflones()
    {
        super(0,0,"Sin nombre","Sin skin",0,"Sin arma");
        gordinflonidad = 0;
    }

    //getters y setters


    public int getGordinflonidad() {
        return gordinflonidad;
    }

    private void setGordinflonidad(int gordinflonidad) {
        this.gordinflonidad = gordinflonidad;
    }

    //metodos
    @Override
    public String camuflarse() {
        return "Camuflaje activado";
    }

    @Override
    public String morder() {
        return "Mordida morbida";
    }

    @Override
    public String toString() {
        return super.toString() +
                "gordinflonidad=" + gordinflonidad +
                '}';
    }

    @Override
    public String atacar() {
        return morder();
    }

    @Override
    public String defenderse() {
        return "Aplastar al rival";
    }

    @Override
    public String morir() {
        setNivelDeVida(0);
        return "Colesterol alto";
    }

    @Override
    public String cargarEnergia() {
        return "Energia al 60%";
    }
}
