package vnavesnoj.ads_loader_service.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import vnavesnoj.ads_loader_common.database.entity.Ad;
import vnavesnoj.ads_loader_service.database.repository.AdRepository;
import vnavesnoj.ads_loader_service.dto.AdMetaInfoReadDto;
import vnavesnoj.ads_loader_service.dto.AdReadDto;
import vnavesnoj.ads_loader_service.mapper.Mapper;
import vnavesnoj.ads_loader_service.service.AdService;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@RequiredArgsConstructor
@Service
public class AdServiceImpl implements AdService {

    private final AdRepository adRepository;

    private final Mapper<Ad, AdMetaInfoReadDto> adMetaInfoReadMapper;
    private final Mapper<Ad, AdReadDto> adReadMapper;


    @Override
    public Flux<AdMetaInfoReadDto> findAllByFilterId(Long filterId) {
        return adRepository.findAllByFilterId(filterId)
                .map(adMetaInfoReadMapper::map);
    }

    @Override
    public Flux<AdMetaInfoReadDto> findAllByFilterIds(Iterable<Long> filterIds) {
        return adRepository.findAllByFilterIds(filterIds)
                .map(adMetaInfoReadMapper::map);
    }

    @Override
    public Mono<AdReadDto> findByUrl(String url) {
        return adRepository.findByUrl(url)
                .map(adReadMapper::map);
    }

    @Override
    public Mono<AdReadDto> findById(Long id) {
        return adRepository.findById(id)
                .map(adReadMapper::map);
    }
}
