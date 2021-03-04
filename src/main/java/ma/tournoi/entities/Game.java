package ma.tournoi.entities;

import java.util.Collection;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity(name="game")
public class Game{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idMatch;
	
	@Column
	@Temporal(TemporalType.DATE)
	Date dateMatch;
	
	@Column
	@Temporal(TemporalType.TIME)
	@JsonFormat(pattern="HH:mm")
	Date heureMatch;
	
	@ManyToOne(fetch=FetchType.EAGER)
	Arbitre arbitre;
	
	@ManyToOne(fetch=FetchType.EAGER) 
	Stade stade;
	
	@ManyToMany
	@JoinTable( 
	joinColumns = @JoinColumn(name = "game_id"), 
	inverseJoinColumns = @JoinColumn(name = "equipe_id"))
	Collection<Equipe> equipe;
	
	
	public Game(Long idMatch, Date dateMatch, Date heureMatch) {
		this.idMatch = idMatch;
		this.dateMatch = dateMatch;
		this.heureMatch = heureMatch;
	}
	
	public Game() { }

	public Long getIdMatch() {
		return idMatch;
	}

	public void setIdMatch(Long idMatch) {
		this.idMatch = idMatch;
	}

	public Date getDateMatch() {
		return dateMatch;
	}

	public void setDateMatch(Date dateMatch) {
		this.dateMatch = dateMatch;
	}

	public Date getHeureMatch() {
		return heureMatch;
	}

	public void setHeureMatch(Date heureMatch) {
		this.heureMatch = heureMatch;
	}

	public Arbitre getArbitre() {
		return arbitre;
	}

	public void setArbitre(Arbitre arbitre) {
		this.arbitre = arbitre;
	}

	public Stade getStade() {
		return stade;
	}

	public void setStade(Stade stade) {
		this.stade = stade;
	}

	public Collection<Equipe> getEquipe() {
		return equipe;
	}

	public void setEquipe(Collection<Equipe> equipe) {
		this.equipe = equipe;
	}

}
