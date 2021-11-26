package com.tsi.murray.ben.SpringBootCocktail;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class CocktailInstructions {
    private int stepNumber;

    private List<Instruction> cocktailInstructions = new ArrayList();


    public CocktailInstructions(){
        this.cocktailInstructions.add(new Instruction(1,"Add ingredients to blender"));
        this.cocktailInstructions.add(new Instruction(2,"Blend"));
        this.cocktailInstructions.add(new Instruction(3,"Push puree through sieve"));
        this.cocktailInstructions.add(new Instruction(4,"Add mixture to blender"));
        this.cocktailInstructions.add(new Instruction(5,"Add ingredients to blender"));
        this.cocktailInstructions.add(new Instruction(6,"Blend"));
        this.cocktailInstructions.add(new Instruction(7,"Pour mixture into glass"));
        this.cocktailInstructions.add(new Instruction(8,"Add garnishes"));
    }

    public List<Instruction> getCocktailInstructions(){
        return this.cocktailInstructions;
    }

    public String toString(){
        String json = new Gson().toJson(cocktailInstructions);
        return  json;
    }
}
