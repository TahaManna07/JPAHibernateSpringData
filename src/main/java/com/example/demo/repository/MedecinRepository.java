package com.example.demo.repository;

import com.example.demo.entites.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {

        Medecin findByNom(String nom);

}
