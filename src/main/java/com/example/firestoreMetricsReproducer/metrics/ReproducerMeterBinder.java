package com.example.firestoreMetricsReproducer.metrics;

import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.MeterBinder;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ReproducerMeterBinder implements MeterBinder {

    private final MeterService meterService;

    public ReproducerMeterBinder(MeterService meterService) {
        this.meterService = meterService;
    }

    @Override
    public void bindTo(MeterRegistry registry) {
        Gauge.builder("test", meterService::count)
                .register(registry);
    }
}

/*

@Component
public class ReproducerMeterBinder {

    private final MeterService meterService;

    public ReproducerMeterBinder(MeterRegistry registry, MeterService meterService) {
        this.meterService = meterService;
        Gauge.builder("test", meterService::count)
                .register(registry);
    }
}
 */
