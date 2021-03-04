package ma.tournoi.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.tournoi.entities.Equipe;
import ma.tournoi.persistence.EquipeRepository;

@Service
public class EquipeService {
	@Autowired
	EquipeRepository equipeRepository;
	
	public Collection<Equipe> getAllEquipes(){
		return equipeRepository.findAll();
	}
	
	public Equipe addEquipe(Equipe e) {
		return equipeRepository.save(e);
	}
	
	public Equipe updateEquipe(Equipe e) {
		return equipeRepository.save(e);
	}
	
	public Equipe deleteEquipe(Equipe e) {
		equipeRepository.delete(e);
		return e;
	}
	
	public List<Equipe> getEquipesByPays(String pays){
		return equipeRepository.getEquipeByPays(pays);
		
	}
	
	

}