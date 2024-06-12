package Modelo;

import java.io.Serializable;

public class Jugador implements Serializable
{
//atributos
private String ID;
private String guid;
private boolean isActive;
private String balance;
private int age;
private String eyeColor;
private name name;
private String eMail;
private String phone;
private String posicion;

//constructor

    public Jugador(String ID, String guid, boolean isActive, String balance, int age, String eyeColor, name name, String eMail, String phone, String posicion) {
        this.ID = ID;
        this.guid = guid;
        this.isActive = isActive;
        this.balance = balance;
        this.age = age;
        this.eyeColor = eyeColor;
        this.name = name;
        this.eMail = eMail;
        this.phone = phone;
        this.posicion = posicion;
    }
//getters y setters

    public String getID() {
        return ID;
    }

    public String getGuid() {
        return guid;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getBalance() {
        return balance;
    }

    public int getAge() {
        return age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public Modelo.name getName() {
        return name;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPhone() {
        return phone;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "ID='" + ID + '\'' +
                ", guid='" + guid + '\'' +
                ", isActive=" + isActive +
                ", balance='" + balance + '\'' +
                ", age=" + age +
                ", eyeColor='" + eyeColor + '\'' +
                ", name=" + name +
                ", eMail='" + eMail + '\'' +
                ", phone='" + phone + '\'' +
                ", tanque='" + posicion + '\'' +
                '}'+"\n";
    }
}
