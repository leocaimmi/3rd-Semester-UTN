package Modelo;

public class SobrepasaCantidadException extends Exception
{
    /*
    Hacer un método que dada una tabla X, una clave Y y un entero Z, retorne la cantidad de elementos. Si la cantidad supera al parámetro Z, lanzar una excepción que contenga nombre del mapa, clave y la diferencia entre Z y la cantidad real.
Ej: tabla “colores”, clave “green”, cantidad 3. Si hay tres o más jugadores con esa clave, lanzó la excepción y me quedo con la cantidad real - 3 (3 es el parámetro que envió)

     */

    public SobrepasaCantidadException()
    {
        super();
    }

    public SobrepasaCantidadException(String tabla, String clave, int cantidadCalculada)
    {
        super("La tabla "+tabla+" con la clave"+clave+" tiene una diferencia de "+cantidadCalculada);
    }

    @Override
    public String toString() {
        return "SobrepasaCantidadException{}";
    }
}
