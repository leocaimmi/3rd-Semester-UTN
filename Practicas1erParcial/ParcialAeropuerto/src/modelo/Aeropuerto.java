package modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class Aeropuerto
{
    //atributos
    private String nombre;
    private String codigoIntenacional;
    private String direccion;
    private int capacidadDeOperacion;//cantidad maxima de aviones en el aeropuerto
    private HashMap<Integer,Hangar> hangares;
    //constructores

    public Aeropuerto(String nombre, String codigoIntenacional, String direccion, int capacidadDeOperacion) {
        this.nombre = nombre;
        this.codigoIntenacional = codigoIntenacional;
        this.direccion = direccion;
        this.capacidadDeOperacion = capacidadDeOperacion;
        hangares = new HashMap<>();
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public String getCodigoIntenacional() {
        return codigoIntenacional;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCapacidadDeOperacion() {
        return capacidadDeOperacion;
    }

    public HashMap<Integer, Hangar> getHangares() {
        return hangares;
    }

    //metodos

    @Override
    public boolean equals(Object o) {
        boolean rta = false;

        if(o != null)
        {

            if(o instanceof Aeropuerto)
            {
                Aeropuerto aux = (Aeropuerto) o;
                if(codigoIntenacional.equals(aux.getCodigoIntenacional()))
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
        return "Aeropuerto"+"\n"+"{" +
                "nombre='" + nombre + '\'' +
                ", codigoIntenacional='" + codigoIntenacional + '\'' +
                ", direccion='" + direccion + '\'' +
                ", capacidadDeOperacion=" + capacidadDeOperacion +
                ", hangares=" + hangares +
                '}';
    }
    public void cargarHangar(Hangar g)
    {
        hangares.put(g.getNroDeHangar(),g);//key el id del hangar, y luego el hangar
    }
    public void agregarAvion(TipoDeAviones nuevoAvion)
    {

       if (nuevoAvion != null)
       {
           if(verificarEspacio())
           {
                   Hangar aux;
                if(nuevoAvion instanceof Comercial)
                {
                            aux = hangares.get(1);//conozco la llave entonces la meto en el hangar correspondiente
                             aux.agregarUnAvion(nuevoAvion);
                }
                else if(nuevoAvion instanceof Privado)
                {
                    aux = hangares.get(2);
                    aux.agregarUnAvion(nuevoAvion);
                }
                else if(nuevoAvion instanceof Militar)
                {
                    aux = hangares.get(3);
                    aux.agregarUnAvion(nuevoAvion);
                }
                else if (nuevoAvion instanceof DeCarga)
                {
                    aux = hangares.get(4);
                    aux.agregarUnAvion(nuevoAvion);
                }
           }
       }
    }

    public boolean verificarEspacio()
    {
        boolean rta = false;
        int contarAviones = 0;

        Iterator <Map.Entry<Integer,Hangar>>iterator = hangares.entrySet().iterator();

       while(iterator.hasNext())
       {
           Map.Entry<Integer,Hangar> datoActual = iterator.next();

           Hangar hangar = datoActual.getValue();
           contarAviones += hangar.cantidadDeAvionesDelHangar();

       }
        if(contarAviones< capacidadDeOperacion)
        {
            rta = true;
        }
        return rta;
    }
    public String despegarTodos(int key)
    {
        String msj = null;

          Hangar aux = hangares.get(key);
            msj= aux.despegarTodos();

        return msj;
    }

}
