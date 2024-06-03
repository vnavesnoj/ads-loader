package vnavesnoj.ads_loader_service.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import vnavesnoj.ads_loader_service.dto.AdReadDto;
import vnavesnoj.ads_loader_service.dto.AdShortReadDto;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
public interface AdService {

    Flux<AdShortReadDto> findAllByFilterId(Long filterId);

    Flux<AdShortReadDto> findAllByFilterIds(Iterable<Long> filterIds);

    Mono<AdReadDto> findByUrl(String url);

    Mono<AdReadDto> findById(Long id);
}
