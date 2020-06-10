package com.example.demo.decorator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("rest/decorator")
public class DecoratorController {
    private DecoratorService decoratorService;

    @Autowired
    DecoratorController(DecoratorService decoratorService) {
        this.decoratorService = decoratorService;
    }

    @GetMapping("/cocktail")
    public String getSomeCocktails() {
        return this.decoratorService.getSomeCocktails();
    }

}
