package com.bigbacks.model;

public class MenuItem implements ItemPrice{

        //Attributes ======================
        // store name (e.g., "Custom Sandwich", "Cola", "Chips")
        // store size (e.g., "4\"", "8\"", "12\"", "Small", "Medium", "Large")

        //constructor===================
        // takes name and size to initialize the common fields

        //getters======================
        // standard getters for name and size

        //derived getters==================
        // public abstract double getPrice(); <-- Every child MUST calculate this

}
