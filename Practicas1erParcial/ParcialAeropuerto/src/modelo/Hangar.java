package modelo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Hangar
{
    //atributos
    private HashSet<TipoDeAviones> aviones;
    private int nroDeHangar;//id

    //constructores

    public Hangar(int nroDeHangar) {
        aviones = new HashSet<>();
        this.nroDeHangar = nroDeHangar;

    }
    //getters y setters

    public HashSet<TipoDeAviones> getAviones() {
        return aviones;
    }


    public int getNroDeHangar() {
        return nroDeHangar;
    }


    //metodos

    public String despegarTodos()
    {
        String rta="";
        Iterator <TipoDeAviones>iterator = aviones.iterator();
        while(iterator.hasNext())
        {
            TipoDeAviones avion = iterator.next();
            rta += avion.despegar()+"\n";
        }
        return rta;
    }
    @Override
    public boolean equals(Object o) {
        boolean rta = false;
        if(o != null)
        {
            if(o instanceof Hangar)
            {
                Hangar aComparar = (Hangar) o;
                if(nroDeHangar == aComparar.getNroDeHangar())
                {
                    rta = true;
                }
            }
        }
        return rta;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "\nHangar{" +
                "aviones=" + aviones +
                ", nroDeHangar=" + nroDeHangar +
                '}';
    }
    public int cantidadDeAvionesDelHangar()
    {
        return aviones.size();
    }
    public void agregarUnAvion(TipoDeAviones avion)
    {
        aviones.add(avion);
    }
}
