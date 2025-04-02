package org.example;
import java.util.ArrayList;

public class Student{
    String name;
    String home;
    int year;
    //Spell learnedSpells[];

    ArrayList<Spell> spellsLearned;

    public Student(String name, String home, int year){
        this.name = name;
        this.home = home;
        this.year = year;
        spellsLearned = new ArrayList<>();
    }

    public boolean learnSpell(Spell spell){
        for(Spell s : spellsLearned){
            if(spell == null || s.name.equals(spell.name)){
                return false;
            }
        }
        
        spellsLearned.add(spell);
        return true;
    }
    public static void main(String args[]){
        System.out.println("asd");
    }
}
