package ma.tournoi.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ma.tournoi.entities.Joueur;

@Repository
public interface JoueurRepository extends JpaRepository<Joueur, Long> {

	@Query("SELECT jr FROM equipe ep Join ep.joueurs jr where ep.nomEquipe =?1 and jr.poste=?2")	
	public List<Joueur> getJoueurByPostAndEquipe(String poste,String eqp);
	
	@Query("SELECT jr FROM equipe ep Join ep.joueurs jr where ep.nomEquipe =?1")	
	public List<Joueur> getJoueurByEquipe(String eqp);
}

