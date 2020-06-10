package com.example.demo.adapter;

public class FoodInJouleAdapter extends FoodInCal {
    private FoodInJoule foodInJoule;

    public FoodInJouleAdapter(FoodInJoule foodInJoule){
        this.foodInJoule = foodInJoule;
    }

    public  String  getName(){
        return  this.foodInJoule.getName();
    }

    public Double getCalorieValue(){
        return  this.foodInJoule.getJouleValue() * 0.24;
    }

}
