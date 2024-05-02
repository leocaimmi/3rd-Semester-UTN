package modelo;

import interfaces.IServicios;

import java.util.Objects;

public class Comercial extends TipoDeAviones implements IServicios {


    //atributos
    private int cantidadAzafatas;
    private String listaServicios;
    //constructores

    public Comercial(String patente,String modelo, String marca, String tipoDeMotor, double cantidadDeCombustible, int cantidadDeAsientos, int cantidadAzafatas, String listaServicios) {
        super(patente,modelo, marca, tipoDeMotor, cantidadDeCombustible, cantidadDeAsientos);
        this.cantidadAzafatas = cantidadAzafatas;
        this.listaServicios = listaServicios;
    }

    //getters y setters

    public int getCantidadAzafatas() {
        return cantidadAzafatas;
    }

    public void setCantidadAzafatas(int cantidadAzafatas) {
        this.cantidadAzafatas = cantidadAzafatas;
    }

    public String getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(String listaServicios) {
        this.listaServicios = listaServicios;
    }

    //metodos

    @Override
    public String toString() {
        return super.toString() +
                "cantidadAzafatas=" + cantidadAzafatas +
                ", listaServicios='" + listaServicios + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        boolean rta = false;
        if(o != null)
        {
            if(o instanceof Comercial)
            {
                Comercial aComparar = (Comercial) o;
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
    public String despegar() {
        return "Despegue exitoso";
    }

    @Override
    public String aterrizar() {
        return "Aterrisaje sospechoso";
    }

    @Override
    public String vuelan() {
        return "Vuelo a 10.000 pies";
    }

    @Override
    public String servirComida() {
        return "Pollo con papas";
    }

    @Override
    public String darMantas() {
        return "Tenes frio? Toma tapate";
    }
}
