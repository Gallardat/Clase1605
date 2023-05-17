package com.softtek2.presentacion;

import com.softtek2.modelo.Coche;

import com.softtek2.modelo.SeguroCoche;
import com.softtek2.modelo.TallerMecanica;
import com.softtek2.modelo.TallerPintura;

public class Main2 {

    public static void main(String[] args) {
        TallerPintura tp= new TallerPintura();
        TallerMecanica tm= new TallerMecanica();
        Coche coche = new Coche("aaaa","dddd");
        SeguroCoche seguroCoche = new SeguroCoche(tp);
        System.out.println("Reparado por la aseguradora "+seguroCoche.getAseguradora());
        System.out.println(seguroCoche.reparar(coche));
        seguroCoche.setSeguroCoche(tm);
        System.out.println(seguroCoche.reparar(coche));

        //Ejemplo instanciando otro objeto
        // SeguroCoche seguroCoche = new SeguroCoche(tp);



    }
}
