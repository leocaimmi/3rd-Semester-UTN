package modelo;

public class Cliente
{
    //atributos
private String nombre;
private String apellido;
private String telefono;
private String direccion;
    //constructores

    public Cliente(String nombre, String apellido, String telefono, String direccion) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    public Cliente()
    {
        nombre = "Sin nombre";
        apellido = "Sin apellido";
        telefono = "Sin telefono";
        direccion = "Sin direccion";
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }



    public String getApellido() {
        return apellido;
    }


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //metodos
    public boolean pedirUnViaje()
    {
        return true;
    }
    public int devolverDistancia()
    {
        return (int) Math.random()*(10-1);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
