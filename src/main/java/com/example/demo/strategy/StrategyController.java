package com.example.demo.strategy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/strategy")
public class StrategyController {
    private StrategyService strategyService;

    public StrategyController(StrategyService strategyService) {
        this.strategyService = strategyService;
    }

    @GetMapping("")
    public void demonstrateStrategyPattern(){
        this.strategyService.demonstrateStrategyPattern();
    }
}
