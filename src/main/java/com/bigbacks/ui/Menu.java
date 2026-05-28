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

   static int topping1;
   static int topping2;
   static int topping3;
   static int topping4;
   static int topping5;
   static int topping6;
   static int topping7;

   static int extraTopping1;
   static int extraTopping2;
   static int extraTopping3;

   static int sauce1;
   static int sauce2;
   static int sauce3;

   static int drinkChoice;
   static char drinkSize;

   static int addOnChoice;
   static char addOnSize;

    //⭐Sign on-screen====================
    //displaySignInScreen() -> [1] Sign-in, [2] Sign-up, [3] Guest
     //if signed-in, ask if they gonna use Cupon

   //Home-screen====================
    // displayHomeScreen() -> [1] New Order, [0] Exit
    static void displayHomeScreen(){
        //--------field--------

        //--------body--------

        //--------control switch---------

    }

    //Order-screen===================
    // displayOrderScreen() -> [1] Add Sandwich, [2] Add Drink, [3] Add Side, [4] Checkout
    static void displayOrderScreen(){
        //--------field--------

        //--------body--------

        //--------control switch---------

    }

    //--------------------------------------MENU---------------------------------

    //Sandwich-Choice-screen=========
    // ➕displaySandwichChoiceScreen() -> [1] Signature Sandwiches , [2] Build Custom
    static void displaySandwichChoiceScreen(){
        //--------field--------

        //--------body--------

        //--------control switch---------
    }

    //Sandwich-Menu-screens==========
    // ➕displaySignatureMenuScreen()  -> Options: [1] Philly Cheese Steak, [2] BLT, etc.
    static void displaySignatureMenuScreen(){
        //--------field--------

        //--------body--------

        //--------control switch---------

    }

    // displayCustomSandwichScreen() -> completely blank build path
    static void displayCustomSandwichScreen(){
        //--------field--------

        //--------body--------

        //--------control switch---------

    }

    //Drink-screen====================
    // displayDrinkScreen() -> Step 1: [1] Soda, [2] Smoothie, [3] Coffee, [4] Tea
    //                         Step 2: Prompt flavor based on choice
    //                         Step 3: [1] Small, [2] Medium, [3] Large
    static void displayDrinkScreen(){
        //--------field--------

        //--------body--------

        //--------control switch---------

    }

    //Side-screen====================
    // displaySideScreen() -> Options: [1] Chips, [2] Fries, [3] Cookie, [4] Brownie -> Prompt size
    static void displayAddOnScreen(){
        //--------field--------

        //--------body--------

        //--------control switch---------

    }

    //Checkout-screen=================
    // displayCheckoutScreen() -> summary and save
     //⭐if signed-in + is using Cupon, Step 1: ask for cupon code,
    //                                  Step 2: apply cupon discount on totalPrice
    static void displayCheckoutScreen(){

    }

    ///Exit system
    private static void exitScreen() {
        System.out.println(" ".repeat(7) + "————————————————————————————————————————————————————————————");
        System.out.println(" ".repeat(19) + "Thank You for dining with us! ");// + userName);
        System.out.println(" ".repeat(7) + "————————————————————————————————————————————————————————————");

        System.exit(0); //shutting down everything
    }
}
