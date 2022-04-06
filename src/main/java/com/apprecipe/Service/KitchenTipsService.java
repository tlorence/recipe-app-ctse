package com.apprecipe.Service;

import com.apprecipe.Model.KitchenTips;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface KitchenTipsService {

    KitchenTips addFoodRecipe(KitchenTips kitchenTips);
    List<KitchenTips> getAllFoodRecipe();
    Optional<KitchenTips> getFoodRecipeById(String id);
    KitchenTips updateFoodRecipe (KitchenTips kitchenTips);
    String deleteFoodRecipe (String id);
}
