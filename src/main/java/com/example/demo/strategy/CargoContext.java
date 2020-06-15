package com.example.demo.strategy;

public class CargoContext {
    private CargoStrategy cargoStrategy;

    public void setCargoStrategy(CargoStrategy cargoStrategy) {
        this.cargoStrategy = cargoStrategy;
    }

    public void executeShippingStrategy(){
        this.cargoStrategy.doShipping();
    }
}
