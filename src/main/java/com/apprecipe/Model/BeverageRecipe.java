package com.apprecipe.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "beverageRecipe")
public class BeverageRecipe {

    @Id
    private String id;
    private String beverageName;
    private String ingredients;

    public BeverageRecipe(String id, String beverageName,String ingredients) {
        this.id = id;
        this.beverageName = beverageName;
        this.ingredients = ingredients;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBeverageName() {
        return beverageName;
    }

    public void setBeverageName(String beverageName) {
        this.beverageName = beverageName;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "BeverageRecipe{" +
                "recipeId='" + id + '\'' +
                ", beverageName='" + beverageName + '\'' +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }
}
