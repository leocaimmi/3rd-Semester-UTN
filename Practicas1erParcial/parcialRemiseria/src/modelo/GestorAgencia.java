package modelo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class GestorAgencia
{
    //atributos
    private HashSet<Cliente> clientes;
    private HashSet<Vehiculo>vehiculos;
    private HashSet<SistemaDeViajes> viajes;
    private double totalRecaudado;

    //constructores
    public GestorAgencia()
    {
        clientes = new HashSet<>();
        vehiculos = new HashSet<>();
        viajes = new HashSet<>();
        totalRecaudado = 0;

    }
    //getters y setters

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    private void setTotalRecaudado(double totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }

    public HashSet<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(HashSet<Cliente> clientes) {
        this.clientes = clientes;
    }

    public HashSet<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(HashSet<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    public HashSet<SistemaDeViajes> getViajes() {
        return viajes;
    }
    //metodos


    public void agregarVehiculo(Vehiculo v)
    {
        vehiculos.add(v);
    }
    public void comenzarViaje(Cliente cliente)
    {
        clientes.add(cliente);
        Iterator<Vehiculo>iterator = vehiculos.iterator();

        boolean flag = false;
        while(iterator.hasNext()&& !flag)
        {
            Vehiculo v = iterator.next();
            if(v instanceof Taxi)
            {

                if(v.isDisponibilidad())
                {
                    v.setDisponibilidad(false);
                    flag = true;//si encuentro un remis dispobible comienzo el viaje
                    viajes.add(new SistemaDeViajes(v, cliente, cliente.devolverDistancia()));

                }
            }
            else if(iterator instanceof Remis)
            {
                if(v.isDisponibilidad())
                {
                    v.setDisponibilidad(false);
                    flag = true;//si encuentro un remis dispobible comienzo el viaje
                    viajes.add(new SistemaDeViajes(v, cliente, cliente.devolverDistancia()));
                }
            }



        }
            //encuentro el vehiculo disponible para la persona que lo solicita

    }
    public boolean finalizarViaje()
    {
        boolean rta= false;
        Iterator<SistemaDeViajes>iteratorViajes = viajes.iterator();
        Iterator<Vehiculo>vehiculoIterator = vehiculos.iterator();
        while(vehiculoIterator.hasNext())//recorro todos los vehiculos
        {
            Vehiculo a = vehiculoIterator.next();
            if(!a.isDisponibilidad())//todos los vehiculos que esten en viaje
            {

                while(iteratorViajes.hasNext())//busco que vehiculos estan en viaje
                {
                    SistemaDeViajes b = iteratorViajes.next();
                    if(b.getVehiculo().equals(a))//si el vehiculo que estan en viaje coincide con el del iterator mando el viaje
                    {
                        rta = b.realizarViaje();
                        a.setDisponibilidad(true);
                    }
                }
            }
        }
        return rta;
    }

    public double recaudacionTotal()
    {
        double recaudacion = 0;
        Iterator <SistemaDeViajes> sistemaDeViajesIterator = viajes.iterator();
        while(sistemaDeViajesIterator.hasNext())
        {
            SistemaDeViajes a = sistemaDeViajesIterator.next();
            recaudacion +=a.getCostoDelViaje();
        }
       setTotalRecaudado(recaudacion);
        return recaudacion;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GestorAgencia agencia = (GestorAgencia) o;
        return Objects.equals(clientes, agencia.clientes) && Objects.equals(vehiculos, agencia.vehiculos) && Objects.equals(viajes, agencia.viajes);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString()
    {
        return "GestorAgencia"+"\n"+"{" +
                "clientes=" + clientes +"\n"+
                ", vehiculos=" + vehiculos +"\n"+
                ", viajes=" + viajes +
                '}'+"\n";
    }
}
