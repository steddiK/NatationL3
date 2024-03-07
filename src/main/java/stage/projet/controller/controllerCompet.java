package stage.projet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import stage.projet.entity.competition;
import stage.projet.service.CompetitionService;

import java.util.List;

@RestController
public class controllerCompet {
   @Autowired
   private final CompetitionService competS;
   @GetMapping("/")
   public String welcome(){
       return "controllerCompet";
   }
   public controllerCompet(CompetitionService cS){
       this.competS= cS;
   }

   @PostMapping("/saveoCompet")
    public String creer(@RequestBody competition c){
       this.competS.creer(c);
       return "Competition enregistrée avec succes!";
   }

   @GetMapping("/rechercher")
    public List<competition> recherche(){
       return this.competS.rechercheAll();
   }
}
