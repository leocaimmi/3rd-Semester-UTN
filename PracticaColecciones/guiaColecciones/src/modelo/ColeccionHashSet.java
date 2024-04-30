package modelo;

import Interfaces.IMetodosColeciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class ColeccionHashSet implements IMetodosColeciones
{
    //atributos
    private HashSet<Integer> hashset;
    //constructores

    public ColeccionHashSet() {
        hashset = new HashSet<>();
    }
    //getters y setters

    public HashSet<Integer> getHashset() {
        return hashset;
    }
//metodos


    @Override
    public String toString() {
        return "ColeccionHashSet{" +
                "hashset=" + hashset +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColeccionHashSet that = (ColeccionHashSet) o;
        return Objects.equals(hashset, that.hashset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashset);
    }

    @Override
    public void agregar(Integer dato)
    {
        hashset.add(dato);
    }

    @Override
    public void eliminar(Integer aBorrar)
    {
    hashset.remove(aBorrar);
    }

    @Override
    public boolean buscar(Integer aBuscar) {

        return hashset.contains(aBuscar);
    }

    @Override
    public String listar()
    {
        String msj = "";
        Iterator<Integer> iterator = hashset.iterator();
        while(iterator.hasNext())
        {
        msj += iterator.next();
        }

        return msj;
    }

    @Override
    public int contar() {
        return hashset.size();
    }
}
