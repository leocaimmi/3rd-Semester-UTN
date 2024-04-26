package modelo;

public class ItemVenta {

    //atributos
    private int id;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    //constructores

    public ItemVenta(int id, String descripcion, int cantidad, double precioUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public ItemVenta()
    {
        this.id=0;
        this.descripcion = "Sin descripcion";
        this.cantidad = 0;
        this.precioUnitario = 0;
    }

    //getters y setter

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    //metodos

    public double calcularPrecioTotal()
    {
        return cantidad*precioUnitario;
    }

    @Override
    public String toString() {
        return "ItemVenta{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                '}';
    }
}
