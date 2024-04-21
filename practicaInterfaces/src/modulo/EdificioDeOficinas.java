package modulo;

import java.util.ArrayList;

public class EdificioDeOficinas extends Edificio{

    //atributos
    private int cantOficinas;

    //constructor
    public EdificioDeOficinas(String nombre, double largo, double ancho, int cantOficinas) {
        super(nombre, largo, ancho);
        this.cantOficinas = cantOficinas;
    }

    //getters y setters
    public int getCantOficinas() {
        return cantOficinas;
    }


    public void setCantOficinas(int cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    //metodos

    public String imprimir()
    {
        return super.imprimir()+" cantidad de oficinas:  "+getCantOficinas();
    }

}
