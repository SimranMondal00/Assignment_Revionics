package com.simran.Assignment_backend.repository;

import com.simran.Assignment_backend.entity.CourseFee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseFeeRepository extends JpaRepository<CourseFee, Long> {
}
