package com.faeiq.healthvault.kyc.repository;

import com.faeiq.healthvault.kyc.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, String> {
    Optional<Patient> findByEmail(String email);
    boolean existsByEmail(String email);
}
