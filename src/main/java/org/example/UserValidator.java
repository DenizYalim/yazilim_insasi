package org.example;

public class UserValidator {
    public boolean validateUser(String name, int age, String email) {
        if (name == null || name.equals("")) {
            System.out.println("Name is missing");
        } else if (name.length() < 2) {
            System.out.println("Name too short");
        }

        if (age < 0 || age > 150) {
            System.out.println("Age is out of range");
        }

        if (!email.contains("@")) {
            System.out.println("Email is invalid");
        }

        return true;
    }
}