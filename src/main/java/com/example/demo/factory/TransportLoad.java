package com.example.demo.factory;

public class TransportLoad extends Transport{
    public Vehicle getVehicle() {
        return new Truck();
    }
    
}
