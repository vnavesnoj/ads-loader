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
@EqualsAndHashCode(of = {"platform", "url"})
@Builder
@Table(name = "ad")
public class Ad {

    @Id
    Long id;

    Platform platform;

    String url;

    String title;

    Instant pushupTime;

    Instant instant;

    Integer hash;
}
