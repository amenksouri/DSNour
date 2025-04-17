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
    @GeneratedValue
    private long idReservation;
    private String anneeUniversitaire;
    private boolean estValide;
    
    @ManyToOne
    @JoinColumn(name="Chambre_id")
    private ChambreModel Chambre;
    
 



public long getIdReservation() {
	return this.idReservation;
}



public void setIdReservation(long idReservation) {
	this.idReservation = idReservation;
}



public String getAnneeUniversitaire() {
	return anneeUniversitaire;
}



public void setAnneeUniversitaire(String anneeUniversitaire) {
	this.anneeUniversitaire = anneeUniversitaire;
}



public boolean isEstValide() {
	return estValide;
}



public void setEstValide(boolean estValide) {
	this.estValide = estValide;
}



public ChambreModel getChambre() {
	return Chambre;
}



public void setChambre(ChambreModel chambre) {
	Chambre = chambre;
}

  
}