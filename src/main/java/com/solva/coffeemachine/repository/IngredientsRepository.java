package com.solva.coffeemachine.repository;

import com.solva.coffeemachine.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientsRepository extends JpaRepository<Ingredient, Integer> {
}
