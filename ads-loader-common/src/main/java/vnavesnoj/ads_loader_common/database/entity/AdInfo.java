package vnavesnoj.ads_loader_common.database.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "adId")
@Builder
@Table(name = "ad_info")
public class AdInfo {

    @Id
    Long adId;

    String infoJson;
}
