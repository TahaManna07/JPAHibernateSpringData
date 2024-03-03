package com.example.demo.entites;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class RendezVous {

   // @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long id;
    @Id
    private String id;
    @Temporal(TemporalType.DATE)

    private Date date;
    @Enumerated(EnumType.STRING) // toujours il faut stocker le type enumuration par String au niveau BD
    private StatusRDV status;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    // tu vas prndre en considération l'objet (patient) uniquement sur l'ajout mais la lecture non
    private Patient patient;
    @ManyToOne
    private Medecin medecin;
    @OneToOne(mappedBy = "rendezVous")
    private Consultation consultation;

}
