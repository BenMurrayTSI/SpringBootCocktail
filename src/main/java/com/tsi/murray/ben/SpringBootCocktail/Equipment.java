package com.tsi.murray.ben.SpringBootCocktail;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equipment {

    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
    private int EquipmentID;

    private String Name;
    private String Type;
    private int Power;

    public Equipment(String Name, String Type, int Power) {
        this.Name = Name;
        this.Type = Type;
        this.Power = Power;
    }

    public Equipment() {

    }



    public int getEquipmentID() {
        return EquipmentID;
    }

    public void setEquipmentID(int equipmentID) {
        this.EquipmentID = equipmentID;
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

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        this.Power = power;
    }
}
