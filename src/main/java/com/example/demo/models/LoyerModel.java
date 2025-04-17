package com.example.demo.models;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;
import java.util.HashSet;
import java.util.List;


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
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BlocModel> blocs;
    
	public Long getIdFoyer() {
		return idFoyer;
	}
	public void setIdFoyer(Long idFoyer) {
		this.idFoyer = idFoyer;
	}
	public String getNomFoyer() {
		return nomFoyer;
	}
	public void setNomFoyer(String nomFoyer) {
		this.nomFoyer = nomFoyer;
	}
	public Long getCapaciteFoyer() {
		return capaciteFoyer;
	}
	public void setCapaciteFoyer(Long capaciteFoyer) {
		this.capaciteFoyer = capaciteFoyer;
	}
    
    
    
    
    
    
}