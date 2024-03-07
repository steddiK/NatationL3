package stage.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stage.projet.entity.competition;

public interface competitionRepository extends JpaRepository<competition, Integer> {
}
