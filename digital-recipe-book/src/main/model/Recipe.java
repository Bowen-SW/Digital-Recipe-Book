/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.model;

/**
 *
 * @author delta
 */
public class Recipe extends Ingredient{
    int PrepTime;
    int CookTime;
    String steps; 
    public Recipe(String name, int CookTime, int PrepTime, String steps){
        super(name);
        this.CookTime=CookTime;
        this.PrepTime=PrepTime;
        this.steps=steps;
    }
    
}
