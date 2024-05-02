package modelo;

public class Muro extends Objeto
{
    //atributos
private String resistencia;
    //constructores

    public Muro(double ancho, double alto, String resistencia) {
        super(ancho, alto);
        this.resistencia = resistencia;
    }

    public Muro() {
        super(0,0);
        resistencia = "Sin resistencia";
    }

    //getters y setters

    public String getResistencia() {
        return resistencia;
    }

    //metodos

    @Override
    public String toString() {
        return super.toString()+
                "resistencia='" + resistencia + '\'' +
                '}';
    }
}
