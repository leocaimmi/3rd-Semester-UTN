package modelo;

import java.util.ArrayList;

public class GestorDelJuego
{
    //atributos
    private ArrayList<Personaje> personajes;
    private ArrayList<Objeto> objetos;
    //constructores
    public GestorDelJuego()
    {
        personajes = new ArrayList<>();
        objetos = new ArrayList<>();

    }
    //getters y setters


    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public ArrayList<Objeto> getObjetos() {
        return objetos;
    }

    //metodos

    public void agregarPersonaje(Personaje aAgregar)
    {
        personajes.add(aAgregar);
    }
    public void agregarObjetos(Objeto aAgregar)
    {
        objetos.add(aAgregar);
    }





    @Override
    public String toString() {//funcion de enlistar.
        return "\n"+"GestorDelJuego{" +
                "personajes=" + personajes +
                ", objetos=" + objetos +
                '}';
    }
}
