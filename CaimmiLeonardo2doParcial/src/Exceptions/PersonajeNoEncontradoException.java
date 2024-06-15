package Exceptions;

public class PersonajeNoEncontradoException extends Exception
{
    public PersonajeNoEncontradoException(String nombre)
    {
        super("El nombre "+nombre+" no ha sido encontrado");
    }
}
