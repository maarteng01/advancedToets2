package be.thomasmore.party.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Snack {
    @Id
    private Integer id;
    private String name;
    private boolean vegan;
    private boolean sideDishPossible;
    private double price;
    //Double met grote letter kan je "null" maken in de database
    //terwijl een double met kleine letter dat niet kan dus je moet hier wel een Double met grote letter gebruiken
    private Double priceSideDish;
}
