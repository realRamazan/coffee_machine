package com.solva.coffeemachine.repository;

import com.solva.coffeemachine.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
    List<Recipe> findAllByCoffeeId(int coffeeId);
}
