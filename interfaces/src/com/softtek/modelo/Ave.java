package com.softtek.modelo;

public class Ave extends Animal implements  ObjetoVolador{
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
    return "aterrizando"+getClass();
    }
    public  String  hacerNido(){
       return "Haciendo nido"+getClass();
    }
    public String ponerHuevos(){
        return "poniendo huevos"+getClass();
    }
}
