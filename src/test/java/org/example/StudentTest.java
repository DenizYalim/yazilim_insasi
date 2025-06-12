package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTest {  
    private Student student;
    private SpellBook spellBook;
    
    @BeforeEach
    public void setUp() {
        student = new Student("Harry Pottah", "petah petah", 1);
        spellBook = new SpellBook();
        spellBook.addSpell("Lighto!");
    }

    @Test
    public void testLearnSpell() {
        assertTrue(student.learnSpell(new Spell(spellBook, "Lighto!")));
    }

    @Test
    public void testLearnNullSpell() { 
        assertFalse(student.learnSpell(null)); // This will blow probb 
    }

    @Test
    public void testLearnKnownSpell() {
        Spell a = new Spell(spellBook, "Fireo");
        student.learnSpell(a);
        assertFalse(student.learnSpell(a));
    }

    @Test
    public void testKnowsSpell() {
        Spell a = new Spell(spellBook, "LIGHTOOO YOUR PANTS ");
        Spell b = new Spell(spellBook, "STAMINA EXTREMEEE ENHANCEEEEEEEEEEEE ");
        student.learnSpell(a);
        assertTrue(student.knowsSpell(a));
        assertFalse(student.knowsSpell(b));
    }
}
