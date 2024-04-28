package modelo;

public class PaquetePorAire extends Paquete
{

    //atributos
    private String aerolinea;
    private String claseDeEnvio;//normal o express

    //constructores

    public PaquetePorAire(double peso, String destino, double tarifa, boolean seguroEnvio, boolean entregaEnElDia, String aerolinea, String claseDeEnvio,double costoAdicional) {
        super(peso, destino, tarifa, seguroEnvio, entregaEnElDia,costoAdicional);
        this.aerolinea = aerolinea;
        this.claseDeEnvio = claseDeEnvio;
    }

    public PaquetePorAire()
    {
        super(0,"Sin destino",0,false,false,0);
        aerolinea = "Sin aerolinea";
        claseDeEnvio = "Sin clase";
    }

    //metodos
    @Override
    public double calcularTarifaEnvio()
    {
        double precioPaquete = getPeso()*30;//El peso del paquete * 30$
        if(aerolinea.equals("AA"))
        {
            precioPaquete *=1.5;//Si la aerolínea es AA, sumaría un 50% de impuestos

        }if(claseDeEnvio.equals("express"))
        {
            precioPaquete+=1000;//Y si es express, +1000$ fijos.
        }

        return precioPaquete;
    }

    @Override
    public double calcularCostoAdicional()
    {
        double costoAdicional = getTarifa();
        if(isSeguroEnvio())//si es true le agrego el impuesto
        {
            costoAdicional += 2500;
            // 2500$ para los paquetes que viajan por aire
        }
        if(isEntregaEnElDia())//si es true le agrego el 50%
        {
            costoAdicional*=1.5;
            //50% para los paquetes que viajan por avión
        }

        return costoAdicional;
    }

    @Override
    public String calcularTotalDelPaquete()//que nos informe el precio final del paquete.
    {
        double precioFinal = getTarifa()+getCostoAdicional();
        return "$"+getTarifa()+" $"+getCostoAdicional()+" Precio final $"+precioFinal;
    }

    @Override
    public String toString() {
        return super.toString() +
                "aerolinea='" + aerolinea + '\'' +
                ", claseDeEnvio='" + claseDeEnvio + '\'' +
                '}';
    }
}
