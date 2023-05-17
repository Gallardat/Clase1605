package com.softtek.modelo;

public class Superman extends Kriptoniano implements ObjetoVolador{

    public String saltarEdificio(){
        return "Saltando edificio"+getClass();
    }
    public String detenerBala(){
        return "Deteniendo bala"+getClass();
    }

    @Override
    public String volar() {
        return "volando"+getClass();
    }

    @Override
    public String despegar() {
        return "despegando"+getClass();
    }

    @Override
    public String aterrizar() {
        return "aterrizando";
    }
}
