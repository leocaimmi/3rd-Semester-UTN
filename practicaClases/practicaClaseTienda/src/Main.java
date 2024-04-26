import modulo.Tienda;

import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        Tienda tienda = new Tienda();
        int op = 1;


        System.out.println("Ingrese el nombre de la tienda: ");
        tienda.setNombre(scanner.nextLine());
        do
        {
            if(op == 1)
            {
                System.out.println("Ingrese el nuevo producto");
                System.out.println(tienda.agregarProducto(scanner.nextLine()));

            }

            System.out.println("""
                    1.Continuar cargando productos
                    2.Mostrar productos de la tienda
                    3.Finalizar programa
                    """);
            System.out.println("Que desea hacer");
            op = scanner.nextInt();
            if(op == 2|| op == 3)
            {
                System.out.println(tienda.mostrarProducto());
            }
            scanner.nextLine();


        }while(op == 1||op ==2);



    }

}