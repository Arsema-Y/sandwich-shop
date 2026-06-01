package com.bigbacks.model;

public class SignatureSandwiches {
    //Attributes
    public static Sandwich signatureSandwich1;
    public static Sandwich signatureSandwich2;
    public static Sandwich signatureSandwich3;

    // Helper method--------------
    public static void makeSignatureSandwiches() {
        //-----------------------work in progress--------------------------------
        signatureSandwich1 = new Sandwich("The Goat", 'L', "Wheat", true);

        signatureSandwich1.addProtein("tofu", false);
        signatureSandwich1.addRegularTopping("lettuce");
        signatureSandwich1.addRegularTopping("tomato");
        signatureSandwich1.addRegularTopping("onion");
        signatureSandwich1.addRegularTopping("guacamole");
        signatureSandwich1.addSauce("mustard");
        signatureSandwich1.addSauce("vinaigrette");

        signatureSandwich2 = new Sandwich("Big Grizzly", 'L', "White", true);
        signatureSandwich2.addProtein("Bacon", false);
        signatureSandwich2.addRegularTopping("Lettuce");
        signatureSandwich2.addRegularTopping("Tomato");
        signatureSandwich2.addSauce("Mayo");

        signatureSandwich3 = new Sandwich("Big Hippo", 'L', "Wrap", true);
        signatureSandwich3.addProtein("Bacon", false);
        signatureSandwich3.addRegularTopping("Lettuce");
        signatureSandwich3.addRegularTopping("Tomato");
        signatureSandwich3.addSauce("Mayo");

    }

    public static Sandwich getByChoice(int choice) {
        return switch (choice) {
            case 1 -> signatureSandwich1;
            case 2 -> signatureSandwich2;
            case 3 -> signatureSandwich3;
            default -> null;
        };
    }
}