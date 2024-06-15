package Modelo;

import Exceptions.PersonajeNoEncontradoException;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class StarWarsRegistro<T> implements Serializable//personaje
{
    //atributos
    private HashSet<T> personajes;

    //constructores

    public StarWarsRegistro(HashSet<T> personajes) {
        this.personajes = personajes;
    }

    public StarWarsRegistro() {
        personajes = new HashSet<>();
    }
    //getters y setters

    public HashSet<T> getPersonajes() {
        return personajes;
    }
    //metodos

    public boolean agregarPersonaje(T personaje)//: Agrega un personaje al registro.
    {
        boolean rta = false;
        if (personaje != null) {
            personajes.add(personaje);
            rta = true;
        }

        return rta;
    }

    public T obtenerPersonajePorNombre(String nombre) throws PersonajeNoEncontradoException//: Devuelve el primer personaje encontrado en
    {
        T encontrado = null;
        Personaje aux = null;
        boolean flag = false;
        Iterator iterator = personajes.iterator();
        while (iterator.hasNext() && !flag)
        {
            encontrado = (T) iterator.next();//solo si es un personaje
            if (encontrado instanceof Personaje)
            {
                aux = (Personaje) encontrado;
                if (!aux.getNombre().equals(nombre))//si es distinto encontrado es null
                {
                  encontrado = null;
                }
                else//si no significa que lo encontre
                {
                    encontrado = (T) aux;
                    flag = true;
                }

            }
        }
       // System.out.println(encontrado);
        if(encontrado == null)//si no lo encontro
        {
            throw new PersonajeNoEncontradoException(nombre);
        }
        return encontrado;
    }
    public boolean eliminarPersonaje(T personaje)//: Elimina la primera aparición del personaje especificado del registro.
    {
        boolean rta = false;
        if(personaje != null)
        {
            personajes.remove(personaje);
            rta = true;
        }
        return rta;
    }
    public String listarPersonajes()//: Devuelve una lista con todos los personajes del registro.
    {
        return this.toString();
    }
    public void limpiar()//: Elimina todos los personajes del registro.
    {
        personajes.clear();
    }
    @Override
    public String toString() {
        return "StarWarsRegistro{"+
                "personajes=" + personajes +
                '}';
    }
}
