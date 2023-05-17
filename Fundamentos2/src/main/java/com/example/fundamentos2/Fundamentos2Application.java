package com.example.fundamentos2;

import com.example.fundamentos2.modelo.Coche;
import com.example.fundamentos2.modelo.Conductor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Fundamentos2Application implements CommandLineRunner {

    @Autowired
    private Conductor c1;
    public static void main(String[] args) {
        SpringApplication.run(Fundamentos2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ((Coche)c1.getVehiculo()).setDeposito(3);
        System.out.println(c1.conducir());

    }
}
