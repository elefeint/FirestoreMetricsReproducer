package com.example.r2dbcMetricsReproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class R2dbcH2MetricsReproducerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(R2dbcH2MetricsReproducerApplication.class, args);
        System.out.println("Enter any key to shutdown ...");
        System.in.read();
    }

}
