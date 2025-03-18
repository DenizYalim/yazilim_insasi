package org.example;

import java.util.ArrayList;

public class Adventurer extends Character{
    public enum Races {Hobbit, Elf, Dwarf, Human} // 'Man' isn't a race dude its human; imagine a female Man forgodssake
    ArrayList<Quest> quests;
    Races race;

    public Adventurer(String name, Races race){
        super(name,"advanturer");
        this.race = race;
        quests = new ArrayList<>();
    }

    public void addQuest(Quest q){
        quests.add(q);
    }

    public void removeQuest(){
        //code
    }
}
