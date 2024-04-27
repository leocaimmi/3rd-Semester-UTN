package modelo;

public class Libro
{
    //atributos
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;
    //constructores

    public Libro(String titulo, double precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }


    //getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }



    //metodos


    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor=" + autor +
                '}';
    }

    public String mensajeDeVenta()
    {
        return "El libro: " + getTitulo() + " de " + getAutor().getNombre() + ". Se vende a: " + getPrecio() + " pesos.";
    }

}
