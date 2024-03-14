package com.mycompany.practical1_6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Люба
 */
public class Sadovnik {
    private String gender;
    private int workExperience;

    public Sadovnik(String gender) {
        this.gender = gender;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        if (workExperience <= 0){
            System.out.println("Некорректный возраст, попробуйте ещё раз");
        }else{
            this.workExperience = workExperience;
        }
    }
    
    public void filter(Plant plant){
        if (plant != null && this.workExperience > 0){
            String fName = plant.getName();
            String[] glasn = {"a","e","i","o","u","y","A","E","I","O",
            "U","Y"};
            for (int i = 0; i < glasn.length;i++){
                fName=fName.replace(glasn[i],"");
            }
            fName = fName + "vgtbl";
            fName = fName.toUpperCase();
            plant.setName(fName);
        }
    }
    
    
}
