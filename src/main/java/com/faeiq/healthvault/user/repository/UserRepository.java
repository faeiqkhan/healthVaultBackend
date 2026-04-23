package com.faeiq.healthvault.user.repository;

import com.faeiq.healthvault.user.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Integer> {

    public User findByEmail(String email);

}
