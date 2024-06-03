package vnavesnoj.ads_loader_service.repository;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import vnavesnoj.ads_loader_service.database.repository.FilterAdRepository;
import vnavesnoj.ads_loader_service.integration.annotation.R2dbcTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@RequiredArgsConstructor
@R2dbcTest
public class FilterAdRepositoryTest {

    private final FilterAdRepository filterAdRepository;

    @Test
    void connectionTest() {
        final var result = filterAdRepository.existsById(-1L).block();
        assertThat(result).isFalse();
    }
}
