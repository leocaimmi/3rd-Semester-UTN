package modelo;

import java.util.HashSet;
import java.util.Objects;

public class Almacenamiento <E>//genericidad
{
 //atributos
    private HashSet<E> almacenamiento;
    //constructores
    public Almacenamiento()
    {
        almacenamiento = new HashSet<>();
    }
    //Get
    public HashSet<E> getAlmacenamiento() {
        return almacenamiento;
    }
    //metodos
    public boolean agregar(E e)
    {
        return almacenamiento.add(e);
    }
    public boolean remover(E e)
    {
        return almacenamiento.remove(e);
    }

    public boolean buscarObjeto(E e)
    {
        return almacenamiento.contains(e);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Almacenamiento<?> that = (Almacenamiento<?>) o;
        return Objects.equals(almacenamiento, that.almacenamiento);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Almacenamiento{" +
                "almacenamiento=" + almacenamiento +
                '}';
    }
}
