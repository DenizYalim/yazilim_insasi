package org.example;

public abstract class Character {
    public String name;
    private int level;
    
    public Character(String n, int l){
        name = n;
        level = l;
    }

    public void levelup(){
        System.out.println(this.name + " has leveled up");
    }

    public int getLevel(){
        return level;
    }

    public abstract void speak();
}
