package com.example.demo.strategy;

public class StandardCargoStrategy implements CargoStrategy {
    @Override
    public void doShipping() {
        try {
            Thread.sleep(2000);
            System.out.println("Standard cargo has been delivered!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
