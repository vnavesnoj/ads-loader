package vnavesnoj.ads_loader_service.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import vnavesnoj.ads_loader_service.dto.AdMetaInfoReadDto;
import vnavesnoj.ads_loader_service.dto.AdReadDto;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
public interface AdService {

    Flux<AdMetaInfoReadDto> findAllByFilterId(Long filterId);

    Flux<AdMetaInfoReadDto> findAllByFilterIds(Iterable<Long> filterIds);

    Mono<AdReadDto> findByUrl(String url);

    Mono<AdReadDto> findById(Long id);
}
