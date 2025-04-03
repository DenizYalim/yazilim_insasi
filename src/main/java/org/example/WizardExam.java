package org.example;
import java.util.ArrayList;

public class WizardExam{
    ArrayList<Spell> requiredSpells;
    
    public WizardExam(){
        requiredSpells = new ArrayList<>();
    }

    public boolean pass(Student stu){
        boolean pass = true;

        for(Spell a : requiredSpells){
            if(!stu.knowsSpell(a)){
                pass = false;
            }
        }
        return pass;
    }

    public void evaulate(Student stu){
        System.out.println("Student " + stu.name + " has passed: " + pass(stu));
    }
}