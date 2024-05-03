package modelo;

import java.util.Objects;

public class EntradaGeneral extends Entrada{

    //atributos
    private String zona;
    //constructores

    public EntradaGeneral(int id, double precio, boolean disponibilidad, String zona) {
        super(id, precio, disponibilidad);
        this.zona = zona;
    }

    public EntradaGeneral()
    {
        super(0, 0, false);
        zona = "Sin zona";
    }
    //getters y setters

    public String getZona() {
        return zona;
    }

    //metodos

    @Override
    public boolean equals(Object o) {
       boolean rta = false;

       if(o !=null)
       {
           if(o instanceof EntradaGeneral)
           {
               EntradaGeneral aComparar = (EntradaGeneral) o;
               if(getId() == aComparar.getId())
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
                "zona='" + zona + '\'' +
                '}';
    }

    @Override
    public String obtenerTipo() {
        return "Entrada General";//tipo de entrada
    }

    @Override
    public double obtenerPrecio() {
        return getPrecio();//me devuelve el precio base de la entrada
    }
}
