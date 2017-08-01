package za.co.nwt.model;

import javax.persistence.*;

/**
 * Created by marc.marais on 2017-08-01.
 */
@Entity
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String firstName;
    String surname;
    @ManyToOne
    Flat flat;

}
