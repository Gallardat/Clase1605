package com.example.fundamentos3;

import com.example.fundamentos3.modelo.Cliente;
import com.example.fundamentos3.modelo.ClienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Fundamentos3Application implements CommandLineRunner {
    @Autowired
    private ClienteDao clienteDao;
    @Autowired
    private Cliente cliente;
    public static void main(String[] args) {
        SpringApplication.run(Fundamentos3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        cliente.setNombre("Daniela");
        cliente.setNif("123456789");
        System.out.println(clienteDao.insertar(cliente));
    }
}
