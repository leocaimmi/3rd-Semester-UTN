package Modelo;

import Excepciones.CantidadException;
import Excepciones.MenoresException;
import json.JsonUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Controladora
{
    //atributos
    /*
     La lista del punto 1 deberá ser creada en una clase genérica donde deberán aplicar
 restricción de genericidad para acceder a los métodos pertinentes
     */
    private ListaMayor<Persona> mayor;
    /*
    Desde la lista genérica pasar a un hashset todos los autores. Implementar el equals
     */
    private HashSet<Friend> autores;
    /*
    Desde la lista genérica pasar un hashmap todas las etiquetas. La clave será el id de la
 persona y el valor un arraylist con las etiquetas.
     */
    private HashMap<String,ArrayList<String>> etiquetas;

    //constructores
    public Controladora()
    {
        mayor = new ListaMayor<>();
        autores = new HashSet<>();
        etiquetas = new HashMap<>();
    }
    //getters y setters

    public ListaMayor<Persona> getMayor() {
        return mayor;
    }

    public HashSet<Friend> getAutores() {
        return autores;
    }

    public HashMap<String, ArrayList<String>> getEtiquetas() {
        return etiquetas;
    }
    //metodos
    public void cargarMayoresJavaToJSON()  {
        JSONObject jsonObject;
        JSONArray jsonArray;
        Persona aux;
        ArrayList<String> tags = new ArrayList<>();
        ArrayList<Friend> friends = new ArrayList<>();
        try {
             jsonArray = new JSONArray(JsonUtiles.leer("archivo"));//leo el JSON
            for(int i = 0;i<jsonArray.length();i++)
            {
                 jsonObject = jsonArray.getJSONObject(i);
                 JSONArray tagsJSON = jsonObject.getJSONArray("tags");

                for(int j = 0;j<tagsJSON.length();j++)//voy a agarrar todos los tags que son strings
                 {
                     tags.add(tagsJSON.getString(j));
                 }
                 JSONArray friendJSON = jsonObject.getJSONArray("friends");

                for (int k = 0;k<friendJSON.length();k++)//voy a agarrar todos los friends
                 {
                     JSONObject jsonObject1 = friendJSON.getJSONObject(k);
                     String name = jsonObject1.getString("name");
                     int id = jsonObject1.getInt("id");
                     friends.add(new Friend(id,name));
                 }
                 aux = new Persona(jsonObject.getString("_id"),
                         jsonObject.getBoolean("isActive"),
                         jsonObject.getString("eyeColor"),
                         jsonObject.getString("balance"),
                         jsonObject.getString("name"),
                         jsonObject.getString("gender"),
                         jsonObject.getInt("age"),
                         tags,
                         friends);
                if(aux.getAge()<18)
                {
                    MenoresException exception = new MenoresException(aux.getAge());
                    exception.printStackTrace();
                }
                else
                {
                    mayor.agregar(aux);
                }
            }


        } catch (JSONException e) {
            throw new RuntimeException(e);
        }


    }
    //Desde la lista genérica pasar a un hashset todos los autores. Implementar el equals
    public void pasarAutoresDeListaAHashSet()//lo hago con friends porque los autores no estan en el JSON...
    {
        ArrayList<Friend> friends = null;
        for(Persona e: mayor.getMayores())
        {
            friends = e.getFriends();
        }
        assert friends != null;//le aviso que nunca va a ser null
        autores.addAll(friends);

    }
    /*
     Desde la lista genérica pasar un hashmap todas las etiquetas. La clave será el id de la
 persona y el valor un arraylist con las etiquetas.
     */
public void pasarEtiquetasDeListaAHashMap()
{
    ArrayList<String>tagsAux;
    for(Persona e: mayor.getMayores())
    {
        tagsAux = e.getTags();
        etiquetas.put(e.get_id(),tagsAux);
    }

}
/*
Hacer un función que devuelva la cantidad de etiquetas según un parámetro enviado por
 parámetro. También se envía el id del usuario. Si la clave no existe, lanzar una excepción
 propia
 */
    public int contarCantidadEtiquetasXID(String idPersona,int cantidad)
    {
        ArrayList<String>tags =  etiquetas.get(idPersona);
        if(tags.size()!= cantidad)
        {
            CantidadException exception = new CantidadException(tags.size()-cantidad);
            exception.printStackTrace();
        }
        return tags.size();
    }
    /**FUNCIONES QUE NO ESTAN EN EL PARCIAL PERO SON PARA PRACTICAR*/
    public boolean guardarListaMayoresArchivo()
    {
        boolean rta = false;

        ObjectOutputStream out = null;
        try
        {
            FileOutputStream fileOutputStream = new FileOutputStream("mayores.bin");
            out = new ObjectOutputStream(fileOutputStream);
            for(Persona e : mayor.getMayores())
            {
                out.writeObject(e);
            }
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
            try
            {
                out.close();
                rta = true;
            } catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        }


        return rta;
    }
    public void leerArchivoMayores()
    {

        FileInputStream fileInputStream;
        ObjectInputStream in = null;
        try
        {
             fileInputStream = new FileInputStream("mayores.bin");
             in = new ObjectInputStream(fileInputStream);
             while(true)
             {
                 mayor.agregar((Persona) in.readObject());
             }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {

                in.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }

        }

    }
    @Override
    public boolean equals(Object o) {
       boolean rta = false;
        if(o != null)
        {
            if(o instanceof Persona aComaparar)
            {
                if(aComaparar.get_id().equals(((Persona) o).get_id()))
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
        return "Controladora{" +
                "mayor=" + mayor +"\n"+
                ", autores=" + autores +"\n"+
                ", etiquetas=" + etiquetas +
                '}';
    }
}
