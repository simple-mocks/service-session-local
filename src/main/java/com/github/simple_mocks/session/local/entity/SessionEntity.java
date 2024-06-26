package com.github.simple_mocks.session.local.entity;

import com.github.simple_mocks.session.api.dto.SessionOwnerType;
import jakarta.persistence.*;
import lombok.*;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "session")
public class SessionEntity {
    @Id
    @Column(name = "uid")
    private String uid;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "owner_type", nullable = false)
    private SessionOwnerType ownerType;
    @Column(name = "owner_id", nullable = false)
    private String ownerId;
    @Column(name = "created_at", nullable = false)
    private ZonedDateTime createdAt;
    @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "session_permission",
            joinColumns = @JoinColumn(name = "session_uid"),
            inverseJoinColumns = @JoinColumn(name = "permission_id")
    )
    private List<PermissionEntity> permissions;
}
