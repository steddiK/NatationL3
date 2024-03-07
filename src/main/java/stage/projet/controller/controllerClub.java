package stage.projet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import stage.projet.entity.Club;
import stage.projet.service.ClubService;

import java.util.List;

@RestController
public class controllerClub {
    @Autowired
    private final ClubService ClubS;
    public controllerClub( ClubService c){
        this.ClubS= c;
    }
    @GetMapping("/Club")
    public String welcome(){
        return "Welcome to club";
    }

    @PostMapping("/saveoClub")
    public String creer(@RequestBody Club c){
        this.ClubS.créerC(c);
        return "Club créer";
    }

    @GetMapping("/afficheClub")
    public List<Club> rechercher(){
        return ClubS.rechercherAll();
    }
}
