package com.example.demo.observer;

public class RetailSubscriber implements MarketSubscriber {
    private String id;

    RetailSubscriber(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void update(String updateString) {
        System.out.println("Retail subscriber id: " + this.getId() + " gets this update : " + updateString);
    }
}
