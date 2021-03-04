package ma.tournoi.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.tournoi.entities.Joueur;
import ma.tournoi.persistence.JoueurRepository;

@Service
public class JoueurService {
	@Autowired
	JoueurRepository joueurRepository;
	
	public Collection<Joueur> getAllJoueurs(){
		return joueurRepository.findAll();
	}
	
	public Joueur addJoueur(Joueur jr) {
		return joueurRepository.save(jr);
	}
	
	public Joueur updateJoueur(Joueur jr) {
		return joueurRepository.save(jr);
	}
	
	public Joueur deleteJoueur(Joueur jr) {
		joueurRepository.delete(jr);
		return jr;
	}
	
	public List<Joueur> getJoueurByPostAndEquipe(String equipe, String poste) {
		return joueurRepository.getJoueurByPostAndEquipe(equipe,poste);
	}
	
	
	public List<Joueur> getJoueurByEquipe(String equipe) {	
		return joueurRepository.getJoueurByEquipe(equipe);
	}

}
