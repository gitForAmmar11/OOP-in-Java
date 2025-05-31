package FInalQuestionSolve.Spring2021;

import java.util.ArrayList;
import java.util.Comparator;

class Student{
    float cgpa;
    String name;

    public Student(float cgpa, String name){
        this.cgpa = cgpa;
        this.name = name;
    }

    public String toString(){
        return this.cgpa + " " + this.name;
    }
}

public class Question3B {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3.44F, "Afnan"));
        students.add(new Student(2.1F, "Ullash"));

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Float.compare(o1.cgpa, o2.cgpa);
            }
        });

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.name.compareTo(o1.name);
            }
        });

    }
}
