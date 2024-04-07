package Modelo;
import java.util.Date;

public class Boleto {
    //atributos
    private int precioBoleto;
    private Date fecha;
    private int id; //nro de boleto
    //constructores
    public Boleto(int precio,int pId)
    {
        setPrecioBoleto(precio);
        setId(pId);
        fecha = new Date();
    }
    //setters y getters

    private void setPrecioBoleto(int precioBoleto) {
        this.precioBoleto = precioBoleto;
    }

    private void setId(int pId) {
        this.id=pId;
    }
    public int getId() {
        return id;
    }
    public int getPrecioBoleto() {
        return precioBoleto;
    }
    public Date getFecha() {
        return fecha;
    }

    //metodos

    public String mostrarBoleto()
    {
        String texto="Boleto["+id+"]\nFecha emision["+fecha+"]\n BOLETO IMPRESO\n";
        return texto;
    }
}
