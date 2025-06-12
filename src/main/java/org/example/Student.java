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

    // Returns true if input's name is in the spellsLearned ArrayList
    public boolean knowsSpell(Spell spell){
        boolean t = false;

        for(Spell a : spellsLearned){
            if(spell != null && a.name.equals(spell.name))
                t = true;
        }
        
        return t;
    }
    

    public boolean learnSpell(Spell spell){
        if(spell == null){
            System.out.println("null");
            return false;
        }
        for(Spell s : spellsLearned){
            if(spell == null || s.name.equals(spell.name)){
                // System.out.println("çözüm var");
                return false;
            }
        }
                //System.out.println("ÇABA SADECE ");
        
        spellsLearned.add(spell);
        return true;
    }
    public static void main(String args[]){
        System.out.println("asd");
    }
}
