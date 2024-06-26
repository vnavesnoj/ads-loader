package vnavesnoj.ads_loader_service.repository;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import vnavesnoj.ads_loader_service.database.repository.FilterRepository;
import vnavesnoj.ads_loader_service.integration.annotation.R2dbcTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@RequiredArgsConstructor
@R2dbcTest
public class FilterRepositoryTest {

    private final FilterRepository filterRepository;

    @Test
    void connectionTest() {
        final var result = filterRepository.existsById(-1L).block();
        assertThat(result).isFalse();
    }
}
