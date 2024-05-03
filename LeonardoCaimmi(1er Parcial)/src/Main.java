import modelo.Entrada;
import modelo.EntradaGeneral;
import modelo.EntradaVip;
import modelo.Recital;

public class Main {
    public static void main(String[] args)
    {
        Recital recital = new Recital("El recital más Gonzalo que el mismo Gonzalo","Santiago del Estero, Chiqui Tapia","12/05/24");

        EntradaGeneral entradaGeneral1=  new EntradaGeneral(1,2,true,"Palco");
        recital.cargarEntrada(entradaGeneral1);

        EntradaVip entradaVip1= new EntradaVip(1,2,true,"Tragos ilimitados");
        recital.cargarEntrada(entradaVip1);

        EntradaGeneral entradaGeneral2 = new EntradaGeneral(1,5,true,"VELEZ CAMPEON!!:)");
        recital.cargarEntrada(entradaGeneral2);//prueba para ver que no se repitan las ID de las entradas

        EntradaGeneral entradaGeneral3 = new EntradaGeneral(3,6,true,"Platea");
        recital.cargarEntrada(entradaGeneral3);

        EntradaVip entradaVip2 = new EntradaVip(2,15,true,"Meet & great");
        recital.cargarEntrada(entradaVip2);
        EntradaVip entradaVip3 = new EntradaVip(3,100,true,"Meet & great +Tragos ilimitados");
        recital.cargarEntrada(entradaVip3);

        System.out.println(recital);
        System.out.println("CANTIDAD DE ENTRADAS");
        System.out.println(recital.contarCantidadDeEntradas());
        System.out.println("MOSTRAR ENTRADAS DISPONIBLES");
        System.out.println( recital.mostrarEntradasDisponibles());
        System.out.println("VENDER UNA ENTRADA");
        boolean rta = recital.venderEntrada(entradaVip3);

        if(recital.venderEntrada(entradaGeneral1))//probar el retorno de la funcion;
        {
            System.out.println("LA ENTRADA HA SIDO VENDIDADA CORRECTAMENTE!!");
        }
        else
        {
            System.out.println("LA ENTRADA NO PUDO VENDERSE:(");
        }
        System.out.println(recital.venderEntrada(entradaGeneral1));//ver el retorno
        System.out.println("ENTRADAS");
        System.out.println(recital);

        System.out.println("ENTRADAS VENDIDAS");
        System.out.println(recital.contarEntradasVendidas());
        System.out.println("GENERALES");
        System.out.println(recital.contarEntradasVendidasGenerales());
        System.out.println("VIP");
        System.out.println(recital.contarEntradasVendidasVip());

        System.out.println("RECAUDACION");
        System.out.println(recital.calcularRecaudacion());

    }
}