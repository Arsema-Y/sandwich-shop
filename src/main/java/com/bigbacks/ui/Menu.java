package com.bigbacks.ui;

import com.bigbacks.model.OrderManager;
import java.util.Scanner;

public class Menu {
    //Attributes ======================
    // Scanner, Order
    static Scanner input = new Scanner(System.in);
    static OrderManager currentOrder = new OrderManager();
    //all inputs-----------------
    //for real-time display
    static int breadChoice;
    static char sandwichSize;

    static int premiumTopping1; //protein
    static int premiumTopping2; //cheese

    //regular toppings (veggies)
    static int topping1;
    static int topping2;
    static int topping3;
    static int topping4;
    static int topping5;
    static int topping6;
    static int topping7;

    static int extraTopping1; //protein
    static int extraTopping2; //protein

    static int extraTopping3; //cheese
    static int extraTopping4; //cheese

    static int sauce1;
    static int sauce2;
    static int sauce3;

    static int drinkChoice;
    static char drinkSize;

    static int addOnChoice;
    static char addOnSize;

    //⭐9. Sign on-screen====================
    //displaySignInScreen() -> [1] Sign-in, [2] Sign-up, [3] Guest
    //if signed-in, ask if they gonna use Cupon

    //1. Home-screen====================
    // displayHomeScreen() -> [1] New Order, [0] Exit
    static void displayHomeScreen() {
        //--------field--------
        boolean runHome = true;

        //--------body--------
        while (runHome) {
            System.out.println("""
                    -------------------------------
                                 HELLO
                    -------------------------------
                    \n""");
            System.out.println("""
                    -------------------------------
                    |         1. New Order        |
                    |         0. EXIT             |
                    -------------------------------""");

            //----------User Input-----------
            int screenChoice = input.nextInt();

            //--------control switch---------

        }


    }

    //2. Order-screen===================
    // displayOrderScreen() -> [1] Add Sandwich, [2] Add Drink, [3] Add Side, [4] Checkout
    static void displayOrderScreen() {
        //--------field--------
        boolean runOrder = true;

        //--------body--------
        while (runOrder) {
            System.out.println("""
                    -------------------------------
                                 NEW ORDER
                    -------------------------------
                    \n""");
            System.out.println("""
                    -------------------------------
                    |         1. Add SANDWICH     |
                    |         2. Add DRINK        |
                    |         3. Add ADD-ON       |
                    |         0. Cancel Order     |
                    -------------------------------""");

            //----------User Input-----------
            int screenChoice = input.nextInt();

            //--------control switch---------

        }

    }

    //--------------------------------------MENU---------------------------------

    //3. Sandwich-Choice-screen=========
    // ➕displaySandwichChoiceScreen() -> [1] Signature Sandwiches , [2] Build Custom
    static void displaySandwichChoiceScreen() {
        //--------field--------
        boolean runSandwich = true;

        //--------body--------
        while (runSandwich) {
            System.out.println("""
                    -------------------------------
                             BUILD OPTIONS
                    -------------------------------
                    \n""");
            System.out.println("""
                    -------------------------------
                    |    1. SIGNATURE SANDWICH    |
                    |    2. CUSTOM SANDWICH       |
                    -------------------------------
                    \n
                    |    0. Cancel Order          |""");

            //----------User Input-----------
            int screenChoice = input.nextInt();

            //--------control switch---------
        }

    }

