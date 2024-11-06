package com.solva.coffeemachine.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table
@Data
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String coffeeId;

    @OneToMany
    @JoinColumn(name = "recipe_ingredients_id")
    private List<RecipeIngredient> recipeIngredients;
}
