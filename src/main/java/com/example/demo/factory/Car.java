package com.example.demo.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car implements Vehicle {
    private static final Logger logger = LoggerFactory.getLogger(Vehicle.class);
    public Integer getWheelCount(){
        return 4;
    }
    public String runVehicle(){
        logger.info("Car is running ");
        return "I'm a Car and looking awesome...";
    }
}
