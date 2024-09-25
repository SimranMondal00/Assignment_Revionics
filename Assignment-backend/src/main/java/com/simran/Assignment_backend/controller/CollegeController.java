package com.simran.Assignment_backend.controller;

import com.simran.Assignment_backend.entity.College;
import com.simran.Assignment_backend.service.CollegeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/colleges")
public class CollegeController {

    private final CollegeService collegeService;

    public CollegeController(CollegeService collegeService) {
        this.collegeService = collegeService;
    }

    // Get all colleges
    @GetMapping
    public ResponseEntity<List<College>> getAllColleges() {
        return ResponseEntity.ok(collegeService.getAllColleges());
    }

    // Get a specific college by name
    @GetMapping("/{collegeName}")
    public ResponseEntity<College> getCollegeByName(@PathVariable String collegeName) {
        College college = collegeService.getCollegeByName(collegeName);
        return college != null ? ResponseEntity.ok(college) : ResponseEntity.notFound().build();
    }
}
