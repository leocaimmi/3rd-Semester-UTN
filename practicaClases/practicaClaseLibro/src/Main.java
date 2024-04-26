import modulo.Libro;

import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        Libro[] libro = new Libro[5];
        int i = 0,op = 1;
        String infoLibroArreglos = "";
        while(i < libro.length && op == 1)
        {
            libro[i] = new Libro();
            System.out.println("Ingrese el nombre del libro: ");
            libro[i].setTitulo(scanner.nextLine());
            System.out.println("Ingrese el autor del libro: ");
            libro[i].setAutor(scanner.nextLine());
            System.out.println("Ingrese el anio de lanzamiento del libro: ");
            libro[i].setAniooPublicacion(scanner.nextInt());
            infoLibroArreglos += libro[i].obtenerInformacion();
            i++;
            System.out.println("""
                    1.Cargar otro libro
                    2.Finalizar la carga
                    """);
            op = scanner.nextInt();
            scanner.nextLine();

        }
        if(i >= libro.length)
        {
            System.out.println("El almacen de libros esta lleno");
        }
        System.out.println(infoLibroArreglos);


    }
}