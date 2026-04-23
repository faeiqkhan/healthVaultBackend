package com.faeiq.healthvault.kyc.entity;

import com.faeiq.healthvault.user.entity.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "doctors")
@Getter @Setter
public class Doctor {

    @Id
    private String id; // SAME as User ID

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 255)
    private String degree;

    @Column(nullable = false, length = 50)
    private String phone;

    @Column(nullable = false, length = 100)
    private String specialization;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
