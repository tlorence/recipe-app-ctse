package com.apprecipe.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "beverageRecipe")
public class BeverageRecipe {

    @Id
    private Long id;
    private String name;
    private String description;
    private String ingredients;
    private String imageLinks;

    public BeverageRecipe(Long id, String name, String description, String ingredients, String imageLinks) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.imageLinks = imageLinks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getImageLinks() {
        return imageLinks;
    }

    public void setImageLinks(String imageLinks) {
        this.imageLinks = imageLinks;
    }
}
