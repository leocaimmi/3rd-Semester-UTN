import modelo.CuentaBanco;

import java.security.PublicKey;
import java.util.Scanner;
public class Main {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
    menuCuenta();


    }


    public static void menuCuenta()
    {
        int op = 1,opSw;
        double saldoAux;
        boolean flag = true;
        String dni,contrasenia;
        CuentaBanco cuenta = new CuentaBanco();
        do
        {
            opciones();
            opSw = scanner.nextInt();
            switch (opSw)
            {
                case 1:
                    System.out.println("Cuenta creada");
                    break;
                case 2:

                    do
                    {
                        System.out.println("Ingrese el saldo a depositar: ");
                        saldoAux = scanner.nextDouble();
                    }while(saldoAux<0);
                    System.out.println("Ingrese su DNI: ");
                    scanner.nextLine();
                    dni = scanner.nextLine();
                    System.out.println("Ingrese su contrasenia: ");
                    contrasenia = scanner.nextLine();
                    cuenta.setContrasenia(contrasenia);
                    cuenta.setDNI(dni);
                    cuenta.setSaldo(saldoAux);
                   break;
                case 3:

                        System.out.println("Ingrese el saldo a depositar: ");
                        saldoAux = scanner.nextDouble();
                        System.out.println(cuenta.ingresarDinero(saldoAux));


                     break;
                case 4:

                        System.out.println("Ingrese el saldo a extraer: ");
                        saldoAux = scanner.nextDouble();
                        System.out.println(cuenta.extraerDinero(saldoAux));


                    break;
                case 5:
                     System.out.println(cuenta.toString());
                    break;
                case 6:
                    System.out.println(cuenta.getSaldo());
                    break;
                case 7:
                   flag = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
           if(flag)
           {

               System.out.println("""
                    1.Continuar en el sistema
                    2.Finalizar el sistema
                    """);
               op = scanner.nextInt();
           }
            scanner.nextLine();


        }while(op == 1);

    }

    public static void opciones()
    {
        System.out.println("""
                1.Crear una cuenta vacia
                2.Crear cuenta con saldo inicial
                3.Ingresar dinero
                4.Extraer dinero
                5.Ver cuenta
                6.Ver saldo 
                7.Salir
                """);
    }


}