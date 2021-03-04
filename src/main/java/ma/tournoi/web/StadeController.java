package ma.tournoi.web;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.tournoi.entities.Stade;
import ma.tournoi.service.StadeService;

@RestController
public class StadeController {
	@Autowired
	StadeService stadeService;
	
	@GetMapping("/stades")
	public Collection<Stade> getAllStade() {
		return stadeService.getAllStade();
	}
	
	@PostMapping("/stade")
	public Stade addStade(@RequestBody Stade s) {
		return stadeService.addStade(s);
	}
	
	@PutMapping("/stade")
	public Stade updateStade(@RequestBody Stade s) {
		return stadeService.updateStade(s);
	}
	
	@DeleteMapping("/stade")
	public Stade deleteStade(@RequestBody Stade s) {
		return stadeService.deleteStade(s);
	}
	
	
	
}
