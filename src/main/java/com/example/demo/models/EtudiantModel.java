package com.example.demo.models;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.Set;
import java.util.HashSet;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Etudiant")
public class EtudiantModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    
    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    private Date dateNaissance;
   
}