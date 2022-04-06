package com.apprecipe.controller;

import com.apprecipe.Model.Diet;
import com.apprecipe.Service.DietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/diet")
public class DietController {

    @Autowired
    DietService dietService;

    @PostMapping("/add")
    public Diet addDiet(@RequestBody Diet diet){
        return dietService.addDiet(diet);
    }
    @GetMapping("/getAll")
    public List<Diet> getAllDiets(){
        return dietService.getAllDiets();
    }
    @GetMapping("/findConferenceById/{id}")
    public Optional<Diet> getById(@PathVariable String id){
        return dietService.getDietReferenceById(id);
    }
    @PutMapping("/update")
    public Diet updateDiet(@RequestBody Diet diet) {
        return dietService.updateDiet(diet);
    }
    @DeleteMapping("/delete/{id}")
    public String updateDiet(@PathVariable String id){
        return dietService.deleteDiet(id);
    }
}
