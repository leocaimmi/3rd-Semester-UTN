package modelo;

public class Rectangulo {
    //atributos
    private double ancho;
    private double largo;

    //constructores

    public Rectangulo(double ancho,double largo)
    {
        this.ancho=ancho;
        this.largo=largo;
    }

    public Rectangulo()
    {
        ancho=1.0;
        largo=1.0;
    }

    //getters y setter

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }


    //metodos

    public double calcularArea()
    {
        return ancho*largo;
    }

    public double calcularPerimetro()
    {
        return ancho*2+largo*2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", largo=" + largo +
                '}';
    }
}
