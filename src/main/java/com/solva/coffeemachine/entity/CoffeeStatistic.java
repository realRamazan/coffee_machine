package com.solva.coffeemachine.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class CoffeeStatistic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "coffee_id")
    private int coffeeId;
    @Column(name = "coffee_quantity")
    private int coffeeQuantity;

}
