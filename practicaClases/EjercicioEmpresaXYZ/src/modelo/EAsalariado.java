package modelo;

public class EAsalariado extends Empleado{
    //atributos

    //constructores

    public EAsalariado(String dni, String nombre, String apellido, int anioDeIngreso, double sueldoBase) {
        super(dni, nombre, apellido,sueldoBase,anioDeIngreso);
    }

    public EAsalariado() {
        super("Sin DNI","Sin nombre","Sin apellido",0,0);
    }



    //getters y setter



    //metodos
    @Override
    public double calcularSalario() {
        double salarioCalculado=0;
        int anioDeIngreso= super.getAnioDeIngreso();
        if(anioDeIngreso>=2 && anioDeIngreso <=3)
        {
            salarioCalculado= super.getSueldoBase()*1.05;//le agrego 5%
        }else if(anioDeIngreso>=4 && anioDeIngreso<=7)
        {
            salarioCalculado= super.getSueldoBase()*1.1;//le agrego 10%

        }
        else if(anioDeIngreso>=8 && anioDeIngreso<=15)
        {
            salarioCalculado= super.getSueldoBase()*1.15;//le agrego 15%
            super.setSueldoBase(getAnioDeIngreso()*1.15);
        }else if (anioDeIngreso>=15)
        {
            salarioCalculado= super.getSueldoBase()*1.2;//le agrego 20%
        }

        return salarioCalculado;
    }
}
