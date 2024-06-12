import Modelo.SobrepasaCantidadException;
import Modelo.Tablas;

import java.io.EOFException;

public class Main {
    public static void main(String[] args)
    {
        Tablas tablas = new Tablas();
       tablas.cargarTablaColorOjos();
        tablas.cargarTablaPosiciones();

        try
        {
            tablas.verificarCantidad("posicion","tanque",4);
        } catch (SobrepasaCantidadException e) {
            System.out.println(e.getMessage());
        }
        tablas.guardarEnArchivoPorSueldo(3000);
       try {
            tablas.leerArchivo();
        } catch (EOFException e) {
            e.printStackTrace();
        }

    }
}