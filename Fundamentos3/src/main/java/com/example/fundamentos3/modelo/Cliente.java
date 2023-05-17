package com.example.fundamentos3.modelo;

import org.springframework.stereotype.Component;

@Component
public class Cliente {

    String nombre;
    String nif;

    public Cliente() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}
