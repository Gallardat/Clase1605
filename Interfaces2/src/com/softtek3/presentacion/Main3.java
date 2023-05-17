package com.softtek3.presentacion;

import com.softtek3.modelo.AccesoDesarrollo;
import com.softtek3.modelo.AccesoProduccion;
import com.softtek3.modelo.Cliente;
import com.softtek3.modelo.ClienteDao;

public class Main3 {

    public static void main(String[] args) {
        Cliente cliente= new Cliente();
        AccesoDesarrollo ad= new AccesoDesarrollo();
        AccesoProduccion ap= new AccesoProduccion();
        ClienteDao cd= new ClienteDao(ad);
        System.out.println("El cliente "+cliente.getNombre());
        System.out.println( cd.insertar(cliente));
        ClienteDao cd2= new ClienteDao(ap);
        System.out.println( cd2.insertar(cliente));









    }
}
