package ma.tournoi.service;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.tournoi.entities.Arbitre;
import ma.tournoi.persistence.ArbitreRepository;

@Service
public class ArbitreService {
	@Autowired
	ArbitreRepository arbitreRepository;
	
	public Collection<Arbitre> getAllArbitre(){
		return arbitreRepository.findAll();
	}
	
	public Arbitre addArbitre(Arbitre a) {
		return arbitreRepository.save(a);
	}
	
	public Arbitre updateArbitre(Arbitre a) {
		return arbitreRepository.save(a);
	}
	
	public Arbitre deleteArbitre(Arbitre a) {
		arbitreRepository.delete(a);
		return a;
	}
}
