package com.apprecipe.Service.Impl;


import com.apprecipe.Model.FoodRecipe;
import com.apprecipe.Repositories.FoodRecipeRepository;
import com.apprecipe.Service.FoodRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FoodRecipeServiceImpl implements FoodRecipeService {

    @Autowired
    FoodRecipeRepository foodRecipeRepository;

    @Override
    public FoodRecipe addFoodRecipe(FoodRecipe foodRecipe) {
        return foodRecipeRepository.save(foodRecipe);
    }

    @Override
    public List<FoodRecipe> getAllFoodRecipe() {
        return foodRecipeRepository.findAll();
    }

    @Override
    public Optional<FoodRecipe> getFoodRecipeById(String id) {
        return foodRecipeRepository.findById(id);
    }

    @Override
    public FoodRecipe updateFoodRecipe(FoodRecipe foodRecipe) {
        return foodRecipeRepository.save(foodRecipe);
    }

    @Override
    public String deleteFoodRecipe(String id) {
        foodRecipeRepository.deleteById(id);
        return "Deleted Successfully";
    }
}
