package com.example.firestoreMetricsReproducer;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.FirestoreEmulatorContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@SpringBootTest
@Testcontainers
class FirestoreMetricsReproducerApplicationTests {

    @Container
    private static FirestoreEmulatorContainer emulator = new FirestoreEmulatorContainer(
            DockerImageName.parse("google/cloud-sdk:382.0.0-emulators")
                    .asCompatibleSubstituteFor("gcr.io/google.com/cloudsdktool/cloud-sdk")
    );

    @DynamicPropertySource
    static void redisProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.cloud.gcp.firestore.emulator.enabled", () -> true);
        registry.add("spring.cloud.gcp.firestore.host-port", emulator::getEmulatorEndpoint);
    }

    @Test
    void contextLoads() {
        Assertions.assertTrue(true, "The app should start successfully");
    }

}
