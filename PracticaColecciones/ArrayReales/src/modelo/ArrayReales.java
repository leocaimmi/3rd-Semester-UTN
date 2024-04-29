package modelo;

import Interfaces.IEstadisticas;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;

public class ArrayReales implements IEstadisticas
{
    //atributos
        private LinkedHashSet<Double> arrayReales;//es la clase de double

    // constructores
    public ArrayReales() {
        arrayReales = new LinkedHashSet<>();
    }
    public ArrayReales(LinkedHashSet<Double> arrayReales) {
        this.arrayReales = new LinkedHashSet<>();
    }
    //getters y setters
    public LinkedHashSet<Double> getArrayReales() {
        return arrayReales;
    }
    public void setArrayReales(LinkedHashSet<Double> arrayReales) {
        this.arrayReales = arrayReales;
    }
    //metodos


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayReales that = (ArrayReales) o;
        return Objects.equals(arrayReales, that.arrayReales);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "ArrayReales{" +
                "ArrayReales=" + arrayReales +
                '}';
    }
    public String recorrer()
    {
        String msj = "null";
        if(!arrayReales.isEmpty())
        {
            Iterator<Double> iterator = arrayReales.iterator();
            while (iterator.hasNext()) {
                msj += "\n" + String.valueOf(iterator.next());
            }
        }
        return msj;
    }

    @Override
    public double minimo() {

        double aux = 0;
        if(!arrayReales.isEmpty())
        {
            aux = arrayReales.getFirst();
            Iterator<Double> iterator = arrayReales.iterator();
            while(iterator.hasNext())
            {
                if(aux< arrayReales.getFirst())
                {
                    aux = arrayReales.getFirst();
                }
                iterator.next();
            }
        }


        return aux;
    }
    @Override
    public double maximo() {

        double aux = 0;
        if(!arrayReales.isEmpty())
        {
            aux = arrayReales.getLast();
            Iterator<Double> iterator = arrayReales.iterator();
            while(iterator.hasNext())
            {
                if(aux> arrayReales.getLast())
                {
                    aux = arrayReales.getLast();
                }
                iterator.next();
            }
        }

        return aux;
    }

    @Override
    public double sumatorio() {

        double aux = 0;
    if(!arrayReales.isEmpty()) {
        Iterator<Double> iterator = arrayReales.iterator();
        while (iterator.hasNext()) {
            aux += iterator.next();
        }
    }
        return aux;
    }
}
