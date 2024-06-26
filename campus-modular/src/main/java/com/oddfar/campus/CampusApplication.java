package com.oddfar.campus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * GitHub: https://github.com/oddfar/campus-imaotai
 * @author oddfar
 */
@SpringBootApplication
public class CampusApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(CampusApplication.class);
        app.setLazyInitialization(true);
        app.run(args);
    }

}
