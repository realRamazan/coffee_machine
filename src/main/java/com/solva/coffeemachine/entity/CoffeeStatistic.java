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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coffee_id")
    private Coffee coffee;

    private int coffeeQuantity;

}
