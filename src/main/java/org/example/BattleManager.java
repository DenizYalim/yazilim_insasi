package org.example;

// Simulates a battle between a Hero and an Enemy.
public class BattleManager {
    public void fight(Character a, Character b){
        if(a.getLevel() == b.getLevel()){
            System.out.println("The battle between" + a.name + " and " + b.name + " is a tie!");
        }
        else if(a.getLevel() > b.getLevel()){
            System.out.println(a.name + " has won the battle against" + b.name);
            a.levelup();
        }
        else{
            System.out.println(b.name + " has won the battle against" + a.name);
            b.levelup();
        }
    }
}   
