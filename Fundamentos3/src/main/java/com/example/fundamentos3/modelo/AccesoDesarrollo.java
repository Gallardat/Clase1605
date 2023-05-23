package com.example.fundamentos3.modelo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("accesoDesarrollo")
public class AccesoDesarrollo implements IDAO{
    @Override
    public String insertar(Cliente c) {

        return "desarrollo al cliente "+c.getNombre()+" con nif "+c.getNif();
    }
}
