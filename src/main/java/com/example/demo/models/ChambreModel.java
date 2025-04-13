package com.example.demo.models;
import java.util.Set;

import java.util.HashSet;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Chambre")
public class ChambreModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    
    @Column(unique = true)
    private long numeroChambre;
    
    @Enumerated(EnumType.STRING)
    private typeChambreEnum typeC;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Chambre")
    private Set<ReservationModel> reservations = new HashSet<>();

    @ManyToOne
    private BlocModel bloc;
}