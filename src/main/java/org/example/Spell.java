package org.example;
class Spell{
    public String name;

    public Spell(SpellBook factory, String name){
        this.name = name;
        factory.addSpell(name);
    }
}