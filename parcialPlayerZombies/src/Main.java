import modelo.*;

public class Main {
    public static void main(String[] args)
    {
        GestorDelJuego a = new GestorDelJuego();
        //player
        a.agregarPersonaje(new Joel(1,2,"Joel","Ropa Deportiva",100,"Pistola",4,7));
        a.agregarPersonaje(new Ellie(2,2,"Ellie","Elegante Sport",100,"Ak-47",10,20));
        //zombies
        a.agregarPersonaje(new Gordinflones(3,2,"Gordis","Grasas",100,"Dientes",9));
        a.agregarPersonaje(new Acechadores(4,3,"Acecher","Musgo",100,"Dientes","Largo alcance"));
        a.agregarPersonaje(new Corredores(5,5,"Usain Bolt","Huesos",100,"Dientes",5));
        a.agregarPersonaje(new Chasqueadores(1,1,"Chasquins","Dedos",100,"Dientes",10));

        //objetos
        //muro
        a.agregarObjetos(new Muro(2,3,"Metal"));
        //plataforma
        a.agregarObjetos(new Plataforma(4,4,"Metal","Acuatico"));

        System.out.println(a);
    }
    //tiempo para realizar 2:05:00; con UML INCLUIDO
}