package Modelo;

import java.util.ArrayList;

public class DoME {
    private ArrayList<Elemento> elementos = new ArrayList<Elemento>();//coleccion de las clases hijas de Elemento





    public Elemento crearUnElemento(String auxTitulo, String auxComentario, int auxDuracion, boolean auxEstado)
    {
        return new Elemento(auxTitulo,auxDuracion,auxEstado,auxComentario);
    }


    public void cargarCatalogoCD(Elemento auxElemento, String auxArtista, int auxCantidadTemas)
    {
        elementos.add(new CD(auxCantidadTemas,auxArtista,auxElemento.getDuracion(), auxElemento.isLoTengo(),auxElemento.getComentario(),auxElemento.getTitulo()));
    }

    public void cargarCatalogoDVD(Elemento auxElemento, String auxDirector)
    {
        elementos.add(new DVD(auxElemento.getTitulo(),auxElemento.getDuracion(),auxElemento.isLoTengo(), auxElemento.getComentario(), auxDirector));
    }


    public String mostrarArrayList()
    {
        String texto=null;
        for(int i = 0;i<elementos.size();i++) {
            if (elementos.get(i) instanceof CD)
            {
                texto+= elementos.get(i).imprimir();

            }else if(elementos.get(i) instanceof DVD)
            {
               texto+= elementos.get(i).imprimir();
            }

        }
        return  texto;
    }

}
