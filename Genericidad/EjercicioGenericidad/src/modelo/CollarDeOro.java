package modelo;

import Interfaces.IValuable;

public class CollarDeOro implements IValuable {
    //atributos
    private double kilates;

    public CollarDeOro(double kilates) {
        this.kilates = kilates;
    }

    public double getKilates() {
        return kilates;
    }


    @Override
    public boolean isValuable() {
        return true;
    }
}
