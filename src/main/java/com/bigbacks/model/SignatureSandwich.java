package com.bigbacks.model;

public class SignatureSandwich extends Sandwich {

    //constructor===================
    // takes signatureName (e.g., "Philly Cheese Steak"), size, bread, toasted
    // calls super(bread, size, toasted)
    // IF name is "Philly Cheese Steak":
    //    calls this.addMeat("Steak", false);
    //    calls this.addCheese("American", false);
    //    calls this.addTopping("Peppers");
    //    calls this.addSauce("Mayo");

    //derived getters==================
    // getPrice() -> calls super.getPrice() + adds a flat signature premium fee (optional)
}
