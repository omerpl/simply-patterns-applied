package com.example.demo.adapter;

import java.util.ArrayList;
import java.util.List;

public class Regime {
    private Double totalCalories;
    private List<String> consumedFoods;

    public Regime() {
        this.totalCalories = 0.0;
        this.consumedFoods = new ArrayList<>();
    }

    public void eatMeal(FoodInCal food) {
        this.consumedFoods.add(food.getName());
        this.totalCalories = this.totalCalories + food.getCalorieValue();
    }

    public String getOverAllStatus() {
        return "Here what i have eaten : " +
                String.join(",", this.consumedFoods) + '\n' +
                " and total calories i had is :  " + this.totalCalories.toString();
    }

}
