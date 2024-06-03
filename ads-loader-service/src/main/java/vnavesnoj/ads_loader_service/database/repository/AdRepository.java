package vnavesnoj.ads_loader_service.database.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import vnavesnoj.ads_loader_common.database.entity.Ad;

import java.util.List;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
public interface AdRepository extends ReactiveCrudRepository<Ad, Long> {

    Mono<Ad> findByUrl(String url);

    @Query("""
            SELECT a.id, a.platform, a.url, a.title, a.pushup_time, a.instant, a.hash
            FROM ad a
            JOIN filter_ad fa on a.url = fa.ad_url
            WHERE fa.filter_id = $1
            """)
    Flux<Ad> findAllByFilterId(@Param("filterId") Long filterId);

    @Query("""
            SELECT a.id, a.platform, a.url, a.title, a.pushup_time, a.instant, a.hash
            FROM ad a
            JOIN filter_ad fa on a.url = fa.ad_url
            WHERE fa.filter_id in (:filterIds)
            """)
    Flux<Ad> findAllByFilterIds(@Param("filterIds") List<Long> filterIds);
}
