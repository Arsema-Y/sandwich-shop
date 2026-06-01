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
    public OrderHistory() {
    }

    // File-Operations====================
    // saveReceipt(Order order) -> generates timestamp, opens BufferedWriter to "receipts/...", logs text lines
    public static void saveReceipt(OrderManager order) {

        // 1. file name------------------
        LocalDateTime timeStamp = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String timestamp = timeStamp.format(formatter);

        // Receipt header
        LocalDateTime header = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        String receiptDate = header.format(dateFormat);
        String receiptTime = header.format(timeFormat);


        // 2. folder creation-------------
        String folderName = "receipts";

        // 3. folder loading-------------
        String fileName = timestamp + ".txt";

        // 4. BufferedWriter-----------
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(folderName + "/" +fileName))) {

            writer.write("====================================\n");
            writer.write("           BIG-BACK ORDER\n");
            writer.write("====================================\n");

            writer.write("Order Date: " + receiptDate);
            writer.write("Order Time: " + receiptTime + "\n");


            writer.write("------------------------------------\n");

            //ordered items-------------
            for (MenuItem item : order.getOrderItems()) {
                String itemLine = String.format("- %-25s - $%.2f\n", item.getName(), item.getPrice());
                writer.write(itemLine);
            }

           //payment history-------------
            writer.write("------------------------------------\n");
            writer.write("TOTAL: $" + String.format("%.2f", order.getOrderTotal()) + "\n");
            writer.write("====================================\n");

            System.out.println("-----------------------------");
            System.out.println("        RECEIPT SAVED!");
            System.out.println("-----------------------------");

            System.out.println( "     Your tracking number \n");

            System.out.println("      " + fileName + "\n");

        } catch (IOException e) {
            System.out.println("Error: Receipt couldn't be saved.");
            e.printStackTrace();
        }
    }
}