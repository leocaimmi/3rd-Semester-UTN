package modulo;

import java.util.ArrayList;

public abstract class Edificio {
    //atributos
    private String nombre;
    private double largo,ancho;
//constructores

    public Edificio(String nombre, double largo, double ancho) {
        this.nombre = nombre;
        this.largo = largo;
        this.ancho = ancho;
    }



    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    //metodos
   public  double getSuperficieEdificio()
   {
       return getLargo()*getAncho();
   }

   public String imprimir()
   {
       return "Nombre: "+getNombre()+" Superficie "+getLargo()*getAncho()+" ";
   }
}
