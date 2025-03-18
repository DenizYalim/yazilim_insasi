package org.example;

import java.util.ArrayList;

public class Adventurer extends Character implements Joinable{
    @Override
    public void joinQuest(Quest q) {
        addQuest(q);
    }

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
        q.joinQuest(this);
    }

    public void removeQuest(){
        //code
    }
}
