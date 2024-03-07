package stage.projet.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Entity
@Transactional
@Table(name="CLUB")
public class Club {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idClub;

    @Setter
    @Getter
    private String NomClub;

    @Setter
    @Getter
    private int TelClub;
    //relation OnetoMany avec la classe Nageurs
    @OneToMany(mappedBy = "club", cascade = CascadeType.ALL)
    private List<Nageurs> listNageur = new ArrayList<>();

    public void ajoutNageurs(Nageurs n){
        listNageur.add(n);

    }
}
