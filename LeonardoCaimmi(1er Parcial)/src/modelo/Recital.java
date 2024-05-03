package modelo;

import Interfaces.IMetodosDeControl;

import java.util.*;

public class Recital implements IMetodosDeControl
{
    //atributos
    private String nombre;
    private String lugar;
    private String fecha;


    private HashMap<String,HashSet<Entrada>> entradas;

    //constructores

    public Recital(String nombre, String lugar, String fecha) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        entradas = new HashMap<>();
    }
    public Recital()
    {
        nombre = "Sin nombre";
        lugar = "Sin lugar";
        fecha = "Sin fecha";
        entradas = new HashMap<>();
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public String getFecha() {
        return fecha;
    }
    private void setFecha(String fecha) {
        this.fecha = fecha;
    }

    //metodos

    @Override
    public String toString() {
        return "Recital{" +
                "nombre='" + nombre + '\'' +
                ", lugar='" + lugar + '\'' +
                ", fecha=" + fecha +
                ", entradas=" + entradas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
       boolean rta = false;
       if(o != null)
       {
           if(o instanceof Recital)
           {
               Recital aComparar = (Recital) o;
               if(entradas.equals(((Recital) o).entradas))//si todos mis elementos son iguales, son iguales
               {
                   rta = true;
               }
           }
       }
        return rta;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override//Carga una entrada si no esta repetida en el mapa, sino devuelve false porque no pudo cargarse
    public boolean cargarEntrada(Entrada entradaAgregar)
    {
        boolean rta = false;
        if (entradaAgregar != null )
        {
            if(!verificarId(entradaAgregar))
            {
                HashSet<Entrada> entradas1 = new HashSet<>();
                entradas1.add(entradaAgregar);
                entradas.put(entradaAgregar.obtenerTipo(),entradas1);
                rta = true;
            }
        }
        return rta;
    }

    @Override//me retorna el tamaño del mapa que van a ser la cantidad de entradas
    public int contarCantidadDeEntradas() {
        return entradas.size();
    }

    @Override//mostrar un listado de entradas disponibles
    public String mostrarEntradasDisponibles()
    {
        String rta= "";
        Iterator<Map.Entry<String,HashSet<Entrada>>> entryIterator = entradas.entrySet().iterator();

        while(entryIterator.hasNext())
        {
            Map.Entry<String, HashSet<Entrada>> a = entryIterator.next();
            HashSet<Entrada> b = a.getValue();
            Iterator <Entrada> entradaIterator = b.iterator();

            while(entradaIterator.hasNext())
            {
                Entrada entrada = entradaIterator.next();
                if(entrada.isDisponibilidad())
                {
                    rta += entrada;
                }
            }
        }
    return rta;
    }

    @Override//vender una entrada que este disponible para la venta sino devuelve false
    public boolean venderEntrada(Entrada aVender)
    {
        boolean rta = false;
        if((aVender != null )&& (aVender.isDisponibilidad()))
        {
         String key = aVender.obtenerTipo();
         aVender.setDisponibilidad(false);
         HashSet<Entrada> aReemplazar = new HashSet<>();
         aReemplazar.add(aVender);
         entradas.put(key,aReemplazar);
         rta = true;
        }
        return rta;
    }

    //total de entradas vendidas
    public int contarEntradasVendidas()
    {
        int rta= 0;
        Iterator<Map.Entry<String,HashSet<Entrada>>> entryIterator = entradas.entrySet().iterator();

        while(entryIterator.hasNext())
        {
            Map.Entry<String, HashSet<Entrada>> a = entryIterator.next();
            HashSet<Entrada> b = a.getValue();
            Iterator <Entrada> entradaIterator = b.iterator();

            while(entradaIterator.hasNext())
            {
                Entrada entrada = entradaIterator.next();
                if(!entrada.isDisponibilidad())//si la disponibilidad es false quiere decir que la vendi
                {
                    rta += 1;
                }
            }
        }
        return rta;
    }
    //total de entradas vendidas de tipo general
    public int contarEntradasVendidasGenerales()
    {
        int rta= 0;
        Iterator<Map.Entry<String,HashSet<Entrada>>> entryIterator = entradas.entrySet().iterator();

        while(entryIterator.hasNext())
        {
            Map.Entry<String, HashSet<Entrada>> a = entryIterator.next();
            HashSet<Entrada> b = a.getValue();
            Iterator <Entrada> entradaIterator = b.iterator();

            while(entradaIterator.hasNext())
            {
                Entrada entrada = entradaIterator.next();
                if(!entrada.isDisponibilidad() && entrada.obtenerTipo().equalsIgnoreCase("Entrada General"))//si la disponibilidad es false quiere decir que la vendi y si es general la acumulo a lo vendido
                {
                    rta += 1;
                }
            }
        }
        return rta;
    }
    //total de entradas vendidas de tipo VIP
    public int contarEntradasVendidasVip()
    {
        int rta= 0;
        Iterator<Map.Entry<String,HashSet<Entrada>>> entryIterator = entradas.entrySet().iterator();

        while(entryIterator.hasNext())
        {
            Map.Entry<String, HashSet<Entrada>> a = entryIterator.next();
            HashSet<Entrada> b = a.getValue();
            Iterator <Entrada> entradaIterator = b.iterator();

            while(entradaIterator.hasNext())
            {
                Entrada entrada = entradaIterator.next();
                if(!entrada.isDisponibilidad() && entrada.obtenerTipo().equalsIgnoreCase("Entrada Vip"))//si la disponibilidad es false quiere decir que la vendi y si es general la acumulo a lo vendido
                {
                    rta += 1;
                }
            }
        }
        return rta;
    }

    //recorro el mapa ya que necesito ver en el HashSet entrada por entrada para ver cuales estan vendidas y asi ir sumando la recaudacion
    public double calcularRecaudacion()
    {
        double rta= 0;
        Iterator<Map.Entry<String,HashSet<Entrada>>> entryIterator = entradas.entrySet().iterator();

        while(entryIterator.hasNext())
        {
            Map.Entry<String, HashSet<Entrada>> a = entryIterator.next();
            HashSet<Entrada> b = a.getValue();
            Iterator <Entrada> entradaIterator = b.iterator();

            while(entradaIterator.hasNext())
            {
                Entrada entrada = entradaIterator.next();
                if(!entrada.isDisponibilidad())
                {
                    rta +=entrada.obtenerPrecio();//me devuelve el precio ya calculado segun el tipo de entrada que sea
                }
            }
        }
        return rta;
    }
    //Recibo una entrada creada y antes de insertarla me fijo si el id ya existe, si es asi devuelvo false, pero si la entrada no existe en mi mapa retorno true y asi podre agregar la entrada
        public boolean verificarId(Entrada aVerificar)
        {
            boolean rta = false;
            if(aVerificar != null)
            {
                String key = aVerificar.obtenerTipo();
                if(entradas.containsKey(key))
                {
                    rta = true;
                }
            }
            return rta;
        }

}
