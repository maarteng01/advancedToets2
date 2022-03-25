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
    private double priceSideDish;
}
