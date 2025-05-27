package org.example;

public class PaymentService {
    public void processPayment(String cardNumber, double amount, String currency) {
        if (cardNumber.startsWith("4")) {
            if (currency.equals("USD")) {
                System.out.println("Processing Visa USD payment");
            } else {
                System.out.println("Visa payment in other currency");
            }
        } else if (cardNumber.length() < 16) {
            System.out.println("Invalid card number length");
        } else {
            System.out.println("Non-Visa card detected");
        }

        if (amount <= 0) {
            System.out.println("Amount must be positive");
        }
    }
}
