package com.example.demo.observer;

public interface MarketSubscriber {
    String getId();
    void update(String updateString) ;
}
