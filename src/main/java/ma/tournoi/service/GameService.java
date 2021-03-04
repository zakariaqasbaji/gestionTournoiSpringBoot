package ma.tournoi.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.tournoi.entities.Game;
import ma.tournoi.persistence.GameRepository;

@Service
public class GameService {
	@Autowired
	GameRepository matchRepository;
	
	public Collection<Game> getAllMatchs(){
		return matchRepository.findAll();
	}
	
	public Game addMatch(Game gm) {
		return matchRepository.save(gm);
	}
	
	public Game updateMatch(Game gm) {
		return matchRepository.save(gm);
	}
	
	public Game deleteMatch(Game gm) {
		matchRepository.delete(gm);
		return gm;
	}
	
	public List<Game> getMatchByDate(String date) throws ParseException{
		return matchRepository.findAllByDateMatch(new SimpleDateFormat("yyyy-MM-dd").parse(date));
	}
	
	public void deletePassedMatch() throws ParseException{
		long millis=System.currentTimeMillis(); 

		 matchRepository.deleteByDateMatchBefore(new Date(millis));
	}
	
	public Game getMatchById(Long id) {
		return matchRepository.findById(id).get();
	}
	

}