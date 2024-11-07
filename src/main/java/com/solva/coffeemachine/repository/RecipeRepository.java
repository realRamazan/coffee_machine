package com.solva.coffeemachine.repository;

import com.solva.coffeemachine.entity.Coffee;
import com.solva.coffeemachine.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
    List<Recipe> findByCoffee_Id(int coffeeId);
}
