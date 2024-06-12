package Excepciones;

public class CantidadException extends Exception
{
    public CantidadException()
    {
        super();
    }
    public CantidadException(int cantidad)
    {
        super("La diferencia de etiquetas es de[ "+cantidad+"]");
    }
}
