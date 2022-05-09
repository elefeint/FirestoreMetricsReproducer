package com.example.firestoreMetricsReproducer.data;

import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ReproducerRepository extends FirestoreReactiveRepository<Reproducer> {
}
