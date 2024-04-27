package modelo;

public abstract class Empleado {
    //atributos
    private String dni;
    private String nombre;
    private String apellido;

    private double sueldoBase;
    private int anioDeIngreso;

    //constructores

    public Empleado(String dni, String nombre, String apellido, double sueldoBase, int anioDeIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Empleado()
    {
        this.dni="Sin DNI";
        this.nombre="Sin nombre";
        this.apellido="Sin apellido";

    }

    //getters y setter

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public void setAnioDeIngreso(int anioDeIngreso) {
        this.anioDeIngreso = anioDeIngreso;
    }

    //metodos

    public abstract double calcularSalario();







    @Override
    public String toString() {
        return "Empleado{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", sueldo base=" + sueldoBase +
                '}';
    }
}