    //4. Sandwich-Menu-screens==========
    // ➕displaySignatureMenuScreen()  -> Options: [1] Philly Cheese Steak, [2] BLT, etc.
    static void displaySignatureMenuScreen() {
        //--------field--------
        boolean runSignatureMenu = true;

        //--------body--------
        while (runSignatureMenu) {
            System.out.println("""
                    -------------------------------
                          SIGNATURE SANDWICHES
                    -------------------------------
                    \n""");
            System.out.println("""
                    -------------------------------
                          SIGNATURE SANDWICHES-1
                    ===============================
                    |1. Protein:         |
                    |2. Dairy:           |
                    |3. Carbs:           |
                    |4. Veggies:         |
                    |5. Sauce:           |
                    -------------------------------""");
            System.out.println("""
                    -------------------------------
                          SIGNATURE SANDWICHES-2
                    ===============================
                    |1. Protein:         |
                    |2. Dairy:           |
                    |3. Carbs:           |
                    |4. Veggies:         |
                    |5. Sauce:           |
                    -------------------------------""");
            System.out.println("""
                    -------------------------------
                          SIGNATURE SANDWICHES-3
                    ===============================
                    |1. Protein:         |
                    |2. Dairy:           |
                    |3. Carbs:           |
                    |4. Veggies:         |
                    |5. Sauce:           |
                    -------------------------------""");

            //----------User Input-----------
            int sandwichChoice = input.nextInt();

            //⭕---------keep track------------
            switch (sandwichChoice) {
                case 1 -> System.out.println("+ (choice)");
                case 2 -> System.out.println("+ (choice)");
                case 3 -> System.out.println("+ (choice)");
                case 4 -> System.out.println("+ (choice)");
            }

            //----------Customize-----------
            System.out.println("""
                    -------------------------------
                       ? CUSTOMIZE INGREDIENTS ?
                    -------------------------------
                    |          1. Yes             |
                    |          2. No              |
                    ===============================""");

            int editIngredients = input.nextInt();

            //--------control switch---------
            if (editIngredients == 1) {
                System.out.println(""" 
                        -------------------------------
                        |          1. ADD             |
                        |          2. REMOVE          |
                        ==============================="""); //➕ REPLACE

                int addRemoveIngredients = input.nextInt();

                if (addRemoveIngredients == 1) {
                    System.out.println("""
                            -------------------------------
                                    ADD INGREDIENTS
                            -------------------------------
                            |          1. Protein         |
                            |          2. Dairy           |
                            |          3. Veggies         |
                            ===============================""");

                    int addType = input.nextInt();

                    switch (addType) {
                        case 1 -> {
                            System.out.println("""
                                    -------------------------------
                                                PROTEIN
                                    ===============================
                                    |1. Small (4")         |
                                    |2. Medium (8")           |
                                    |3. Large (12")           |
                                    |4. Large (12")           |
                                    -------------------------------""");

                            int extraProtein = input.nextInt();
                            //⭕--------Add to Order----------

                        }
                        case 2 -> {
                            System.out.println("""
                                    -------------------------------
                                                 DAIRY
                                    ===============================
                                    |1. Small (4")            |
                                    |2. Medium (8")           |
                                    |3. Large (12")           |
                                    |4. Large (12")           |
                                    -------------------------------""");

                            int extraDairy = input.nextInt();
                            //⭕--------Add to Order----------
                        }
                        case 3 -> {
                            System.out.println("""
                                    -------------------------------
                                                Veggies
                                    ===============================
                                    |1. Small (4")           |
                                    |2. Medium (8")           |
                                    |3. Large (12")           |
                                    |4. Large (12")           |
                                    -------------------------------""");

                            int extraTopping = input.nextInt();
                            //⭕--------Add to Order----------
                        }
                    }
                } else if (addRemoveIngredients == 2) {
                    System.out.println("""
                            -------------------------------
                                   REMOVE INGREDIENTS
                            -------------------------------
                            |          1. Protein         |
                            |          2. Dairy           |
                            |          3. Veggies         |
                            ===============================""");
                    int removeType = input.nextInt();
                    switch (removeType) {
                        case 1 -> {
                            System.out.println("""
                                    -------------------------------
                                                PROTEIN
                                    ===============================
                                    |1. Small (4")         |
                                    |2. Medium (8")           |
                                    |3. Large (12")           |
                                    |4. Large (12")           |
                                    -------------------------------""");

                            int extraProtein = input.nextInt();
                            //⭕--------Add to Order----------

                        }
                        case 2 -> {
                            System.out.println("""
                                    -------------------------------
                                                 DAIRY
                                    ===============================
                                    |1. Small (4")            |
                                    |2. Medium (8")           |
                                    |3. Large (12")           |
                                    |4. Large (12")           |
                                    -------------------------------""");

                            int extraDairy = input.nextInt();
                            //⭕--------Add to Order----------
                        }
                        case 3 -> {
                            System.out.println("""
                                    -------------------------------
                                                Veggies
                                    ===============================
                                    |1. Small (4")           |
                                    |2. Medium (8")           |
                                    |3. Large (12")           |
                                    |4. Large (12")           |
                                    -------------------------------""");

                            int extraTopping = input.nextInt();
                            //⭕--------Add to Order----------
                        }
                    }
                }

            } else if (editIngredients == 2){
                //⭕--------Add to Order----------

                //⭕--------change Screen---------
                //[1] Drink , [2] Add-On , [3] Add another Sandwich
                // [0] Check-out , [x] Cancel Order

                //⭕--------control switch---------;
            }



        }


    }

