package modelo;

import java.util.Objects;
public class SistemaDeViajes {
    //Atributos
    private Vehiculo vehiculo;
    private Cliente cliente;
    private double costoDelViaje;
    //constructores
    public SistemaDeViajes(Vehiculo vehiculo, Cliente cliente,double costoDelViaje) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.costoDelViaje = costoDelViaje;
    }
    public SistemaDeViajes() {
        vehiculo = null;
        cliente = null;
        costoDelViaje = 0;
    }
    //getters y setters
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public double getCostoDelViaje() {
        return costoDelViaje;
    }
    private void setCostoDelViaje(double costoDelViaje) {
        this.costoDelViaje = costoDelViaje;
    }
    //metodos
    @Override
    public boolean equals(Object o) {
        boolean rta = false;
        if(o != null)
        {
            if(o instanceof Vehiculo)
            {
                Vehiculo aComparar = (Vehiculo) o;
                if(vehiculo.isDisponibilidad() == aComparar.isDisponibilidad()&&vehiculo.getPatente().equals(aComparar.getPatente()))
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

    public boolean realizarViaje()
    {
        boolean rta = false;
        if(cliente.pedirUnViaje())//si es true pide el viaje
        {
            if(vehiculo instanceof Taxi)
            {
                Taxi aux = (Taxi) vehiculo;
                aux.setContadorKM(cliente.devolverDistancia());//distancia del viaje
                setCostoDelViaje(aux.calcularTarifa());//calcula el valor del viaje
                rta = true;
            }else if(vehiculo instanceof Remis)
            {
                Remis aux = (Remis) vehiculo;
                aux.setDistancia(cliente.devolverDistancia());//distancia del viaje
                setCostoDelViaje(aux.calcularTarifa());//calcula el valor del viaje
                rta = true;
            }

        }

        return rta;
    }

    @Override
    public String toString() {
        return
                "vehiculo=" + vehiculo +
                ", cliente=" + cliente +
                ", costoDelViaje=" + costoDelViaje +
                '}';
    }
}


