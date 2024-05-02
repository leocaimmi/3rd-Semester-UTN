package modelo;

public abstract class Vehiculo
{
    //atributos
    private String marca;
    private String modelo;
    private  String tipoCombustible;
    private String patente;
    private boolean disponibilidad;


    //constructores

    public Vehiculo(String marca, String modelo, String tipoCombustible, String patente,boolean disponibilidad) {

        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.patente = patente;
        this.disponibilidad = disponibilidad;

    }
    public Vehiculo()
    {
        marca = "Sin marca";
        modelo = "Sin modelo";
        tipoCombustible = "Sin combustible";
        patente = "Sin patente";
        disponibilidad = false;

    }

    //getters y setters

    public String getMarca() {
        return marca;
    }



    public String getModelo() {
        return modelo;
    }



    public String getTipoCombustible() {
        return tipoCombustible;
    }



    public String getPatente() {
        return patente;
    }



    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }




    //metodos

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", patente='" + patente + '\'' +
                ", disponibilidad=" + disponibilidad +
                +
                '}';
    }

    public abstract double calcularTarifa();


}
