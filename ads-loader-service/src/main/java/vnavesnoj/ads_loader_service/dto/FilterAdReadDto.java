package vnavesnoj.ads_loader_service.dto;

import lombok.Value;

import java.time.Instant;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@Value
public class FilterAdReadDto {

    Long id;

    AdMetaInfoReadDto ad;

    FilterMetaInfoReadDto filter;

    Instant instant;
}
