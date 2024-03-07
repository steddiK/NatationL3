package stage.projet.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name= "nageurs")
public class Nageurs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNag;

    @Getter
    @Setter
    private String nomNag;

    @Getter
    @Setter
    private String prenomNag;

    @Getter
    @Setter
    private Date dateNaiss;

}
