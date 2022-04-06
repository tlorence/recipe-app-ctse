package com.apprecipe.Repositories;

import com.apprecipe.Model.BeverageRecipe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface BeverageRecipeRepository extends MongoRepository<BeverageRecipe, String> {
}
