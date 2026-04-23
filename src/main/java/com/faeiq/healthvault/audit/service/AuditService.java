package com.faeiq.healthvault.audit.service;

import com.faeiq.healthvault.audit.entity.Audit;
import com.faeiq.healthvault.audit.entity.UserType;
import com.faeiq.healthvault.audit.repository.AuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AuditService {

    @Autowired
    private AuditRepository auditRepository;

    public void addToAudit(UserType UserType, String Name, String Email){
        Audit audit = new Audit();
        audit.setUserType(UserType);
        audit.setName(Name);
        audit.setEmail(Email);
        audit.setUsedAt(LocalDateTime.now());

        auditRepository.save(audit);
    }

    public List<Audit> findAllByEmail(String Email){
        return auditRepository.findByEmail(Email);
    }
}
