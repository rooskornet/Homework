package com.ivik.students.util;

import com.ivik.students.model.Student;

/**
 * Created by jennie on 12-1-2016.
 */
public class SortUtils {

    public static void sortStudents(Student[] students){

     for(int i = 0; i < students.length-1; i++){

         for(int a = i+ 1; a < students.length; a++){

             if (students[i].getScore() > students[a].getScore()) {
                 Student temporary = students[a];
                 students[a] = students[i];
                 students[i]= temporary;

             }
         }
     }
    }


}

