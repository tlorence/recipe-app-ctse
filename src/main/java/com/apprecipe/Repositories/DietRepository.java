package com.apprecipe.Repositories;

import com.apprecipe.Model.Diet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DietRepository extends MongoRepository<Diet, String> {
}
