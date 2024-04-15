import Modelo.DVD;
import Modelo.DoME;
import Modelo.Elemento;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        DoME dome = new DoME();
        menu(dome);

        scanner.close();
    }
    public static void menu(DoME dome)
    {
        int op,opSw;

        do
        {
            opcionDeCarga();
            opSw = scanner.nextInt();

            scanner.nextLine();
            switch (opSw)
            {
                case 1:
                    cargarCD(dome);

                    break;
                case 2:
                    cargarDVDS(dome);


                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
            System.out.println("""
                    1.Si desea continuar.
                    2.Si desea finalizar el programa.
                    """);
            op = scanner.nextInt();

        }while(op == 1);
        System.out.println(dome.mostrarArrayList());
    }
    public static Elemento preguntarDatosElemento(DoME dome)
    {
        String auxTitulo,auxComentario;
        int auxDuracion;
        boolean auxEstado;
        System.out.println("Ingrese el titulo: ");
        auxTitulo = scanner.nextLine();
        System.out.println("Ingrese la duracion: ");
        auxDuracion = scanner.nextInt();
        auxEstado = true;
        scanner.nextLine();
        System.out.println("Ingrese un comentario");
        auxComentario = scanner.nextLine();
       // scanner.nextLine();
        return dome.crearUnElemento(auxTitulo,auxComentario,auxDuracion,auxEstado);
    }

    public static void opcionDeCarga()
    {
        System.out.println("""
                    1.Cargar un CD
                    2.Cargar un DVD
                    """);
    }

    private static void cargarCD(DoME dome)
    {
       int op;
        String auxTitulo=null,auxComentario =null;
        boolean auxEstado = true;
        int auxDuracion = 0;
        Elemento auxElemento;
        do
        {
            System.out.println("-----CARGA CD-----");
            auxElemento= preguntarDatosElemento(dome); // primero cargo un elemento auxiliar
            cargarUnCD(dome,auxElemento); //luego creo el CD

            opcionCarga(); // le pregunto al usuario si quiere seguir
            op= scanner.nextInt();
            scanner.nextLine();
        }while(op == 1);

    }
    public static void cargarUnCD(DoME dome,Elemento miElemento)
    {
        int auxCantTemas;
        String auxInterprete;

        System.out.println("Ingrese el artista del CD");
        auxInterprete = scanner.nextLine();
        System.out.println("Ingrese la cantidad de temas del CD");
        auxCantTemas = scanner.nextInt();

        dome.cargarCatalogoCD(miElemento,auxInterprete,auxCantTemas);//en el dome me agrega al arrayList un CD
    }
    public static void opcionCarga()
    {
        System.out.println("""
                    1.Para seguir cargando otro.
                    2.Para volver al menu.
                    """);
    }

    public static void cargarDVDS(DoME dome)
    {
        int op;

        String auxTitulo=null,auxComentario =null;
        boolean auxEstado = true;
        int auxDuracion = 0;
        Elemento auxElemento;

        do {
            System.out.println("-----CARGA DVD-----");
            auxElemento= preguntarDatosElemento(dome);
            cargarUnDvd(dome,auxElemento);

            opcionCarga();
            op= scanner.nextInt();
            scanner.nextLine();
        }while(op==1);
    }

    public static void cargarUnDvd(DoME dome, Elemento miElemento)
    {
        String auxDirector;

        System.out.println("Ingrese el director: ");
        auxDirector= scanner.nextLine();

        dome.cargarCatalogoDVD(miElemento,auxDirector);
    }


}