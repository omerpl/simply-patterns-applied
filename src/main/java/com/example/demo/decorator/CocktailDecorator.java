package com.example.demo.decorator;

 public class CocktailDecorator implements CocktailInterface {
     protected CocktailInterface decorated;

     CocktailDecorator (CocktailInterface decorated){
         this.decorated = decorated;
     }

     public  String getDrinkDetails(){
         return  decorated.getDrinkDetails();
     }

}
