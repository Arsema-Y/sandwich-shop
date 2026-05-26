package com.bigbacks.model;

public class Order {
    //Attributes ======================
    // List<MenuItem> to hold all items chosen for this single transaction

    //constructor===================
    // initializes empty item list

    //setters/adders========================
    // addItem(MenuItem item) -> adds a sandwich, drink, or chips to the collection

    //derived getters==================
    // calculateOrderTotal() -> loops through list, calls .getPrice() on each item
    // getOrderSummary() -> loops through list, calls summaries, builds final bill view
}
