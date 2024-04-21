/*CONSIGNA
Una instalación deportiva es un recinto delimitado donde se practican deportes,
en Java interesa disponer de un método int getTipoDeInstalacion().
Un edificio es una construcción cubierta y en Java interesa disponer de un método double getSuperficieEdificio().
 Un polideportivo es al mismo tiempo una instalación deportiva y un edificio;
 en Java interesa conocer la superficie que tiene y el nombre que tiene. Un edificio de oficinas es un edificio;
 en Java interesa conocer el número de oficinas que tiene.
Definir las clases e interfaces necesarias para representar la situación anterior.
 En una clase test con el método main,
 crear un ArrayList que contenga tres polideportivos y dos edificios de oficinas,
 recorrer la colección y mostrar los atributos de cada elemento.
 ¿Entre qué clases existe una relación que se asemeja a la herencia múltiple?

 */
import modulo.EdificioDeOficinas;
import modulo.Polideportivo;
import modulo.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        Test estructura=new Test(new ArrayList<>());
        menu(estructura);



        scanner.close();
    }

    public static void menu(Test estructura)
    {

        int opSw,cantOficinas = 0;
        double largo = 0,ancho = 0;
        String nombre = null,tipoInstalacion = null;


        do
        {
            System.out.println("""
                    1.Agregar Oficina
                    2.Agregar polideportivo
 
                    """);
            opSw = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese el nombre: ");
            nombre = scanner.nextLine();

            System.out.println("Ingrese el ancho: ");
            ancho = scanner.nextDouble();
            System.out.println("Ingrese el largo: ");
            largo = scanner.nextDouble();

            switch (opSw)
            {

                case 1:

                    System.out.println("Cuantas oficinas tiene su edificio: ");
                    cantOficinas = scanner.nextInt();

                    EdificioDeOficinas oficina = new EdificioDeOficinas(nombre,largo,ancho,cantOficinas);
                    estructura.agregarEstructuras(oficina);
                    //imprimirOficinas(estructura);

                    break;
                case 2:
                    System.out.println("Que tipo de instalacion tiene: ");
                    tipoInstalacion = scanner.nextLine();
                    Polideportivo poli = new Polideportivo(nombre,largo,ancho,tipoInstalacion);
                    estructura.agregarEstructuras(poli);
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }

            System.out.println("""
                    1.Para seguir con el programa.
                    2.Para finalizar.
                    """);
            opSw = scanner.nextInt();

        }while(opSw == 1);
        estructura.imprimir();
    }


}