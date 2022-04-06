package com.apprecipe.Service.Impl;

import com.apprecipe.Model.Diet;
import com.apprecipe.Repositories.DietRepository;
import com.apprecipe.Service.DietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DietServiceImpl implements DietService {

    @Autowired
    DietRepository dietRepository;

    @Override
    public Diet addDiet(Diet diet) {
        return dietRepository.save(diet);
    }

    @Override
    public List<Diet> getAllDiets() {
        return dietRepository.findAll();
    }

    @Override
    public Optional<Diet> getDietReferenceById(String id) {
        return dietRepository.findById(id);
    }

    @Override
    public Diet updateDiet(Diet diet) {
        return dietRepository.save(diet);
    }

    @Override
    public String deleteDiet(String id) {
        dietRepository.deleteById(id);
        return "Deleted Successfully";
    }
}
