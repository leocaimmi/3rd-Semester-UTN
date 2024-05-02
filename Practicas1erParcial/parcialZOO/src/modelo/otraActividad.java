package modelo;

import Interfaces.IValoracion;

public class otraActividad implements IValoracion {
    //atributos
    private String otraActividad;
    //constructores

    public otraActividad(String otraActividad) {
        this.otraActividad = otraActividad;
    }
    public otraActividad()
    {
        otraActividad = "Sin actividad";
    }

    //getters y setters

    public String getOtraActividad() {
        return otraActividad;
    }

    public void setOtraActividad(String otraActividad) {
        this.otraActividad = otraActividad;
    }

    //metodos




    @Override
    public int calcularValoracion() {
        return 0;
    }
}
