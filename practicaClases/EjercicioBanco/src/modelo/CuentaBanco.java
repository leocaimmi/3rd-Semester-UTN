package modelo;

public class CuentaBanco {
    //atributos
    private String DNI;
    private double saldo;
    private String contrasenia;
    //constructores

    public CuentaBanco(String DNI, double saldo, String contrasenia) {
        this.contrasenia = contrasenia;
        this.DNI = DNI;
        this.saldo = saldo;
    }
    public CuentaBanco()
    {
        this.contrasenia = "null";
        this.DNI = "null";
        this.saldo = 0;
    }
    //getters y setters

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    //metodos

    public String ingresarDinero(double dinero)
    {
        String s="No puede ingresar dinero nulo o negativo";
        if (dinero > 0) {
            saldo += dinero;
            s="Se ha ingresado su dinero correctamente, monto actual: "+ saldo;
        }

        return s;
    }

    public String extraerDinero(double dinero)
    {
        String s="No puede extraer ese monto de dinero";

        if (dinero <= saldo)
        {
            saldo-=dinero;
            s="Monto extraido, saldo actual: "+saldo;
        }

        return s;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "DNI='" + DNI + '\'' +
                ", saldo=" + saldo +
                ", contrasenia='" + contrasenia + '\'' +
                '}';
    }
}

