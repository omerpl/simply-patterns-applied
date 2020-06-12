package com.example.demo.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("rest/observer")
public class ObserverController {
    private ObserverService observerService;

    @Autowired
    ObserverController(ObserverService observerService) {
        this.observerService = observerService;
    }

    @PostMapping("/market")
    public void calculateWhatsEaten() {
        this.observerService.demonstrateObserverPattern();
    }

}
