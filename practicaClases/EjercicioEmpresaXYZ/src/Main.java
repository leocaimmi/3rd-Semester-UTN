import modelo.EAsalariado;
import modelo.EComision;
import modelo.GestoraDeEmpleados;


public class Main {
    public static void main(String[] args)
    {
        GestoraDeEmpleados empleados = new GestoraDeEmpleados();

        //constructor lleno
        empleados.agregar(new EAsalariado("569587A","Javier","Gómez",2024-2008,1225));
        empleados.agregar(new EComision("695235B","Eva","Nieto",179,8.1,2024-2010));
        //constructor vacio

        EComision empl3 = new EComision();
        empl3.setDni("741258C");
        empl3.setNombre("Jose");
        empl3.setApellido("Ruiz");
        empl3.setNroClientesCaptados(81);
        empl3.setMontoXCliente(7.9);
        empl3.setAnioDeIngreso(2024-2012);
        empleados.agregar(empl3);

        EAsalariado empl4 = new EAsalariado();
        empl4.setDni("896325D");
        empl4.setNombre("Maria ");
        empl4.setApellido("Nuñez");
        empl4.setAnioDeIngreso(2024-2013);
        empl4.setSueldoBase(1155);
        empleados.agregar(empl4);
        System.out.println("SUELDO BASE");
       System.out.println(empleados);

        empleados.actualizarSalario();
        System.out.println("SUELDO MODIFICADO");
        System.out.println(empleados);

        System.out.println(empleados.sueldoMayor());

    }
}