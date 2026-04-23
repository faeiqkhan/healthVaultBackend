package com.faeiq.healthvault.kyc.repository;

import com.faeiq.healthvault.kyc.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String> {
    Optional<Doctor> findByEmail(String email);
    boolean existsByEmail(String email);
}
