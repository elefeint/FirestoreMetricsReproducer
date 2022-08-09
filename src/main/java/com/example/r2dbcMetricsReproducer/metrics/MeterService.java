package com.example.r2dbcMetricsReproducer.metrics;

import com.example.r2dbcMetricsReproducer.data.ReproducerRepository;
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
