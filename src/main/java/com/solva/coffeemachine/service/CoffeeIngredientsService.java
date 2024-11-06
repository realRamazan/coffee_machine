package com.solva.coffeemachine.service;

import com.solva.coffeemachine.dto.AddCoffeeRecipeDTO;
import com.solva.coffeemachine.repository.CoffeeIngredientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CoffeeIngredientsService {
    @Autowired
    CoffeeIngredientsRepository coffeeIngredientsRepository;

    public String addCoffeeRecipe(AddCoffeeRecipeDTO addCoffeeRecipeDTO, String id) {

        return "New coffee recipe added";
    }
}
