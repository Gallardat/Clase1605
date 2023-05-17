package com.softtek3.modelo;

public class ClienteDao {

    IDAO conexion;

    public ClienteDao(IDAO conexion) {
        this.conexion = conexion;
    }

    public String insertar(Cliente cliente) {

        return"acceso "+conexion.insertar(cliente);
    }
}
