package com.apprecipe.Service.Impl;

import com.apprecipe.Model.BeverageRecipe;
import com.apprecipe.Repositories.BeverageRecipeRepository;
import com.apprecipe.Service.BeverageRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BeverageRecipeServiceImpl implements BeverageRecipeService {

    @Autowired
    private BeverageRecipeRepository beverageRecipeRepository;

    @Override
    public BeverageRecipe addBeverage(BeverageRecipe beverageRecipe){
        return beverageRecipeRepository.save(beverageRecipe);
    }

    @Override
    public List<BeverageRecipe> getAllBeverages() {
        return beverageRecipeRepository.findAll();
    }

    @Override
    public Optional<BeverageRecipe> getBeverageReferenceById(String id) {
        return beverageRecipeRepository.findById(id);
    }

    @Override
    public BeverageRecipe updateBeverage(BeverageRecipe beverageRecipe) {
        return beverageRecipeRepository.save(beverageRecipe);
    }

    @Override
    public String deleteBeverageRecipe(String id) {
        beverageRecipeRepository.deleteById(id);
        return "Deleted Successfully";
    }

    ;

}
