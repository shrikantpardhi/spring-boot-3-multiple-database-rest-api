package com.multipledatabase.repository.user;

import com.multipledatabase.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
