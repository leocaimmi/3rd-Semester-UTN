package modelo;

import java.util.ArrayList;

public  class GestoraDeEmpleados {
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
}
