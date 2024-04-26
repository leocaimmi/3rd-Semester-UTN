import modulo.Coche;
import modulo.Concesionario;

import java.util.ArrayList;
import java.util.Scanner;

//Para este TP tuve que buscar documentacion acerca de ArrayList. Aunque con los conocimientos de como funciona fue mucho mas facil de entender
public class Main
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {

        int op;
        Concesionario nuevoConcesionario = new Concesionario();
        cargarNombreConcesionario(nuevoConcesionario);
        do
        {
            System.out.println("""
                    1.Si quiere cargar autos en el sistema.
                    2.Si quiere aumentar o decrementar la velocidad de algun coche.
                    3.Si quiere ver la informacion del concesionario.
                    4.Si quiere finalizar el programa y ver los coches disponibles.
                    """);
            System.out.println("Que desea hacer: ");
            op = scanner.nextInt();
            switch (op)
            {
                case 1:
                    cargarConcesionario(nuevoConcesionario);
                    break;
                case 2:
                    if(nuevoConcesionario.getCocheDisponibles().size()>0)
                    {
                        modificarVelocidadCoche(nuevoConcesionario);
                    }else
                    {
                        System.out.println("No hay coches disponibles para modificar");
                    }
                    break;
                case 3:
                    System.out.println(nuevoConcesionario.mostrarCochesDisponibles());
                    break;
                case 4:
                    op = 4;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        }while(op == 1|| op == 2||op == 3);//si quiere seguir con la carga o finalizar el programa
        System.out.println(nuevoConcesionario.mostrarCochesDisponibles());
        scanner.close();
    }
    //carga de concesionario
    public static void cargarNombreConcesionario(Concesionario nuevoConcesionario)
    {
        System.out.println("Ingrese el nombre del Concesionario: ");
        nuevoConcesionario.setNombreConcesionario(scanner.nextLine());
    }
    public static void cargarConcesionario(Concesionario nuevoConcesionario)
    {
        ArrayList<Coche> listaCoche = new ArrayList<>();
        int op = 1;
        do{


            Coche coche = new Coche();
            cargarUnCoche(coche);
            listaCoche.add(coche);

            System.out.println("""
                    1.Para cargar otro coche.
                    2.Finalizar la carga y volver al menu.
                    """);
            System.out.println("Que desea hacer: ");
            op = scanner.nextInt();
            scanner.nextLine();

        }while(op == 1);//1 para seguir creando autos.

        nuevoConcesionario.setCocheDisponibles(listaCoche);
    }
    public static void cargarUnCoche(Coche pCoche)
    {
        scanner.nextLine();//funciona como fflush en C. Basicamente limpia el buffer para que me deje cargar sin errores
        System.out.println(".....INGRESE LOS DATOS DEL NUEVO COCHE.....");
        System.out.println("Ingrese la marca del coche: ");
        pCoche.setMarca(scanner.nextLine());
        System.out.println("Ingrese el modelo del coche: ");
        pCoche.setModelo(scanner.nextLine());
        System.out.println("Ingrese cuando el anio de fabricacion: ");
        pCoche.setAnioFabricacion(scanner.nextInt());
        pCoche.setVelocidadActual(0);
    }
    //modificacion de velocidad de los coches

    public static void modificarVelocidadCoche(Concesionario concesionario)
    {
        String cocheModificarVel = "";
        int op;
        Coche aux;
        scanner.nextLine();
        do {
            System.out.println(concesionario.mostrarCochesDisponibles());
            System.out.println("Ingrese el nombre del coche que desee modificar la velocidad: ");
             cocheModificarVel = scanner.nextLine();
        }while (!verificarExistenciaCoche(concesionario,cocheModificarVel));

        for(int i = 0; i < concesionario.getCocheDisponibles().size(); i++)
        {
            if(concesionario.getCocheDisponibles().get(i).getModelo().equals(cocheModificarVel.toLowerCase()))
            {
                System.out.println("""
                        1.Acelerar velocidad.
                        2.Decrementar velocidad.
                        """);
                System.out.println("Que desea hacer: ");
                op = scanner.nextInt();
                aux = concesionario.getCocheDisponibles().get(i);
                System.out.println(aux.obtenerInformacion());

                switch(op)
                {
                    case 1:
                        System.out.println("Ingrese la velocidad para acelerar: ");
                        aux.acelerar(scanner.nextDouble());
                        break;
                    case 2:
                        System.out.println("Ingrese la velocidad para frenar: ");
                        aux.frenar(scanner.nextDouble());
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
            }

        }

    }
    public static boolean verificarExistenciaCoche(Concesionario concesionario, String modeloABuscar)
    {
        boolean flag = false;
        for (int i = 0; i < concesionario.getCocheDisponibles().size(); i++)
        {
            if(concesionario.getCocheDisponibles().get(i).getModelo().equals(modeloABuscar.toLowerCase()))
            {
                flag = true;
            }
        }

        if(!flag)
        {
            System.out.println("Coche no existente");
        }

        return flag;
    }

}