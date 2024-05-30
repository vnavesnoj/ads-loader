package vnavesnoj.ads_loader_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("vnavesnoj.ads_loader_common.database.entity")
@SpringBootApplication
public class AdsLoaderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdsLoaderServiceApplication.class, args);
    }

}
