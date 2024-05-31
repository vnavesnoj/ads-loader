package vnavesnoj.ads_loader_service.repository;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import vnavesnoj.ads_loader_service.database.repository.AdRepository;
import vnavesnoj.ads_loader_service.integration.annotation.JpaTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@RequiredArgsConstructor
@JpaTest
public class AdRepositoryTest {

    private final AdRepository adRepository;

    @Test
    void connectionTest() {
        final var result = adRepository.existsById(-1L);
        assertThat(result).isFalse();
    }
}
