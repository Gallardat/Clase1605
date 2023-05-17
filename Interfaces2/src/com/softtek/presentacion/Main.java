package com.softtek.presentacion;


import com.softtek.modelo.Coche;
import com.softtek.modelo.Conductor;
import com.softtek.modelo.IVehiculo;

public class Main {

    public static void main(String[] args) {
        //IVehiculo c= new Coche(1);
        Conductor c = new Conductor( new Coche(0));
        System.out.println(c.conducir());
    }
}