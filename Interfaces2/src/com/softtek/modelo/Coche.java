package com.softtek.modelo;

public class Coche implements IVehiculo{
    int deposito;

    public Coche(int deposito) {
        this.deposito = deposito;
    }

    public Coche() {
    }

    @Override
    public String moverse() {
        if(this.deposito>0)
        {
            return "Moviendose el "+getClass().getSimpleName();
        }
        else return "no cuenta con deposito sufiente para moverse ";

    }
}
