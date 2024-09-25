package com.simran.Assignment_backend.service;

import com.simran.Assignment_backend.entity.College;
import com.simran.Assignment_backend.repository.CollegeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {

    private final CollegeRepository collegeRepository;

    public CollegeService(CollegeRepository collegeRepository) {
        this.collegeRepository = collegeRepository;
    }

    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    public College getCollegeByName(String collegeName) {
        return collegeRepository.findByCollegeName(collegeName);
    }
}

