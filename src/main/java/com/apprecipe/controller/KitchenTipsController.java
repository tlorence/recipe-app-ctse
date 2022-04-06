package com.apprecipe.controller;

import com.apprecipe.Model.FoodRecipe;
import com.apprecipe.Model.KitchenTips;
import com.apprecipe.Service.FoodRecipeService;
import com.apprecipe.Service.KitchenTipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/kitchentips")
public class KitchenTipsController {

    @Autowired
    KitchenTipsService kitchenTipsService;

    @PostMapping("/add")
    public KitchenTips addFoodRecipe(@RequestBody KitchenTips kitchenTips){
        return kitchenTipsService.addFoodRecipe(kitchenTips);
    }
    @GetMapping("/getAll")
    public List<KitchenTips> getAllDiets(){
        return kitchenTipsService.getAllFoodRecipe();
    }
    @GetMapping("/findKitchenTipsById/{id}")
    public Optional<KitchenTips> getById(@PathVariable String id){
        return kitchenTipsService.getFoodRecipeById(id);
    }
    @PutMapping("/update")
    public KitchenTips updateDiet(@RequestBody KitchenTips kitchenTips) {
        return kitchenTipsService.updateFoodRecipe(kitchenTips);
    }
    @DeleteMapping("/delete/{id}")
    public String updateDiet(@PathVariable String id){
        return kitchenTipsService.deleteFoodRecipe(id);
    }
}
