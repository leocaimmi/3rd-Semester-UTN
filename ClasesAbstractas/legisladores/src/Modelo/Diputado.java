package Modelo;

public class Diputado extends Legislador
{
    //atributos

    //constructores
    public Diputado(String nombre, String provinciaQuePertenece,String camaraDeTrabajo) {
        super(nombre, provinciaQuePertenece,camaraDeTrabajo);
    }

    @Override
    String getCamaraEnLaQueTrabaja() {
        return "Diputado";
    }


    //metodos

    public String imprimir()
    {
        return super.imprimir()+" Camara en la que trabaja ["+getCamaraEnLaQueTrabaja()+"] ";
    }



}
