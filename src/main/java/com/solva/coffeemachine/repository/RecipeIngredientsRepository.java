package com.solva.coffeemachine.repository;

import com.solva.coffeemachine.entity.RecipeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeIngredientsRepository extends JpaRepository<RecipeIngredient, Integer> {
}
