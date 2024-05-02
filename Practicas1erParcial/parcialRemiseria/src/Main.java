import modelo.Cliente;
import modelo.GestorAgencia;

import modelo.Taxi;

public class Main {
    public static void main(String[] args) {
        GestorAgencia agencia = new GestorAgencia();
        agencia.agregarVehiculo(new Taxi("Corsa","2010","Diesel","123AAA",true,0,10,10));
        Cliente cliente = new Cliente("Leo","Caimmi","223456785","la costa");
        agencia.comenzarViaje(cliente);

        System.out.println(agencia);
        System.out.println(agencia.finalizarViaje());
        System.out.println(agencia);
        System.out.println(agencia.recaudacionTotal());


    }
}