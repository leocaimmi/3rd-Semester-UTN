package modelo;

public class Horario {

    //atributos
    int hora;
    int minutos;
    int segundos;
    //constructores

    public Horario(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Horario()
    {
        hora=0;
        minutos=0;
        segundos=0;
    }

    //getters y setter

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }


    //metodos

    public String getHoraCompleta()
    {
        String s="";
        if (hora >= 10)
        {
            s+= hora;
        }
        else
        {
            s+="0"+hora;
        }
        s+=":";
        if (minutos>=10)
        {
            s+=minutos;
        }
        else
        {
            s+="0"+minutos;
        }
        s+=":";

        if (segundos>=10)
        {
            s+=segundos;
        }
        else
        {
            s+="0"+segundos;
        }

        return s;
    }

    public Horario avanzarUnSegundo()
    {
        segundos++;
        if (segundos > 59)
        {
            segundos=0;
            minutos++;
        }
        if (minutos > 59)
        {
            minutos=0;
            hora++;
        }

        if (hora > 59)
        {
            segundos=0;
            minutos=0;
            hora=0;
        }

       return this;
    }

    public Horario retrasarUnSegundo()
    {
        segundos--;

        if (segundos < 0)
        {
            segundos=59;
            minutos--;
        }
        if (minutos < 0)
        {
            minutos=59;
            hora--;
        }

        if (hora < 0)
        {
            hora=23;
            minutos=59;
            segundos=59;
        }

        return this;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "hora=" + hora +
                ", minutos=" + minutos +
                ", segundos=" + segundos +
                '}';
    }
}
