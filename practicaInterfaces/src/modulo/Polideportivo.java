package modulo;

import Interfaces.IInstalacionDeportiva;

import java.util.ArrayList;

public class Polideportivo extends Edificio implements IInstalacionDeportiva {
    //atributos
    private String tipoInstalacion;


    //constructores
    public Polideportivo(String nombre, double largo, double ancho,String tipoInstalacion) {
      super(nombre, largo, ancho);
      this.tipoInstalacion = tipoInstalacion;
    }

    //getters y setters
    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    //metodo de la interface
    @Override
    public String tipoDeInstalacion() {//prueba de interface
    return tipoInstalacion;
    }

    public String imprimir()
    {
        return super.imprimir()+" tipo de instalacion: "+tipoDeInstalacion();
    }

}
