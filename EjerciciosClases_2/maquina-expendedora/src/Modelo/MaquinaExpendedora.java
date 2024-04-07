package Modelo;

public class MaquinaExpendedora {
    //atributos
    private boolean estado;// true anda, false no anda
    private int precioMaquina;
    private int saldo;
    private int cantidadBoletos;
    private int recaudacion;
    private int vuelto;
    private int boletosVendidos;

    //constructores
    public MaquinaExpendedora()
    {
        setEstado(true);
        setPrecioMaquina(10);
        setCantidadBoletos(0);
    }


    public MaquinaExpendedora(int precioMaquina,int cantidadBoletos)
    {
        setEstado(true);
        setCantidadBoletos(cantidadBoletos);
        setPrecioMaquina(precioMaquina);
    }

    //setters y getters

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    private void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }

    public void setPrecioMaquina(int precioMaquina) {
        this.precioMaquina = precioMaquina;
    }
    public boolean getEstado() {
        return estado;
    }
    public int getCantidadBoletos() {
        return cantidadBoletos;
    }
    public int getPrecioMaquina() {
        return precioMaquina;
    }

    public int getRecaudacion() {
        return recaudacion;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getBoletosVendidos() {
        return boletosVendidos;
    }

    public int getVuelto() {
        return vuelto;
    }
    //metodos

    public void introducirDinero(int dinero)
    {
        if (dinero > 0)
        {
            saldo+=dinero; //se suma el dinero al saldo de la maquina, si el usuario ingresa de mas, quedara para el proximo usuario
        }
    }
    public Boleto imprimirBoleto()
    {
        Boleto boletoNuevo=null;
        if (saldo >= precioMaquina && cantidadBoletos > 0)
        {
            boletoNuevo= new Boleto(precioMaquina,boletosVendidos);
            recaudacion+=precioMaquina;
            vuelto= calcularVuelto();
            reiniciarSaldo();

            cantidadBoletos--;
            boletosVendidos++;
        }

        return boletoNuevo;
    }

    private void reiniciarSaldo(){
        saldo=0;
    }

    private int calcularVuelto()
    {
        int vuelto=0;
        if (saldo > 0.5)
        {
            vuelto= this.saldo-precioMaquina;
        }
        else
        {
            recaudacion+= this.saldo; // es menor a 0.5 centavos
        }
        return vuelto;
    }

    public int vaciarMaquina()
    {
        int total=recaudacion;
        recaudacion=0;
        return total;
    }

    public String estadisticasMaquina()
    {
        return "Recaudacion: "+vaciarMaquina() + " Cantidad de boletos vendidos: "+ getBoletosVendidos()+ " Cantidad de boletos restantes: "+ getCantidadBoletos();
    }

}
