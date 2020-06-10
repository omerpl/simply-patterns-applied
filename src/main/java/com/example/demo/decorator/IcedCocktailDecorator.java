package com.example.demo.decorator;

 public class IcedCocktailDecorator extends CocktailDecorator {

     IcedCocktailDecorator(CocktailInterface decorated) {
         super(decorated);
     }

     public  String getDrinkDetails(){
         return "Iced " + this.decorated.getDrinkDetails();
     }
}
