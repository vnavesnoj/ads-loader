package vnavesnoj.ads_loader_service.dto;

import lombok.Value;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@Value
public class AdReadDto {

    AdMetaInfoReadDto adMetaInfo;

    String adInfoJson;
}