package com.softtek2.modelo;


public class SeguroCoche {

    ITaller taller;
    String aseguradora="Mapfre";

    public SeguroCoche(ITaller taller) {

        this.taller = taller;
    }
    public String reparar(Coche c) {

        return ""+taller.reparar(c);
    }


    public void setSeguroCoche(ITaller taller){
        this.taller = taller;

    }



    public ITaller getTaller() {
        return taller;
    }

    public void setTaller(ITaller taller) {
        this.taller = taller;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }
}
