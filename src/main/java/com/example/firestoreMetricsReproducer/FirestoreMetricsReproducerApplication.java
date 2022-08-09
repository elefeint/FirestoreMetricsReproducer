package com.example.firestoreMetricsReproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirestoreMetricsReproducerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(FirestoreMetricsReproducerApplication.class, args);
        System.out.println("Enter any key to shutdown ...");
        System.in.read();
    }

}
