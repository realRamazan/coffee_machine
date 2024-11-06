package com.solva.coffeemachine.controller;

import com.solva.coffeemachine.dto.AddCoffeeRecipeDTO;
import com.solva.coffeemachine.entity.CoffeeStatistic;
import com.solva.coffeemachine.entity.Ingredient;
import com.solva.coffeemachine.entity.Recipe;
import com.solva.coffeemachine.service.CoffeeIngredientService;
import com.solva.coffeemachine.service.CoffeeStatisticService;
import com.solva.coffeemachine.service.IngredientService;
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
    private IngredientService ingredientService;

    @Autowired
    private CoffeeIngredientService coffeeIngredientService;

    @Autowired
    private CoffeeStatisticService coffeeStatisticService;

    @GetMapping("/quantity")
    public List<Ingredient> checkQuantityOfIngredients() {
        return ingredientService.checkIngredients();
    }

    @PostMapping("/order/{id}")
    public List<Recipe> orderCoffee(@PathVariable String id){
        return ingredientService.orderCoffee(id);
    }

    @PostMapping("/selectedRecipe/{id}")
    public String selectedRecipe(String id){
        return ingredientService.selectedRecipeOrder(id);
    }

    @PostMapping("/addNewRecipes/{id}")
    public String addCoffee(@PathVariable String id,
            @RequestBody AddCoffeeRecipeDTO addCoffeeRecipeDTO){
        return coffeeIngredientService.addCoffeeRecipe(addCoffeeRecipeDTO, id);
    }

    @GetMapping("/statistics")
    public List<CoffeeStatistic> getCoffeeStatistics() {
        return coffeeStatisticService.getStatistics();
    }
}


