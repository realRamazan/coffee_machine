package com.solva.coffeemachine.repository;

import com.solva.coffeemachine.entity.CoffeeIngredients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CoffeeIngredientsRepository extends JpaRepository<CoffeeIngredients, Integer> {
     Optional<CoffeeIngredients> findByCoffeeId(Integer coffeeId);
}
