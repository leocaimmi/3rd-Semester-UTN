import Modelo.Diputado;
import Modelo.Legislador;
import Modelo.Persona;
import Modelo.Senador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int op,opSw;
        String nombre,provincia;
        ArrayList<Persona> legisladores = new ArrayList<>();


        do
        {

            System.out.println("------INFORMACION DEL LEGISLADOR------");

            System.out.println("Ingrese el nombre: ");
            nombre = scanner.nextLine();

            System.out.println("Ingrese a que provincia pertenece: ");
            provincia = scanner.nextLine();

            System.out.println("""
                    1.Para cargar un diputado.
                    2.Para cargar un senador.
                    3.Para ver el registro.
                    """);
            opSw = scanner.nextInt();

            switch (opSw)
            {
                case 1:
                    legisladores.add(new Diputado(nombre,provincia,"diputados"));
                    break;
                case 2:
                    legisladores.add(new Diputado(nombre,provincia,"Senadores"));
                    break;
                case 3:
                    imprimir(legisladores);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            System.out.println("""
                    1.Para seguir en el sistema
                    2.Para finalizar y ver el registro final
                    """);
                    op = scanner.nextInt();
            scanner.nextLine();
        }while(op == 1);
        imprimir(legisladores);
        scanner.close();
    }

    public static void imprimir(ArrayList<Persona> legisladores)
    {

        for(Persona l : legisladores)
        {
            System.out.println(l.imprimir());
        }
    }
}