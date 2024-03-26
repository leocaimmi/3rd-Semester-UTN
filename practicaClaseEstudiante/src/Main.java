import Modulo.Curso;
import Modulo.Estudiante;

import java.util.Scanner;

public class Main
{
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        Curso cursoActual= new Curso();
        Estudiante[] estudiante = new Estudiante[cursoActual.getEstudianteDelCurso().length];

        /*double[] arregloNotas = new double[3];
            arregloNotas[0] = 10;
            arregloNotas[1] = 7;
            arregloNotas[2] = 8;
            Estudiante estudiante1 = new Estudiante("leo",18,arregloNotas);
            Estudiante estudiante2 = new Estudiante("Fabri",20,arregloNotas);
            //System.out.println(estudiante1.imprimirInformacion());
        System.out.println(cursoActual.agregarEstudiante(estudiante1));
        System.out.println(cursoActual.agregarEstudiante(estudiante2));
        System.out.println(cursoActual.mostrarInfo());
        System.out.println("Promedio general["+cursoActual.obtenerPromedioGeneral()+"]");*/

       cargarCurso(estudiante,cursoActual);
       System.out.println(cursoActual.getCantEstudiantes());
       System.out.println(cursoActual.mostrarInfo());




        scanner.close();
    }

    public static void cargarCurso(Estudiante[]estudiante, Curso cursoActual)
    {
        int i = 0;
        double[]nota = new double[3];
        while(i < cursoActual.getEstudianteDelCurso().length)
        {
            estudiante[i] = new Estudiante();
            System.out.println("Ingrese su nombre: ");
            estudiante[i].setNombre(scanner.nextLine());
            scanner.nextLine();//funciona como un fflush liberando el buffer permiendo scannear otra vez.
            System.out.println("Ingrese su edad: ");
            estudiante[i].setEdad(scanner.nextInt());
            for(int j = 0;j<estudiante[i].getCalificaciones().length;j++)
            {
                System.out.println("Ingrese sus notas: ");
                nota[j] = scanner.nextDouble();
                estudiante[i].setCalificaciones(nota);
            }
            scanner.nextLine();
            System.out.println(cursoActual.agregarEstudiante(estudiante[i]));

            i++;
        }
    }


}