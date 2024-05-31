package vnavesnoj.ads_loader_service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import vnavesnoj.ads_loader_service.integration.config.TestContainersConfig;

//@Testcontainers
@SpringBootTest
@Import(TestContainersConfig.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AdsLoaderServiceApplicationTests {

    @Test
    void contextLoads() {
        System.out.println();
    }

}
