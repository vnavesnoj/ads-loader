package vnavesnoj.ads_loader_service.repository;

import lombok.RequiredArgsConstructor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import vnavesnoj.ads_loader_service.database.repository.AdRepository;
import vnavesnoj.ads_loader_service.integration.config.TestContainersConfig;

import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@RequiredArgsConstructor
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Import(TestContainersConfig.class)
public class AdRepositoryTest {

    private final AdRepository adRepository;

    @Test
    void connectionTest() {
        final var result = adRepository.existsById(-1L);
        Assertions.assertThat(result).isFalse();
    }
}
