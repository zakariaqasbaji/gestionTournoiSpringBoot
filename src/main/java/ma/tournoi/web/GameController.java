package ma.tournoi.web;

import java.text.ParseException;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ma.tournoi.entities.Equipe;
import ma.tournoi.entities.Game;
import ma.tournoi.entities.Stade;
import ma.tournoi.service.GameService;

@RestController
public class GameController {
	@Autowired
	GameService matchService;
	
	@GetMapping("/matchs")
	public Collection<Game> getAllMatchs() {
		return matchService.getAllMatchs();
	}
	
	@PostMapping("/match")
	public Game addMatch(@RequestBody Game gm) {
		return matchService.addMatch(gm);
	}
	
	@PutMapping("/match")
	public Game updateGame(@RequestBody Game gm) {
		return matchService.updateMatch(gm);
	}
	
	@DeleteMapping("/match")
	public Game deleteMatch(@RequestBody Game gm) {
		return matchService.deleteMatch(gm);
	}
	
	
	@GetMapping("/matchs/date/{date}")
	public @ResponseBody List<Game> getMatchByDate(@PathVariable(value="date") String date) throws ParseException {
		return matchService.getMatchByDate(date);
	}
	
	@DeleteMapping("/deletePassedMatchs")
	public @ResponseBody void  deleteMatch() throws ParseException {
		matchService.deletePassedMatch();
	}
	
	@GetMapping("/stadeMatch/{id}")
	public Stade getStadeById(@PathVariable Long id ) {
		return matchService.getMatchById(id).getStade();
	}
	
	@GetMapping("/equipeByMatch/{id}")
	public Collection<Equipe> getEquipesByMatch(@PathVariable Long id) {
		return matchService.getMatchById(id).getEquipe();
	}

}