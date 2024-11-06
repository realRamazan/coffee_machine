package com.solva.coffeemachine.service;

import com.solva.coffeemachine.dto.AddCoffeeRecipeDTO;
import org.springframework.stereotype.Service;


@Service
public class CoffeeIngredientService {


    public String addCoffeeRecipe(AddCoffeeRecipeDTO addCoffeeRecipeDTO, String id) {

        return "New coffee recipe added";
    }
}
