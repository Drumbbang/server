package com.drumbbang.user.repository;

import com.drumbbang.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByUniqueNum (String uniqueNum);
}
