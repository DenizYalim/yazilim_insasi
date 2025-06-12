package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SpellBookTest {
    private SpellBook spellBook;
    
    @BeforeEach
    public void setUp() {
        spellBook = new SpellBook();
        spellBook.addSpell("Lighto!");
        spellBook.addSpell("Uganda!");
        spellBook.addSpell("Flight!");
        spellBook.addSpell("Magicksa!");
    }

    @Test
    public void testRetrievebyIndex() {
        assertTrue(spellBook.getSpellByIndex(0).name.equals("Lighto!"));
    }

    @Test
    public void testSpellWithPrefix() { 
        assertTrue(spellBook.getSpellsWithPrefix("Light").get(0).name.equals("Lighto!")); // Lighto best spell fl
        assertTrue(spellBook.getSpellsWithPrefix("").get(0).name.equals("Lighto!")); // No idea if thisll work
        assertTrue(spellBook.getSpellsWithPrefix("Mute").size() == 0);
    }

    
}
