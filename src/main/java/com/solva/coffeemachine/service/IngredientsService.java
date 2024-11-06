package com.solva.coffeemachine.service;

import com.solva.coffeemachine.entity.CoffeeIngredients;
import com.solva.coffeemachine.entity.Ingredient;
import com.solva.coffeemachine.entity.Recipe;
import com.solva.coffeemachine.repository.CoffeeIngredientsRepository;
import com.solva.coffeemachine.repository.CoffeeStatisticsRepository;
import com.solva.coffeemachine.repository.IngredientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientsService {

    @Autowired
    IngredientsRepository ingredientsRepository;

    @Autowired
    CoffeeIngredientsRepository coffeeIngredientsRepository;

    @Autowired
    CoffeeStatisticsRepository coffeeStatisticsRepository;

    public List<Ingredient> checkIngredients() {
        return ingredientsRepository.findAll();
    }

    public List<Recipe> orderCoffee(String id) {

        return
    }
}
