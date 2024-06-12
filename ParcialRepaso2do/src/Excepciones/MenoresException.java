package Excepciones;

public class MenoresException extends Exception{
    public MenoresException()
    {
        super();
    }
    public MenoresException(int edad)
    {
        super("La edad es menor a 18[ "+edad+" ]");
    }
}
