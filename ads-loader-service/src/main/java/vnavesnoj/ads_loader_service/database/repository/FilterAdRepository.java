package vnavesnoj.ads_loader_service.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vnavesnoj.ads_loader_common.database.entity.FilterAd;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
public interface FilterAdRepository extends JpaRepository<FilterAd, Long> {
}
