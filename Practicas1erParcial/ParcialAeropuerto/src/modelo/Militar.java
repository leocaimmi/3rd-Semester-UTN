package modelo;

import interfaces.IIngresar;

public class Militar extends TipoDeAviones implements IIngresar
{

    //atributos
    private String sistemaDeArmas;
    private int cantidadDeBalas;
    //constructores

    public Militar(String patente, String modelo, String marca, String tipoDeMotor, double cantidadDeCombustible, int cantidadDeAsientos, String sistemaDeArmas, int cantidadDeBalas) {
        super(patente, modelo, marca, tipoDeMotor, cantidadDeCombustible, cantidadDeAsientos);
        this.sistemaDeArmas = sistemaDeArmas;
        this.cantidadDeBalas = cantidadDeBalas;
    }

    //getters y setters

    //metodos

    @Override
    public String toString() {
        return super.toString() +
                "sistemaDeArmas='" + sistemaDeArmas + '\'' +
                ", cantidadDeBalas=" + cantidadDeBalas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        boolean rta = false;
        if(o != null)
        {
            if(o instanceof Militar)
            {
                Militar aComparar = (Militar) o;
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
        return "Despegue complejo";
    }

    @Override
    public String aterrizar() {
        return "Aterrisaje forzoso";
    }

    @Override
    public String vuelan() {
        return "Vuelvo a 12.000 pies";
    }
}
