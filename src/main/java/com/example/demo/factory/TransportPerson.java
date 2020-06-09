package com.example.demo.factory;

public class TransportPerson extends Transport{
    public Vehicle getVehicle() {
        return new Car();
    }
    
}
