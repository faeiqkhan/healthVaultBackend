package com.faeiq.healthvault.audit.repository;

import com.faeiq.healthvault.audit.entity.Audit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuditRepository extends CrudRepository<Audit,String> {
    List<Audit> findByEmail(String email);
}
