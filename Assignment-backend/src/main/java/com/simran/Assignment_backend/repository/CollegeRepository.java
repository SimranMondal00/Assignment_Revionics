package com.simran.Assignment_backend.repository;


import com.simran.Assignment_backend.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {
    College findByCollegeName(String collegeName);
}
