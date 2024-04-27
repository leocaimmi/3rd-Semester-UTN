import modelo.Autor;
import modelo.Libro;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Instanciando un autor: ");

        Autor autor=new Autor("Joshua","Bloch", "joshua@email.com",'M');
        System.out.println(autor);


        System.out.println("Instanciando un libro: ");

        Libro nuevoLibro= new Libro("Effective Java",450, 150, autor);
        System.out.println(nuevoLibro);

        System.out.println("Modificando precio y stock del objeto libro: ");
        nuevoLibro.setPrecio(nuevoLibro.getPrecio()+50);//
        nuevoLibro.setStock(nuevoLibro.getStock()+50);//
        System.out.println(nuevoLibro);


        System.out.println("Imprimiendo al autor dentro del libro");
        System.out.println(nuevoLibro.getAutor());

        System.out.println("Mensaje de venta: ");
        System.out.println(nuevoLibro.mensajeDeVenta());

    }
}