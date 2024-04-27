package modelo;

public class EComision extends Empleado{
    //atributos
    private int nroClientesCaptados;
    private Double montoXCliente;

    //constructores

    public EComision(String dni, String nombre, String apellido, int nroClientesCaptados, Double montoXCliente, int anioDeIngreso) {
        super(dni, nombre, apellido, 750, anioDeIngreso);
        this.nroClientesCaptados = nroClientesCaptados;
        this.montoXCliente = montoXCliente;
    }

    public EComision() {
        super("Sin DNI","Sin nombre","Sin apellido",750, 0);
        this.montoXCliente=0.0;
        this.nroClientesCaptados=0;
    }



    //getters y setter
    public int getNroClientesCaptados() {
        return nroClientesCaptados;
    }

    public void setNroClientesCaptados(int nroClientesCaptados) {
        this.nroClientesCaptados = nroClientesCaptados;
    }

    public Double getMontoXCliente() {
        return montoXCliente;
    }

    public void setMontoXCliente(Double montoXCliente) {
        this.montoXCliente = montoXCliente;
    }




    //metodos
    @Override
    public double calcularSalario() {
        double salarioCalculado= nroClientesCaptados*montoXCliente;
        if (salarioCalculado < 750)
        {
            salarioCalculado=super.getSueldoBase();
        }else
        {
            salarioCalculado+= super.getSueldoBase();
        }

        return salarioCalculado;
    }


}
