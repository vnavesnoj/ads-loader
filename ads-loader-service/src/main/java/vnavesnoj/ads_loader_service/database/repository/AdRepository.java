package vnavesnoj.ads_loader_service.database.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;
import vnavesnoj.ads_loader_common.database.entity.Ad;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
public interface AdRepository extends ReactiveCrudRepository<Ad, Long> {

    Mono<Ad> findByUrl(String url);
}
