package com.bigbacks.ui;

import com.bigbacks.data.OrderHistory;
import com.bigbacks.model.AddOn;
import com.bigbacks.model.Drink;
import com.bigbacks.model.OrderManager;
import com.bigbacks.model.Sandwich;
import com.bigbacks.model.SignatureSandwiches;

import java.util.Scanner;

public class Menu {
    //Attributes ======================
    // Scanner, Order
    static Scanner input = new Scanner(System.in);
    static OrderManager currentOrder = new OrderManager();
    static boolean runHome;
    static boolean runOrder;
//    //all inputs-----------------
//    //for real-time display
//    static int breadChoice;
//    static char sandwichSize;
//
//    static int premiumTopping1; //protein
//    static int premiumTopping2; //cheese
//
//    //regular toppings (veggies)
//    static int topping1;
//    static int topping2;
//    static int topping3;
//    static int topping4;
//    static int topping5;
//    static int topping6;
//    static int topping7;
//
//    static int extraTopping1; //protein
//    static int extraTopping2; //protein
//
//    static int extraTopping3; //cheese
//    static int extraTopping4; //cheese
//
//    static int sauce1;
//    static int sauce2;
//    static int sauce3;
//
//    static int drinkChoice;
//    static char drinkSize;
//
//    static int addOnChoice;
//    static char addOnSize;

    //⭐9. Sign on-screen====================
    //displaySignInScreen() -> [1] Sign-in, [2] Sign-up, [3] Guest
    //if signed-in, ask if they gonna use Cupon

    //1. Home-screen====================
    // displayHomeScreen() -> [1] New Order, [0] Exit
    public static void displayHomeScreen() {
        //--------field--------
        runHome = true;

        //--------body--------
        while (runHome) {
            System.out.println("""
                    -------------------------------
                                 HELLO
                    -------------------------------
                    """);
            System.out.println("""
                    -------------------------------
                    |         1. New Order        |
                    |         0. EXIT             |
                    -------------------------------""");

            //----------User Input-----------
            int screenChoice = input.nextInt();

            //--------control switch---------
            switch (screenChoice) {
                case 1 -> {displayOrderScreen();
                }
                case 0 -> exitScreen();
                default -> {
                    System.out.println("Invalid choice.");
                    displayHomeScreen();
                }

            }
            runHome = false;
        }

    }

    //2. Order-screen===================
    // displayOrderScreen() -> [1] Add Sandwich, [2] Add Drink, [3] Add Side, [4] Checkout
    static void displayOrderScreen() {
        //--------field--------
         runOrder = true;

        //--------body--------
        while (runOrder) {
            System.out.println("""
                    -------------------------------
                                 NEW ORDER
                    -------------------------------
                    """);
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
            switch (screenChoice) {
                case 1 -> { runOrder = false;
                    displaySandwichTypeScreen();
                }
                case 2 -> { runOrder = false;
                    displayDrinkScreen();
                }
                case 3 -> {runOrder = false;
                    displayAddOnScreen();
                }
                case 0 -> { runOrder = false;
                    runHome = true;
                }
            }

            runOrder = false;

        }

    }

    //--------------------------------------MENU---------------------------------

