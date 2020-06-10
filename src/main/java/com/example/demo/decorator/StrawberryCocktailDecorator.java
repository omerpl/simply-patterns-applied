package com.example.demo.decorator;

 public class StrawberryCocktailDecorator extends CocktailDecorator {

     StrawberryCocktailDecorator(CocktailInterface decorated) {
         super(decorated);
     }

     public  String getDrinkDetails(){
         return "Strawberry " + this.decorated.getDrinkDetails();
     }




}
