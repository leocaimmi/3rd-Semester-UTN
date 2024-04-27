package modelo;

public class Autor {
    //atributos
    private String nombre;
    private String apellido;
    private String eMail;
    private char genero;
    //constructores

    public Autor(String nombre, String apellido, String eMail, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.eMail = eMail;
        this.genero = genero;
    }

    //getters y setters

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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }


    //metodos



    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", eMail='" + eMail + '\'' +
                ", genero=" + genero +
                '}';
    }
}
