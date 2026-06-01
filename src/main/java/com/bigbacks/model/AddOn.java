package com.bigbacks.model;

public class AddOn extends MenuItem{
//Attributes ======================
    // store sideType (e.g., "Chips", "Cookie", "Brownie", "Fries")
    private String addOnType;
    private String saltLevel; //for fries

    //constructor===================
    public AddOn(String type, String name, char size) {
        super(name, size);

        this.addOnType = type;
    }

    //setter==================
    public void setSaltLevel(String saltLevel) {
        this.saltLevel = saltLevel;
    }

    //getter==================

    //derived getters==================
    // getPrice() -> checks sideType and size (1: Small, 2: Large)
    @Override
    public double getPrice() {
        return
                switch (getSize()){
            case 'S' -> 1.0;
            case 'M' -> 2.0;
            case 'L' -> 3.0;
            default -> 0.0;
        };

    }
}
