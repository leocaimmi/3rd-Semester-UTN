package modelo;

public class PaquetePorTierra extends Paquete
{
    //atributos
    private double distanciaDelEnvio;
    private String tipoDeVehiculo;
    //constructores

    public PaquetePorTierra(double peso, String destino, double tarifa, boolean seguroEnvio, boolean entregaEnElDia, double costoAdicional, double distanciaDelEnvio, String tipoDeVehiculo) {
        super(peso, destino, tarifa, seguroEnvio, entregaEnElDia, costoAdicional);
        this.distanciaDelEnvio = distanciaDelEnvio;
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public PaquetePorTierra()
    {
        super(0, "Sin destino", 0, false, false, 0);
        this.distanciaDelEnvio = 0;
        this.tipoDeVehiculo = "Sin vehiculo";
    }

    //getters y setters

    public double getDistanciaDelEnvio() {
        return distanciaDelEnvio;
    }

    public void setDistanciaDelEnvio(double distanciaDelEnvio) {
        this.distanciaDelEnvio = distanciaDelEnvio;
    }

    public String getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(String tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    //metodos
    @Override
    public double calcularTarifaEnvio() {
        double precioPaquete = getPeso()*25;//El peso del paquete * 25$
        double distanciaTotal = 0;
        if(tipoDeVehiculo.equals("camion"))
        {
            precioPaquete *=1.1;//Si es “camión” el tipo de vehículo +10%

        }if(distanciaDelEnvio>100)
        {
            distanciaTotal = distanciaDelEnvio - 100;
            distanciaTotal*=1.05;// Si la distancia es superior a los 100km, por cada kilómetro adicional, +5%
            precioPaquete+= distanciaTotal;

        }
        return precioPaquete;
    }

    @Override
    public double calcularCostoAdicional() {
        double costoAdicional = getTarifa();
        if(isSeguroEnvio())//si es true le agrego el impuesto
        {
            costoAdicional += 1500;
            // 2500$ para los paquetes que viajan por aire
        }
        if(isEntregaEnElDia())//si es true le agrego el 50%
        {
            costoAdicional*=1.25;
            //50% para los paquetes que viajan por avión
        }

        return costoAdicional;
    }

    @Override
    public String calcularTotalDelPaquete() {
        double precioFinal = getTarifa()+getCostoAdicional();
        return "$"+getTarifa()+" $"+getCostoAdicional()+" Precio final $"+precioFinal;
    }

    @Override
    public String toString() {
        return super.toString() +
                "distanciaDelEnvio=" + distanciaDelEnvio +
                ", tipoDeVehiculo='" + tipoDeVehiculo + '\'' +
                '}';
    }
}
