import modelo.Decimal;
import modelo.Entero;
import modelo.OperacionMatematica;

public class Main {
    public static void main(String[] args) {
        /*
        Crear una clase genérica llamada "OperacionMatematica" que pueda realizar operaciones matemáticas simples
        (suma, resta, multiplicación, división) con cualquier tipo de número (enteros, decimales, etc.).
         Debe tener métodos para cada operación y para establecer los números de entrada. Haz pruebas de tu clase con diferentes tipos de números.
         */
        System.out.println("ENTEROS");
        OperacionMatematica operacionMatematica = new Entero();
        System.out.println("SUMAR");
        System.out.println(operacionMatematica.sumar(2,3));
        System.out.println("RESTAR");
        System.out.println(operacionMatematica.restar(3,5));
        System.out.println("MULTIPLICAR");
        System.out.println(operacionMatematica.multiplicar(2,5));
        System.out.println("DIVIDR");
        System.out.println(operacionMatematica.dividir(3,3));

        System.out.println("DECIMALES");
        operacionMatematica = new Decimal();
        System.out.println("SUMAR");
        System.out.println(operacionMatematica.sumar(5.2,3.6));
        System.out.println("RESTAR");
        System.out.println(operacionMatematica.restar(3.5,5.5));
        System.out.println("MULTIPLICAR");
        System.out.println(operacionMatematica.multiplicar(2.5,5.5));
        System.out.println("DIVIDR");
        System.out.println(operacionMatematica.dividir(3.5,3.5));


    }
}