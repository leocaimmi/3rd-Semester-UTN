import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        int opSw;
        System.out.println("Ingrese el ejercicio que quiere hacer: ");


        scanner = new Scanner(System.in);
        opSw = scanner.nextInt();
        //falta validacion


        int[] arreglito = {1, 5, 7, 3, 2};

        switch (opSw) {
            case 1:
                calcularPromedioArreglo(arreglito);
                break;
            case 2:
                esPar(2);//numero de prueba2
                break;
            case 3:
                imprimirPrimos();
                break;
            case 4:

                imprimirPrimosPorRango(scanner.nextInt());
                break;
            case 5:
                verificarSiEsPrimo(scanner.nextInt());
                break;
            case 6:
                sumaPrimeroDiezNaturales();
                break;
            case 7:
                sumarEnCantidadNumerosPositivos();
                break;
            case 8:
                esBisiesto();
                break;
            case 9:
                encontrarASCII();
                break;
            case 10:
                multiplicarDosNumeros();
                break;
            case 11:
                calcularArea();
                break;
            case 12:
                saludarXNombre();
                break;
            case 13:
                obtenerDobleYTriple();
                break;
            case 14:
                pasarCentigradosAFahrenheit();
                break;
            case 15:
                calcularLongitudYAreaCircunferencia();
                break;
            case 16:
                convertirDeKmAMs();
                break;
            case 17:
                calcularHipotenusaDeTriRectangulo();
                break;
        }

        scanner.close();
    }

    static public void calcularPromedioArreglo(int[] arreglito)
    {
        /*Ejercicio nº1: Calcular el promedio de un arreglo de números enteros.
        Realizar variantes con arreglos ya inicializados e ingreso por teclado.*/
        float promedio = 0;
        float sum = 0;
        for (int i = 0; i < arreglito.length; i++)
        {
            sum += (float) arreglito[i];
        }
        promedio = sum / arreglito.length;

        System.out.println("El promedio del arreglo es: " + promedio);

    }

    static public void esPar(int num)
    {
        /*Ejercicio nº2: Calcular si un número es par o no.*/


        if (num % 2 == 0)
        {
            System.out.println("Es par: " + num);
        } else {
            System.out.println("No es par: " + num);
        }
    }

    static public void imprimirPrimos()
    {
        int cont = 0, i = 1;
        while (cont < 100) {

            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0)
            {
                cont++;
                System.out.println("Su numero es primo: " + i + " " + "cantidad numeros primos = " + cont);
            } else {
                if (i == 2 || i == 3 || i == 5 || i == 7)
                {
//Evaluo los casos donde utilizo los numeros del condicional para poder printearlo
                    cont++;
                    System.out.println("Su numero es primo: " + i + " " + "cantidad numeros primos = " + cont);
                }
            }
            i++;
        }
    }

    static public void imprimirPrimosPorRango(int rango)
    {
        /*  Ejercicio nº4: Mostrar los primeros n números primos.*/
        for (int i = rango; i >= 0; i--) {

            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0)
            {
                System.out.println("Su numero es primo: " + i);
            } else
            {
                if (i == 2 || i == 3 || i == 5 || i == 7)
                {//Evaluo los casos donde utilizo los numeros del condicional para poder printearlo
                    System.out.println("Su numero es primo: " + i);
                }
            }

        }
    }

    public static void verificarSiEsPrimo(int num)
    {
        /*Ejercicio nº6: Ingresar un número o tantos como quiera el usuario y revisar si es primo.*/
        if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0)
        {
            System.out.println("Su numero es primo: " + num);
        } else
        {
            if (num == 2 || num == 3 || num == 5 || num == 7)
            {//Evaluo los casos donde utilizo los numeros del condicional para poder printearlo
                System.out.println("Su numero es primo: " + num);

            }
        }
    }


    public static void sumaPrimeroDiezNaturales()
    {
        /*Ejercicio nº7: Encontrar la suma de los primeros 10 números naturales.*/
        int sum = 0;
        for (int i = 1; i <= 10; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void sumarEnCantidadNumerosPositivos()
    {
        /*Ejercicio nº8: Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario.*/

        char op = 's';
        int num = 0;
        int cont = 0;
        do {
            num = scanner.nextInt();


            if (num > 0)
            {

                cont++;
            }
            System.out.println("Desea seguir ingresando numeros?: s/n");
            scanner.nextLine();// limpia el buffer para poder guardar el char sino tira error
            op = scanner.nextLine().charAt(0);


        } while (op == 's');

        System.out.println("La cantidad de numeros positivos ingresados es: " + cont);
    }

    public static void esBisiesto()
    {
        int anio = scanner.nextInt();
        if (anio % 4 == 0) {
            if (anio % 100 != 0)
            {
                System.out.println("El año es bisiesto");
            } else if (anio % 100 == 0 && anio % 400 == 0)
            {
                System.out.println("El año es bisiesto");
            } else
            {
                System.out.println("No es bisiesto");
            }
        } else
        {
            System.out.println("No es bisiesto");
        }


    }

    public static void encontrarASCII()
    {
        /*Ejercicio nº10: Encontrar el valor ASCII de un carácter.*/
        char letra = 's';

        System.out.println("Ingrese la letra que desee transformar: ");
        scanner.nextLine();
        letra = scanner.next().charAt(0);
        int numAscii = letra;
        System.out.println(numAscii);
    }

    public static void multiplicarDosNumeros()
    {
        /*Ejercicio nº11: Multiplicar dos números.*/
        int num1 = 0, num2 = 0, multiplicacion = 0;
        System.out.println("Ingrese el primer numero a multiplicar: ");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero a multiplicar: ");
        num2 = scanner.nextInt();

        multiplicacion = num1 * num2;

        System.out.println("Multiplicacion: " + multiplicacion);

    }

    public static void calcularArea()
    {
        /*
            Ejercicio nº12: Realizar un programa que le pregunte al usuario que área desea calcular.
             Las opciones son: rectángulo, cuadrado, triangulo y circulo.
         */
        int opSw = 0, num1 = 0, num2 = 0;
        float area = 0;
        boolean flag = false;

        do {
            System.out.println("""
                    1. Rectangulo\s
                    2. Cuadrado\s
                    3. Triangulo\s
                    4. Circulo""");
            System.out.println("Ingrese el area que desea calcular:");
            opSw = scanner.nextInt();
            if (opSw == 1 || opSw == 2 || opSw == 3 || opSw == 4) {
                flag = true;
            }
        } while (!flag);
        switch (opSw) {
            case 1:
                System.out.println("Ingrese la longitud de un lado del cuadrado: ");
                num1 = scanner.nextInt();
                area = (float) Math.pow(num1, 2);
                break;
            case 2:
                System.out.println("Ingrese la longitud de la base del rectangulo: ");
                num1 = scanner.nextInt();

                System.out.println("Ingrese la longitud de la altura del rectangulo: ");
                num2 = scanner.nextInt();

                area = (float) num1 * num2;
                break;
            case 3:
                System.out.println("Ingrese la longitud de la base del triangulo: ");
                num1 = scanner.nextInt();
                System.out.println("Ingrese la longitud de la altura del triangulo: ");
                num2 = scanner.nextInt();

                area = (float) (num1 * num2) / 2;
                break;
            case 4:
                System.out.println("Ingrese el radio del circulo: ");
                num1 = scanner.nextInt();

                area = (float) (Math.PI * Math.pow(num1, 2));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opSw);
        }
        System.out.println("El area es: " + area);
    }

    static public void saludarXNombre()
    {
        /*
        Ejercicio nº13: Programa que lea un nombre y muestre por pantalla:
        “Buenos dias nombre_introducido”.

         */
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Buenos dias " + nombre + " !");

    }

    static public void obtenerDobleYTriple()
    {
        /*
        Ejercicio nº14: Escribir un programa que lea
        un número entero por teclado y obtenga y muestre por pantalla el doble y el triple de ese número.
         */
        System.out.println("Ingrese un numero: ");
        int num = scanner.nextInt();
        System.out.println("El doble del numero ingresado es: " + num * 2 +
                "\nEl triple del numero ingresado es: " + num * 3);

    }

    static public void pasarCentigradosAFahrenheit()
    {
        /*
        Ejercicio nº15: Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
        La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:  F = 32 + ( 9 * C / 5)
         */
        System.out.println("Ingrese la temperatura en grados celsius");
        int num = scanner.nextInt();

        int rta = 32 + (9 * num / 5);
        System.out.println(num + "° en F es: " + rta);

    }

    static public void calcularLongitudYAreaCircunferencia()
    {
        /*Ejercicio nº16:
        Programa que lea por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia.
        Investigar el uso de la librería Math.
        Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2*/

        System.out.println("Ingrese el radio de la circunferencia: ");
        int radio = scanner.nextInt();

        double longitudCircunferencia = 2 * Math.PI * radio;
        double areaCircunferencia = Math.PI * Math.pow(radio, 2);

        System.out.println("Longitud de la circunferencia: " + longitudCircunferencia);
        System.out.println("Area de la circunferencia: " + areaCircunferencia);
    }
    static public void convertirDeKmAMs()//km por hora a metro por segundo
    {
        /*Ejercicio nº17: Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.*/
        System.out.println("Ingrese la velocidad en km/h a la que desee convertir: ");
        float km =(float) scanner.nextInt();

        float metroXSegundo = (float) (km/3.6);//3.6 se refiere a 1 metro por cada 3.6 segundos. O sea 1 km por hora es igual a 3.6 metros por segundo
        System.out.println("La velocidad de["+km+"Km/h"+"]"+"en metros por segundo es de: "+metroXSegundo);

    }
    static public void calcularHipotenusaDeTriRectangulo()
    {
        /*Ejercicio nº18: Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras. */
        System.out.println("Ingrese el tamaño del cateto 1: ");
        int cateto1 = scanner.nextInt();
        System.out.println("Ingrese el tamaño del cateto 2: ");
        int cateto2 = scanner.nextInt();
        double hipotenusa = (double) Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));

        System.out.println("La hipotenusa es: "+hipotenusa);

    }
}

