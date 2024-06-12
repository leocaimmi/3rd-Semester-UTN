package Modelo;

import JSON.JsonUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.helpers.ParserAdapter;

import java.io.*;
import java.util.HashSet;

public class Tablas  {
    //atributos
    private ContenedorGenerico<String,Jugador> tablaColorOjos;
    private ContenedorGenerico<String,Jugador> tablaPosicion;

    //constructores
    public Tablas()
    {
        tablaColorOjos = new ContenedorGenerico<>();
        tablaPosicion = new ContenedorGenerico<>();
    }
    //getters y setters

    public ContenedorGenerico<String, Jugador> getTablaColorOjos() {
        return tablaColorOjos;
    }

    public ContenedorGenerico<String, Jugador> getTablaPosicion() {
        return tablaPosicion;
    }

    //metodos
    public void cargarTablaColorOjos()
    {
        Jugador jugador = null;
        HashSet<Jugador> jugadorAgregar = null;
        try
        {

            JSONArray jsonArray = new JSONArray(JsonUtiles.leer("jugadores"));

            for(int i = 0; i<jsonArray.length();i++)
            {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                JSONObject jsonName = jsonObject.getJSONObject("name");

                name n = new name(jsonName.getString("first"),jsonName.getString("last"));
                 jugador = new Jugador(jsonObject.getString("_id"),
                         jsonObject.getString("guid"),
                         jsonObject.getBoolean("isActive"),
                         jsonObject.getString("balance"),
                         jsonObject.getInt("age"),
                         jsonObject.getString("eyeColor"),
                         n,
                         jsonObject.getString("email"),
                         jsonObject.getString("phone"),
                         jsonObject.getString("position"));
                if (tablaColorOjos.getTabla().containsKey(jugador.getEyeColor()))
                {
                   jugadorAgregar= tablaColorOjos.getTabla().get(jugador.getEyeColor());//agarro el hashset
                   jugadorAgregar.add(jugador);
                }
                else
                {
                    jugadorAgregar = new HashSet<>();
                    jugadorAgregar.add(jugador);
                    tablaColorOjos.agregar(jugador.getEyeColor(),jugadorAgregar);//si no existe la clave la creo yo
                }

            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

    }
    public void cargarTablaPosiciones()
    {
        Jugador jugador = null;
        HashSet<Jugador> jugadorAgregar = null;
        try
        {

            JSONArray jsonArray = new JSONArray(JsonUtiles.leer("jugadores"));

            for(int i = 0; i<jsonArray.length();i++)
            {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                JSONObject jsonName = jsonObject.getJSONObject("name");

                name n = new name(jsonName.getString("first"),jsonName.getString("last"));
                jugador = new Jugador(jsonObject.getString("_id"),
                        jsonObject.getString("guid"),
                        jsonObject.getBoolean("isActive"),
                        jsonObject.getString("balance"),
                        jsonObject.getInt("age"),
                        jsonObject.getString("eyeColor"),
                        n,
                        jsonObject.getString("email"),
                        jsonObject.getString("phone"),
                        jsonObject.getString("position"));
                if (tablaPosicion.getTabla().containsKey(jugador.getPosicion()))
                {
                    jugadorAgregar= tablaPosicion.getTabla().get(jugador.getPosicion());
                    jugadorAgregar.add(jugador);
                }
                else
                {
                    jugadorAgregar = new HashSet<>();
                    jugadorAgregar.add(jugador);
                    tablaPosicion.agregar(jugador.getPosicion(),jugadorAgregar);
                }

            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
    /*Hacer un método que dada una tabla X, una clave Y y un entero Z,
    retorne la cantidad de elementos. Si la cantidad supera al parámetro Z,
     lanzar una excepción que contenga nombre del mapa, clave y la diferencia entre Z y la cantidad real.
Ej: tabla “colores”, clave “green”, cantidad 3.
 Si hay tres o más jugadores con esa clave, lanzó la excepción y me quedo con la cantidad real - 3 (3 es el parámetro que envió) 25 pts*/

    public int verificarCantidad(String tablaSelecta,String clave,int cantidadAverificar) throws SobrepasaCantidadException
    {
        ContenedorGenerico tablaSelectaMap;
        if(tablaSelecta.equalsIgnoreCase("color"))
        {
             tablaSelectaMap = tablaColorOjos;
        }else
        {
             tablaSelectaMap = tablaPosicion;
        }

             if(cantidadAverificar > tablaSelectaMap.contar())
            {
                throw new SobrepasaCantidadException(tablaSelecta,clave,cantidadAverificar-tablaSelectaMap.contar());
            }

        return tablaSelectaMap.contar();
    }
    /*Guardar en un archivo binario de objetos todos los jugadores cuyo sueldo superen un parámetro enviado.  20 pts.*/

    public boolean guardarEnArchivoPorSueldo(double sueldo) {
        boolean rta = false;
        JSONArray jsonArray;
        JSONObject jsonObject;
        Jugador jugador;
        ObjectOutputStream out = null;
        try {
            jsonArray = new JSONArray(JsonUtiles.leer("jugadores"));//se puede modularizar porque la reutilizo 2 veces
            FileOutputStream fileOut = new FileOutputStream("clienteSueldos.bin");//permite el flujo de salida de datos
            out = new ObjectOutputStream(fileOut);//crea un flujo de salida de objetos a partir de los datos(bytes)

            for (int i = 0; i < jsonArray.length(); i++)
            {

                jsonObject = jsonArray.getJSONObject(i);
                JSONObject jsonName = jsonObject.getJSONObject("name");

                name n = new name(jsonName.getString("first"), jsonName.getString("last"));
                jugador = new Jugador(jsonObject.getString("_id"),
                        jsonObject.getString("guid"),
                        jsonObject.getBoolean("isActive"),
                        jsonObject.getString("balance"),
                        jsonObject.getInt("age"),
                        jsonObject.getString("eyeColor"),
                        n,
                        jsonObject.getString("email"),
                        jsonObject.getString("phone"),
                        jsonObject.getString("position"));
                String sueldoJugadorSinCaracteres = jugador.getBalance().replace("$","").replace(",","");
                double sueldoJugador = Double.parseDouble(sueldoJugadorSinCaracteres);
                if (sueldoJugador >= sueldo)
                {
                    //lo guardo en el archivo
                    out.writeObject(jugador);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally
        {
            try {
                System.out.println("Archvio guardado de manera correcta");
                out.close();//cierro el flujo de datos
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return rta;
    }


    @Override
    public String toString() {
        return "Tablas{" +
                "tablaColorOjos=" + tablaColorOjos +
                ", tablaPosicion=" + tablaPosicion +
                '}';
    }
}
