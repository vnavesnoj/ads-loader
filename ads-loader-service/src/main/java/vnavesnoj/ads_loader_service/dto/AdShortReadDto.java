package vnavesnoj.ads_loader_service.dto;

import lombok.Value;
import org.springframework.lang.Nullable;
import vnavesnoj.ads_loader_common.database.entity.Platform;

import java.time.Instant;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@Value
public class AdShortReadDto {

    Long id;

    Platform platform;

    String url;

    String title;

    @Nullable
    Instant pushupTime;

    Instant instant;
}
