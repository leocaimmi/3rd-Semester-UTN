package modelo;

import java.util.ArrayList;

public class Contenedor <E>{
    //atributos
    private ArrayList<E> elementitoContenido;

    //constructores

    public Contenedor(){
        elementitoContenido=new ArrayList<>();
    }
    //get y set

    public ArrayList<E> getElementitoContenido() {
        return elementitoContenido;
    }

    //metodos
    public Boolean agregar(E e)
    {
        return elementitoContenido.add(e);
    }
    public Boolean eliminar(E e)
    {
        return elementitoContenido.remove(e);
    }
    public Boolean contiene(E e)
    {
        return elementitoContenido.contains(e);
    }
    public Integer contar()
    {
        return elementitoContenido.size();
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "elementitoContenido=" + elementitoContenido +
                '}';
    }
}
