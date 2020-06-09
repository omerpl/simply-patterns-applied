package com.example.demo.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("rest/factory")
public class FactoryController {
    private FactoryService factoryService;

    @Autowired
    FactoryController(FactoryService factoryService) {
        this.factoryService = factoryService;
    }

    @GetMapping("/car")
    public String getAndRunCar() {
        return this.factoryService.getAndRunCar();
    }
    @GetMapping("/truck")
    public String getAndRunTruck() {
        return this.factoryService.getAndRunTruck();
    }
}
