/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.model;

import java.util.ArrayList;

/**
 *
 * @author delta
 */
public class RecipeList {
    ArrayList<Ingredient> list;
    int selected; //Iterator
    String name;
    public RecipeList(String name){
        this.name=name;
    }
    
    Ingredient getIngredient(){
        return null;
    }
}
