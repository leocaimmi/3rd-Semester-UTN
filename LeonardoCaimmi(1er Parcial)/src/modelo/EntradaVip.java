package modelo;

public class EntradaVip extends Entrada
{

    //atributos
    private String beneficios;
    //constructores

    public EntradaVip(int id, double precio, boolean disponibilidad, String beneficios) {
        super(id, precio, disponibilidad);
        this.beneficios = beneficios;
    }
    public EntradaVip()
    {
        super(0, 0, false);
        beneficios = "Sin beneficios";
    }

    //getters y setters

    //metodos

    @Override
    public String toString() {
        return super.toString() +
                "beneficios='" + beneficios + '\'' +
                '}';
    }
    public boolean equals(Object o) {
        boolean rta = false;

        if(o !=null)
        {
            if(o instanceof EntradaGeneral)
            {
                EntradaGeneral aComparar = (EntradaGeneral) o;
                if(getId() == aComparar.getId())
                {
                    rta = true;
                }
            }
        }

        return rta;
    }
    @Override
    public int hashCode() {
        return 1;
    }
    @Override
    public String obtenerTipo() {
        return "Entrada Vip";//tipo de entrada
    }

    @Override
    public double obtenerPrecio() {
        double valorEntradaVip = getPrecio() * 1.5;//precio base + el 50%
        return valorEntradaVip;//devuelvo el precio final ya calculado
    }
}

