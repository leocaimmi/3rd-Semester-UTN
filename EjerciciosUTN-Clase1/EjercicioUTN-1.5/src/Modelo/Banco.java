package Modelo;

public class Banco
{
   //atributos
    private String usuario;//Dni simulando la cuenta de usuario
    private double saldo;// Atributo con el cual con los metodos voy ha realizar los ingresos y egresos,

    //constructores

    public Banco()
    {
        usuario = "Sin cuenta";
        saldo = 0;
    }
    public Banco(String pDni,double pSaldo)
    {
        setUsuario(pDni);
        setSaldo(pSaldo);
    }
    //setter y getter


    public double getSaldo() {
        return saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    //metodos

    public  String getInfo()
    {
        return "Usuario["+usuario+"],"+" Saldo: "+saldo;
    }
    public  String showSaldo()
    {
        return "Saldo $"+saldo;
    }
}
