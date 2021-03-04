package ma.tournoi.persistence;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.tournoi.entities.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {
	public List<Equipe> getEquipeByPays(String pays);
	
	/*@Query(value = "SELECT nom_equipe FROM equipe eq natural join game_equipe ge ge.game_id = ?", nativeQuery = true)
	 Collection<Equipe> getEquipesByGame(Long id);*/
	 
	
}
