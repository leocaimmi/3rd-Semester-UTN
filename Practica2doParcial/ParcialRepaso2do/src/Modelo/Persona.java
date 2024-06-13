package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
/*

Crear las clases Java necesarias para guardar toda la información del archivo. Aquí deben
 procesar el JSON y convertirlo en clases java
 */
public class Persona implements Serializable
{
    //atributos
    private String _id;
    private boolean isActive;
    private String balance;
    private String eyeColor;
    private String name;
    private String gender;
    private int age;
    private ArrayList<String> tags;
    private ArrayList<Friend> friends;
    //constructores

    public Persona(String _id, boolean isActive, String balance, String eyeColor, String name, String gender,int age,ArrayList<String>tags,ArrayList<Friend>friends) {
        this._id = _id;
        this.isActive = isActive;
        this.balance = balance;
        this.eyeColor = eyeColor;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.tags = tags;
        this.friends = friends;
    }
    //getters y setters


    public String get_id() {
        return _id;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getBalance() {
        return balance;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public ArrayList<Friend> getFriends() {
        return friends;
    }
    //metodos


    @Override
    public String toString() {
        return "Persona{" +
                "_id='" + _id + '\'' +
                ", isActive=" + isActive +
                ", balance='" + balance + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", tags=" + tags +
                ", friends=" + friends +
                '}';
    }
}
