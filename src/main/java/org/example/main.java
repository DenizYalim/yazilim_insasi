package org.example;

public class main{
    public static void main(String args[]){
        System.out.println("begin testing");
        Student stu1 = new Student("hermione,", "hermihome", 2);


        SpellBook spellBook = new SpellBook();
        //spellBook.getSpell("Fireball");
        Spell spell = spellBook.getSpell("Fireball");
        System.out.print("Prefix test: ");
        System.out.println(spellBook.getSpellsWithPrefix("Fire").size() == 1);
        stu1.learnSpell(spell);

        System.out.println(stu1.knowsSpell(spell));
        
        System.out.println("bitti");
    }
}