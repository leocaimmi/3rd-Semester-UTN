package modulo;

public class Coche
{
    //Atributos

    private String marca;
    private String modelo;
    private int anioFabricacion;
    private double velocidadActual;

    //constructores
    public Coche()
    {
        setMarca("Sin nombre");
        setModelo("Sin modelo");
        setAnioFabricacion(0);
        setVelocidadActual(0);
    }
    //getters y setters


    public double getVelocidadActual() {
        return velocidadActual;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    //metodos

    public void acelerar(double incremento)//incrementa la velocidad actual del coche en función del incremento dado.
    {
        setVelocidadActual(incremento);
    }
    public void frenar(double decremento)// reduce la velocidad actual del coche en función del decremento dado.
    {
        double velocidadNueva = 0;
        if(getVelocidadActual()>0)
        {
            velocidadNueva = velocidadActual - decremento;
            if(velocidadNueva>=0)
            {
                setVelocidadActual(velocidadNueva);
            }
            else
            {
                System.out.println("No puede reducir la velocidad de forma negativa.");
            }
        }
    }
    public String obtenerInformacion() //muestra por pantalla la marca, modelo, año de fabricación y velocidad actual del coche.
    {
        return "Marca["+marca+"], Modelo["+modelo+"], anio de fabricacion["+anioFabricacion+"], velocidad[Km/h "+velocidadActual+"]\n";
    }

}
