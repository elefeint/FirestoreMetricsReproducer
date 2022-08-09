# Minimal reproducer for bean dependency cycle

This project can be used to show an issue when user application attempts to inject an implementation of `MeterBinder`.

`org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport` brings in `org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessor`. Spring Data publishes `org.springframework.data.mapping.context.MappingContextEvent` when entity type is registered in  `RepositoryFactoryBeanSupport.afterPropertiesSet()`. Because `startupTimeMetrics` is registered as an `ApplicationListener`, it has to get instantiated at that point, causing the cycle.


# Workaround

Injecting `MeterRegistry` and adding gauges instead of implementing `MeterBinder` would resolve the issue.

## Verification

Attempt to run the application.

## See also
https://github.com/GoogleCloudPlatform/spring-cloud-gcp/issues/1113
https://github.com/spring-projects/spring-boot/issues/27591
