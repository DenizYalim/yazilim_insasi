package org.example;
import java.util.ArrayList;

public class SpellBook{
    ArrayList<Spell> spells;
    ArrayList<String> spellNames;

    public SpellBook(){
        spells = new ArrayList<>();
        spellNames = new ArrayList<>();
    }

    public void addSpell(String spellName){
        if(!spellIsIn(spellName)){
            //System.out.println(spells.size());
            spellNames.add(spellName);
            Spell newSpell = new Spell(this, spellName);
            spells.add(newSpell);
        }
    }

    public boolean spellIsIn(String spellName){
        boolean t = false;

        for(String a : spellNames){
            //System.out.println(a);
            if(a == spellName)
                t = true;
        }
        return t;
    }

    public Spell getSpell(String spellName){
        addSpell(spellName);

        for(Spell a : spells){
            if(a.name == spellName){
                return a;
            }
        }

        System.out.println("Something went wrong in getSpell()");
        return null;
    }

    public Spell getSpellByIndex(int index){
        return spells.get(index);   
    }

    public ArrayList<Spell> getSpellsWithPrefix(String prefix){
        ArrayList<Spell> cevap = new ArrayList<>();

        for(Spell spell : spells){
            if(spell.name.startsWith(prefix)){
                cevap.add(spell);
            }
        }

        return cevap;
    }
}