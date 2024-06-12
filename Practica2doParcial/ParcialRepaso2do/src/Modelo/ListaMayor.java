package Modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
Agregar a una lista las personas que solo sean mayor o igual a 18 años. Cuando
 encuentren una persona menor, lanzar una excepción (creada por ustedes, no las
 genéricas). Dicha excepción deberá tener la edad de la persona y al mostrar la excepción,
 mostrar esa edad.
 */
public class ListaMayor<E>
{
    //atributos
    private ArrayList<E> mayores;
   //constructores
    public ListaMayor()
    {
        mayores = new ArrayList<>();
    }

    public ListaMayor(ArrayList<E> mayores) {
        this.mayores = mayores;
    }
    //getters y setters

    public ArrayList<E> getMayores() {
        return mayores;
    }
    //metodos
    public void agregar(E e)
    {
        if(e != null)
        {
            mayores.add(e);
        }
    }
    @Override
    public String toString() {
        return "ListaMayor{" +
                "mayores=" + mayores +
                '}';
    }
}
