package com.example.demo.models;
import java.util.Set;
import java.util.HashSet;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Reservation")
public class ReservationModel {
    @Id
    private String idReservation;
    
    private Date anneeUniversitaire;
    private boolean estValide;
    
    
    
  @ManyToOne
  @JoinColumn(name="Chambre_id")
  private ChambreModel Chambre;

  
}