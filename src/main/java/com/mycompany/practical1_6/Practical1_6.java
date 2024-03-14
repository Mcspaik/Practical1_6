/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practical1_6;
import java.util.Scanner;

/**
 *
 * @author Люба
 */
public class Practical1_6 {

    public static void main(String[] args) {
        System.out.println("Вариант 4, Cтеперенкова Любовь Алексеевна");
        Scanner scan = new Scanner(System.in); 
        System.out.println("Please, enter plant name: ");
        String pName = scan.nextLine();
        System.out.println("Please, enter plant type: ");
        String pType = scan.nextLine();
        System.out.println("Please, enter plant's way of eating: ");
        String pEat = scan.nextLine();
        Plant plant = new Plant(pName, pType,pEat);
        System.out.println(plant.toString());
        
        Sadovnik sadovnik = new Sadovnik("male");
        sadovnik.setWorkExperience(8);
        sadovnik.filter(plant);
        System.out.println(plant.toString());
        
    }
}
