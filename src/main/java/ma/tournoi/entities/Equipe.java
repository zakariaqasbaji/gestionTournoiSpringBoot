package ma.tournoi.entities;

import java.util.Collection;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity(name="equipe")
public class Equipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idEquipe;
	
	@Column
	String nomEquipe;
	
	@Column
	String pays;
	
	@OneToMany(mappedBy="equipe")
	@JsonManagedReference
	Collection<Joueur> joueurs;
	
	@ManyToMany(mappedBy = "equipe")
	@JsonIgnore
	Collection<Game> games;

	public Equipe(Long idEquipe, String nomEquipe, String pays) {
		this.idEquipe = idEquipe;
		this.nomEquipe = nomEquipe;
		this.pays = pays;
	}
	public Equipe() { }
	
	public Long getIdEquipe() {
		return idEquipe;
	}
	public void setIdEquipe(Long idEquipe) {
		this.idEquipe = idEquipe;
	}
	public String getNomEquipe() {
		return nomEquipe;
	}
	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public Collection<Joueur> getJoueurs() {
		return joueurs;
	}
	public void setJoueurs(Collection<Joueur> joueurs) {
		this.joueurs = joueurs;
	}
	public Collection<Game> getGames() {
		return games;
	}
	public void setGames(Collection<Game> games) {
		this.games = games;
	}

}
