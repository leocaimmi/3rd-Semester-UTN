package Modelo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ControladorStarWars
{
    //atributos
    StarWarsRegistro<Personaje> personajeStarWarsRegistro;
    //constructor

    public ControladorStarWars() {
        this.personajeStarWarsRegistro = new StarWarsRegistro<>();
    }
    //getters y setters
    public StarWarsRegistro<Personaje> getPersonajeStarWarsRegistro() {
        return personajeStarWarsRegistro;
    }
    //metodos
    public void cargarPersonajesJSONtoJAVA()
    {
        try
        {
            JSONObject jsObject = new JSONObject(JsonUtiles.leer("starwars"));
            JSONArray jsonArray = jsObject.getJSONArray("personajes");
            Personaje personaje = null;
            JSONObject agarrarDelJSONArray = null;
            for(int i = 0; i<jsonArray.length();i++)
            {
                personaje = new Personaje();
                agarrarDelJSONArray = jsonArray.getJSONObject(i);
                personaje.setNombre(agarrarDelJSONArray.getString("nombre"));
                personaje.setEdad(agarrarDelJSONArray.getInt("edad"));
                personaje.setJedi(agarrarDelJSONArray.getBoolean("jedi"));

                //agarrar Maestro
                JSONObject jsonMaestro = agarrarDelJSONArray.getJSONObject("maestro");

                JSONArray JSONHabilidadesMaestro = new JSONArray();
                Maestro maestro = new Maestro();
                ArrayList<String> habilidadesMaestro = new ArrayList<>();//lo inicializo porque necesito que en cada vuelta se formatee
                maestro.setNombre(jsonMaestro.getString("nombre"));
                maestro.setEs_jedi(jsonMaestro.getBoolean("es_jedi"));
                JSONHabilidadesMaestro = jsonMaestro.getJSONArray("habilidades");
                for(int j = 0;j<JSONHabilidadesMaestro.length();j++)
                {
                    habilidadesMaestro.add(JSONHabilidadesMaestro.getString(j));
                }
                maestro.setHabilidades(habilidadesMaestro);
                personaje.setMaestro(maestro);

                //amigos
                JSONArray jsonAmigosArray = agarrarDelJSONArray.getJSONArray("amigos");
                JSONObject jsonAmigosObject = new JSONObject();
                JSONObject jsonAmigosNave = new JSONObject();
                ArrayList<Amigo>amigos = new ArrayList<>();
                for(int k = 0;k<jsonAmigosArray.length();k++)
                {
                    jsonAmigosObject = jsonAmigosArray.getJSONObject(k);
                    Nave nave = new Nave();
                    Amigo amigo = new Amigo();
                    if(!jsonAmigosObject.isNull("nave"))
                    {
                        jsonAmigosNave = jsonAmigosObject.getJSONObject("nave");
                        System.out.println(jsonAmigosNave);
                        nave.setNave(jsonAmigosNave.getString("nombre"));
                        nave.setModelo(jsonAmigosNave.getString("modelo"));
                        amigo.setNave(nave);
                    }

                    amigo.setNombre(jsonAmigosObject.getString("nombre"));
                    amigo.setPiloto(jsonAmigosObject.getBoolean("piloto"));

                    amigos.add(amigo);

                }
                personaje.setAmigo(amigos);

                //cargar eventos
                JSONArray jsonEventosArray = agarrarDelJSONArray.getJSONArray("eventos");
                JSONObject jsonEventoObject = new JSONObject();
                ArrayList<Evento>eventos = new ArrayList<>();
                for(int l = 0;l<jsonEventosArray.length();l++)
                {
                    jsonEventoObject = jsonEventosArray.getJSONObject(l);
                    Evento evento = new Evento();
                    evento.setNombre(jsonEventoObject.getString("nombre"));
                    evento.setAnio(jsonEventoObject.getInt("anio"));
                    evento.setGanada(jsonEventoObject.getBoolean("ganada"));
                    eventos.add(evento);
                }
                personaje.setEvento(eventos);
                //System.out.println(personaje);
                personajeStarWarsRegistro.agregarPersonaje(personaje);
            }


        } catch (JSONException e)
        {
            throw new RuntimeException(e);
        }

    }
//Guardar en un archivo binario todas las naves de los personajes. Mostrar dicho archivo. (20 pts)
    public void guardarPersonajesEnArchivoBinario()
    {
        FileOutputStream fileOutputStream;
        ObjectOutputStream out = null;
        try {
             fileOutputStream = new FileOutputStream("personajes.bin");
             out = new ObjectOutputStream(fileOutputStream);
            Iterator iterator = personajeStarWarsRegistro.getPersonajes().iterator();
             while(iterator.hasNext())
             {
                 Personaje personajeAlmacenar = (Personaje) iterator.next();
                 out.writeObject(personajeAlmacenar);
             }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally
        {
            try
            {
                out.close();
            } catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        }


    }

    public ArrayList<Personaje> mostrarArchivoBinario()
    {
        FileInputStream fileInputStream;
        ObjectInputStream in = null;
        ArrayList<Personaje> personajes = null;
        try
        {
             fileInputStream = new FileInputStream("personajes.bin");
             in = new ObjectInputStream(fileInputStream);
             Personaje personaje = new Personaje();
             personajes = new ArrayList<>();
             while(true)
             {
                 personaje = (Personaje) in.readObject();
                 personajes.add(personaje);
             }

        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }finally
        {
            try
            {
                in.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
            return personajes;

        }


    }
    @Override
    public String toString() {
        return "ControladorStarWars{"+
                "personajeStarWarsRegistro=" + personajeStarWarsRegistro +
                '}';
    }
}
