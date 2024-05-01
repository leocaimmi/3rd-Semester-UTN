package modelo;

import java.util.ArrayList;
import java.util.Objects;

public class Mamifero extends Animal {
    //atributos
    private ArrayList<String> habilidad;
    private String pelaje;
    //constructores

    public Mamifero(String especie, String nombre, int edad, String estadoSalud, ArrayList<String> habilidad, String pelaje) {
        super(especie, nombre, edad, estadoSalud);
        this.habilidad = new ArrayList<>();
        this.pelaje = pelaje;
    }
    public Mamifero()
    {
        super("Sin especie", "Sin nombre", 0, "Sin estado de salud");
        habilidad = new ArrayList<>();
        pelaje = "Sin pelaje";
    }

    //getters y setters

    public String getPelaje() {
        return pelaje;
    }

    //metodos
    @Override
    public int calcularValoracion()
    {
        int valoracion = 30;//base o malo
        if(getEstadoSalud().equalsIgnoreCase("regular"))
        {
        valoracion *=2;//duplica la valoracion
        }else if(getEstadoSalud().equalsIgnoreCase("estupendo"))
        {
            valoracion *=3;//triplica la valoracion
        }
        return valoracion;
    }

    @Override
    public boolean equals(Object o) {
        boolean rta = false;
        if (o != null)
        {
            if(o instanceof Mamifero)
            {
                Mamifero aComparar = (Mamifero) o;
                if(this.getNombre().equals(aComparar.getNombre()))
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
        return super.toString() +
                "habilidad=" + habilidad +
                ", pelaje='" + pelaje + '\'' +
                '}';
    }
}
