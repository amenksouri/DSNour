package com.example.demo.models;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;
import java.util.HashSet;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Foyer")
public class LoyerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    
    private String nomFoyer;
    private Long capaciteFoyer;
    
    
    
    
    
    
}