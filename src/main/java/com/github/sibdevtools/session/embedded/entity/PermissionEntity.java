package com.github.sibdevtools.session.embedded.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@Entity(name = "session_service_permission")
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "session_service", name = "permission")
public class PermissionEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "code", nullable = false)
    private String code;
}
