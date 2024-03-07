package stage.projet.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Transactional
@Setter
@Getter
@Table(name= "NAGEURS")
public class Nageurs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNag;
    private String nomNag;

    private String prenomNag;

    private Date dateNaiss;
    @ManyToMany(cascade= CascadeType.ALL)
    @JoinTable(
            name = "PARTICIPER",
            joinColumns = @JoinColumn(name = "ID_NAGEUR"),
            inverseJoinColumns = @JoinColumn(name="ID_COMPETITION")
    )
    private List<competition> ListCompet = new ArrayList<>();
    public void  ajoutCompetition(competition c){ListCompet.add(c);}


}
