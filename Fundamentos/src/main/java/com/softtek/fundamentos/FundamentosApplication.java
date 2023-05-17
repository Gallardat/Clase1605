package com.softtek.fundamentos;

import com.softtek.fundamentos.modelo.Coche;
import com.softtek.fundamentos.modelo.SeguroCoche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

    @Autowired
    private SeguroCoche s1;
    @Autowired
    private Coche c1;
    public static void main(String[] args) {

        SpringApplication.run(FundamentosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       // Coche c1 = new Coche("1111","3333");
        c1.setMatricula("1111");
        c1.setModelo("3333");
        System.out.println(s1.reparar(c1));
    }
}
