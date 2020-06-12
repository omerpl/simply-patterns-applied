package com.example.demo.observer;

public class MassSubscriber implements MarketSubscriber {
    private String id;

    MassSubscriber(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void update(String updateString) {
        System.out.println("Mass subscriber id : " + this.getId() + " gets this update : " + updateString);
    }
}
