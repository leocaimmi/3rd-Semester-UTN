package modelo;

import Interfaces.IMetodosColeciones;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class ColeccionTreeSet implements IMetodosColeciones{

    //atributos

    private TreeSet<Integer> treeSet;

    //constructores

    public ColeccionTreeSet()
    {
        treeSet = new TreeSet<>();
    }
    //get y set

    public TreeSet<Integer> getTreeSet() {
        return treeSet;
    }

    @Override
    public void agregar(Integer dato)
    {
    treeSet.add(dato);
    }

    @Override
    public void eliminar(Integer aborrar)
    {
    treeSet.remove(aborrar);
    }

    @Override
    public boolean buscar(Integer aBuscar) {
        return treeSet.contains(aBuscar);
    }

    @Override
    public String listar() {
        String msj = "";

        for (Integer aux : treeSet) {
            msj += aux;//redundante porque tenemos toString
        }
        return msj;
    }

    @Override
    public int contar() {
    return treeSet.size();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColeccionTreeSet that = (ColeccionTreeSet) o;
        return Objects.equals(treeSet, that.treeSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treeSet);
    }

    @Override
    public String toString() {
        return "ColeccionTreeSet{" +
                "treeSet=" + treeSet +
                '}';
    }


}
