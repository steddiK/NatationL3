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
}
