package stage.projet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import stage.projet.entity.Nageurs;
import stage.projet.repository.nageursRepository;

import java.util.List;

@Service
public class NageursService {

    @Autowired
    private final nageursRepository nageurR;

    public NageursService(nageursRepository nageurR){

        this.nageurR =nageurR;
    }
    public void créerN(Nageurs n){
        this.nageurR.save(n);
    }
    public List<Nageurs> rechercherAll(){
        return this.nageurR.findAll();
    }
}
