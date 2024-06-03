package vnavesnoj.ads_loader_service.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import vnavesnoj.ads_loader_common.database.entity.Ad;
import vnavesnoj.ads_loader_service.database.repository.AdInfoRepository;
import vnavesnoj.ads_loader_service.dto.AdReadDto;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@RequiredArgsConstructor
@Component
public class AdReadMapper implements Mapper<Ad, AdReadDto> {

    private final AdInfoRepository adInfoRepository;

    @Override
    public AdReadDto map(Ad object) {

        final var adInfo = adInfoRepository.findById(object.getId()).blockOptional()
                .orElseThrow(() -> new IllegalArgumentException(
                        "adInfo with id = " + object.getId() + " does not exist"
                ));
        return new AdReadDto(
                object.getPlatform(),
                object.getUrl(),
                adInfo.getInfoJson(),
                object.getInstant()
        );
    }
}
