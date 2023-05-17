package com.softtek2.modelo;



public class TallerMecanica implements ITaller{
    @Override
    public String reparar(Coche c) {
        return "Reparacion mecanica";
    }
}
