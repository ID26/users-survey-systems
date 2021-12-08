package com.solutionfactory.den26.userssurveysystems.userssurveysystems.repositories;

import com.solutionfactory.den26.userssurveysystems.userssurveysystems.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findByActivationCode(String code);
}
