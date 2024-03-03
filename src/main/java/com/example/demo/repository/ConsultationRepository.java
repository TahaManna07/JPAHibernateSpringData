package com.example.demo.repository;

import com.example.demo.entites.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository  extends JpaRepository<Consultation,Long> {
}
