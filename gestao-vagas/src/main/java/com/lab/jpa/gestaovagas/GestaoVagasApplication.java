package com.lab.jpa.gestaovagas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestaoVagasApplication {

    public static void main(String[] args) {
        //inicializa o servidor web embutido
        SpringApplication.run(GestaoVagasApplication.class, args);
    }

}
