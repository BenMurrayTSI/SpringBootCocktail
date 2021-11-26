package com.tsi.murray.ben.SpringBootCocktail;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instruction {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int InstructionID;
    private String Description;

    public Instruction(String Description) {
        this.Description = Description;
    }

    public Instruction() {

    }

    public int getInstructionID() {
        return InstructionID;
    }

    public void setInstructionID(int instructionID) {
        this.InstructionID = instructionID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }
}
