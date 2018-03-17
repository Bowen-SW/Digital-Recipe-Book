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
public class Book {
    ArrayList<RecipeList> rl;
    int selected; //Iterator
    String name;
    public Book(String name){
        this.name=name;
        rl=new ArrayList<>();
    }
    RecipeList getList(){
        return null;
    }
    public void addRecipeList(String name){
        rl.add(new RecipeList(name));
    }
    
            
}