    // 5. displayCustomSandwichScreen() -> completely blank build path
    static void displayCustomSandwichScreen() {
        //--------field--------
        boolean runCustomSandwich = true;

        //--------body--------
        while (runCustomSandwich) {
            System.out.println("""
                    -------------------------------
                            CUSTOM SANDWICH
                    -------------------------------
                    \n""");
            // ---------------------Bread type (int->String)
            System.out.println("""
                    -------------------------------
                           Carb: BREAD TYPE
                    ===============================
                    |1. Protein:         |
                    |2. Dairy:           |
                    |3. Carbs:           |
                    |4. Veggies:         |
                    |5. Sauce:           |
                    -------------------------------""");

            //➕branch idea: streams -> add to currentOrder List + print
            //----------User Input-----------
            int breadChoice = input.nextInt();

            //⭕---------keep track------------
            switch (breadChoice) {
                case 1 -> System.out.println("+ (choice)");
                case 2 -> System.out.println("+ (choice)");
                case 3 -> System.out.println("+ (choice)");
                case 4 -> System.out.println("+ (choice)");
            }

            //⭕--------Add to Order----------

            // ---------------------Bread size (char-> char)
            System.out.println("""
                    -------------------------------
                                 SIZE
                    ===============================
                    |S. Small (4")         |
                    |M. Medium (8")           |
                    |L. Large (12")           |
                    -------------------------------""");
            //----------User Input-----------
            int sandwichSize = input.nextInt();

            //⭕---------keep track------------
            switch (sandwichSize) {
                case 1 -> System.out.println("+ (choice)");
                case 2 -> System.out.println("+ (choice)");
                case 3 -> System.out.println("+ (choice)");
                case 4 -> System.out.println("+ (choice)");
            }

            //⭕--------Add to Order----------

            // ---------------------isToasted (int->bool)
            System.out.println("""
                    -------------------------------
                                STATE
                    ===============================
                    |1. Toasted         |
                    |2. untoasted           |
                    -------------------------------""");
            //----------User Input-----------
            int toastOption = input.nextInt();

            //⭕---------keep track------------
            switch (toastOption) {
                case 1 -> System.out.println("+ TOASTED");
                case 2 -> System.out.println("- UNTOASTED");
            }

            //⭕--------Add to Order----------

            // ---------------------Protein (int->String)
            //⭕ ----> into helper method
            System.out.println("""
                    -------------------------------
                                PROTEIN
                    ===============================
                    |1. Small (4")         |
                    |2. Medium (8")           |
                    |3. Large (12")           |
                    |4. Large (12")           |
                    -------------------------------""");
            //----------User Input-----------
            int premiumTopping1 = input.nextInt();

            //⭕---------keep track------------
            switch (premiumTopping1) {
                case 1 -> System.out.println("+ (choice)");
                case 2 -> System.out.println("+ (choice)");
                case 3 -> System.out.println("+ (choice)");
                case 4 -> System.out.println("+ (choice)");
            }
            //⭕--------Add to Order----------

            // ---------------------Dairy (int->String)
            //⭕ ----> into helper method
            System.out.println("""
                    -------------------------------
                                 DAIRY
                    ===============================
                    |1. Small (4")         |
                    |2. Medium (8")           |
                    |3. Large (12")           |
                    |4. Large (12")           |
                    -------------------------------""");
            //----------User Input-----------
            int premiumTopping2 = input.nextInt();

            //⭕---------keep track------------
            switch (premiumTopping2) {
                case 1 -> System.out.println("+ (choice)");
                case 2 -> System.out.println("+ (choice)");
                case 3 -> System.out.println("+ (choice)");
                case 4 -> System.out.println("+ (choice)");
            }
            //⭕--------Add to Order----------

            // ---------------------Veggies (int->String)
            //⭕ ----> into helper method
            //➕branch idea: string~ 123 (elementAt(0)), switch->...
            System.out.println("""
                    -------------------------------
                                VEGGIES
                    ===============================
                    |1. Small (4")         |
                    |2. Medium (8")           |
                    |3. Large (12")           |
                    |4. Large (12")           |
                    -------------------------------""");
            //----------User Input-----------
            int topping1 = input.nextInt();

            //⭕---------keep track------------
            switch (topping1) {
                case 1 -> System.out.println("+ (choice)");
                case 2 -> System.out.println("+ (choice)");
                case 3 -> System.out.println("+ (choice)");
                case 4 -> System.out.println("+ (choice)");
            }
            //⭕--------Add to Order----------

            // ---------------------Sauces (int->String)
            //⭕ ----> into helper method
            System.out.println("""
                    -------------------------------
                                 SAUCE
                    ===============================
                    |1. Small (4")         |
                    |2. Medium (8")           |
                    |3. Large (12")           |
                    |4. Large (12")           |
                    -------------------------------""");
            //----------User Input-----------
            int sauce1 = input.nextInt();

            //⭕---------keep track------------
            switch (breadChoice) {
                case 1 -> System.out.println("+ (choice)");
                case 2 -> System.out.println("+ (choice)");
                case 3 -> System.out.println("+ (choice)");
                case 4 -> System.out.println("+ (choice)");
            }
            //⭕--------Add to Order----------

            //⭕--------change Screen---------
            //[1] Drink , [2] Add-On , [3] Add another Sandwich
            // [0] Check-out , [x] Cancel Order

        }

    }

