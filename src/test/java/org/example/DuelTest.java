package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test; 

public class DuelTest {
    Student a;
    Student b;

    @BeforeAll
    public void setUp(){
        a = new Student("a", "aa", 0);
        b = new Student("b", "aa", 0);
    }

    @Test
    public void duel(){
        assertTrue(true);
    }
}
