package modelo;

public abstract class Juego
{
    //atributos
    private int x;//posicion
    private int y;//posicion
    //constructores

    public Juego(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Juego()
    {
        x = 0;
        y = 0;
    }

    //getters y setters

    public int getX()
    {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void setX(int x) {
        this.x = x;
    }

    protected void setY(int y) {
        this.y = y;
    }
    //metodos


    @Override
    public String toString() {
        return "\n"+"Juego{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
