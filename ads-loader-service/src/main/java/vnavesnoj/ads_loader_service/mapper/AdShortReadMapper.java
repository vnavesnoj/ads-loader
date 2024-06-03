package vnavesnoj.ads_loader_service.mapper;

import org.springframework.stereotype.Component;
import vnavesnoj.ads_loader_common.database.entity.Ad;
import vnavesnoj.ads_loader_service.dto.AdShortReadDto;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@Component
public class AdShortReadMapper implements Mapper<Ad, AdShortReadDto> {

    @Override
    public AdShortReadDto map(Ad object) {
        return new AdShortReadDto(
                object.getId(),
                object.getPlatform(),
                object.getUrl(),
                object.getTitle(),
                object.getPushupTime(),
                object.getInstant()
        );
    }
}
