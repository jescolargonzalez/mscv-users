package com.mscv.users.repository;

import com.mscv.users.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
