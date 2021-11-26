package com.tsi.murray.ben.SpringBootCocktail;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Garnish {

    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
    private int GarnishID;

    private String Name;
    private String Type;

    public Garnish(String Name, String Type) {
        this.Name = Name;
        this.Type = Type;
    }

    public Garnish() {

    }

    public int getGarnishID() {
        return GarnishID;
    }

    public void setGarnishID(int garnishID) {
        this.GarnishID = garnishID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }
}
