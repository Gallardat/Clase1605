package com.example.fundamentos2.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coche implements IVehiculo{
    int deposito;

    public Coche(int deposito) {
        this.deposito = deposito;
        System.out.println(this.deposito);
    }

    public Coche() {
    }

    @Override
    public String moverse() {
        String cadena="";
        if(this.deposito>0)
        {
            cadena="Moviendose el "+getClass().getSimpleName();
        }
        else {
            cadena="no cuenta con deposito sufiente para moverse ";

        }
    return cadena;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }
}
