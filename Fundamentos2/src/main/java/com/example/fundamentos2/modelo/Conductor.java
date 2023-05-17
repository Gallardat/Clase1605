package com.example.fundamentos2.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Conductor {
    @Autowired
    private IVehiculo vehiculo;

    public Conductor(IVehiculo vehiculo) {

        this.vehiculo = vehiculo;
    }

    public Conductor() {
    }


    public String conducir(){

        return vehiculo.moverse();
    }

    public IVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
