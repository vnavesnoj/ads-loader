package vnavesnoj.ads_loader_service.database.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import vnavesnoj.ads_loader_common.database.entity.Filter;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */

public interface FilterRepository extends ReactiveCrudRepository<Filter, Long> {
}