    //6. Drink-screen====================
    // displayDrinkScreen() -> Step 1: [1] Soda, [2] Smoothie, [3] Coffee, [4] Tea
    //                         Step 2: Prompt flavor based on choice
    //                         Step 3: [1] Small, [2] Medium, [3] Large
    static void displayDrinkScreen() {
        //--------field--------
        boolean runDrink = true;

        //--------body--------
        while (runDrink) {
            System.out.println("""
                    -------------------------------
                                DRINKS
                    -------------------------------
                    \n""");
            // ---------------------Bread type (int->String)
            System.out.println("""
                    -------------------------------
                             DRINK TYPE
                    ===============================
                    |1. Protein:         |
                    |2. Dairy:           |
                    |3. Carbs:           |
                    |4. Veggies:         |
                    |5. Sauce:           |
                    -------------------------------""");}

        //----------User Input-----------

        //--------control switch---------

    }

    //7. Side-screen====================
    // displaySideScreen() -> Options: [1] Chips, [2] Fries, [3] Cookie, [4] Brownie -> Prompt size
    static void displayAddOnScreen() {
        //--------field--------
        boolean runAddOn = true;

        //--------body--------

        //----------User Input-----------

        //--------control switch---------

    }

    //8. Checkout-screen=================
    // displayCheckoutScreen() -> summary and save
    //⭐if signed-in + is using Cupon, Step 1: ask for cupon code,
    //                                  Step 2: apply cupon discount on totalPrice
    static void displayCheckoutScreen() {

    }

    /// Exit system
    private static void exitScreen() {
        System.out.println(" ".repeat(7) + "————————————————————————————————————————————————————————————");
        System.out.println(" ".repeat(19) + "Thank You for dining with us! ");// + userName);
        System.out.println(" ".repeat(7) + "————————————————————————————————————————————————————————————");

        System.exit(0); //shutting down everything
    }
}
