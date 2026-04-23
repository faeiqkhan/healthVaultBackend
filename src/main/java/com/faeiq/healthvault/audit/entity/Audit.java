package com.faeiq.healthvault.audit.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String Id;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    private String name;

    private String email;

    private LocalDateTime usedAt;




}
