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
    
    
    
    
	public long getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getNomEt() {
		return nomEt;
	}
	public void setNomEt(String nomEt) {
		this.nomEt = nomEt;
	}
	public String getPrenomEt() {
		return prenomEt;
	}
	public void setPrenomEt(String prenomEt) {
		this.prenomEt = prenomEt;
	}
	public long getCin() {
		return cin;
	}
	public void setCin(long cin) {
		this.cin = cin;
	}
	public String getEcole() {
		return ecole;
	}
	public void setEcole(String ecole) {
		this.ecole = ecole;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
   
}