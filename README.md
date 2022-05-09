# Minimal reproducer for bean dependency cycle

This project can be used to show an issue when spring data firestore
repositories are used to generate metrics for micrometer.


## Verification
The test in `FirestoreMetricsReproducerApplicationTests` should pass.
The test uses testcontainers to run a firestore emulator, so a valid local docker 
environment is required.
