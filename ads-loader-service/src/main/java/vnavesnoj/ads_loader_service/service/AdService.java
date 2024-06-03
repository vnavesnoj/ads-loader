package vnavesnoj.ads_loader_service.service;

import reactor.core.publisher.Flux;
import vnavesnoj.ads_loader_service.dto.AdReadDto;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
public interface AdService {

    Flux<AdReadDto> findAllByFilterId(Long filterId);
}
