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
	public long getIdUniversite() {
		return idUniversite;
	}
	public void setIdUniversite(long idUniversite) {
		this.idUniversite = idUniversite;
	}
	public String getNomUniversite() {
		return nomUniversite;
	}
	public void setNomUniversite(String nomUniversite) {
		this.nomUniversite = nomUniversite;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public LoyerModel getLoyerModel() {
		return LoyerModel;
	}
	public void setLoyerModel(LoyerModel loyerModel) {
		LoyerModel = loyerModel;
	}
    
}
