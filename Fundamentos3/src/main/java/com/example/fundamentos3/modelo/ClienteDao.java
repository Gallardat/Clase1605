package com.example.fundamentos3.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class ClienteDao {
    @Autowired
    @Qualifier("accesoProduccion")
    IDAO conexion;

    public String insertar(Cliente cliente) {

        return"acceso "+conexion.insertar(cliente);
    }


}
