package stage.projet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stage.projet.entity.Club;
import stage.projet.repository.clubRepository;

import java.util.List;

@Service
public class ClubService {
    @Autowired
    private final clubRepository clubR;
    public ClubService(clubRepository clubR){
        this.clubR =clubR;

    }
    public void créerC(Club cl ){
        this.clubR.save(cl);
    }
    public List<Club> rechercherAll(){
        return  this.clubR.findAll();
    }
}
