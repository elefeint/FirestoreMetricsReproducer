package com.example.firestoreMetricsReproducer.metrics;

import com.example.firestoreMetricsReproducer.data.ReproducerRepository;
import org.springframework.stereotype.Service;

@Service
public class MeterService {
    private final ReproducerRepository repository;

    public MeterService(ReproducerRepository repository) {
        this.repository = repository;
    }

    public Long count() {
        return repository.count().block();
    }

}
