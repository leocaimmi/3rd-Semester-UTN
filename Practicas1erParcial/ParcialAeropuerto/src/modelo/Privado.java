package modelo;

import interfaces.IServicios;

import java.util.Objects;

public class Privado extends TipoDeAviones implements IServicios {


    //atributos
    private boolean tieneJacuzzi;
    private  String claveWifi;
    //constructores

    public Privado(String patente, String modelo, String marca, String tipoDeMotor, double cantidadDeCombustible, int cantidadDeAsientos, boolean tieneJacuzzi, String claveWifi) {
        super(patente, modelo, marca, tipoDeMotor, cantidadDeCombustible, cantidadDeAsientos);
        this.tieneJacuzzi = tieneJacuzzi;
        this.claveWifi = claveWifi;
    }

    //getters y setters


    public boolean isTieneJacuzzi() {
        return tieneJacuzzi;
    }

    public String getClaveWifi() {
        return claveWifi;
    }

    public void setClaveWifi(String claveWifi) {
        this.claveWifi = claveWifi;
    }

    //metodos
    public boolean verMundial()
    {
        boolean rta = false;
        if(Math.floor(Math.round(Math.random())) == 1)
        {
            rta = true;
        }
        return rta;
    }

    @Override
    public String toString() {
        return super.toString() +
                "tieneJacuzzi=" + tieneJacuzzi +
                ", claveWifi='" + claveWifi + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        boolean rta = false;
        if(o != null)
        {
            if(o instanceof Privado)
            {
                Privado aComparar = (Privado) o;
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
    public String servirComida() {
        return "Caviar servido";
    }

    @Override
    public String darMantas() {
        return "Tome una manta Sr.";
    }

    @Override
    public String despegar() {
        return "Despegue sonico";
    }

    @Override
    public String aterrizar() {
        return "Aterrisaje sonicont";
    }

    @Override
    public String vuelan() {
        return "vuelo a 8.000 pies";
    }
}