    //3. Sandwich-Choice-screen=========
    // ➕displaySandwichChoiceScreen() -> [1] Signature Sandwiches , [2] Build Custom
    static void displaySandwichTypeScreen() {
        //--------field--------
        boolean runSandwich = true;

        //--------body--------
        while (runSandwich) {
            System.out.println("""
                    -------------------------------
                             BUILD OPTIONS
                    -------------------------------
                    """);
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
            switch (screenChoice) {
                case 1 -> {
                    runSandwich = false;
                    displaySignatureMenuScreen();
                }
                case 2 -> {
                    runSandwich = false;
                    displayCustomSandwichScreen();
                }
            }
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
                             ⭐   ⭐   ⭐""");
            System.out.println("""
                    -------------------------------
                           [1] THE GOAT
                    ===============================
                    | 1. Protein: Tofu             |
                    | 2. Dairy: Hummus (non-dairy) |
                    | 3. Carbs: Wheat Bread        |
                    | 4. Veggies: Lettuce, Tomatoes|
                    |            Onions, Guacamole |
                    | 5. Sauce: Vinegar            |
                    -------------------------------
                                   ⭐""");
            System.out.println("""
                    -------------------------------
                          [2] THE GRIZZLY
                    ===============================
                    | 1. Protein: Ham, Beacon      |
                    | 2. Dairy: Cheddar Cheese     |
                    | 3. Carbs: White Bread        |
                    | 4. Veggies: Onions, Pickles, |
                    |             Jalapenos        |
                    | 5. Sauce: Mustard, Ketchup   |
                    -------------------------------
                                   ⭐""");
            System.out.println("""
                    -------------------------------
                          [3] THE HIPPO
                    ===============================
                    | 1. Protein: Turkey           |
                    | 2. Dairy: Provolone Cheese   |
                    | 3. Carbs: Wrap               |
                    | 4. Veggies: Cucumber, Onions,|
                    |           Tomatoes, Mushrooms|
                    | 5. Sauce: Mayo, Hummus       |
                    -------------------------------""");

            //----------User Input-----------
            int sandwichChoice = input.nextInt();
            SignatureSandwiches.setChoice(sandwichChoice);
            String sandwitchName = switch (sandwichChoice) {
                case 1 -> "The Goat";
                case 2 -> "The Grizzly";
                case 3 -> "The Hippo";
                default -> "None Selected";
            };


            //---------keep track------------
            System.out.println("\n+ " + sandwitchName);

            //----------Customize-----------
//            System.out.println("""
//                    -------------------------------
//                       ? CUSTOMIZE INGREDIENTS ?
//                    -------------------------------
//                    |          1. Yes             |
//                    |          2. No              |
//                    ===============================""");
//
//            int editIngredients = input.nextInt();
//
//            //--------control switch---------
//            if (editIngredients == 1) {
//                System.out.println("""
//                        -------------------------------
//                        |          1. ADD             |
//                        |          2. REMOVE          |
//                        ==============================="""); //➕ REPLACE
//
//                int addRemoveIngredients = input.nextInt();
//
//                if (addRemoveIngredients == 1) {
//                    System.out.println("""
//                            -------------------------------
//                                    ADD INGREDIENTS
//                            -------------------------------
//                            |          1. Protein         |
//                            |          2. Dairy           |
//                            |          3. Veggies         |
//                            ===============================""");
//
//                    int addType = input.nextInt();
//
//                    switch (addType) {
//                        case 1 -> {
//                            System.out.println("""
//                                    -------------------------------
//                                                PROTEIN
//                                    ===============================
//                                    |1. Small (4")            |
//                                    |2. Medium (8")           |
//                                    |3. Large (12")           |
//                                    |4. Large (12")           |
//                                    -------------------------------""");
//
//                            int extraProtein = input.nextInt();
//                            //⭕--------Add to Order----------
//
//                        }
//                        case 2 -> {
//                            System.out.println("""
//                                    -------------------------------
//                                                 DAIRY
//                                    ===============================
//                                    |1. Small (4")            |
//                                    |2. Medium (8")           |
//                                    |3. Large (12")           |
//                                    |4. Large (12")           |
//                                    -------------------------------""");
//
//                            int extraDairy = input.nextInt();
//                            //⭕--------Add to Order----------
//                        }
//                        case 3 -> {
//                            System.out.println("""
//                                    -------------------------------
//                                                Veggies
//                                    ===============================
//                                    |1. Small (4")           |
//                                    |2. Medium (8")           |
//                                    |3. Large (12")           |
//                                    |4. Large (12")           |
//                                    -------------------------------""");
//
//                            int extraTopping = input.nextInt();
//                            //⭕--------Add to Order----------
//                        }
//                    }
//                } else if (addRemoveIngredients == 2) {
//                    System.out.println("""
//                            -------------------------------
//                                   REMOVE INGREDIENTS
//                            -------------------------------
//                            |          1. Protein         |
//                            |          2. Dairy           |
//                            |          3. Veggies         |
//                            ===============================""");
//                    int removeType = input.nextInt();
//                    switch (removeType) {
//                        case 1 -> {
//                            System.out.println("""
//                                    -------------------------------
//                                                PROTEIN
//                                    ===============================
//                                    |1. Small (4")         |
//                                    |2. Medium (8")           |
//                                    |3. Large (12")           |
//                                    |4. Large (12")           |
//                                    -------------------------------""");
//
//                            int extraProtein = input.nextInt();
//                            //⭕--------Add to Order----------
//
//                        }
//                        case 2 -> {
//                            System.out.println("""
//                                    -------------------------------
//                                                 DAIRY
//                                    ===============================
//                                    |1. Small (4")            |
//                                    |2. Medium (8")           |
//                                    |3. Large (12")           |
//                                    |4. Large (12")           |
//                                    -------------------------------""");
//
//                            int extraDairy = input.nextInt();
//                            //⭕--------Add to Order----------
//                        }
//                        case 3 -> {
//                            System.out.println("""
//                                    -------------------------------
//                                                Veggies
//                                    ===============================
//                                    |1. Small (4")           |
//                                    |2. Medium (8")           |
//                                    |3. Large (12")           |
//                                    |4. Large (12")           |
//                                    -------------------------------""");
//
//                            int extraTopping = input.nextInt();
//                            //⭕--------Add to Order----------
//                        }
//                    }
//                }else if (editIngredients == 2) {
//            //⭕--------Add to Order----------
//
//            //⭕--------change Screen---------
//
//            displayNavigationBar();
            runSignatureMenu = false;
        }


        //⭕--------Add to Order----------

        //⭕--------change Screen---------
        displayNavigationBar();

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
                    """);
            // ---------------------Name (String)
            input.nextLine(); //clear buffer for txt
            System.out.print("""
                    -------------------------------
                                 NAME
                    ===============================
                    |Name for your order:_""");
            String name = input.nextLine();

            // ---------------------Bread type (int->String)
            System.out.println("""
                    -------------------------------
                           Carb: BREAD TYPE
                    ===============================
                    |          1. White           |
                    |          2. Wheat           |
                    |          3. Rye             |
                    |          4. Wrap            |
                    -------------------------------""");

            //➕branch idea: streams -> add to currentOrder List + print
            //----------User Input-----------
            int breadChoice = input.nextInt();
            String breadType = switch (breadChoice) {
                case 1 -> "Wheat";
                case 2 -> "White";
                case 3 -> "Rye";
                case 4 -> "Wrap";
                default -> "White";
            };

            //---------keep track------------
            System.out.println("\n+ " + breadType + "\n");



            // ---------------------Bread size (char-> char)
            System.out.println("""
                    -------------------------------
                                 SIZE
                    ===============================
                    |       S. Small (4")         |
                    |       M. Medium (8")        |
                    |       L. Large (12")        |
                    -------------------------------""");
            //----------User Input-----------
            char sandwichSize = input.next().toUpperCase().charAt(0);

            //---------keep track------------
            switch (sandwichSize) {
                case 'S' -> System.out.println("\n+ 4\" Sandwich\n");
                case 'M' -> System.out.println("\n+ 8\" Sandwich\n");
                case 'L' -> System.out.println("\n+ 12\" Sandwich\n");
            }

            // ---------------------isToasted (int->bool)
            System.out.println("""
                    -------------------------------
                                STATE
                    ===============================
                    |        1. Toasted           |
                    |        2. untoasted         |
                    -------------------------------""");
            //----------User Input-----------
            int toastOption = input.nextInt();
            boolean isToasted = switch (toastOption) {
                case 1 -> true;
                case 2 -> false;
                default -> false;
            };

            //---------keep track------------
            switch (toastOption) {
                case 1 -> System.out.println("\n+ TOASTED\n");
                case 2 -> System.out.println("\n- UNTOASTED\n");
            }

            //--------Add to Order----------
            Sandwich customSandwich = new Sandwich(name, sandwichSize, breadType, isToasted);


            // ---------------------Protein (int->String)
            //⭕ ----> into helper method
            System.out.println("""
                    -------------------------------
                                PROTEIN
                    ===============================
                    |         1. Steak            |
                    |         2. Ham              |
                    |         3. Beacon           |
                    |         4. Turkey           |
                    |         5. Chicken          |
                    -------------------------------""");
            //----------User Input-----------
            int premiumTopping1 = input.nextInt();
            String proteinChoice = switch (premiumTopping1) {
                case 1 -> "Steak";
                case 2 -> "Ham";
                case 3 -> "Beacon";
                case 4 -> "Turkey";
                case 5 -> "Chicken";
                default -> "Steak"; //⭕should be none
            };

            //---------keep track------------
            System.out.println("\n+ " + proteinChoice);

            //--------Add to Order----------
            customSandwich.addProtein(proteinChoice, false);

            //⭕--------Add EXTRA protein-------

            // ---------------------Dairy (int->String)
            //⭕ ----> into helper method
            System.out.println("""
                    -------------------------------
                                 DAIRY
                    ===============================
                    |      1. American Cheese      |
                    |      2. Provolone Cheese     |
                    |      3. Cheddar Cheese       |
                    |      4. Swiss Cheese         |
                    -------------------------------""");
            //----------User Input-----------
            int premiumTopping2 = input.nextInt();
            String dairyChoice = switch (premiumTopping2) {
                case 1 -> "American";
                case 2 -> "Provolone";
                case 3 -> "Cheddar";
                case 4 -> "Swiss";
                default -> "American"; //⭕should be none
            };

            //---------keep track------------
            System.out.println("\n+ " + dairyChoice + "\n");

            //--------Add to Order----------
            customSandwich.addCheese(dairyChoice, false);

            //⭕--------Add EXTRA cheese-------

            // ---------------------Veggies (int->String)
            //⭕ ----> into helper method
            //➕branch idea: string~ 123 (elementAt(0)), switch->...
            System.out.println("""
                    -------------------------------
                                VEGGIES
                    ===============================
                    |         1. Lettuce          |
                    |         2. Jalapenos        |
                    |         3. Onions           |
                    |         4. Tomatoes         |
                    |         5. Cucumber         |
                    |         6. Pickles          |
                    |         7.Guacamole         |
                    -------------------------------""");
            //----------User Input-----------
            int topping1 = input.nextInt();
            String toppingChoice = switch (topping1) {
                case 1 -> "Lettuce";
                case 2 -> "jalapenos";
                case 3 -> "Onions";
                case 4 -> "Tomatoes";
                case 5 -> "Cucumbers";
                case 6 -> "Pickles";
                case 7 -> "Guacamole";
                default -> "No Veggies";
            };

            //---------keep track------------
            System.out.printf("\n+ " + toppingChoice + "\n");

            //--------Add to Order----------
            customSandwich.addRegularTopping(toppingChoice);

            //--------Add More Veggies-------

            // ---------------------Sauces (int->String)
            //⭕ ----> into helper method
            System.out.println("""
                    -------------------------------
                                 SAUCE
                    ===============================
                    |           1. Mayo            |
                    |           2. Mustard         |
                    |           3. Ketchup         |
                    |           4. Ranch           |
                    |           5. Vinaigrette     |
                    -------------------------------""");
            //----------User Input-----------
            int sauce1 = input.nextInt();
            String sauceChoice = switch (sauce1) {
                case 1 -> "Mayo";
                case 2 -> "Mustard";
                case 3 -> "Ketchup";
                case 4 -> "Ranch";
                case 5 -> "Vinaigrette";
                default -> "No Sauce";
            };

            //---------keep track------------
            System.out.println("\n+ " + sauceChoice + "\n");

            //--------Add to Order----------
            customSandwich.addSauce(sauceChoice);

            currentOrder.addItem(customSandwich);

            runCustomSandwich = false;
        }
        //--------change Screen---------
        displayNavigationBar();
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
                    """);
            // ---------------------drink type (int->String)
            System.out.println("""
                    -------------------------------
                             DRINK TYPE
                    ===============================
                    |         1. Soda             |
                    |         2. Smoothie         |
                    |         3. Coffee           |
                    |         4. Tea              |
                    -------------------------------""");
            //----------User Input-----------
            int drinkTypeChoice = input.nextInt();
            String drinkType = switch (drinkTypeChoice) {
                case 1 -> "Soda";
                case 2 -> "Smoothie";
                case 3 -> "Coffee";
                case 4 -> "Tea";
                default -> "No Drink";
            };

            //--------control switch---------
            if (drinkTypeChoice == 1) {
                System.out.println("""
                        -------------------------------
                                     SODA
                        ===============================
                        |          1. Coke             |
                        |          2. Sprite           |
                        |          3. Fanta            |
                        -------------------------------""");
                //----------User Input-----------
                int sodaChoice = input.nextInt();
                String drinkName = switch (sodaChoice) {
                    case 1 -> "Coke";
                    case 2 -> "Sprite";
                    case 3 -> "Fanta";
                    default -> "Coke"; //⭕should be none
                };

                System.out.println("""
                        -------------------------------
                                     SIZE
                        ===============================
                        |       S. Small (4")         |
                        |       M. Medium (8")        |
                        |       L. Large (12")        |
                        -------------------------------""");
                //----------User Input-----------
                char drinkSize = input.next().toUpperCase().charAt(0);

                //---------keep track------------
                System.out.println("\n+ " + drinkName + " " + drinkSize);

                //--------Add to Order----------
                Drink drink = new Drink(drinkType, drinkName, drinkSize);
                currentOrder.addItem(drink);


                //--------change Screen---------
                //helper method
                displayNavigationBar();


            } else if (drinkTypeChoice == 2) {
                System.out.println("""
                        -------------------------------
                                   SMOOTHIE
                        ===============================
                        |         1. Mango             |
                        |         2. Banana            |
                        |         3. Strawberry        |
                        -------------------------------""");
                //----------User Input-----------
                int smoothieChoice = input.nextInt();
                String drinkName = switch (smoothieChoice) {
                    case 1 -> "Mango";
                    case 2 -> "Banana";
                    case 3 -> "Strawberry";
                    default -> "None"; //⭕should be none
                };

                System.out.println("""
                        -------------------------------
                                     SIZE
                        ===============================
                        |       S. Small (4")         |
                        |       M. Medium (8")        |
                        |       L. Large (12")        |
                        -------------------------------""");
                //----------User Input-----------
                char drinkSize = input.next().toUpperCase().charAt(0);

                //---------keep track------------
                System.out.println("\n+ " + drinkName + " " + drinkSize);


                //--------Add to Order----------
                Drink drink = new Drink(drinkType, drinkName, drinkSize);
                currentOrder.addItem(drink);


                //--------change Screen---------
                displayNavigationBar();

            } else if (drinkTypeChoice == 3) {
                System.out.println("""
                        -------------------------------
                                     COFFEE
                        ===============================
                        |           1. Hot            |
                        |           2. Cold           |
                        -------------------------------""");
                //----------User Input-----------
                int coffeeChoice = input.nextInt();
                String drinkName = switch (coffeeChoice) {
                    case 1 -> "Hot";
                    case 2 -> "Cold";
                    default -> "Cold"; //⭕should be none
                };

                System.out.println("""
                        -------------------------------
                                     SIZE
                        ===============================
                        |       S. Small (4")         |
                        |       M. Medium (8")        |
                        |       L. Large (12")        |
                        -------------------------------""");
                //----------User Input-----------
                char drinkSize = input.next().toUpperCase().charAt(0);

                //---------keep track------------
                System.out.println("\n+ " + drinkName + " " + drinkSize);


                //--------Add to Order----------
                Drink drink = new Drink(drinkType, drinkName, drinkSize);
                currentOrder.addItem(drink);


            } else if (drinkTypeChoice == 4) {
                System.out.println("""
                        -------------------------------
                                     TEA
                        ===============================
                        |           1. Hot            |
                        |           2. Cold           |
                        -------------------------------""");
                //----------User Input-----------
                int teaChoice = input.nextInt();
                String drinkName = switch (teaChoice) {
                    case 1 -> "Hot";
                    case 2 -> "Cold";
                    default -> "Cold"; //⭕should be none
                };

                System.out.println("""
                        -------------------------------
                                     SIZE
                        ===============================
                        |       S. Small (4")         |
                        |       M. Medium (8")        |
                        |       L. Large (12")        |
                        -------------------------------""");
                //----------User Input-----------
                char drinkSize = input.next().toUpperCase().charAt(0);

                //---------keep track------------
                System.out.println("\n+ " + drinkName + " " + drinkSize);

                //--------Add to Order----------
                Drink drink = new Drink(drinkType, drinkName, drinkSize);
                currentOrder.addItem(drink);

                displayNavigationBar();


            }

            runDrink = false;
        }
        //--------change Screen---------
        displayNavigationBar();
    }


    //7. Side-screen====================
    // displaySideScreen() -> Options: [1] Chips, [2] Fries, [3] Cookie, [4] Brownie -> Prompt size
    static void displayAddOnScreen() {
        //--------field--------
        boolean runAddOn = true;

        //--------body--------
        while (runAddOn) {
            System.out.println("""
                    -------------------------------
                                ADD-ONs
                    -------------------------------
                    """);
            // ---------------------drink type (int->String)
            System.out.println("""
                    -------------------------------
                             ADD-ON TYPE
                    ===============================
                    |1. Chips         |
                    |2. Fries           |
                    |3. Cookie           |
                    |4. Brownie         |
                    -------------------------------""");
            //----------User Input-----------
            int addOnTypeChoice = input.nextInt();
            String addOnType = switch (addOnTypeChoice) {
                case 1 -> "Chips";
                case 2 -> "Fries";
                case 3 -> "Cookie";
                case 4 -> "Brownie";
                default -> "none";
            };

            //--------control switch---------
            if (addOnTypeChoice == 1) {
                System.out.println("""
                        -------------------------------
                                     CHIPS
                        ===============================
                        |           1. Doritos         |
                        |           2. Cheetos         |
                        |           3. Lays            |
                        -------------------------------""");
                //----------User Input-----------
                int addOnChoice = input.nextInt();
                String addOnName = switch (addOnChoice) {
                    case 1 -> "Doritos";
                    case 2 -> "Cheetos";
                    case 3 -> "Lays";
                    default -> "none";
                };

                System.out.println("""
                        -------------------------------
                                     SIZE
                        ===============================
                        |       S. Small (4")         |
                        |       M. Medium (8")        |
                        |       L. Large (12")        |
                        -------------------------------""");
                //----------User Input-----------
                char addOnSize = input.next().toUpperCase().charAt(0);

                //---------keep track------------
                System.out.println("\n+ " + addOnName + " " + addOnSize);

                //--------Add to Order----------
                AddOn addOn = new AddOn(addOnType, addOnName, addOnSize);
                currentOrder.addItem(addOn);


                //⭕--------change Screen---------
                //helper method
                displayNavigationBar();


            } else if (addOnTypeChoice == 2) {
                System.out.println("""
                        -------------------------------
                                     FRIES
                        ===============================
                        |      1. ONION RINGS         |
                        |      2. Stick Fries         |
                        |      3. Waffle Fries        |
                        -------------------------------""");
                //----------User Input-----------
                int addOnChoice = input.nextInt();
                String addOnName = switch (addOnChoice) {
                    case 1 -> "Chips";
                    case 2 -> "Fries";
                    case 3 -> "Onions";
                    default -> "none";
                };

                System.out.println("""
                        -------------------------------
                                     SIZE
                        ===============================
                        |       S. Small (4")         |
                        |       M. Medium (8")        |
                        |       L. Large (12")        |
                        -------------------------------""");
                //----------User Input-----------
                char addOnSize = input.next().toUpperCase().charAt(0);

                System.out.println("""
                        -------------------------------
                                  SALT LEVEL
                        ===============================
                        |        0. NONE (4")         |
                        |        1. light (8")        |
                        |        2. Regular (12")     |
                        -------------------------------""");

                int saltChoice = input.nextInt();
                String saltLevel = switch (saltChoice) {
                    case 0 -> "None";
                    case 1 -> "Light";
                    case 2 -> "Regular";
                    default -> "Regular";
                };

                //---------keep track------------
                System.out.println("\n+ " + addOnName + " " + addOnSize);

                //--------Add to Order----------
                AddOn addOn = new AddOn(addOnType, addOnName, addOnSize);
                addOn.setSaltLevel(saltLevel);
                currentOrder.addItem(addOn);

                displayOrderScreen();


            } else if (addOnTypeChoice == 3) {
                System.out.println("""
                        -------------------------------
                                     COOKIE
                        ===============================
                        |    1. White Chocolate       |
                        |    2. Dark Chocolate        |
                        -------------------------------""");
                //----------User Input-----------
                int addOnChoice = input.nextInt();
                String addOnName = switch (addOnChoice) {
                    case 1 -> "White";
                    case 2 -> "Dark";
                    default -> "none";
                };

                System.out.println("""
                        -------------------------------
                                     SIZE
                        ===============================
                        |       S. Small (4")         |
                        |       M. Medium (8")        |
                        |       L. Large (12")        |
                        -------------------------------""");
                //----------User Input-----------
                char addOnSize = input.next().toUpperCase().charAt(0);

                //---------keep track------------
                System.out.println("\n+ " + addOnName + " " + addOnSize);

                //--------Add to Order----------
                AddOn addOn = new AddOn(addOnType, addOnName, addOnSize);
                currentOrder.addItem(addOn);

                displayNavigationBar();


            } else if (addOnTypeChoice == 4) {

                System.out.println("""
                        -------------------------------
                                    BROWNIE
                        ===============================
                        |       S. Small (4")         |
                        |       M. Medium (8")        |
                        |       L. Large (12")        |
                        -------------------------------""");
            }

            String addOnName = "Brownie";

            //----------User Input-----------
            char addOnSize = input.next().toUpperCase().charAt(0);

            //---------keep track------------
            System.out.println("\n+ " + addOnName + " " + addOnSize);

            //--------Add to Order----------
            AddOn addOn = new AddOn(addOnType, addOnName, addOnSize);
            currentOrder.addItem(addOn);

            //--------change Screen---------
            displayOrderScreen();

            runAddOn = false;

        }


        displayNavigationBar();
    }


    //8. Checkout-screen=================
    // displayCheckoutScreen() -> summary and save
    //⭐if signed-in + is using Cupon, Step 1: ask for cupon code,
    //                                  Step 2: apply cupon discount on totalPrice
    static void displayCheckoutScreen() {
        boolean runCheckout = true;

        while (runCheckout) {

            System.out.println("""
                    -------------------------------
                                CHECKOUT
                    ===============================""");
            System.out.println(currentOrder.getOrderReceipt());

            System.out.println("""
                    \n  
                             1. Confirm
                             2. Cancel""");

            int confirmation = input.nextInt();

            switch (confirmation) {
                case 1 -> {
                    OrderHistory.saveReceipt(currentOrder);
                    currentOrder = new OrderManager();
                }

                case 2 -> {
                    System.out.println("""
                            -------------------------------
                                      1. New Order
                                      2. EXIT
                            -------------------------------""");
                    int newOrderChoice = input.nextInt();

                    switch (newOrderChoice) {
                        case 1 -> displayOrderScreen();
                        case 2 -> exitScreen();
                    }
                }
            }

            runCheckout = false;
        }

        exitScreen();

    }

    /// Exit system
    private static void exitScreen() {
        System.out.println("""
                ===============================
                 THANK YOU FOR DINING WITH US!
                ===============================""");

        System.exit(0); //shutting down everything
    }

    //helper methods
    static void displayNavigationBar() {
        System.out.println("""
                --------------------------------------
                  [1]       [2]       [0]      [X]
                 DRINK     ADD-ON   CHECKOUT   EXIT""");

        char changeScreen = input.next().charAt(0);

        //--------control switch---------;
        switch (changeScreen) {
            case '1' -> displayDrinkScreen();
            case '2' -> displayAddOnScreen();
            case '0' -> displayCheckoutScreen();
            case 'x' -> exitScreen();
        }
        ;
    }

}
