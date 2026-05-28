package com.bigbacks.model;

public class Drink extends MenuItem {
    //Attributes ======================
    private int drinkType; // (1.Soda, 2.Smoothie, 3.Coffee, 4.Tea")
    private int flavor; /* Soda     Smoothie   Coffee    Tea
                          1.Sprite   Mango     Cold      Cold
                          2.Coke     Banana    Hot       Hot
                          3.Fanta    Strawberry
                        */

    //constructor===================
    // takes drinkType, flavor, size -> passes name to super()

    public Drink(String name, char size, int drinkType, int flavor) {
        super(name, size);

        this.drinkType = drinkType;
        this.flavor = flavor;
    }

    //setters==================
    public void setDrinkType(int drinkType) {this.drinkType = drinkType;}

    public void setFlavor(int flavor) {this.flavor = flavor;}

    //getters==================
    public int getDrinkType() {return drinkType;}

    public int getFlavor() {return flavor;}

    //derived getters==================
    // calculate -> checks drinkType
    //               -> ceck size
    @Override
    public double getPrice() {
        return
                switch (this.drinkType) {
                    //------Soda------
                    case 1 -> switch (getSize()) {
                            case 'S' -> 1.00;
                            case 'M' -> 2.50;
                            case 'L' -> 3.00;
                            default -> 0;
                        };

                    //------Smoothie------
                    case 2 -> switch (getSize()) {
                            case 'S' -> 3.00;
                            case 'M' -> 5.00;
                            case 'L' -> 7.00;
                            default -> 0;
                    };

                    //------Coffee------
                    case 3 -> switch (getSize()) {
                            case 'S' -> 2.00;
                            case 'M' -> 4.00;
                            case 'L' -> 6.00;
                            default -> 0.00;
                        };

                    //------Tea------
                    case 4 -> switch (getSize()) {
                            case 'S' -> 1.00;
                            case 'M' -> 2.50;
                            case 'L' -> 3.00;
                            default -> 0.00;
                        };

                    // Invalid drinkType---------
                    default -> 0;
                };
    }

//    @Override
//    public double getPrice() {
//        return getPrice(drinkType, flavor,getSize());
//    }
}


