package stage.projet.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Table;
import javax.transaction.Transactional;
import java.sql.Date;

@Entity
@Transactional
@Table(name= "COMPETITION")
public class competition {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  int IdCompet;

    @Setter
    @Getter
    private String NomCompet;

    @Setter
    @Getter
    private String Lieu;

    @Setter
    @Getter
    private String TypeCompet;

    @Setter
    @Getter
    private String Sexe;


    @Getter
    @Setter
    private String niveau;

    @Getter
    @Setter
    private float score;

    @Getter
    @Setter
    private int rang;

    @Getter
    @Setter
    private Date date;

    @Getter
    @Setter
    private String heure;
}
