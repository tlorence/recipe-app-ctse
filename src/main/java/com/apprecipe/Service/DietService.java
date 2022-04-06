package com.apprecipe.Service;

import com.apprecipe.Model.Diet;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface DietService {

    Diet addDiet(Diet diet);
    List<Diet> getAllDiets();
    Optional<Diet> getDietReferenceById(String id);
    Diet updateDiet (Diet diet);
    String deleteDiet(String id);
}
