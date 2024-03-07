package stage.projet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import stage.projet.entity.Nageurs;
import stage.projet.service.NageursService;

import java.util.List;

@RestController
@RequestMapping("")
public class controllerNageurs {
    @Autowired
    private final NageursService nageurS;

    @GetMapping
    public String Welcome(){ return "Nageur controller";}

    public controllerNageurs(NageursService nageurS){
        this.nageurS = nageurS;

    }
    @PostMapping("/création")
    public String créerN(@RequestBody Nageurs n){
        this.nageurS.créerN(n);
        return "Nageurs enregistrées avec succes";
    }
    @GetMapping("/rechercherN")
    public List<Nageurs> rechercherN(){
        return this.nageurS.rechercherN();
    }
}
