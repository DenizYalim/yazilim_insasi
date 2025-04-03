package org.example;
import java.util.ArrayList;

public class Classroom{
    ArrayList<Student> students;
    public Classroom(){
        students = new ArrayList<>();
    }
    public void addStudent(Student stu){
        if(stu != null){
            students.add(stu);
        }
    }

    public Student findStudent(String name){
        for(Student i : students){
            if(i.name == name){
                return i; 
            }
        }
        return null;
    }

    public Student findStudentBySpell(Spell s){
        ArrayList<Student> cevap = new ArrayList<>();
        for(Student i : students){
            if(i.knowsSpell(s)){
                cevap.add(i);
            }
        }
        return cevap.get(0);
    }

    public ArrayList<Student> getStudentsWithHouse(String home){
        ArrayList<Student> cevap = new ArrayList<>();
        for(Student i : students){
            if(i.home == home){
                cevap.add(i);
            }
        }
        return cevap;
    }

    public ArrayList<Student> sortByHome(){
        ArrayList<Student> cevap = new ArrayList<>();
        // yea
        return cevap;
    }

    

}
