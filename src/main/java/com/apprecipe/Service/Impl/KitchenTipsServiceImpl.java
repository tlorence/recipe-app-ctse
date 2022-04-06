package com.apprecipe.Service.Impl;

import com.apprecipe.Model.KitchenTips;
import com.apprecipe.Repositories.KitchenTipsRepository;
import com.apprecipe.Service.KitchenTipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class KitchenTipsServiceImpl implements KitchenTipsService {

    @Autowired
    KitchenTipsRepository kitchenTipsRepository;

    @Override
    public KitchenTips addFoodRecipe(KitchenTips kitchenTips) {
        return kitchenTipsRepository.save(kitchenTips);
    }

    @Override
    public List<KitchenTips> getAllFoodRecipe() {
        return kitchenTipsRepository.findAll();
    }

    @Override
    public Optional<KitchenTips> getFoodRecipeById(String id) {
        return kitchenTipsRepository.findById(id);
    }

    @Override
    public KitchenTips updateFoodRecipe(KitchenTips kitchenTips) {
        return kitchenTipsRepository.save(kitchenTips);
    }

    @Override
    public String deleteFoodRecipe(String id) {
        kitchenTipsRepository.deleteById(id);
        return "Deleted Successfully";
    }
}
