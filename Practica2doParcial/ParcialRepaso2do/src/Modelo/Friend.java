package Modelo;

public class Friend
{
    //atributos
    private int id;
    private String name;

    public Friend(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
