package com.example.demo.repository;

import com.example.demo.entites.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
// ça c'est SpringDATA
public interface PatientRepository extends JpaRepository<Patient,Long> {
    //List<Patient> findPatientByNom(String nom);
    Patient findByNom(String name);


}
