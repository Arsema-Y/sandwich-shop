package com.bigbacks;

import com.bigbacks.ui.Menu;

public class App {
    public static void main(String[] args) {
        System.out.println("Starting application pipeline...");

        Menu ui = new Menu();
        Menu.displayHomeScreen();
    }
}