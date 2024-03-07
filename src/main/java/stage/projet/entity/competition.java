package stage.projet.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Table;
import javax.transaction.Transactional;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Transactional
@Table(name= "COMPETITION")
@Getter
@Setter
public class competition {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  int IdCompet;
    private String NomCompet;
    private String Lieu;
    private String TypeCompet;
    private String Sexe;
    private String niveau;
    private float score;
    private int rang;
    private Date date;
    private String heure;
    @ManyToMany(cascade= CascadeType.ALL)
    @JoinTable(
            name= "PARTICIPER",
            joinColumns = @JoinColumn(name="ID_COMPETITION"),
            inverseJoinColumns = @JoinColumn(name = "ID_NAGEUR")
    )
    private List<Nageurs> listNageur = new ArrayList<>();

    public void ajoutNageurs(Nageurs n){
        listNageur.add(n);
    }
}
