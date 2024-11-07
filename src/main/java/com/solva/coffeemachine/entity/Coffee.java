package com.solva.coffeemachine.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String coffeeName;
}
