package modelo;

public class Remis extends Vehiculo{


    //atributos
    private double tarifaXCuadra;
    private double distancia;

    //constructores

    public Remis(String marca, String modelo, String tipoCombustible, String patente,double distancia, boolean disponibilidad, double tarifaXCuadra) {
        super(marca, modelo, tipoCombustible, patente, disponibilidad);
        this.tarifaXCuadra = tarifaXCuadra;
        this.distancia = distancia;
    }
    public Remis()
    {
        super("Sin marca", "Sin modelo", "Sin combustible", "Sin patente", false);
        tarifaXCuadra = 0;
        distancia = 0;
    }
    //getters y setters

    public double getTarifaXCuadra() {
        return tarifaXCuadra;
    }

    public void setTarifaXCuadra(double tarifaXCuadra) {
        this.tarifaXCuadra = tarifaXCuadra;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    //metodos

    @Override
    public String toString() {
        return super.toString() +
                "tarifaXCuadra=" + tarifaXCuadra +
                '}';
    }

    @Override
    public double calcularTarifa() {
        return distancia*tarifaXCuadra;
    }


}
