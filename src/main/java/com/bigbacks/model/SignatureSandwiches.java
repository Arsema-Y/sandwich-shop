package com.bigbacks.model;

public class SignatureSandwiches extends Sandwich {
    //Attributes
    private int choice;

    //constructor===================
    // takes signatureName (e.g., "Philly Cheese Steak"), size, bread, toasted
    // calls super(bread, size, toasted)
    public SignatureSandwiches(int choice, String name, char size, String breadType, boolean isToasted) {
        super(name, size, breadType, isToasted);

        this.choice = choice;

        //solidify sandwiches
        makeSignatureSandwiches();

    }

    public int getChoice() {return choice;}

    public static void setChoice(int sandwichChoice) {}

    // Helper method--------------
    public void makeSignatureSandwiches() {
        switch (getChoice()) {
            case 1 -> {
                //-----------------------work in progress--------------------------------
                setName("The Goat");
                setSize('l');
                this.addProtein("Tofu", false);
                this.addRegularTopping("Lettuce");
                this.addRegularTopping("Tomato");
                this.addRegularTopping("Onion");
                this.addRegularTopping("Guacamole");
                this.addSauce("Mustard");
                this.addSauce("Vinaigrette");
            }
            case 2 -> {
                setName("Big Grizzly");
                setSize('l');
                this.addProtein("Bacon", false);
                this.addRegularTopping("Lettuce");
                this.addRegularTopping("Tomato");
                this.addSauce("Mayo");
            }
            case 3 -> {
                setName("Big Hippo");
                setSize('l');
                this.addProtein("Bacon", false);
                this.addRegularTopping("Lettuce");
                this.addRegularTopping("Tomato");
                this.addSauce("Mayo");
            }
            default -> {
                // Optional: Handles the case where a name doesn't match any recipe
                System.out.println("Unavailable.\n Would you like to make a Custom Sandwich?" );
            }
        }
        ;
    }

    //derived getters==================
    // getPrice() -> calls super.getPrice()
    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
