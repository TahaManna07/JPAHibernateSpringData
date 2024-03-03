package com.example.demo.service;

import com.example.demo.entites.Consultation;
import com.example.demo.entites.Medecin;
import com.example.demo.entites.Patient;
import com.example.demo.entites.RendezVous;
import com.example.demo.repository.ConsultationRepository;
import com.example.demo.repository.MedecinRepository;
import com.example.demo.repository.PatientRepository;
import com.example.demo.repository.RendezVousRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class HospitalServiceImpl implements IHospitalService{
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private ConsultationRepository consultationRepository;
    private RendezVousRepository rendezVousRepository;


    @Override
    public Patient savePatient(Patient p) {
        return patientRepository.save(p);
    }

    @Override
    public Medecin saveMedecin(Medecin m) {
        return medecinRepository.save(m);
    }

    @Override
    public RendezVous saveRendezVous(RendezVous rv) {
        // pour generer des chaines de ch aléatoires et unique
        rv.setId(UUID.randomUUID().toString());
        return rendezVousRepository.save(rv);
    }

    @Override
    public Consultation saveConsultation(Consultation c) {
        return consultationRepository.save(c);
    }

    @Override
    public Patient findPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    @Override
    public RendezVous findRendezVousbyId(Long id) {
        return null ;
        //rendezVousRepository.findById(id).orElse(null);
    }

    @Override
    public Medecin findMedecinbyId(Long id) {
        return medecinRepository.findById(id).orElse(null);
    }




}
