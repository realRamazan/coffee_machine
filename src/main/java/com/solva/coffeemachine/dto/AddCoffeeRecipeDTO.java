package com.solva.coffeemachine.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddCoffeeRecipeDTO {
    int milk;
    int sugar;
    int water;
    int grainArabica;
    int grainRobusta;
    int grainLiberica;
    int milkFoam;
}
