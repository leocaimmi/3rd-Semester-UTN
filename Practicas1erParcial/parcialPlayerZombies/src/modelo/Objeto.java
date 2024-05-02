package modelo;

public abstract class Objeto extends Juego
{
    //atributos
private double ancho;
private double alto;
    //constructores

    public Objeto(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    public Objeto()
    {
        ancho = 0;
        alto = 0;

    }

    //getters y setters

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    //metodos

    @Override
    public String toString() {
        return super.toString() +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
}
