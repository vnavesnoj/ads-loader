package vnavesnoj.ads_loader_service.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.r2dbc.core.DatabaseClient;
import reactor.test.StepVerifier;
import vnavesnoj.ads_loader_common.database.entity.Ad;
import vnavesnoj.ads_loader_common.database.entity.Platform;
import vnavesnoj.ads_loader_service.database.repository.AdRepository;
import vnavesnoj.ads_loader_service.integration.annotation.R2dbcTest;
import vnavesnoj.ads_loader_service.tool.SimpleTestDataInjection;

import java.time.Instant;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@R2dbcTest
public class AdRepositoryTest extends SimpleTestDataInjection {

    private final AdRepository adRepository;

    public AdRepositoryTest(@Autowired AdRepository adRepository,
                            @Autowired DatabaseClient databaseClient) {
        super(databaseClient);
        this.adRepository = adRepository;
    }

    @Test
    void connectionTest() {
        final var result = adRepository.existsById(-1L).block();
        assertThat(result).isFalse();
    }

    @Test
    void findAllByFilterId() {
        final Long filterId = 1L;
        adRepository.findAllByFilterId(filterId)
                .as(StepVerifier::create)
                .expectNextCount(9L)
                .verifyComplete();
    }

    @Test
    void emptyFindAllByFilterId() {
        final Long filterId = 99L;
        adRepository.findAllByFilterId(filterId)
                .as(StepVerifier::create)
                .expectNextCount(0L)
                .verifyComplete();
    }

    @Test
    void findAllByFilterIds() {
        final var filterIds = List.of(1L, 2L);
        adRepository.findAllByFilterIds(filterIds)
                .as(StepVerifier::create)
                .expectNextCount(16L)
                .verifyComplete();
    }

    @Test
    void executeInsertAndFindByUrl() {
        final var ad = Ad.builder()
                .platform(Platform.OLX)
                .url("uniqueUrl")
                .title("title")
                .instant(Instant.now())
                .hash(123)
                .build();
        adRepository.save(ad).block();
        adRepository.findByUrl(ad.getUrl())
                .as(StepVerifier::create)
                .expectNext(ad)
                .verifyComplete();
    }
}
