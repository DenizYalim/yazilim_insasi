package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExamTest {
    WizardExam exam;
    Spell a;
    Spell nrw;

    @BeforeEach
    public void setUp(){
        exam = new WizardExam();
        SpellBook fact = new SpellBook();
        a = new Spell(fact, "testSpell");
        nrw = new Spell(fact, "smtEls");
        exam.requiredSpells.add(a);
    }
    
    @Test
    public void testPass() {
        Student stu = new Student("deniz", "aa", 0);
        stu.learnSpell(a);
        assertTrue(exam.pass(stu));
        exam.requiredSpells.add(nrw);
        assertFalse(exam.pass(stu));
    }
}
