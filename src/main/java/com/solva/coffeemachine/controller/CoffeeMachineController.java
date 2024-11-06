package com.solva.coffeemachine.controller;

import com.solva.coffeemachine.dto.AddCoffeeRecipeDTO;
import com.solva.coffeemachine.entity.CoffeeStatistic;
import com.solva.coffeemachine.entity.Ingredient;
import com.solva.coffeemachine.entity.Recipe;
import com.solva.coffeemachine.service.CoffeeIngredientsService;
import com.solva.coffeemachine.service.CoffeeStatisticsService;
import com.solva.coffeemachine.service.IngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/coffeemachine")
public class CoffeeMachineController {

    @GetMapping("/status")
    public void coffeeMachineStatus() {
    }

    @Autowired
    private IngredientsService ingredientsService;

    @Autowired
    private CoffeeIngredientsService coffeeIngredientsService;

    @Autowired
    private CoffeeStatisticsService coffeeStatisticsService;

    @GetMapping("/quantity")
    public List<Ingredient> checkQuantityOfIngredients() {
        return ingredientsService.checkIngredients();
    }

    @PostMapping("/order/{id}")
    public List<Recipe> orderCoffee(@PathVariable String id){
        return ingredientsService.orderCoffee(id);
    }

    @PostMapping("/addNewRecipes/{id}")
    public String addCoffee(@PathVariable String id,
            @RequestBody AddCoffeeRecipeDTO addCoffeeRecipeDTO){
        return coffeeIngredientsService.addCoffeeRecipe(addCoffeeRecipeDTO, id);
    }

    @GetMapping("/statistics")
    public List<CoffeeStatistic> getCoffeeStatistics() {
        return coffeeStatisticsService.getStatistics();
    }
}


