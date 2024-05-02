package modelo;

public class Ave extends Animal{
    //atributos
    private String tipoPlumaje;
    private boolean esMigratorio;
    //constructores

    public Ave(String especie, String nombre, int edad, String estadoSalud, String tipoPlumaje, boolean esMigratorio) {
        super(especie, nombre, edad, estadoSalud);
        this.tipoPlumaje = tipoPlumaje;
        this.esMigratorio = esMigratorio;
    }
    public Ave()
    {
        super("Sin especie", "Sin nombre", 0, "Sin estado de salud");
        tipoPlumaje = "Sin plumaje";
        esMigratorio = false;
    }
    //getters y setters

    public String getTipoPlumaje() {
        return tipoPlumaje;
    }


    public boolean isEsMigratorio() {
        return esMigratorio;
    }

    //metodos
    @Override
    public boolean equals(Object o) {
        boolean rta = false;
        if (o != null)
        {
            if(o instanceof Ave)
            {
                Ave aComparar = (Ave) o;
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
        int valoracion = 10;//base/regular
        if(getEstadoSalud().equalsIgnoreCase("malo"))
        {
            valoracion /=2;
        }else if(getEstadoSalud().equalsIgnoreCase("estupenda"))
        {
            valoracion *= 2;
        }

        return valoracion;
    }
}
