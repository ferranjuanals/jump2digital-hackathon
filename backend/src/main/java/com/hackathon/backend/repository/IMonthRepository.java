package com.hackathon.backend.repository;

import com.hackathon.backend.model.entity.Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMonthRepository extends JpaRepository<Month, Integer> {
}
