package ma.tournoi.persistence;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import ma.tournoi.entities.Game;


@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
	
	public List<Game> findAllByDateMatch(Date matchDate);
	
	
	public Collection<Game> findByDateMatch(Date dateMatch);
	@Modifying
    @Transactional
    public void deleteByDateMatchBefore(Date date);
	
	
}
