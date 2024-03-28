package modulo;
/*nombre (String): almacena el nombre de la tienda.
productos (ArrayList de tipo String): almacena una lista de productos disponibles en la tienda.

Comportamiento:

agregarProducto(String producto): agrega un producto a la lista de productos de la tienda.
mostrarProductos(): muestra por pantalla la lista de productos disponibles en la tienda.*/

public class Tienda
{
    //atributos
    private String nombre;
    private String[] producto;
    private int cantProductos;

    //constructores
    public  Tienda()
    {
        setNombre("sin nombre");
        producto = new String[10];//usamos arreglos unicamente para aprender la sintaxis.
        setCantProductos(0);
    }
    public Tienda(String pNombre,String pProducto[],int pCantProducto)
    {
        setNombre(pNombre);
        setProducto(pProducto);
        setCantProductos(pCantProducto);

    }
    //getters y setters

    public String getNombre() {
        return nombre;
    }
    public String[] getProductos() {
        return producto;
    }

    public int getCantProductos() {
        return cantProductos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setProducto(String[] producto) {
        this.producto = producto;
    }

    public void setCantProductos(int cantProductos) {
        this.cantProductos = cantProductos;
    }
    //metodos

    public  String agregarProducto(String nuevoProducto)
    {
        String msj = "";
        if(cantProductos < producto.length)//si tengo lugar en la tienda los agrego.
        {
            producto[cantProductos] = nuevoProducto;//le sumo uno para que en la posicion vacia agregue el nuevo producto;
            cantProductos++;
        }else
        {
            msj="No hay lugar suficiente para agregar el producto.";
        }
        return msj;
    }

    public String mostrarProducto()//muestra todos los productos del arreglo
    {
       String rta = "";
        for(int i = 0;i<cantProductos;i++)
        {
            rta +=mostrarUnProducto(producto[i]);
        }

        return rta;
    }
    private String mostrarUnProducto(String producto)//retorna la informacion de un producto
    {
        return "Tienda["+nombre+"]-->"+"Producto: "+producto+"\n";
    }


}
