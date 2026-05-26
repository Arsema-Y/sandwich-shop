package com.bigbacks.model;

public class Sandwich extends MenuItem {

    //Attributes ======================
    // store bread type, toasted status (boolean)
    // List collections for meats, cheeses, regular toppings, sauces
    // boolean flags for extraMeat and extraCheese

    //constructor===================
    // takes bread type, size, toasted status, passes name ("Sandwich") to super()
    // initializes all array lists as empty collections

    //setters/adders========================
    // addMeat(string name, boolean isExtra)
    // addCheese(string name, boolean isExtra)
    // addTopping(string toppingName)
    // addSauce(string sauceName)

    //derived getters==================
    // getPrice() -> calculates base price by size + premium additions by size
    // getSummary() -> returns formatted string of all sandwich ingredients
}
