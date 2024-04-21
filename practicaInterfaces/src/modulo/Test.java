package modulo;

import java.util.ArrayList;

public class Test
{
    //atributos
    private ArrayList<Edificio> estructuras = new ArrayList<>();
    //constructores

    public Test(ArrayList<Edificio> estructuras) {
        this.estructuras = estructuras;
    }

    //getters y setters

    public ArrayList<Edificio> getEstructuras() {
        return estructuras;
    }

    public void setEstructuras(ArrayList<Edificio> estructuras) {
        this.estructuras = estructuras;
    }

    //metodos

    public void agregarEstructuras(Edificio unaEstructura)
    {
        estructuras.add(unaEstructura);
    }
    public void imprimir()
    {
        for(int i = 0; i<estructuras.size();i++)
        {
            if(estructuras.get(i) instanceof EdificioDeOficinas)
            {
                EdificioDeOficinas oficina = (EdificioDeOficinas) estructuras.get(i);
                System.out.println(oficina.imprimir());
            }
            else if(estructuras.get(i) instanceof Polideportivo)
            {
                Polideportivo poli = (Polideportivo) estructuras.get(i);
                System.out.println(poli.imprimir());
            }
        }
    }


}
