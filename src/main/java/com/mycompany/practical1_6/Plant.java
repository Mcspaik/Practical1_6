package com.mycompany.practical1_6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Люба
 */
public class Plant {
    private String name;
    private String type;
    private String wayOfEating;

    public Plant(String name, String type, String wayOfEating) {
        this.name = name;
        this.type = type;
        this.wayOfEating = wayOfEating;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWayOfEating() {
        return wayOfEating;
    }

    public void setWayOfEating(String wayOfEating) {
        this.wayOfEating = wayOfEating;
    }

    
    @Override
    public String toString(){
        return  getName() + "," + getType() +
                "," + getWayOfEating();
    }
    
    
}
