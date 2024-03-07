package stage.projet.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Transactional
@Table(name="COMPETITION")
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


}
