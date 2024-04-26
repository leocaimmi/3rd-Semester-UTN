package modulo;

import java.util.ArrayList;

public class Concesionario
{
    //atributos
    private String nombreConcesionario;
    private ArrayList<Coche> cocheDisponibles = new ArrayList<>();//almacena una lista de coches disponibles en el concesionario.

    //constructores
    public Concesionario()
    {
        setNombreConcesionario("Sin nombre");
        //cocheDisponibles = new ArrayList<>();
    }
    //getters y setters

    public ArrayList<Coche> getCocheDisponibles() {
        return cocheDisponibles;
    }

    public String getNombreConcesionario() {
        return nombreConcesionario;
    }

    public void setCocheDisponibles(ArrayList<Coche> cocheDisponibles) {
        this.cocheDisponibles = cocheDisponibles;
    }

    public void setNombreConcesionario(String nombreConcesionario) {
        this.nombreConcesionario = nombreConcesionario;
    }

    //metodos
    public void agregarCoche(Coche coche)// agrega un coche a la lista de coches disponibles en el concesionario.
    {
        cocheDisponibles.add(coche);
    }
    public String mostrarCochesDisponibles()//muestra por pantalla la información de todos los coches disponibles en el concesionario
    {
        Coche coche = new Coche();
        String rta = "";
        for(int i = 0;i<cocheDisponibles.size();i++)
        {
            coche = cocheDisponibles.get(i);
            rta += coche.obtenerInformacion();
        }
        return rta;
    }
}
