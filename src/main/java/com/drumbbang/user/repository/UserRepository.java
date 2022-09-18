package com.drumbbang.user.repository;

import com.drumbbang.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUniqueNum (String uniqueNum);
}
