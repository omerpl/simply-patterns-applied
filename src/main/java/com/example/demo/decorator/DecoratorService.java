package com.example.demo.decorator;

import org.springframework.stereotype.Service;

@Service
public class DecoratorService {
    public String getSomeCocktails() {
        String result;
        Cocktail cocktail = new Cocktail();
        result = "Cocktail undecorated  : " + cocktail.getDrinkDetails();

        CocktailDecorator decoratedCocktail = new StrawberryCocktailDecorator(cocktail);
        result = result + "\n" + decoratedCocktail.getDrinkDetails();

        decoratedCocktail = new IcedCocktailDecorator(cocktail);
        result = result + "\n" + decoratedCocktail.getDrinkDetails();

        decoratedCocktail = new IcedCocktailDecorator(new StrawberryCocktailDecorator(cocktail));
        result = result + "\n" + decoratedCocktail.getDrinkDetails();

        return result;
    }
}
