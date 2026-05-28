package com.bigbacks.model;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends MenuItem {

    // Attributes ======================
    private String breadType;
    private boolean isToasted;

    private List<String> meats;
    private boolean isExtraMeat;

    private List<String> cheeses;
    private boolean isExtraCheese;

    private List<String> regularToppings;
    private List<String> sauces;

    // Constructor ======================
    public Sandwich(String name, char size, String breadType, boolean isToasted) {
        super(name, size);

        this.breadType = breadType;
        this.isToasted = isToasted;

        // Initialize empty ArrayLists
        this.meats = new ArrayList<>();
        this.cheeses = new ArrayList<>();
        this.regularToppings = new ArrayList<>();
        this.sauces = new ArrayList<>();

        // Start as false by default
        this.isExtraMeat = false;
        this.isExtraCheese = false;
    }

    // Setters / Adders ========================

    // 1. Meat Adder ----------------
    public void addMeat(String meatName, boolean isExtra) {
        this.meats.add(meatName); // Add to meat List
        if (isExtra) {
            this.isExtraMeat = true; // premium price trigger
        }
    }

    // 2. Cheese Adder ----------------
    public void addCheese(String cheeseName, boolean isExtra) {
        this.cheeses.add(cheeseName); // Add to cheese List
        if (isExtra) {
            this.isExtraCheese = true; // premium price trigger
        }
    }

    // 3. Regular Toppings Adder ----------------
    public void addRegularTopping(String toppingName) {
        this.regularToppings.add(toppingName); // Add to toppings List
    }

    // 4. Sauce Adder ----------------
    public void addSauce(String sauceName) {
        this.sauces.add(sauceName); // Add to sauce List
    }

    //  Getters ===================
    public String getBreadType() {return breadType;}

    public boolean isToasted() {return isToasted;}

    // Derived Getters ==================
    @Override
    public double getPrice() {
        // 1. Check size for base price
        // 2. Base premium cost for  meats/cheeses on Size
        // 3. Check if isExtraMeat or isExtraCheese are true

            double calculatedPrice = 0.00;

            // --- SMALL SANDWICH (4") LOGIC ---
            if (getSize() == 'S') {
                // 1. Add Base Price
                calculatedPrice += 5.50;

                // 2. Add Premium Meat Price (Only if they added meat)
                if (!meats.isEmpty()) {calculatedPrice += 1.00;}

                //    Add Premium Cheese Price (Only if they added cheese)
                if (!cheeses.isEmpty()) {calculatedPrice += 0.75;}

                // 3. Add Extra Meat
                if (isExtraMeat) {calculatedPrice += 0.50;}

                //    Add Extra Cheese
                if (isExtraCheese) {calculatedPrice += 0.30;}
            }

            // --- MEDIUM SANDWICH (8") LOGIC ---
            else if (getSize() == 'M') {
                calculatedPrice += 7.00;

                if (!meats.isEmpty()) {calculatedPrice += 2.00;}

                if (!cheeses.isEmpty()) {calculatedPrice += 1.50;}

                if (isExtraMeat) {calculatedPrice += 1.00;}

                if (isExtraCheese) {calculatedPrice +=0.60;}
            }

            // --- LARGE SANDWICH (12") LOGIC ---
            else if (getSize() == 'L') {
                calculatedPrice += 8.50;

                if (!meats.isEmpty()) {calculatedPrice += 3.00;}

                if (!cheeses.isEmpty()) {calculatedPrice += 2.25;}

                if (isExtraMeat) {calculatedPrice += 1.50;}

                if (isExtraCheese) {calculatedPrice += 0.90;}
            }


        return calculatedPrice;

    }

    public String getReceipt() {
        // 1. Create a StringBuilder to build the receipt txt
        StringBuilder receipt = new StringBuilder();

        // 2. Add the main header info (Size, Name, Bread, and Toasting)
        receipt.append("--- ").append(getSize()).append(" ").append(getName()).append(" ---\n");
        receipt.append("Bread: ").append(breadType);
        if (isToasted) {receipt.append(" (Toasted)");}

        receipt.append("\n");

        // 3. Add Meats (Check if the list has anything in it first)
        receipt.append("Meats: ");
        if (meats.isEmpty()) {receipt.append("None\n");}
        else {receipt.append(String.join(", ", meats)); // commas delimiter
            if (isExtraMeat) {receipt.append(" (*Extra Meat*)");}
            receipt.append("\n");
        }

        // 4. Add Cheeses
        receipt.append("Cheeses: ");
        if (cheeses.isEmpty()) {receipt.append("None\n");}
        else {receipt.append(String.join(", ", cheeses));
            if (isExtraCheese) {receipt.append(" (*Extra Cheese*)");}
            receipt.append("\n");
        }

        // 5. Add Regular Toppings
        receipt.append("Toppings: ");
        if (regularToppings.isEmpty()) {receipt.append("None\n");}
        else {receipt.append(String.join(", ", regularToppings)).append("\n");}

        // 6. Add Sauces
        receipt.append("Sauces: ");
        if (sauces.isEmpty()) {receipt.append("None\n");}
        else {receipt.append(String.join(", ", sauces)).append("\n");}

        // 7. Add the Price ( 2 decimal places)
        receipt.append(String.format("Price: $%.2f\n", getPrice()));

        // 8. Convert the StringBuilder into a regular String
        return receipt.toString();
    }
}