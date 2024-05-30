package vnavesnoj.ads_loader_common.database.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString(exclude = "ad")
@Builder
@Entity
@Table(name = "ad_info")
public class AdInfo {

    @Id
    @Column(name = "ad_id")
    Long id;

    @Column(name = "info", nullable = false, columnDefinition = "jsonb")
    String infoJson;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "ad_id")
    Ad ad;
}
