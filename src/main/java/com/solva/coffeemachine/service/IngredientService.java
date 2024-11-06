package com.solva.coffeemachine.service;

import com.solva.coffeemachine.entity.Ingredient;
import com.solva.coffeemachine.entity.Recipe;
import com.solva.coffeemachine.entity.RecipeIngredient;
import com.solva.coffeemachine.repository.CoffeeStatisticRepository;
import com.solva.coffeemachine.repository.IngredientRepository;
import com.solva.coffeemachine.repository.RecipeIngredientRepository;
import com.solva.coffeemachine.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {

    @Autowired
    IngredientRepository ingredientRepository;

    @Autowired
    RecipeRepository recipeRepository;

    @Autowired
    RecipeIngredientRepository recipeIngredientRepository;

    @Autowired
    CoffeeStatisticRepository coffeeStatisticRepository;

    public List<Ingredient> checkIngredients() {
        return ingredientRepository.findAll();
    }

    public List<Recipe> orderCoffee(String id) {
        int coffeeId = Integer.parseInt(id);
        return recipeRepository.findAllByCoffeeId(coffeeId);
    }

    public String selectedRecipeOrder(String id) {

        Ingredient ingredient = new Ingredient();

        int recipeId = Integer.parseInt(id);
        Optional<Recipe> recipe = recipeRepository.findById(recipeId);
        if(recipe.isPresent()) {
            Recipe coffeeRecipe = recipe.get();
            List<RecipeIngredient> recipeIngredient = coffeeRecipe.getRecipeIngredient();
            for(RecipeIngredient x : recipeIngredient){
                ingredient.setId(x.getIngredientId().getId());
                ingredient.setIngredientQuantity(x.getQuantity());
            }
            return "Your coffee will be done ASAP";
        }
        else {return  "Can't make coffee";}
    }
}
