package Interfaces;

import modelo.Entrada;

public interface IMetodosDeControl
{
    boolean cargarEntrada(Entrada aAGregar);//recibo una entrada y luego realizo la carga como la clase lo implemente
    int contarCantidadDeEntradas();
    String  mostrarEntradasDisponibles();
     int contarEntradasVendidasGenerales();
     int contarEntradasVendidasVip();
    double calcularRecaudacion();
    boolean venderEntrada(Entrada aVender);//recibo una entrada y luego realizo la venta como la clase lo implemente

}
