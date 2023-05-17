package com.softtek.modelo;

public class Barcaza extends Vehiculo implements Nautico{
    @Override
    public String atracar() {
        return "Atracar"+getClass().getSimpleName();
    }

    @Override
    public String navegar() {
        return "Navegar"+getClass().getSimpleName();
    }
}
