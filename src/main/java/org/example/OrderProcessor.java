package org.example;

import java.util.List;

public class OrderProcessor {
    public void processOrder(String orderId, List<String> items) {
        if (orderId.length() > 5 && items != null) {
            System.out.println("Processing complex order: " + orderId);
        } else {
            System.out.println("Processing order: " + orderId);
        }

        for (String item : items) {
            if (item.contains("item")) {
                System.out.println("Valid item: " + item);
            } else {
                System.out.println("Skipping unknown item");
            }
        }
    }
}