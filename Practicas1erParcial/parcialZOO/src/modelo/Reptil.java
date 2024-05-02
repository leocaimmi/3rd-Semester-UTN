package modelo;

public class Reptil extends Animal{
    //atributos
    private String escamas;
    private boolean esVenenoso;
    //constructores

    public Reptil(String especie, String nombre, int edad, String estadoSalud, String escamas, boolean esVenenoso) {
        super(especie, nombre, edad, estadoSalud);
        this.escamas = escamas;
        this.esVenenoso = esVenenoso;
    }
    public Reptil()
    {
        super("Sin especie", "Sin nombre", 0, "Sin estado de salud");
        escamas = "Sin escamas";
        esVenenoso = false;
    }
    //getters y setters

    //metodos
    @Override
    public boolean equals(Object o) {
        boolean rta = false;
        if (o != null)
        {
            if(o instanceof Reptil)
            {
                Reptil aComparar = (Reptil) o;
                if(this.getNombre().equals(aComparar.getNombre()))
                {
                    rta = true;
                }
            }
        }
        return rta;
    }

    @Override
    public int calcularValoracion()
    {
        int valoracion = 25;//base /malo/regular
        if(getEstadoSalud().equalsIgnoreCase("estupendo"))
        {
            valoracion *=3;
        }
        return valoracion;
    }
}
