package com.faeiq.healthvault.record.entity;

import com.faeiq.healthvault.user.entity.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "record")
@Getter @Setter @Data
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, length = 255)
    private String fileUrl;

    @Column(nullable = false, length = 255)
    private String fileName;

    @Column(nullable = false, length = 50)
    private String fileType;

    @Column(nullable = false, length = 255)
    private String doctorName;

    @Column(length = 100)
    private String doctorSpecialization;

    @Column(nullable = false)
    private LocalDateTime date;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime uploadedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;



}
