package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClassroomTest {
    Classroom clas;
        
    @BeforeEach
    public void setUp() {
    clas = new Classroom();
    }

    @Test
    public void Testall(){
        clas.addStudent(new Student("deniz", "aaaaaaaaaaaaaaaa", 0));
        assertTrue(clas.getSize() == 1); // check if add works
        assertTrue(clas.findStudent("deniz").name.equals("deniz"));

        Spell a = new Spell(new SpellBook(), "boncuk");
        clas.findStudent("deniz").learnSpell(a);
        assertTrue(clas.findStudentBySpell(a).name.equals("deniz"));
    }
}
