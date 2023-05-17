package com.example.fundamentos3.modelo;

public class AccesoProduccion implements IDAO{
    @Override
    public String insertar(Cliente cliente) {


        return " produccion al "+cliente.getNombre();
    }
}
