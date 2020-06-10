package com.example.demo.adapter;

import org.springframework.stereotype.Service;

@Service
public class AdapterService {
    public String calculateWhatsEaten(RegimeDto regimeDto) {
        Regime myRegime = new Regime();
        regimeDto.getFoodInCals().forEach(myRegime::eatMeal);
        regimeDto.getFoodInJoules().forEach(foodInJoule -> myRegime.eatMeal(new FoodInJouleAdapter(foodInJoule)));
        return myRegime.getOverAllStatus();
    }
}
