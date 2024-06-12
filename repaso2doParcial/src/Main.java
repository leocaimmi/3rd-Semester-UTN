import Modelo.SobrepasaCantidadException;
import Modelo.Tablas;

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
        tablas.guardarEnArchivoPorSueldo(2000.0);
    }
}