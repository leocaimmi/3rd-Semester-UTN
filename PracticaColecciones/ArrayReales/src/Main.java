import modelo.ArrayReales;

import java.util.LinkedHashSet;

public class Main
{
    /*
    Construir una clase ArrayReales que declare una lista (elija la que corresponda) como atributo
    y que implemente una interfaz llamada Estadísticas.
    Realizar un main para comprobar funcionamiento implementando todos los métodos.
     */
    public static void main(String[] args)
    {
        ArrayReales arrayReales = new ArrayReales();
       for(int i = 0;i<10;i++)arrayReales.getArrayReales().add((double) i);
        System.out.println(arrayReales.recorrer());

        System.out.println("MINIMO");
        System.out.println(arrayReales.minimo());
        System.out.println("MAXIMO");
        System.out.println(arrayReales.maximo());
        System.out.println("SUMATORIO");
        System.out.println(arrayReales.sumatorio());
    }
}