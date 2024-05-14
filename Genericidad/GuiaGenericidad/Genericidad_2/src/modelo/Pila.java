package modelo;

import java.util.LinkedList;

public class Pila <E>
{
    //atributos
    private LinkedList<E> pila;
    //constructores
    public Pila ()
    {
        pila = new LinkedList<>();
    }
    //getters y setters
    public LinkedList<E> getPila()
    {
        return pila;
    }
    //metodos

    public void apilar(E e)//agrega al ppio
    {
        pila.addFirst(e);
    }
    public E desapilar()//desapilar el ultimo ingresado y devolverlo
    {
        return pila.removeFirst();
    }
    public E tope()//me devuelve el ultimo
    {
        return pila.getFirst();
    }

    public int contarDatos()
    {
        return pila.size();
    }
    public boolean pilaVacia()
    {

        return pila.isEmpty();
    }
    @Override
    public String toString()
    {
        return "Pila{" +
                "pila=" + pila +
                '}';
    }




}
