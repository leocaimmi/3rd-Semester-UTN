package modelo;

public class Decimal extends OperacionMatematica<Double>{


    public Decimal()
    {
        sumar(0.0,0.0);
    }
    @Override
    public Double sumar(Double a, Double b) {
        return a+b;
    }

    @Override
    public Double restar(Double a, Double b) {
        return a-b;
    }

    @Override
    public Double dividir(Double a, Double b) {
        Double rta = null;
        if(b != 0)
        {
            rta = a/b;

        }
        return rta;
    }

    @Override
    public Double multiplicar(Double a, Double b) {
        return a*b;
    }
}
