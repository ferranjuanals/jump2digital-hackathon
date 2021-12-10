package com.hackathon.backend.repository;

import com.hackathon.backend.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
}
