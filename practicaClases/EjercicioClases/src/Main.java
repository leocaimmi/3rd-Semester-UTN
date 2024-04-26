import modelo.Empleado;
import modelo.Horario;
import modelo.ItemVenta;
import modelo.Rectangulo;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    menu();





    }

    public static void menu()
    {
        int opSw;
        char op;

        do
        {
            opcionesMenu();
            opSw= scanner.nextInt();

            switch(opSw)
            {
                case 1:
                    System.out.println("Rectangulo con atributos inicializados: ");
                    Rectangulo recConValores=new Rectangulo(2.5,5);
                    System.out.println(recConValores);

                    System.out.println("Area: ");
                    System.out.println(recConValores.calcularArea());
                    System.out.println("Perimetro: ");
                    System.out.println(recConValores.calcularPerimetro());

                    System.out.println("Valores modificados: ");
                    recConValores.setAncho(6);
                    recConValores.setLargo(3.5);
                    System.out.println(recConValores);

                    System.out.println("nueva Area: ");
                    System.out.println(recConValores.calcularArea());
                    System.out.println("nuevo Perimetro: ");
                    System.out.println(recConValores.calcularPerimetro());

                    System.out.println("Rectangulo vacio: ");
                    System.out.println(new Rectangulo());
                    break;
                case 2:
                    Empleado empleado1 = new Empleado(23456345,"Carlos","Gutiérrez",25000);
                    Empleado empleado2 = new Empleado(23456345,"Ana","Sánchez",27500);

                    System.out.println("Empleado 1");
                    System.out.println(empleado1);
                    System.out.println("Empleado 2");
                    System.out.println(empleado2);

                    System.out.println("Aumento 15% salario de carlos");
                    empleado1.incrementarSalario(0.15);
                    System.out.println(empleado1.getSalario());
                    System.out.println("Salario Anual");
                    System.out.println(empleado1.getSalarioAnual());


                    break;
                case 3:
                    ItemVenta item1= new ItemVenta();
                    System.out.println("Item 1, sin valores en los atributos: ");
                    System.out.println(item1);

                    ItemVenta item2= new ItemVenta(1,"Mate",30,5000);
                    System.out.println("Item 2: ");
                    System.out.println(item2);

                    break;
                case 4:
                    Horario reloj=new Horario();

                    System.out.println("Reloj sin valores");
                    System.out.println(reloj.getHoraCompleta());

                    reloj.setHora(0);
                    reloj.setMinutos(0);
                    reloj.setSegundos(0);
                    System.out.println("Reloj con valores");
                    System.out.println(reloj.getHoraCompleta());

                    reloj.avanzarUnSegundo();
                    System.out.println(reloj.getHoraCompleta());

                    reloj.retrasarUnSegundo();
                    reloj.retrasarUnSegundo();
                    System.out.println(reloj.getHoraCompleta());
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            System.out.println("Desea continuar? s/n");
            scanner.nextLine();
            op=scanner.nextLine().charAt(0);

        }while(op == 's');




    }
    public static void opcionesMenu()
    {
        System.out.println("""
                1.clase rectangulo
                2.clase empleado
                3.clase itemventa
                4.clase horario
                
           
                """);
    }

}