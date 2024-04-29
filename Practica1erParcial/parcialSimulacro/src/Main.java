import modelo.Paquete;
import modelo.PaquetePorAire;
import modelo.PaquetePorTierra;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Paquete> paquetes = new ArrayList<>();
        int op = 1, opSw = 1;
        double peso, tarifa, costoAdicional,distanciaEnvio;
        String destino, seleccion,aerolinea,claseDeEnvio;
        boolean seguroEnvio = false, entregaEnElDia = false;

        do
        {
            System.out.println("Ingrese los datos del paquete");

            System.out.println("Destino: ");
            destino = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Peso: ");
            peso = scanner.nextDouble();
            System.out.println("Tarifa: ");
            tarifa = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Desea agregar seguro al envio? si/no");
            seleccion = scanner.nextLine();
            if (seleccion.equals("si") || seleccion.equals("SI")) {
                seguroEnvio = true;
            }
            System.out.println("Desea que el pedido sea en el dia? si/no");
            seleccion = scanner.nextLine();
            if (seleccion.equals("si") || seleccion.equals("SI")) {
                entregaEnElDia = true;
            }
            opcionesSw();
            opSw = scanner.nextInt();
            scanner.nextLine();
            switch (opSw)
            {
                case 1:
                    System.out.println("Aerolinea: ");
                    aerolinea = scanner.nextLine();
                    System.out.println("Clase de envio(express/normal)");
                    claseDeEnvio = scanner.nextLine();

                    PaquetePorAire paqueteAire = new PaquetePorAire(peso,destino,tarifa,seguroEnvio,entregaEnElDia,aerolinea,claseDeEnvio,0);

                    costoAdicional = paqueteAire.calcularTarifaEnvio();
                    paqueteAire.setTarifa(costoAdicional);
                    costoAdicional = paqueteAire.calcularCostoAdicional();
                    paqueteAire.setCostoAdicional(costoAdicional);

                    System.out.println(paqueteAire.calcularTotalDelPaquete());
                    paquetes.add(paqueteAire);
                    System.out.println(paquetes);

                    break;
                case 2:
                    System.out.println("Distacia del envio: ");
                    distanciaEnvio = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Tipo de vehiculo: ");
                    claseDeEnvio = scanner.nextLine();

                    PaquetePorTierra paqueteTierra = new PaquetePorTierra(peso,destino,tarifa,seguroEnvio,entregaEnElDia,0,distanciaEnvio,claseDeEnvio);

                    costoAdicional = paqueteTierra.calcularTarifaEnvio();
                    paqueteTierra.setTarifa(costoAdicional);

                    costoAdicional = paqueteTierra.calcularCostoAdicional();
                    paqueteTierra.setCostoAdicional(costoAdicional);

                    System.out.println(paqueteTierra.calcularTotalDelPaquete());
                    paquetes.add(paqueteTierra);
                    System.out.println(paquetes);

                    break;
                case 3:
                    if(cantidadDeEnvios(paquetes) == 0)
                    {
                        System.out.println("La cantidad de paquetes enlistados es: "+cantidadDeEnvios(paquetes));
                    }
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
                System.out.println("""
                        1.Para cargar otro paquete
                        2.Para finalizar y ver todos los paquetes
                        """);
                op = scanner.nextInt();
            scanner.nextLine();
        } while(op==1);
        System.out.println(paquetes);
    }

    public static void opcionesSw()
    {
        System.out.println("""
                1.Crear paquete aereo
                2.Crear paquete por tierra
                3.Ver cantidad de paquetes enlistados
                """);
    }


    public static int cantidadDeEnvios(ArrayList<Paquete> paquetes)
    {
        return paquetes.size();
    }
   // BONUS TRACK por el 10 y la promoción: gestionar si el paquete ya fue enviado o no. comprobaciones para no enviar un paquete dos veces.
    // terminar, tiempo 1:55:53

}