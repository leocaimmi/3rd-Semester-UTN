import Modelo.Boleto;
import Modelo.MaquinaExpendedora;

import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Boleto boletito;
        int op=1,opSw,aux;
        MaquinaExpendedora maquinita=new MaquinaExpendedora();
       do
       {
           System.out.println("1.Administrador \n2.Cliente");
           opSw = scanner.nextInt();
           switch (opSw)
           {
               case 1:// admin, para poder settear el precio de la maquina
                   System.out.println("Ingrese el precio de los boletos de la maquina: ");
                   aux= scanner.nextInt();
                   maquinita.setPrecioMaquina(aux);

                   System.out.println("Ingrese la cantidad de boletos disponibles");
                   aux= scanner.nextInt();
                   maquinita.setCantidadBoletos(aux);
                   break;
               case 2:
                   do
                   {
                    if (maquinita.getCantidadBoletos() > 0)
                    {

                       System.out.println("Ingrese saldo el precio del boleto es: "+ maquinita.getPrecioMaquina());
                       aux = scanner.nextInt();
                       maquinita.introducirDinero(aux);
                       boletito = maquinita.imprimirBoleto();
                       if (boletito == null)
                       {
                           System.out.println("Saldo insuficiente, el saldo actual es: "+ maquinita.getSaldo());
                       }
                       else
                       {
                           aux-= maquinita.getPrecioMaquina();
                           System.out.println("El vuelto es: "+ maquinita.getVuelto());
                           System.out.println(boletito.mostrarBoleto());

                       }
                    }
                    else
                   {
                       System.out.println("No hay boletos disponibles. Llame al tecnico del area...");
                       op = 2;
                   }
                       if(op == 1)
                       {
                           System.out.println("""
                             1.Si desea realizar otra compra o cargar mas saldo.
                             2.Si desea salir.  
                                """);
                           op = scanner.nextInt();
                       }
                       //solo menu de compra(cliente
                   }while(op == 1);
                   break;
               default:
                   System.out.println("Opcion no valida. Reintente...");
                   break;
           }
           System.out.println("""
                   1.Desea volver al menu principal
                   2.Finalizar
                   """);
           opSw = scanner.nextInt();

       }while(opSw == 1);//si requiere entrar el tecnico o seguir el clinte

        System.out.println(maquinita.estadisticasMaquina());



    }
}