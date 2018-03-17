/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.controller;

import java.util.ArrayList;
import main.model.Book;
import main.model.Ingredient;
import main.model.Recipe;
import main.model.RecipeList;

/**
 *
 * @author delta
 */
public class Controller {
    ArrayList<Book> bl;
    int selected; //index
    Book newBook(String name){
        Book b = new Book(name);
        bl.add(b);
        return b;
    }
    void newRecipeList(String name){
        bl.get(selected).addRecipeList(name);
    } 
    void newIngredient(RecipeList list, String name){
       //bl.get(selected).addIngredient(name);
    }
    void newRecipe(RecipeList list, String name, int prep, int cook, String steps){
        
    }
}
