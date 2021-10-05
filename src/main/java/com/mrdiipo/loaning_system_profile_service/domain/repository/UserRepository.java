package com.mrdiipo.loaning_system_profile_service.domain.repository;

import com.mrdiipo.loaning_system_profile_service.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
