package com.apprecipe.Service;

import com.apprecipe.Model.FoodRecipe;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface FoodRecipeService {

    FoodRecipe addFoodRecipe(FoodRecipe foodRecipe);
    List<FoodRecipe> getAllFoodRecipe();
    Optional<FoodRecipe> getFoodRecipeById(String id);
    FoodRecipe updateFoodRecipe (FoodRecipe foodRecipe);
    String deleteFoodRecipe (String id);

}
