package com.apprecipe.controller;

import com.apprecipe.Model.Diet;
import com.apprecipe.Model.FoodRecipe;
import com.apprecipe.Service.DietService;
import com.apprecipe.Service.FoodRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/foodRecipe")
public class FoodRecipeController {

    @Autowired
    FoodRecipeService foodRecipeService;

    @PostMapping("/add")
    public FoodRecipe addFoodRecipe(@RequestBody FoodRecipe foodRecipe){
        return foodRecipeService.addFoodRecipe(foodRecipe);
    }
    @GetMapping("/getAll")
    public List<FoodRecipe> getAllDiets(){
        return foodRecipeService.getAllFoodRecipe();
    }
    @GetMapping("/findFoodRecipeById/{id}")
    public Optional<FoodRecipe> getById(@PathVariable String id){
        return foodRecipeService.getFoodRecipeById(id);
    }
    @PutMapping("/update")
    public FoodRecipe updateDiet(@RequestBody FoodRecipe foodRecipe) {
        return foodRecipeService.updateFoodRecipe(foodRecipe);
    }
    @DeleteMapping("/delete/{id}")
    public String updateDiet(@PathVariable String id){
        return foodRecipeService.deleteFoodRecipe(id);
    }
}
