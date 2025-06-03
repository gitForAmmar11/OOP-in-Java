package FInalQuestionSolve.Fall2021;

import java.util.ArrayList;
import java.util.Comparator;

class Student{
    String name;
    int id;
    double cgpa;

    public Student(String name, int id, double cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public Student(String name){
        this.name = name;
        this.id = -1;
        this.cgpa = -1;
    }

    public boolean contains(ArrayList<Student> list){
        for(Student st : list){
            if(st.name.equals("Peter"))
                return true;
        }
        return false;
    }

}

public class Question5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Wizard", 3, 3.88));
        list.add(new Student("Peter", 2, 3.5));
        list.add(new Student("Wanda", 1, 3.88));
        list.add(new Student("Thanos", 41, 3.9));
        list.add(new Student("Yelena", 7, 3.75));
        list.add(new Student("Thor", 15, 3.89));


        if((new Student("")).contains(list))
            System.out.println("Peter exists");
        else
            System.out.println("Peter is not exists");


        list.sort(new Comparator<>(){
            public int compare(Student o1, Student o2){
                return Double.compare(o2.cgpa, o1.cgpa);
            }
        });


        for(Student st : list){
            System.out.println(st.name + " " + st.id + " " + st.cgpa);
        }

    }
}
