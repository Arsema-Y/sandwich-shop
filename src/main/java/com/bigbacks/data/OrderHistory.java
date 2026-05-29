package com.bigbacks.data;


import com.bigbacks.model.MenuItem;
import com.bigbacks.model.OrderManager;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OrderHistory {

    // constructor===================
    // default empty constructor
    public OrderHistory() {
    }

    // File-Operations====================
    // saveReceipt(Order order) -> generates timestamp, opens BufferedWriter to "receipts/...", logs text lines
    public static void saveReceipt(OrderManager order) {

        // 1. header------------------
        LocalDateTime timeStamp = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String timestamp = timeStamp.format(formatter);

        // 2. folder-------------------
        String folderName = "receipts";
        String fileName = timestamp + ".txt";


        // 4. BufferedWriter-----------
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            writer.write("====================================\n");
            writer.write("           BIG-BACK ORDER\n");
            writer.write("====================================\n");
            writer.write("Order Date: " + timeStamp + "\n");
            writer.write("------------------------------------\n");

            for (MenuItem item : order.getOrderItems()) {
                String itemLine = String.format("- %-25s $%.2f\n", item.getName(), item.getPrice());
                writer.write(itemLine);
            }

            writer.write("------------------------------------\n");
            writer.write("TOTAL: $" + String.format("%.2f", order.getOrderTotal()) + "\n");
            writer.write("====================================\n");

            System.out.println( "[" + fileName + "] saved!");

        } catch (IOException e) {
            System.out.println("Oopsie Error: file not saved.");
            e.printStackTrace();
        }
    }
}