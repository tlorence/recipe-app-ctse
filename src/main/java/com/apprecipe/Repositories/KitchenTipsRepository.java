package com.apprecipe.Repositories;

import com.apprecipe.Model.KitchenTips;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KitchenTipsRepository extends MongoRepository<KitchenTips, String> {
}
