package com.example.demo.strategy;

public class CheapCargoStrategy implements CargoStrategy {
    @Override
    public void doShipping() {
        try {
            Thread.sleep(5000);
            System.out.println("Cheap cargo has been delivered!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
