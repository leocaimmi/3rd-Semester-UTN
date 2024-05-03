package modelo;

public abstract class Entrada
{
    //atributos
    private int id;
    private double precio;

    private boolean disponibilidad;

    //constructores

    public Entrada(int id, double precio, boolean disponibilidad) {
        this.id = id;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }

    //getters y setters

    public int getId() {
        return id;
    }


    public double getPrecio() {
        return precio;
    }



    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    //metodos
    public abstract String obtenerTipo();
    public abstract  double obtenerPrecio();

    @Override
    public String toString() {
        return "Entrada{" +
                "id=" + id +
                ", precio=" + precio +
                ", disponibilidad=" + disponibilidad +
                '}';
    }

}
