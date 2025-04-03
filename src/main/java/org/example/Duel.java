package org.example;

public class Duel{
    public Duel(){

    }

    public static void start(Student s1, Student s2, Spell spell){
        boolean s1know = s1.knowsSpell(spell);
        boolean s2know = s2.knowsSpell(spell);

        if(s1know == false && s2know == false){
            System.out.println("Neither student knows the spell, it's a draw!");
            return;
        }

        if(s1know && s2know){
            System.out.println("Both students knows the spell, it's a random outcome!");
            return;
        }

        boolean stu1win = true;
        if(s1know)
            System.out.println("Student: "+ s1.name + "wins the duel by knowledge!!");
        else
            System.out.println("Student: "+ s2.name+ "wins the duel by knowledge!!");
        
    }
}