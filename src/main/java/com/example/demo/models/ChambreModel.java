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

	public long getIdChambre() {
		return idChambre;
	}

	public void setIdChambre(long idChambre) {
		this.idChambre = idChambre;
	}

	public long getNumeroChambre() {
		return numeroChambre;
	}

	public void setNumeroChambre(long numeroChambre) {
		this.numeroChambre = numeroChambre;
	}

	public typeChambreEnum getTypeC() {
		return typeC;
	}

	public void setTypeC(typeChambreEnum typeC) {
		this.typeC = typeC;
	}

	public Set<ReservationModel> getReservations() {
		return reservations;
	}

	public void setReservations(Set<ReservationModel> reservations) {
		this.reservations = reservations;
	}

	public BlocModel getBloc() {
		return bloc;
	}

	public void setBloc(BlocModel bloc) {
		this.bloc = bloc;
	}
    
    
    
    
    
    
}