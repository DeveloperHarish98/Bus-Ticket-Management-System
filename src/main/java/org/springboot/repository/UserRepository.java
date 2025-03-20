package org.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}