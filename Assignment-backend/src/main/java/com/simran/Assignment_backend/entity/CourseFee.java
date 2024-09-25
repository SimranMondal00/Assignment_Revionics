package com.simran.Assignment_backend.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;


@Entity
public class CourseFee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double courseFee;

    @ManyToOne
    @JoinColumn(name = "college_id", nullable = false)
    private College college;

    // Getters and Setters
}
