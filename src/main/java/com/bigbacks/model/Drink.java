package com.bigbacks.model;

public class Drink extends MenuItem {
    //Attributes ======================
    private String drinkType; // (1.Soda, 2.Smoothie, 3.Coffee, 4.Tea")
    //❌private int flavor; -> name
                         /* Soda     Smoothie   Coffee    Tea
                          1.Sprite   Mango     Cold      Cold
                          2.Coke     Banana    Hot       Hot
                          3.Fanta    Strawberry
                        */

    //constructor===================
    // takes drinkType, flavor, size -> passes name to super()

    public Drink(String drinkType, String name, char size) {
        super(name, size);

        this.drinkType = drinkType;
        //❌this.flavor = flavor;
    }

    //setters==================
    public void setDrinkType(String drinkType) {this.drinkType = drinkType;}

    //❌public void setFlavor(int flavor) {this.flavor = flavor;}

    //getters==================
    public String getDrinkType() {return drinkType;}

    //❌public int getFlavor() {return flavor;}

    //derived getters==================
    // calculate -> checks drinkType
    //               -> ceck size
    @Override
    public double getPrice() {
        return
                switch (this.drinkType) {
                    //------Soda------
                    case "Soda" -> switch (getSize()) {
                            case 'S' -> 1.00;
                            case 'M' -> 2.50;
                            case 'L' -> 3.00;
                            default -> 0;
                        };

                    //------Smoothie------
                    case "Smoothie" -> switch (getSize()) {
                            case 'S' -> 3.00;
                            case 'M' -> 5.00;
                            case 'L' -> 7.00;
                            default -> 0;
                    };

                    //------Coffee------
                    case "Coffee" -> switch (getSize()) {
                            case 'S' -> 2.00;
                            case 'M' -> 4.00;
                            case 'L' -> 6.00;
                            default -> 0.00;
                        };

                    //------Tea------
                    case "Tea" -> switch (getSize()) {
                            case 'S' -> 1.00;
                            case 'M' -> 2.50;
                            case 'L' -> 3.00;
                            default -> 0.00;
                        };

                    // Invalid drinkType---------
                    case "none" -> 0;
                    default -> 0;
                };
    }

}


