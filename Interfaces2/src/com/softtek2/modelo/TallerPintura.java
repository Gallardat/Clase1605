package com.softtek2.modelo;

public class TallerPintura implements ITaller {
    @Override
    public String reparar(Coche c) {
        return "Reparacion de pintura ";
    }
}
