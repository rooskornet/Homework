package com.ivik.students.exam;


import com.ivik.students.model.Student;
import com.ivik.students.util.SortUtils;


/**
 * Created by jennie on 12-1-2016.
 */
public class StudentExamScores {

    private Student[] students;

    public StudentExamScores(){
        initExamScores();

    }

    private void initExamScores(){
        Student student1 = new Student("Piet", 6.5);
        Student student2 = new Student("Klaas", 5.5);
        Student student3 = new Student("Henk", 8.0);
        Student student4 = new Student("Kees", 9.0);
        Student student5 = new Student("Hans", 4.5);

        students = new Student[]{student1, student2, student3, student4, student5};


    }

    public void reportStudents() {
        SortUtils.sortStudents(students);

        System.out.println("Name " + "     Score");
        System.out.println("-------- --------");

        for (int i = 0; i < students.length; i++) {
            String name = students[i].getName();
            Double score = students[i].getScore();
            System.out.format("%s%10.2f%n", name, score);


        }
    }

    public static void main(String[] args) {
        new StudentExamScores().reportStudents();
    }


}
