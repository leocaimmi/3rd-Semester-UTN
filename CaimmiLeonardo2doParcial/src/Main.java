import Exceptions.PersonajeNoEncontradoException;
import Modelo.ControladorStarWars;
import Modelo.Personaje;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ControladorStarWars controladorStarWars = new ControladorStarWars();
        controladorStarWars.cargarPersonajesJSONtoJAVA();
        System.out.println(controladorStarWars);
        try
        {
            controladorStarWars.getPersonajeStarWarsRegistro().obtenerPersonajePorNombre("Luke Skywalker");
            System.out.println("\nLUKE HA SIDO ENCONTRADO EN UN PLANETA MUY MUY LEJANO\n");
        } catch (PersonajeNoEncontradoException e)
        {
            e.printStackTrace();
        }
        try
        {
            controladorStarWars.getPersonajeStarWarsRegistro().obtenerPersonajePorNombre("gonza");
        } catch (PersonajeNoEncontradoException e)
        {
            e.printStackTrace();
        }
        controladorStarWars.guardarPersonajesEnArchivoBinario();
       ArrayList<Personaje>personajes= controladorStarWars.mostrarArchivoBinario();
        System.out.println("ARCHIVO BINARIO");
        System.out.println(personajes);
    }
}
