package vnavesnoj.ads_loader_common.database.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "adInfo")
@EqualsAndHashCode(of = "id")
@Builder
@Entity
@Table(name = "ad")
public class Ad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 7)
    Platform platform;

    @Column(unique = true, nullable = false)
    String url;

    @Column(nullable = false, length = 63)
    String title;

    @Column(columnDefinition = "timestamp")
    Instant pushupTime;

    @Column(nullable = false, columnDefinition = "timestamp")
    Instant instant;

    @Column(nullable = false)
    Integer hash;

    @OneToOne(mappedBy = "ad", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    AdInfo adInfo;
}
