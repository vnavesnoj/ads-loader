package vnavesnoj.ads_loader_service.tool;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.core.io.ClassPathResource;
import org.springframework.r2dbc.core.DatabaseClient;

import java.nio.charset.Charset;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@RequiredArgsConstructor
public class SimpleTestDataInjection {

    private final DatabaseClient databaseClient;

    @SneakyThrows
    @BeforeEach
    void insertData() {
        final var insertScript = new ClassPathResource("insert-data.sql")
                .getContentAsString(Charset.defaultCharset());
        databaseClient.sql(insertScript)
                .then()
                .block();
    }

    @SneakyThrows
    @AfterEach
    void deleteAllData() {
        final var deleteScript = new ClassPathResource("delete-data.sql")
                .getContentAsString(Charset.defaultCharset());
        databaseClient.sql(deleteScript)
                .then()
                .block();
    }
}
