package ma.tournoi.web;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.tournoi.entities.Arbitre;
import ma.tournoi.service.ArbitreService;

@RestController
public class ArbitreController {
	@Autowired
	ArbitreService arbitreService;
	
	@GetMapping("/arbitres")
	public Collection<Arbitre> getAllArbitre() {
		return arbitreService.getAllArbitre();
	}
	
	@PostMapping("/arbitre")
	public Arbitre addArbitre(@RequestBody Arbitre a) {
		return arbitreService.addArbitre(a);
	}
	
	@PutMapping("/arbitre")
	public Arbitre updateArbitre(@RequestBody Arbitre a) {
		return arbitreService.updateArbitre(a);
	}
	
	@DeleteMapping("/arbitre")
	public Arbitre deleteArbitre(@RequestBody Arbitre a) {
		return arbitreService.deleteArbitre(a);
	}
		
	

}
