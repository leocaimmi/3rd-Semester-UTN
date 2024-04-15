package Modelo;

public class CD extends Elemento
{
    //atributos
    private String interprete;
    private int numeroDeTemas;
    //constructores
    public CD(int numeroDeTemas,String interprete,int duracion,boolean loTengo,String comentario, String titulo)
    {
    super(titulo, duracion, loTengo,comentario); // el constructor de la clase padre siempre se llama al principio
    this.numeroDeTemas = numeroDeTemas;
    this.interprete = interprete;
    }
    //getters y setters


    public int getNumeroDeTemas() {
        return numeroDeTemas;
    }

    public String getInterprete() {
        return interprete;
    }

    //metodos

    public String imprimir()
    {
        return super.imprimir()+"|Artista "+getInterprete()+"|\n |Cantidad de temas "+getNumeroDeTemas()+"|\n ";
    }

}
