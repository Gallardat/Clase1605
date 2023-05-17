package com.example.fundamentos3.modelo;

import org.springframework.stereotype.Component;

@Component
public class AccesoDesarrollo implements IDAO{
    @Override
    public String insertar(Cliente c) {

        return "desarrollo al cliente "+c.getNombre()+" con nif "+c.getNif();
    }
}
