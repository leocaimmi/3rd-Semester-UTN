package modelo;

import java.util.Objects;

public class Zapatilla  //clase de prueba
{
//atributos
    private String marca;
    //constructores
    public Zapatilla(String marca)
    {
        this.marca = marca;
    }
    //Get

    public String getMarca() {
        return marca;
    }
    //metodos

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Zapatilla zapatilla = (Zapatilla) o;
        return Objects.equals(marca, zapatilla.marca);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Zapatilla{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
