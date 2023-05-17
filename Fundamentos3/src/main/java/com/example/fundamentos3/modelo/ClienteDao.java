package com.example.fundamentos3.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteDao {
    @Autowired
    IDAO conexion;

    public ClienteDao(IDAO conexion) {

        this.conexion = conexion;
    }

    public ClienteDao() {
    }

    public String insertar(Cliente cliente) {

        return"acceso "+conexion.insertar(cliente);
    }

    public IDAO getConexion() {
        return conexion;
    }

    public void setConexion(IDAO conexion) {
        this.conexion = conexion;
    }
}
