package com.tsi.murray.ben.SpringBootCocktail;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cocktail {

    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
    private int CocktailID;

    private String Name;
    private String Type;
    private int Volume;

    public Cocktail(String Name, String Type, int Volume) {
        this.Name = Name;
        this.Type = Type;
        this.Volume = Volume;
    }

    public Cocktail() {

    }




    public int getCocktailID() {
        return CocktailID;
    }

    public void setCocktailID(int cocktailID) {
        this.CocktailID = cocktailID;
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

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int volume) {
        this.Volume = volume;
    }

}


