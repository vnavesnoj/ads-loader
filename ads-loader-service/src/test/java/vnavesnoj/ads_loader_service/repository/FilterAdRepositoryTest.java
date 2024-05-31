package vnavesnoj.ads_loader_service.repository;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import vnavesnoj.ads_loader_service.database.repository.FilterAdRepository;
import vnavesnoj.ads_loader_service.integration.annotation.JpaTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@RequiredArgsConstructor
@JpaTest
public class FilterAdRepositoryTest {

    private final FilterAdRepository filterAdRepository;

    @Test
    void connectionTest() {
        final var result = filterAdRepository.existsById(-1L);
        assertThat(result).isFalse();
    }
}
