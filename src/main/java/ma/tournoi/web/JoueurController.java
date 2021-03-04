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

import ma.tournoi.entities.Joueur;
import ma.tournoi.service.JoueurService;

@RestController
public class JoueurController {
	@Autowired
	JoueurService joueurService;
	
	@GetMapping("/joueurs")
	public Collection<Joueur> getAllJoueurs() {
		return joueurService.getAllJoueurs();
	}
	
	@PostMapping("/joueur")
	public Joueur addJoueur(@RequestBody Joueur jr) {
		return joueurService.addJoueur(jr);
	}
	
	@PutMapping("/joueur")
	public Joueur updateJoueur(@RequestBody Joueur jr) {
		return joueurService.updateJoueur(jr);
	}
	
	@DeleteMapping("/joueur")
	public Joueur deleteJoueur(@RequestBody Joueur jr) {
		return joueurService.deleteJoueur(jr);
	}
	
	@GetMapping("/joueurs/{equipe}/{poste}")
	public @ResponseBody List<Joueur> getJoueurByEquipPoste(@PathVariable(value="equipe") String equipe,@PathVariable(value="poste") String poste) {
		return joueurService.getJoueurByPostAndEquipe(equipe,poste);

	}
	
	@GetMapping("/joueurs/{equipe}")
	public @ResponseBody List<Joueur> getJoueurByEquipe(@PathVariable(value="equipe") String equipe) {
		return joueurService.getJoueurByEquipe(equipe);

	}
	
	
}