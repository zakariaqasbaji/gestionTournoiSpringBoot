package ma.tournoi.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ma.tournoi.entities.Stade;
import ma.tournoi.persistence.StadeRepository;

@Service
public class StadeService {
	@Autowired
	StadeRepository stadeRepository;
	
	public Collection<Stade> getAllStade(){
		return stadeRepository.findAll();
	}
	
	public Stade addStade(Stade s) {
		return stadeRepository.save(s);
	}
	
	public Stade updateStade(Stade s) {
		return stadeRepository.save(s);
	}
	
	public Stade deleteStade(Stade s) {
		stadeRepository.delete(s);
		return s;
	}
	
	

}