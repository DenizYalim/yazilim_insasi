package org.example;
 

// Represents playable classes
public class Hero extends Character{ 

    public Hero(String n, int l) {
        super(n, l);
    }

    @Override
    public void speak() {
       System.out.println("speech");
    }
}
