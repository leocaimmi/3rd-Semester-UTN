//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*Crea un programa que simule una cuenta bancaria, permitiendo al usuario depositar y retirar dinero, y mostrar el saldo actual.*/

import Modelo.Banco;

import java.util.Scanner;

public class Main
    {
        static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        Banco persona = new Banco();
        System.out.println("Ingrese su DNI para ingresar al banco: ");
        persona.setUsuario(scanner.nextLine());//escaneo el dni
        boolean op;
        int operador;
        do {
            int opcion = elegirIngresoEgreso();
            modificarCuenta(opcion, persona);
            System.out.println(persona.getInfo());

            System.out.println("""
                    1.Desea realizar otra operacion
                    2.Desea salir de su cuenta
                    """);
                operador = scanner.nextInt();
            if(operador == 1)
            {
                op = true;
            }else
            {
                op = false;
            }
        }while(op);
        scanner.close();
    }
    public static int elegirIngresoEgreso()
    {
        boolean op = false;
        int eleccion;
        do{
            System.out.println("""
                    1.Extraer dinero
                    2.Ingresar dinero
                    3.Ver saldo en cuenta
                    """);
            System.out.println("Que desea hacer: ");
            eleccion = scanner.nextInt();
            switch (eleccion)
            {
                case 1:
                    eleccion = 1;
                    op = true;
                    break;
                case 2:
                    eleccion = 2;
                    op = true;
                    break;
                case 3:
                    eleccion = 3;
                    op = true;
                    break;
                default:
                    System.out.println("Por favor ingrese una opcion valida");
                    break;
            }
        }while(!op);
        return eleccion;
    }
    public static void modificarCuenta(int opcion,Banco usuario)//segun lo que elige el usuario es la accion a realizar
    {
        double operacion , saldoACuenta;
        if (opcion == 1)
        {
            if(usuario.getSaldo()>0)
            {
                do
                {
                    System.out.println(usuario.showSaldo());
                    System.out.println("Cuanto desea extraer: ");
                    operacion = scanner.nextDouble();

                }while(operacion >usuario.getSaldo());//si el usuario quiere sacar mas de lo que tiene no puede
                usuario.setSaldo(calcularDiferenciaMonto(operacion,usuario.getSaldo()));//calculo el nuevo saldo
            }else
            {
                System.out.println("Saldo insuficiente. No es posible la extraccion");
            }
        }else if(opcion == 2)
        {
            do
            {
                System.out.println(usuario.showSaldo());
                System.out.println("Cuanto desea ingresar a su cuenta: ");
                saldoACuenta = scanner.nextDouble();
            }while(saldoACuenta<0);// si el usuario quiere ingresar a su cuenta un valor negativo no lo dejo avanzar
            usuario.setSaldo(calcularSumaCuenta(saldoACuenta,usuario.getSaldo()));
        }else
        {
            System.out.println(usuario.showSaldo());
        }
    }
    public static double calcularDiferenciaMonto(double operacion,double saldoCuenta)
    {
        return saldoCuenta - operacion;
    }
    public static double calcularSumaCuenta(double agregarCuenta,double saldoCuenta)
    {
        return agregarCuenta + saldoCuenta;
    }
}