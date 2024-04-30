package modelo;

import Interfaces.IMetodosColeciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapasHashMap implements IMetodosColeciones
{
    //atributos
    private HashMap<Integer,Integer> hashMap;

    //constructores
    public MapasHashMap()
    {
        hashMap = new HashMap<>();
    }
    //metodos

    @Override
    public String toString() {
        return "MapasHashMap{" +
                "hashMap=" + hashMap +
                '}';
    }

    @Override
    public void agregar(Integer dato) {
        hashMap.put(dato,dato);
    }

    @Override//la key
    public void eliminar(Integer aBorrar) {
        hashMap.remove(aBorrar);
    }

    @Override
    public boolean buscar(Integer aBuscar) {
        return hashMap.containsKey(aBuscar);
    }

    @Override
    public String listar() {
        String msj = "";

        Iterator <Map.Entry<Integer,Integer>> entryIterator = hashMap.entrySet().iterator();
        while(entryIterator.hasNext())
        {
            msj += entryIterator.next()+"\n";
        }
        return msj;
    }

    @Override
    public int contar() {
        return hashMap.size();
    }
}
