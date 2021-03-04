package ma.tournoi.entities;

import java.util.Collection;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Arbitre{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idArbitre;
	
	@Column
	String nom;
	
	@Column
	String nationalite;
	
	@OneToMany(mappedBy="arbitre")
	@JsonIgnore
	Collection<Game> games;
	
	public Arbitre(Long idArbitre, String nom, String nationalite) {
		this.idArbitre = idArbitre;
		this.nom = nom;
		this.nationalite = nationalite;
	}
	public Arbitre() { }
	
	public Long getIdArbitre() {
		return idArbitre;
	}
	public void setIdArbitre(Long idArbitre) {
		this.idArbitre = idArbitre;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public Collection<Game> getGames() {
		return games;
	}
	public void setGames(Collection<Game> games) {
		this.games = games;
	}

}
