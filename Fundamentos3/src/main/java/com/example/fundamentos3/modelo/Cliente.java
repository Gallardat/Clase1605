package com.example.fundamentos3.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@NoArgsConstructor
@Data
@Component
public class Cliente {

    String nombre;
    String nif;
}
