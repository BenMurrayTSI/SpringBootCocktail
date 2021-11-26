package com.tsi.murray.ben.SpringBootCocktail;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Glass {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int GlassID;

    private String Type;
    private int Volume;

    public Glass(String Type, int Volume) {
        this.Type = Type;
        this.Volume = Volume;
    }

    public Glass() {

    }

    public int getGlassID() {
        return GlassID;
    }

    public void setGlassID(int glassID) {
        this.GlassID = glassID;
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
