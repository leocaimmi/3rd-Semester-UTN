import javaUtiles.JsonUtiles;
import modelo.Alumno;
import netscape.javascript.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        JSONArray jsonArray= new JSONArray();
        ArrayList<Alumno>alumnos = new ArrayList<>();

        /*alumnos.add(new Alumno("carlos",12));
        alumnos.add(new Alumno("Manucho",22));
        alumnos.add(new Alumno("MATIDEJOLACARRERA",457));*/




        /*for(int i = 0;i<alumnos.size(); i++)
        {
            JSONObject jsObject= new JSONObject();

            try {
                jsObject.put("nombre",alumnos.get(i).getNombre());
                jsObject.put("edad",alumnos.get(i).getEdad());
            } catch (JSONException e) {
               e.getMessage();
            }
            jsonArray.put(jsObject);
        }*/
        //System.out.println(jsonArray.toString());

        //JsonUtiles.grabar(jsonArray,"Alumnos");

       // String contenido= JsonUtiles.leer("Alumnos");
        //contenido.split("[,]")

       /* try {
            JSONArray array1 = new JSONArray(contenido);

            System.out.println(jsonArray);
            for(int i = 0;i<array1.length();i++)
            {

                alumnos.add(new Alumno(array1.getJSONObject(i).getString("nombre"),array1.getJSONObject(i).getInt("edad")));

            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        System.out.println(alumnos);*/

        //object grabar
        /*alumnos.add(new Alumno("carlos",12));
        alumnos.add(new Alumno("Manucho",22));
        alumnos.add(new Alumno("MATIDEJOLACARRERA",457));
        JSONObject jsObject= new JSONObject();

             jsObject= new JSONObject();

            try {

                jsObject.put("nombre",alumnos.get(i).getNombre());
                jsObject.put("edad",alumnos.get(i).getEdad());
            } catch (JSONException e) {
                e.getMessage();
            }


            JsonUtiles.grabar(jsObject,"alumnosObject");*/
        //leer Json object
        /*String json =JsonUtiles.leer("alumnosObject");
        try {
            JSONObject jsonObject = new JSONObject(json);
            alumnos.add(new Alumno(jsonObject.getString("nombre"),jsonObject.getInt("edad")));
            System.out.println(alumnos);
        } catch (JSONException e) {
            e.getMessage();
        }*/

    }
}