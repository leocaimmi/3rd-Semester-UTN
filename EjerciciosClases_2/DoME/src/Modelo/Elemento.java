package Modelo;

public class Elemento
{
    //atributos
    private String titulo;
    private int duracion;
    private boolean loTengo;
    private String comentario;
    //constructor
    public Elemento(String titulo, int duracion, boolean loTengo, String comentario) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.loTengo = loTengo;
        this.comentario = comentario;
    }
    //getters y setters

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setLoTengo(boolean loTengo) {
        this.loTengo = loTengo;
    }

    public boolean isLoTengo() {
        return loTengo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }
    //metodos

    public String imprimir()
    {
        return "|Titulo "+getTitulo()+"|\n |Duracion "+getDuracion()+"|\n |Disponibilidad "+isLoTengo()+"|\n |Comentario [ "+getComentario()+"]| \n";
    }
}
