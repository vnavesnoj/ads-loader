package vnavesnoj.ads_loader_service.repository;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;
import vnavesnoj.ads_loader_common.database.entity.Ad;
import vnavesnoj.ads_loader_common.database.entity.Platform;
import vnavesnoj.ads_loader_service.database.repository.AdRepository;
import vnavesnoj.ads_loader_service.integration.annotation.R2dbcTest;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@RequiredArgsConstructor
@R2dbcTest
public class AdRepositoryTest {

    private final AdRepository adRepository;

    private final Ad ad1 = Ad.builder()
            .platform(Platform.OLX)
            .url("dummy url")
            .title("Dummy title")
            .pushupTime(Instant.now().minus(1, ChronoUnit.DAYS))
            .instant(Instant.now())
            .hash(123)
            .build();
    private final Ad ad2 = Ad.builder()
            .platform(Platform.OLX)
            .url("dummy url2")
            .title("Dummy title2")
            .instant(Instant.now())
            .hash(123)
            .build();

    @AfterEach
    void deleteAllData() {
        adRepository.deleteAll()
                .block();
    }

    @Test
    void connectionTest() {
        final var result = adRepository.existsById(-1L).block();
        assertThat(result).isFalse();
    }

    @Test
    void executesInsertAndFindAll() {
        insert(ad1, ad2);

        adRepository.findAll()
                .as(StepVerifier::create)
                .expectNext(ad1)
                .expectNext(ad2)
                .verifyComplete();
    }

    @Test
    void executeInsertFindByUrl() {
        insert(ad1, ad2);

        adRepository.findByUrl(ad1.getUrl())
                .as(StepVerifier::create)
                .expectNext(ad1)
                .verifyComplete();

        adRepository.findAll()
                .as(StepVerifier::create)
                .expectNext(ad1)
                .expectNext(ad2)
                .verifyComplete();
    }

    private void insert(Ad... ads) {
        adRepository.saveAll(Arrays.asList(ads))
                .as(StepVerifier::create)
                .expectNextCount(2L)
                .verifyComplete();
    }
}
