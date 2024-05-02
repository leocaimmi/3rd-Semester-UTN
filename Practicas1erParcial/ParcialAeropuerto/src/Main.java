import modelo.*;

public class Main {
    public static void main(String[] args)
    {
        Aeropuerto aeropuerto = new Aeropuerto("Astor PIAZZOLA","MDQ","Av pescaderos",4);
        aeropuerto.cargarHangar(new Hangar(1));
        aeropuerto.cargarHangar(new Hangar(2));
        aeropuerto.cargarHangar(new Hangar(3));
        aeropuerto.cargarHangar(new Hangar(4));

      //  aeropuerto.agregarAvion(new Comercial("AAA","AirBus777","FlyBondi","Grande",100,2,2,"Limpieza"));
       // aeropuerto.agregarAvion(new Comercial("AAA","AirBus777","FlyBondi","Grande",100,2,2,"Limpieza"));
        aeropuerto.agregarAvion(new Privado("BBB","MESSIJET","Private","Medio",200,2,true,"facuCrack"));
        aeropuerto.agregarAvion(new Militar("CCC","MILITAR","CAMUFLADO","Grande",300,2,"Armas",100));
        aeropuerto.agregarAvion(new DeCarga("DDD","Carga","Militar","Cuadruple",1000,0,1000,"Avena"));
        //System.out.println(aeropuerto);
        aeropuerto.agregarAvion(new Privado("a","a","a","a",200,2,true,"a"));
        System.out.println(aeropuerto);
        System.out.println(aeropuerto.verificarEspacio());
        System.out.println(aeropuerto.despegarTodos(2));


    }
    //tiempo 3 horas
}