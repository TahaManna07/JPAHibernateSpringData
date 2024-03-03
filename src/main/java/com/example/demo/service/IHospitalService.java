package com.example.demo.service;

import com.example.demo.entites.*;

import java.util.List;


public interface IHospitalService {
    Patient savePatient(Patient p );
    Medecin saveMedecin(Medecin m);
    RendezVous saveRendezVous(RendezVous rv);
    Consultation saveConsultation(Consultation c);

    Patient findPatientById(Long id);
    RendezVous findRendezVousbyId(Long id);
    Medecin findMedecinbyId(Long id);







}
