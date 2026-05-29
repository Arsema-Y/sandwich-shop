package com.bigbacks.model;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    //Attributes ======================
    // List<MenuItem> to hold all items chosen for this single transaction
    private List<MenuItem> orderItems;

    //constructor===================
    // initializes empty item list
    public OrderManager() {
        this.orderItems = new ArrayList<>();
    }


    //setters/adders========================
    // addItem(MenuItem item) -> to add a sandwich, drink, or addOn to the list
    public void addItem(MenuItem item) {
        this.orderItems.add(item);
    }

    // Remove an item of MenuItem from the list
    public void removeItem(MenuItem item) {
        this.orderItems.remove(item);
    }

    public List<MenuItem> getOrderItems() {
        return orderItems;
    }

    //derived getters==================
    // calculateOrderTotal() -> loops through list, calls .getPrice() on each item
    public double getOrderTotal() {
        return //showoff streams
                orderItems.stream()
                .mapToDouble(MenuItem::getPrice)
                .sum();
    }

    // getOrderSummary() -> loop through list, calls summaries, build final receipt view
    public String getOrderReceipt() {
        StringBuilder receiptBuilder = new StringBuilder();

        receiptBuilder.append("===== YOUR ORDER SUMMARY ======\n");

        // Loop through every item in the cart
        for (MenuItem item : orderItems) {
            //  MenuItem should a getName() method and getPrice() logic
            receiptBuilder.append("       " + item.getName())
                    .append(" - $")
                    .append(String.format("%.2f", item.getPrice()))
                    .append("\n");
        }

        receiptBuilder.append("-----------------------------\n");
        receiptBuilder.append("       Total: $")
                .append(String.format("%.2f", getOrderTotal()))
                .append("\n");

        return receiptBuilder.toString();
    }

}
