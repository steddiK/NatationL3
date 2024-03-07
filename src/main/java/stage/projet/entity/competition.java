package stage.projet.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.transaction.Transactional;
import java.sql.Date;

@Entity
@Transactional
@Table(name= "COMPETITION")
public class competition {

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
