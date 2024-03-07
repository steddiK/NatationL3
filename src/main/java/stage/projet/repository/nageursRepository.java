package stage.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stage.projet.entity.Nageurs;

import java.util.List;

public interface nageursRepository extends JpaRepository <Nageurs,Integer> {
}
