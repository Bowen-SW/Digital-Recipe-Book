/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.model;
import java.util.Scanner;

/**
 *
 * @author delta
 */
public class Ingredient {
    String name;
    String img; //Temporary, Filepath, File for adding images to the ingredient
    public Ingredient(String name){
        this.name=name;
    }
    public void getFileName(){
        //This function prompts the user for a filepath, 
        //which is stored as a string.
        System.out.print ("Please input the filepath of an image that you want to store.\n");
        Scanner sc= new Scanner(System.in);
        img=sc.next();
}
}
