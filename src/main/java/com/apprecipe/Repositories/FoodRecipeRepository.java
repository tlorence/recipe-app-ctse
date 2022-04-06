package com.apprecipe.Repositories;

import com.apprecipe.Model.FoodRecipe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FoodRecipeRepository extends MongoRepository<FoodRecipe, String> {
}
