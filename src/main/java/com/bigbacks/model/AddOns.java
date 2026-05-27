package com.bigbacks.model;

public class AddOns extends MenuItem{
//Attributes ======================
    // store sideType (e.g., "Chips", "Cookie", "Brownie", "Fries")
    private int addOnType;
    private int saltLevel;

    //constructor===================
    public AddOns(String name, char size, int type) {
        super(name, size);
        this.addOnType = type;
    }

    public void setSaltLevel(int saltLevel) {
        this.saltLevel = saltLevel; // Correctly storing the state

        switch(saltLevel){
            case 0 -> System.out.println("No Salt");
            case 1 -> System.out.println("Light Salt");
            case 2 -> System.out.println("Regular Salt");
        }
    }


    //derived getters==================
    // getPrice() -> checks sideType and size (1: Small, 2: Large)
    @Override
    public double getPrice() {
        return
                switch (getSize()){
            case 'S' -> 1.0;
            case 'L' -> 3.0;
            default -> 0.0;
        };

    }
}
