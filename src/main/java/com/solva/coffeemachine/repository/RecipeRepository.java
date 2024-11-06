package com.solva.coffeemachine.repository;

import com.solva.coffeemachine.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
}