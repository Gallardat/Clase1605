package com.example.fundamentos3.modelo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("accesoProduccion")
public class AccesoProduccion implements IDAO{
    @Override
    public String insertar(Cliente cliente) {


        return " produccion a "+cliente.getNombre();
    }
}
