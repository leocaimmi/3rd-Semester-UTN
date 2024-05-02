package modelo;

import interfaces.IIngresar;

public class DeCarga extends TipoDeAviones implements IIngresar
{
    //atributos
    private double cantidadDeKilos;
    private String posiblesProductosATransportar;
    //constructores

    public DeCarga(String patente, String modelo, String marca, String tipoDeMotor, double cantidadDeCombustible, int cantidadDeAsientos, double cantidadDeKilos, String posiblesProductosATransportar) {
        super(patente, modelo, marca, tipoDeMotor, cantidadDeCombustible, cantidadDeAsientos);
        this.cantidadDeKilos = cantidadDeKilos;
        this.posiblesProductosATransportar = posiblesProductosATransportar;
    }

    //getters y setters

    public double getCantidadDeKilos() {
        return cantidadDeKilos;
    }

    public String getPosiblesProductosATransportar() {
        return posiblesProductosATransportar;
    }

    public void setPosiblesProductosATransportar(String posiblesProductosATransportar) {
        this.posiblesProductosATransportar = posiblesProductosATransportar;
    }

    //metodos

    @Override
    public String toString() {
        return super.toString() +
                "cantidadDeKilos=" + cantidadDeKilos +
                ", posiblesProductosATransportar='" + posiblesProductosATransportar + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        boolean rta = false;
        if(o != null)
        {
            if(o instanceof DeCarga)
            {
                DeCarga aComparar = (DeCarga) o;
                if(super.getPatente().equals(aComparar.getPatente()))
                {
                    rta = true;
                }
            }
        }
        return rta;
    }

    @Override
    public int hashCode() {
        return 1;
    }
    @Override
    public boolean ingresar() {
        boolean rta = false;
        if(Math.floor(Math.round(Math.random())) == 1)
        {
            rta = true;
        }
        return rta;
    }

    @Override
    public String despegar() {
        return "Despegue pesado";
    }

    @Override
    public String aterrizar() {
        return "Aterrisaje pesado";
    }

    @Override
    public String vuelan() {
        return "Vuelo a 9.000 pies";
    }
    public String descargarContenido()
    {
        return "Descargando";
    }
}
