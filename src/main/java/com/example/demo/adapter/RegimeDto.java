package com.example.demo.adapter;

import lombok.Data;

import java.util.List;

@Data
class RegimeDto {
    private List<FoodInCal> foodInCals;
    private List<FoodInJoule> foodInJoules;

}
