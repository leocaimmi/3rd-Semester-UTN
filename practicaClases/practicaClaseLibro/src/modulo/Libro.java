package modulo;
/*obtenerInformacion(): muestra por pantalla el título, autor y año de publicación del libro.*/
public class Libro
{
    //atributos
    private String titulo;
    private String autor;
    private int aniooPublicacion;

    //constructores
    public Libro()
    {

    }
    //getters y setters
    public int getAniooPublicacion() {
        return aniooPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAniooPublicacion(int aniooPublicacion) {
        this.aniooPublicacion = aniooPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //metodos
    public String obtenerInformacion()
    {
        return "Titulo ["+titulo+"], Autor ["+autor+"], Anio en que se publico["+aniooPublicacion+"].\n";
    }
}
