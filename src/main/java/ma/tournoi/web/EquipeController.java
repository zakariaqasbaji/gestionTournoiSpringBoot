package ma.tournoi.web;

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
import ma.tournoi.service.EquipeService;


@RestController
public class EquipeController {
	@Autowired
	EquipeService equipeService;
	
	@GetMapping("/equipes")
	public Collection<Equipe> getAllEquipes() {
		return equipeService.getAllEquipes();
	}
	
	@PostMapping("/equipe")
	public Equipe addEquipe(@RequestBody Equipe eq) {
		return equipeService.addEquipe(eq);
	}
	
	@PutMapping("/equipe")
	public Equipe updateEquipe(@RequestBody Equipe eq) {
		return equipeService.updateEquipe(eq);
	}
	
	@DeleteMapping("/equipe")
	public Equipe deleteEquipe(@RequestBody Equipe eq) {
		return equipeService.deleteEquipe(eq);
	}
	
	@GetMapping("/equipes/{pays}")
	public @ResponseBody List<Equipe> getEquipeByPays(@PathVariable(value="pays") String pays) {
		return equipeService.getEquipesByPays(pays);

	}
	
	
	
	
}