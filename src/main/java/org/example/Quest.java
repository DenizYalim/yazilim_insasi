package org.example;


import java.util.ArrayList;

public class Quest implements  Joinable{
    String name;
    Difficulty difficulty;
    Mentor mentor;
    ArrayList<Adventurer> adventurers = new ArrayList<>();

    @Override
    public void joinQuest(Quest q) {
        for (Adventurer adventurer : adventurers) {
            System.out.println(adventurer.name);
        }
    }

    public enum Difficulty {Hard, Medium, Easy}

    public void joinQuest(Adventurer adv) {
        adventurers.add(adv);
    }

}
