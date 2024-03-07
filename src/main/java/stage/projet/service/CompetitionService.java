package stage.projet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import stage.projet.entity.competition;
import stage.projet.repository.competitionRepository;

import java.util.List;

@Service
public class CompetitionService {

    @Autowired
    private final competitionRepository competR;

    public CompetitionService(competitionRepository competR){
        this.competR= competR;
    }
    public void creer(competition c){
        this.competR.save(c);
    }
    public List<competition> rechercheAll(){
        return this.competR.findAll();
    }

}
