package com.softtek.presentacion;


import com.softtek.modelo.*;

import java.io.ObjectStreamException;

public class Main {
    public static void main(String[] args) {
        ObjetoVolador avion= new Avion();
        ObjetoVolador ave= new Ave();
        ObjetoVolador superman= new Superman();
        ObjetoVolador hidroavion1= new Hidroavion();
        Nautico barcaza = new Barcaza();

        Nautico[] arrayNautico= new Nautico[]{barcaza, (Nautico) hidroavion1};
        ObjetoVolador[] array= new ObjetoVolador[]{avion,ave,superman, hidroavion1};

        System.out.println("----CON FOR----");

        for (ObjetoVolador objeto : array) {
            System.out.println(objeto.volar());
            System.out.println(objeto.aterrizar());
            System.out.println(objeto.despegar());
            if(objeto instanceof ObjetoVolador){
                System.out.println(objeto.getClass().getSimpleName());
            }
            if(objeto instanceof Ave){
                System.out.println(((Ave) ave).hacerNido());
                System.out.println(((Ave) ave).ponerHuevos());
            }
            if(objeto instanceof Superman){
                System.out.println(((Superman) superman).saltarEdificio());
                System.out.println(((Superman) superman).detenerBala());
            }
            if(objeto instanceof Hidroavion){
                System.out.println(((Hidroavion) hidroavion1).atracar());
                System.out.println(((Hidroavion) hidroavion1).navegar());
            }
        }

        System.out.println("-----SIN FOR----");
        System.out.println("El Avion está ");
        System.out.println(avion.volar());
        System.out.println(avion.aterrizar());
        System.out.println(avion.despegar());
        System.out.println("El Ave está");
        System.out.println(ave.volar());
        System.out.println(ave.aterrizar());
        System.out.println(ave.despegar());
        System.out.println(((Ave) ave).hacerNido());
        System.out.println(((Ave) ave).ponerHuevos());
        System.out.println("El Superman está ");
        System.out.println(superman.volar());
        System.out.println(superman.aterrizar());
        System.out.println(superman.despegar());
        System.out.println(((Superman) superman).saltarEdificio());
        System.out.println(((Superman) superman).detenerBala());

        System.out.println("Ejemplo de casteo para poder obtener metodos de las clases que no son objetovolador");
        Superman s1= (Superman) superman;
        s1.saltarEdificio();
        System.out.println(s1.saltarEdificio());
        System.out.println("**************************************************");



        for(Nautico nautico:arrayNautico){
            System.out.println(nautico.atracar());
            System.out.println(nautico.navegar());
            if(nautico instanceof Nautico){
                System.out.println(nautico.getClass().getSimpleName());
            }
            //Aqui no hacemos el casteo porque recordemos que en la declaracion del array ya lo estamos casteando
            if(nautico instanceof Hidroavion){
                System.out.println(hidroavion1.volar());
                System.out.println(hidroavion1.aterrizar());
                System.out.println(hidroavion1.despegar());
            }

        }




    }

}

    /*System.out.println("RESTO DE EJEMPLOS DE EXTENDS E IMPLEMENTES");
            System.out.println("LA CLASE HIDROACION HEREDA DE AVION Y SUS METODOS");
            System.out.println(hidroavion1.despegar());
            System.out.println(hidroavion1.aterrizar());
            System.out.println(hidroavion1.volar());
            System.out.println("IMPLEMENTACION DE HIDROAVION");

            Nautico barcaza = new Barcaza();
            System.out.println(barcaza.atracar());
            Nautico hidroavion=  new Hidroavion();
            System.out.println(hidroavion.navegar());*/