package modelo;

public class Plataforma extends Objeto
{
    //atributos
    private String material;
    private String soporte;
    //constructores

    public Plataforma(double ancho, double alto, String material, String soporte) {
        super(ancho, alto);
        this.material = material;
        this.soporte = soporte;
    }

    public Plataforma() {
        super(0, 0);
        material = "Sin material";
        soporte = "Sin soporte";

    }

    //getters y setters

    //metodos

    @Override
    public String toString() {
        return super.toString() +
                "material='" + material + '\'' +
                ", soporte='" + soporte + '\'' +
                '}';
    }
}
