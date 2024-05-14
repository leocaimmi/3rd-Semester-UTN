import modelo.Pila;

public class Main {
    public static void main(String[] args) {

        /*
        Crear una clase genérica llamada "Pila" que funcione como una pila de objetos.
        Debe tener métodos para agregar y quitar elementos de la pila, así como para verificar si está vacía y para obtener el número de elementos en la pila.
         Haz pruebas de tu clase con diferentes tipos de objetos.
         */
        Pila pila = new Pila<>();

        System.out.println("APILAR CUALQUIER COSA");
        pila.apilar(2);
        pila.apilar("3");
        pila.apilar(4.0);
        System.out.println(pila);

        System.out.println("DESAPILAR ULTIMO");
        System.out.println(pila.desapilar());
        System.out.println("PILA DESAPILADA");
        System.out.println(pila);

        System.out.println("VER TOPE");
        System.out.println(pila.tope());
        System.out.println("PILA");
        System.out.println(pila);

        System.out.println("CONTAR ELEMENTOS");
        System.out.println(pila.contarDatos());
        System.out.println(pila);

        System.out.println("PILA VACIA?");
        System.out.println(pila.pilaVacia());
    }
}