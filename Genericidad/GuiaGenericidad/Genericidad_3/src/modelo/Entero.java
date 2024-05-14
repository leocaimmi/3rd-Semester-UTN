package modelo;

public class Entero extends OperacionMatematica<Integer>
{
    //constructores

    public Entero() {
        super(0, 0);
    }

    //metodos
    @Override
    public Integer sumar(Integer a, Integer b) {

        return a+b;
    }

    @Override
    public Integer restar(Integer a, Integer b) {

        return a-b;
    }

    @Override
    public Integer dividir(Integer a, Integer b) {
       Integer rta = null;
        if(b != 0)
        {
            rta = a/b;

        }
        return rta;
    }
    @Override
    public Integer multiplicar(Integer a, Integer b) {

        return a * b;
    }

}
