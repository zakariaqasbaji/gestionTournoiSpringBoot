package ma.tournoi.entities;

import java.util.Collection;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity(name="stade")
public class Stade{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idStade;
	
	@Column
	String nomStade;
	
	@Column
	String ville;
	
	@OneToMany(mappedBy="stade")
	@JsonIgnore
	Collection<Game> games;

	public Stade(Long idStade, String nomStade, String ville) {

		this.idStade = idStade;
		this.nomStade = nomStade;
		this.ville = ville;
	}
	
	public Stade() { }

	public Long getIdStade() {
		return idStade;
	}

	public void setIdStade(Long idStade) {
		this.idStade = idStade;
	}

	public String getNomStade() {
		return nomStade;
	}

	public void setNomStade(String nomStade) {
		this.nomStade = nomStade;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Collection<Game> getGames() {
		return games;
	}

	public void setGames(Collection<Game> games) {
		this.games = games;
	}
}
