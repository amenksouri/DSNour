package com.example.demo.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Universite")
public class UniversiteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite;
    
    private String nomUniversite;
    private String adresse;
    @OneToOne(cascade = CascadeType.ALL)
    private LoyerModel LoyerModel;
}
