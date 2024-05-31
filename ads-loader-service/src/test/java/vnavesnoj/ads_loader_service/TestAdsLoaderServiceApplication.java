package vnavesnoj.ads_loader_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import vnavesnoj.ads_loader_service.integration.config.TestContainersConfig;

@TestConfiguration(proxyBeanMethods = false)
public class TestAdsLoaderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(AdsLoaderServiceApplication::main)
                .with(TestContainersConfig.class)
                .run(args);
    }
}
