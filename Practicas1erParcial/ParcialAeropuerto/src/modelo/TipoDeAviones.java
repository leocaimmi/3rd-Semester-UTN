package modelo;

public abstract class TipoDeAviones
{
    //atributos
    private String patente;
    private String modelo;
    private String marca;
    private String tipoDeMotor;
    private double cantidadDeCombustible;
    private int cantidadDeAsientos;
    //constructores

    public TipoDeAviones(String patente,String modelo, String marca, String tipoDeMotor, double cantidadDeCombustible, int cantidadDeAsientos) {
        this.patente = patente;
        this.modelo = modelo;
        this.marca = marca;
        this.tipoDeMotor = tipoDeMotor;
        this.cantidadDeCombustible = cantidadDeCombustible;
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    //getters y setters


    public String getPatente() {
        return patente;
    }


    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }
    public String getTipoDeMotor() {
        return tipoDeMotor;
    }

    public double getCantidadDeCombustible() {
        return cantidadDeCombustible;
    }

    public void setCantidadDeCombustible(double cantidadDeCombustible) {
        this.cantidadDeCombustible = cantidadDeCombustible;
    }

    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    //metodos
     public abstract String despegar();
    public abstract String aterrizar();
    public abstract String vuelan();

    @Override
    public String toString() {
        return "TipoDeAviones{" +
                "patente='" + patente + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", tipoDeMotor='" + tipoDeMotor + '\'' +
                ", cantidadDeCombustible=" + cantidadDeCombustible +
                ", cantidadDeAsientos=" + cantidadDeAsientos +
                '}';
    }
}
