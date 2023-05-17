package com.softtek.fundamentos.modelo;

import org.springframework.stereotype.Component;

@Component
public class TallerMecanica implements ITaller{
    @Override
    public String reparar(Coche c) {

        return "Reparacion mecanica al coche con matricula de "+c.getMatricula()+" y modelo"+c.getModelo();
    }
}
