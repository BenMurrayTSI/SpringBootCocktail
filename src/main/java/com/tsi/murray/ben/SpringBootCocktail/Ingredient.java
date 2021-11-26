package com.tsi.murray.ben.SpringBootCocktail;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int IngredientID;

    private String Name;
    private double ABV;
    private String Storage;
    private String Description;

    public Ingredient(String Name, double ABV, String Storage, String Description) {
        this.Name = Name;
        this.ABV = ABV;
        this.Storage = Storage;
        this.Description = Description;
    }

    public Ingredient() {

    }

    public int getIngredientID() {
        return IngredientID;
    }

    public void setIngredientID(int ingredientID) {
        this.IngredientID = ingredientID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public double getABV() {
        return ABV;
    }

    public void setABV(double ABV) {
        this.ABV = ABV;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String storage) {
        this.Storage = storage;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }
}
