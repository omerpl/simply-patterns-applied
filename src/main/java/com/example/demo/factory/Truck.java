package com.example.demo.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Truck implements Vehicle {
    private static final Logger logger = LoggerFactory.getLogger(Vehicle.class);
    public Integer getWheelCount(){
        return 12;
    }
    public String runVehicle(){
        logger.info("Truck is running ");
        return "I'm a Truck and used for heavy duty...";
    }
}
