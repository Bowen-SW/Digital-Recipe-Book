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
        //Basic Constructor
        this.name=name;
    }
    public void getFileName(){
        //This function prompts the user for a filepath, 
        //which is stored as a string.
        System.out.print ("Please input the filepath of an image that you want to store.\n");
        Scanner sc= new Scanner(System.in);
        img=sc.next();
}
    public void ChangeIngredientName(String new_name){
        //This function allows the user to replace the name of the ingredient. The controller specifies what the new name is.
        name=new_name;
    }
    
}
