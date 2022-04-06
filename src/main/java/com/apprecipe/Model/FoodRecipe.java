package com.apprecipe.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "foodRecipe")
public class FoodRecipe {

    @Id
    private String foodRecipeId;
    private String description;

    public FoodRecipe(String foodRecipeId, String description) {
        this.foodRecipeId = foodRecipeId;
        this.description = description;
    }

    public String getFoodRecipeId() {
        return foodRecipeId;
    }

    public void setFoodRecipeId(String foodRecipeId) {
        this.foodRecipeId = foodRecipeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
