package modelo;

import java.util.Objects;

public abstract class Paquete
{
    //atributos obg
    private double peso;
    private String destino;
    private double tarifa;

    //atributos add
    private boolean seguroEnvio;
    private boolean entregaEnElDia;

    private double costoAdicional;

    //constructores

    public Paquete(double peso, String destino, double tarifa, boolean seguroEnvio, boolean entregaEnElDia, double costoAdicional) {
        this.peso = peso;
        this.destino = destino;
        this.tarifa = tarifa;
        this.seguroEnvio = seguroEnvio;
        this.entregaEnElDia = entregaEnElDia;
        this.costoAdicional = costoAdicional;
    }
    public Paquete()
    {
        costoAdicional = 0;
        peso = 0;
        destino = "sin destino";
        tarifa = 0;
        seguroEnvio = false;
        entregaEnElDia = false;
    }
    //getters y setters

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isSeguroEnvio() {
        return seguroEnvio;
    }



    public boolean isEntregaEnElDia() {
        return entregaEnElDia;
    }



    public double getCostoAdicional() {
        return costoAdicional;
    }

    public void setCostoAdicional(double costoAdicional) {
        this.costoAdicional = costoAdicional;
    }
    //metodos


    @Override
    public String toString() {
        return "Paquete{" +
                "peso=" + peso +
                ", destino='" + destino + '\'' +
                ", tarifa=" + tarifa +
                ", seguroEnvio=" + seguroEnvio +
                ", entregaEnElDia=" + entregaEnElDia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paquete paquete = (Paquete) o;
        return Double.compare(peso, paquete.peso) == 0 && Double.compare(tarifa, paquete.tarifa) == 0 && seguroEnvio == paquete.seguroEnvio && entregaEnElDia == paquete.entregaEnElDia && Double.compare(costoAdicional, paquete.costoAdicional) == 0 && Objects.equals(destino, paquete.destino);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peso, destino, tarifa, seguroEnvio, entregaEnElDia);
    }
    public abstract double calcularTarifaEnvio();
    public abstract double calcularCostoAdicional();
    public  abstract String calcularTotalDelPaquete();

}
