package com.example.demo.strategy;

public class ExpressCargoStrategy implements CargoStrategy {
    @Override
    public void doShipping() {
        try {
            Thread.sleep(500);
            System.out.println("Express cargo has been delivered!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
