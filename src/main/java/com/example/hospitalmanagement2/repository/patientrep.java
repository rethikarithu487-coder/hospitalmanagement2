package com.example.hospitalmanagement2.repository;

import com.example.hospitalmanagement2.entiy.patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface patientrep extends JpaRepository<patient, Long> {
}
