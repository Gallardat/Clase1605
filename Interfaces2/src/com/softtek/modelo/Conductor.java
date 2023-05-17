package com.softtek.modelo;

public class Conductor {

    private IVehiculo vehiculo;

    public Conductor(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


    public String conducir(){

        return vehiculo.moverse();
    }
}
