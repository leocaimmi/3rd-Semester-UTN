package modelo;

public class Taxi extends Vehiculo{

   //atributos
    private double contadorKM;
    private double bajadaBandera;
    private double precioXKM;
    //constructores


    public Taxi(String marca, String modelo, String tipoCombustible, String patente, boolean disponibilidad, double contadorKM, double bajadaBandera, double precioXKM) {

        super(marca, modelo, tipoCombustible, patente, disponibilidad);
        this.contadorKM = contadorKM;
        this.bajadaBandera = bajadaBandera;
        this.precioXKM = precioXKM;
    }
    public Taxi()
    {
        super("Sin marca", "Sin modelo", "Sin combustible", "Sin patente", false);
        contadorKM = 0;
        bajadaBandera = 0;
        precioXKM = 0;
    }

    //getters y setters

    public double getContadorKM() {
        return contadorKM;
    }

    public void setContadorKM(double contadorKM) {
        this.contadorKM = contadorKM;
    }

    public double getBajadaBandera() {
        return bajadaBandera;
    }

    public void setBajadaBandera(double bajadaBandera) {
        this.bajadaBandera = bajadaBandera;
    }

    public double getPrecioXKM() {
        return precioXKM;
    }

    public void setPrecioXKM(double precioXKM) {
        this.precioXKM = precioXKM;
    }
    //metodos

    @Override
    public String toString() {
        return super.toString() +
                "contadorKM=" + contadorKM +
                ", bajadaBandera=" + bajadaBandera +
                ", precioXKM=" + precioXKM +
                '}';
    }

    @Override
    public double calcularTarifa() {
        return bajadaBandera+(precioXKM*contadorKM);
    }


}
