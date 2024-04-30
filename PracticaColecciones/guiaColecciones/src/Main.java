import modelo.ColeccionArrayList;
import modelo.ColeccionHashSet;
import modelo.ColeccionTreeSet;
import modelo.MapasHashMap;

public class Main
{
    public static void main(String[] args)
    {
         //treeSet();
        // hashSet();
        //arrayList();
        hashMap();
    }

    public static void treeSet()
    {
        System.out.println("TREESET");
        ColeccionTreeSet coleccionTreeSet = new ColeccionTreeSet();
        for(int i = 0;i<10;i++)
        {
            coleccionTreeSet.agregar(i);
        }
        System.out.println(coleccionTreeSet.listar());
        System.out.println("CONTAR");
        System.out.println(coleccionTreeSet.contar());
        System.out.println("ELIMINAR");
        coleccionTreeSet.eliminar(1);
        System.out.println(coleccionTreeSet);
        System.out.println("BUSCAR");
        if(coleccionTreeSet.buscar(2))
        {
            System.out.println("DATO ENCONTRADO");
        }else
        {
            System.out.println("NO SE ENCONTRO");
        }
        coleccionTreeSet.agregar(1);//comprobacion de repetidos
        System.out.println(coleccionTreeSet);
    }
    public static void hashSet()
    {
        System.out.println("HASHSET");
        ColeccionHashSet coleccionHashSet = new ColeccionHashSet();
        for(int i = 9;i<19;i++)
        {
            coleccionHashSet.agregar(i);
        }
        System.out.println(coleccionHashSet.listar());
        System.out.println("CONTAR");
        System.out.println(coleccionHashSet.contar());
        System.out.println("ELIMINAR");
        coleccionHashSet.eliminar(15);
        System.out.println(coleccionHashSet);
        System.out.println("BUSCAR");
        if(coleccionHashSet.buscar(14))
        {
            System.out.println("DATO ENCONTRADO");
        }else
        {
            System.out.println("NO SE ENCONTRO");
        }
        coleccionHashSet.agregar(1);//comprobacion de repetidos
        System.out.println(coleccionHashSet);
    }
    public static void arrayList()
    {
        System.out.println("ArrayList");
        ColeccionArrayList coleccionArrayList = new ColeccionArrayList();
        for(int i = 20;i<30;i++)
        {
            coleccionArrayList.agregar(i);
        }
        System.out.println(coleccionArrayList.listar());
        System.out.println("CONTAR");
        System.out.println(coleccionArrayList.contar());
        System.out.println("ELIMINAR");
        coleccionArrayList.eliminar(25);
        System.out.println(coleccionArrayList);
        System.out.println("BUSCAR");
        if(coleccionArrayList.buscar(25))
        {
            System.out.println("DATO ENCONTRADO");
        }else
        {
            System.out.println("NO SE ENCONTRO");
        }
        coleccionArrayList.agregar(20);//comprobacion de repetidos
        System.out.println(coleccionArrayList);

    }
    public static void hashMap()
    {
        System.out.println("hashMap");
        MapasHashMap hashMap = new MapasHashMap();
        for(int i = 100;i<110;i++)
        {
            hashMap.agregar(i);
        }
        System.out.println(hashMap.listar());
        System.out.println("CONTAR");
        System.out.println(hashMap.contar());
        System.out.println("ELIMINAR");
        hashMap.eliminar(109);
        System.out.println(hashMap);
        System.out.println("BUSCAR");
        if(hashMap.buscar(107))
        {
            System.out.println("DATO ENCONTRADO");
        }else
        {
            System.out.println("NO SE ENCONTRO");
        }
        hashMap.agregar(1000);//comprobacion de repetidos
        System.out.println(hashMap);


    }
}
