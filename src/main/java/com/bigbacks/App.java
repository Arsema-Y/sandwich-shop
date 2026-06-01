package com.bigbacks;

import com.bigbacks.model.SignatureSandwiches;
import com.bigbacks.ui.Menu;

public class App {
    public static void main(String[] args) {

        SignatureSandwiches.makeSignatureSandwiches();

        Menu.displayHomeScreen();
    }
}