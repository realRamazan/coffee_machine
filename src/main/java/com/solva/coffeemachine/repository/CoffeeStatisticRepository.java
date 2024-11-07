package com.solva.coffeemachine.repository;

import com.solva.coffeemachine.entity.CoffeeStatistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeStatisticRepository extends JpaRepository<CoffeeStatistic, Integer> {
    CoffeeStatistic findByCoffee_Id(int coffeeId);
}
