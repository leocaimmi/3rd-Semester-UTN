package Modelo;

public abstract class Legislador extends Persona
{
    //atributos
    private String camaraDeTrabajo;
    private String provinciaQuePertenece;
    //constructores
    public Legislador(String nombre, String provinciaQuePertenece,String camaraDeTrabajo) {
        super(nombre);
        this.camaraDeTrabajo = camaraDeTrabajo;
        this.provinciaQuePertenece = provinciaQuePertenece;
    }

    //getters y setters


    public String getProvinciaQuePertenece() {
        return provinciaQuePertenece;
    }

    public void setProvinciaQuePertenece(String provinciaQuePertenece) {
        this.provinciaQuePertenece = provinciaQuePertenece;
    }

    //metodos
    abstract String getCamaraEnLaQueTrabaja();
    public String imprimir()
    {
        return super.imprimir()+" Provincia a la que pertenece ["+getProvinciaQuePertenece()+"] ";
    }
}
