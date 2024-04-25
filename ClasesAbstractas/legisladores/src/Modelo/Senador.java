package Modelo;

public class Senador extends Legislador
{
    //atributos

    //constructor

    public Senador(String nombre, String provinciaQuePertenece, String camaraDeTrabajo) {
        super(nombre, provinciaQuePertenece, camaraDeTrabajo);
    }
   //getters y setters
    @Override
    String getCamaraEnLaQueTrabaja() {
        return "Senador";
    }
    //metodos
    public String imprimir()
    {
        return super.imprimir()+"Camara en la que trabaja ["+getCamaraEnLaQueTrabaja()+"]";
    }

}
