package com.solva.coffeemachine.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table
@Entity
@Data
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String ingredientName;

    private int ingredientQuantity;

}
