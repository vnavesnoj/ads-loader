package vnavesnoj.ads_loader_common.database.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.Instant;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Builder
@Table(name = "filter_ad")
public class FilterAd {

    @Id
    Long id;

    Instant instant;

    String ad_href;

    Long filterId;
}
