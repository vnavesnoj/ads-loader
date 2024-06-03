package vnavesnoj.ads_loader_service.integration.repository;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import vnavesnoj.ads_loader_service.database.repository.AdRepository;
import vnavesnoj.ads_loader_service.integration.annotation.IT;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@RequiredArgsConstructor
@IT
public class AdRepositoryTest {

    private final AdRepository adRepository;

    @Test
    void connectionTest() {
        final var result = adRepository.existsById(-1L).block();
        assertThat(result).isFalse();
    }
}
