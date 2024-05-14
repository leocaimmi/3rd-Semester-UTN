package modelo;

import Interfaces.IOperaciones;

import java.util.ArrayList;

public abstract class OperacionMatematica <E extends Number> implements IOperaciones<E>
{
    //atributos

    private E num1;
    private E num2;

    //constructores
    public OperacionMatematica(E num1,E num2)
    {
        this.num1 = num1;
        this.num2 = num2;

    }
    public OperacionMatematica()
    {
        num1 = null;
        num2 = null;


    }
    //gettes y setters

    public E getNum1() {
        return num1;
    }

    public E getNum2() {
        return num2;
    }


    //metodos

    @Override
    public String toString() {
        return "OperacionMatematica{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", operacion=" +
                '}';
    }
}
