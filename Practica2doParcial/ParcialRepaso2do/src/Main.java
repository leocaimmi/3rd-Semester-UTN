import Excepciones.MenoresException;
import Modelo.Controladora;

public class Main {
    public static void main(String[] args)
    {
        Controladora controladora = new Controladora();

       /*controladora.cargarMayoresJavaToJSON();
        controladora.pasarAutoresDeListaAHashSet();
        controladora.pasarEtiquetasDeListaAHashMap();
       // System.out.println("Cantidad de etiquetas INCORRECTA");
        controladora.contarCantidadEtiquetasXID("649233e6dca4d36d583922fe",20);
        System.out.println("Cantidad de etiquetas CORRECTA");
        System.out.println(controladora.contarCantidadEtiquetasXID("649233e6dca4d36d583922fe",42));
        System.out.println("\n");
        System.out.println(controladora);

        System.out.println(controladora.guardarListaMayoresArchivo());*/
        controladora.leerArchivoMayores();
        System.out.println(controladora.getMayor());
    }
}