package vnavesnoj.ads_loader_service.dto;

import lombok.Value;
import vnavesnoj.ads_loader_common.database.entity.Platform;

import java.time.Instant;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@Value
public class FilterMetaInfoReadDto {

    Long id;

    Platform platform;

    Instant instant;
}
