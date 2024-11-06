package com.solva.coffeemachine.service;

import com.solva.coffeemachine.entity.CoffeeStatistic;
import com.solva.coffeemachine.repository.CoffeeStatisticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeStatisticService {
    @Autowired
    private CoffeeStatisticRepository coffeeStatisticRepository;

    public List<CoffeeStatistic> getStatistics() {
        return coffeeStatisticRepository.findAll();
    }
}
