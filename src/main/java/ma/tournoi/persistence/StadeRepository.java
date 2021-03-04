package ma.tournoi.persistence;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.tournoi.entities.Stade;

@Repository
public interface StadeRepository extends JpaRepository<Stade, Long> {
	
}

