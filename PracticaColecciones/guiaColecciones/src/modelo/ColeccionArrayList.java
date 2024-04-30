package modelo;

import Interfaces.IMetodosColeciones;

import java.util.ArrayList;

public class ColeccionArrayList implements IMetodosColeciones
{
    //atributos
    private ArrayList<Integer> arrayList;
    //constructores
    public ColeccionArrayList()
    {
        arrayList = new ArrayList<>();
    }

    //getters y setters


    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    //metodos


    @Override
    public String toString() {
        return "ColeccionArrayList{" +
                "arrayList=" + arrayList +
                '}';
    }

    @Override
    public void agregar(Integer dato)
    {
     arrayList.add(dato);
    }

    @Override
    public void eliminar(Integer aBorrar)
    {
    arrayList.remove(aBorrar);
    }

    @Override
    public boolean buscar(Integer aBuscar) {
        return arrayList.contains(aBuscar);
    }

    @Override
    public String listar() {
        String msj = "";
        for(Integer e: arrayList)
        {
            msj += e+"\n";
        }
        return msj ;
    }

    @Override
    public int contar() {
        return arrayList.size();
    }

}
