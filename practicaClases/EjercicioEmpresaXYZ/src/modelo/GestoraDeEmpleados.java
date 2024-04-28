package modelo;

import java.util.ArrayList;


public  class GestoraDeEmpleados  {
    //atributos
    private ArrayList<Empleado> empleados;

    //constructores

    public GestoraDeEmpleados() {
        empleados = new ArrayList<>();
    }

    //getters y setters


    //metodos
        public void agregar(Empleado empleado)
        {
            empleados.add(empleado);
        }

        public void actualizarSalario()
        {
            for(Empleado e : empleados)
            {
                if(e instanceof EAsalariado)
                {
                    EAsalariado empleado1 = (EAsalariado) e;
                    double sueldoActualizado1 = empleado1.calcularSalario();
                    empleado1.setSueldoBase(sueldoActualizado1);
                }
                else if(e instanceof EComision)
                {
                    EComision empleado2 = (EComision) e;
                    double sueldoActualizado2 = empleado2.calcularSalario();
                    empleado2.setSueldoBase(sueldoActualizado2);
                }

            }


        }
    public double sueldoMayor()
    {
        double maxSalario = empleados.get(0).getSueldoBase();
        for(Empleado e : empleados)
        {
            if(maxSalario < e.getSueldoBase())
            {
                maxSalario = e.getSueldoBase();
            }

        }
        return maxSalario;
    }

    public String toString() {
        return "GestoraDeEmpleados{" +
                "empleados=" + empleados+
                '}';
    }


}
