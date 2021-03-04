package ma.tournoi.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name="joueur")
public class Joueur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idJoueur;
	
	@Column
	String nomJoueur;
	
	@Column
	String poste;
	
	@ManyToOne(fetch=FetchType.LAZY) 
	@JsonBackReference
	Equipe equipe;

	public Joueur(Long idJoueur, String nomJoueur, String poste) {
		this.idJoueur = idJoueur;
		this.nomJoueur = nomJoueur;
		this.poste = poste;
	}
	public Joueur() { }
	
	public Long getIdJoueur() {
		return idJoueur;
	}
	public void setIdJoueur(Long idJoueur) {
		this.idJoueur = idJoueur;
	}
	public String getNomJoueur() {
		return nomJoueur;
	}
	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}
	public String getPost() {
		return poste;
	}
	public void setPost(String post) {
		this.poste = post;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

}
