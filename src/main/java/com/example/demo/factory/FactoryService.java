package com.example.demo.factory;

import org.springframework.stereotype.Service;

@Service
public class FactoryService {
    Transport transport;

    String getAndRunCar(){
            this.transport = new TransportPerson();
            Vehicle vehicle = this.transport.getVehicle();
            return vehicle.runVehicle();
    }
    String getAndRunTruck(){
        this.transport = new TransportLoad();
        Vehicle vehicle = this.transport.getVehicle();
        return vehicle.runVehicle();
    }
}
