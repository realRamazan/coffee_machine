package com.solva.coffeemachine.service;

import com.solva.coffeemachine.entity.CoffeeStatistic;
import com.solva.coffeemachine.repository.CoffeeStatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeStatisticsService {
    @Autowired
    private CoffeeStatisticsRepository coffeeStatisticsRepository;

    public List<CoffeeStatistic> getStatistics() {
        return coffeeStatisticsRepository.findAll();
    }
}
