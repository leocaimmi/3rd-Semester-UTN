package Modelo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;

/**
Tenemos como fuente de datos muchos jugadores pero vamos a ordenarlos de alguna manera.
Primero una tabla clave-valor por el color de ojos y otra tabla clave-valor por la posición.
 Ambas tablas deben ser contenedores genéricos con métodos para agregar,
  devolver un elemento por clave, listar y contar. El valor de ambas tablas es una colección de jugadores
 */
public class ContenedorGenerico <K,V>
{
    //atributos
    private HashMap<K,HashSet<V>> tabla;

    //constructores
    public ContenedorGenerico()
    {
        tabla = new HashMap<>();
    }
    //getters y setters


    public HashMap<K, HashSet<V>> getTabla() {
        return tabla;
    }

    //metodos
    public boolean agregar(K key,HashSet<V> value)
    {
        boolean rta = false;
        if(value != null)
        {
            tabla.put(key,value);
            rta = true;
        }
        return rta;
    }
    public HashSet<V> devolverElementoPorClave(K key)
    {
        return tabla.get(key);
    }

    public String listar()
    {
        return tabla.toString();
    }
    public int contar()
    {
        return tabla.size();
    }
    @Override
    public String toString()
    {
        return "ContenedorGenerico{" +
                "tabla=" + tabla +
                '}';
    }

}
