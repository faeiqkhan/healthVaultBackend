package com.faeiq.healthvault.record.repository;

import com.faeiq.healthvault.record.entity.Record;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RecordRepository extends JpaRepository<Record, String> {
    Page<Record> findByUserIdOrderByUploadedAtDesc(String userId, Pageable pageable);
    List<Record> findByUserIdAndFileTypeOrderByUploadedAtDesc(String userId, String fileType, Pageable pageable);
    Optional<Record> findById(String id);
}
