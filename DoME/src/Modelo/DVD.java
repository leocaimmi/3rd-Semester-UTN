package Modelo;

public class DVD extends Elemento{
//atributos
    private String director;
    //constructores
    public DVD(String titulo,int duracion,boolean loTengo,String comentario,String director) {
        super(titulo,duracion,loTengo,comentario);
        this.director = director;
    }
    //getters y setters

    public String getDirector() {
        return director;
    }

    //metodos

    public String imprimir()
    {
        return super.imprimir()+"| Director: "+getDirector()+"|\n";
    }


}
