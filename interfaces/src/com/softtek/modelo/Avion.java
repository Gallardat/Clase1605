package com.softtek.modelo;

public class Avion extends Vehiculo implements ObjetoVolador {
    @Override
    public String volar() {

        return "Volando"+getClass();
    }

    @Override
    public String despegar() {
    return "Despegando "+getClass();
    }

    @Override
    public String aterrizar() {
    return "Aterrizando "+getClass();
    }
}
