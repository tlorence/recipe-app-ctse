package com.apprecipe.controller;

import com.apprecipe.Model.BeverageRecipe;
import com.apprecipe.Service.BeverageRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/beverageRecipes")
public class BeverageRecipeController {
    @Autowired
    BeverageRecipeService beverageRecipeService;

    @PostMapping("/addBeverages")
    public BeverageRecipe addBeverage(@RequestBody BeverageRecipe beverageRecipe){
        return beverageRecipeService.addBeverage(beverageRecipe);
    }

    @GetMapping("/getBeverages")
    public List<BeverageRecipe> getAllBeverages(){
        return beverageRecipeService.getAllBeverages();
    }

    @GetMapping("/findBeverageRecipeById/{id}")
    public Optional<BeverageRecipe> getBeverageById(@PathVariable String id){
        return beverageRecipeService.getBeverageReferenceById(id);
    }
    @PutMapping("/update")
    public BeverageRecipe updateBeverage(@RequestBody BeverageRecipe beverageRecipe) {
        return beverageRecipeService.updateBeverage(beverageRecipe);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteBeverage(@PathVariable String id){
        return beverageRecipeService.deleteBeverageRecipe(id);
    }
}
