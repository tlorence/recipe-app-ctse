package com.apprecipe.Service;

import com.apprecipe.Model.BeverageRecipe;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface BeverageRecipeService {

    BeverageRecipe addBeverage(BeverageRecipe beverageRecipe);
    List<BeverageRecipe> getAllBeverages();
    Optional<BeverageRecipe> getBeverageReferenceById(String id);
    BeverageRecipe updateBeverage (BeverageRecipe beverageRecipe);
    String deleteBeverageRecipe(String id);
}
