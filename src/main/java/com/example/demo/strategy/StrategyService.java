package com.example.demo.strategy;

import org.springframework.stereotype.Service;

@Service
class StrategyService {
    void demonstrateStrategyPattern(){
        CargoStrategy express = new ExpressCargoStrategy();
        CargoStrategy standard = new StandardCargoStrategy();
        CargoStrategy cheap = new CheapCargoStrategy();

        System.out.println("Cargo has been sent through all strategies...");

        new Thread(express::doShipping).start();
        new Thread(standard::doShipping).start();
        new Thread(cheap::doShipping).start();

    }

}
