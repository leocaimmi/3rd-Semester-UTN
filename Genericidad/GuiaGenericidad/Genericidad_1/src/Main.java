import modelo.Almacenamiento;
import modelo.Zapatilla;

public class Main {
    public static void main(String[] args)
    {
        //1.Crear una clase genérica llamada "Almacenamiento" que pueda almacenar cualquier tipo de objeto.
        // Debe tener métodos para agregar, eliminar, y buscar objetos en el almacenamiento.
        // Haz pruebas de tu clase con diferentes tipos de objetos.

        Almacenamiento caja = new Almacenamiento<>();//puedo agregar cualquier cosa
        Zapatilla nike = new Zapatilla("Nike");
        System.out.println("AGREGAR CUALQUIER TIPO DE OBJETO SIN RESTRICCIONES NI NADA");
        caja.agregar(nike);
        caja.agregar(20);
        caja.agregar("LAPICES");
        caja.agregar(2.3);
        System.out.println(caja);
        System.out.println("REMOVER UN LAPIZ");
        caja.remover("LAPICES");
        System.out.println(caja);
        System.out.println("BUSCAR UNA ZAPATILLA");
        System.out.println(caja.buscarObjeto(nike));


    }
}