package vnavesnoj.ads_loader_service.mapper;

import org.springframework.stereotype.Component;
import vnavesnoj.ads_loader_common.database.entity.Ad;
import vnavesnoj.ads_loader_service.dto.AdMetaInfoReadDto;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@Component
public class AdMetaInfoReadMapper implements Mapper<Ad, AdMetaInfoReadDto> {

    @Override
    public AdMetaInfoReadDto map(Ad object) {
        return new AdMetaInfoReadDto(
                object.getId(),
                object.getPlatform(),
                object.getUrl(),
                object.getTitle(),
                object.getPushupTime(),
                object.getInstant(),
                object.getHash()
        );
    }
}
